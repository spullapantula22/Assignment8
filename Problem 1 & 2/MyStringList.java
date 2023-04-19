
public class MyStringList {
	
	private final int INITIAL_LENGTH = 4;
	private Person arr[];
	private int size;
	
	public MyStringList(){
		
		this.arr = new Person[this.INITIAL_LENGTH];
		this.size = 0;
	}
	
	public void add(Person s) {
		
		if(s == null) return;
		
		if(size == arr.length) resize();
		
		arr[size++] = s;
	}
	
	public boolean find(Person s) {
		
		for(int i = 0; i < size; i++) {
			
			if(arr[i].equals(s)) return true;
		}
		return false;
	}
	
	public Person get(int i) {
		
		if(i < 0 || i >= size) return null;
		
		return arr[i];
	}
	
	public void resize() {
		
		System.out.println("resizing...");
		
		int len = arr.length;
		int newlen = 2*len;
		
		Person temp[] = new Person[newlen];
		
		System.arraycopy(arr, 0, temp, 0, len);
		arr = temp;
		
	}
	
	public void insert(Person s, int pos) {
		
		if(pos >= size || pos < 0) return;
		
		if(pos == size || pos + 1 >= arr.length) resize();
		
		Person temp[] = new Person[arr.length+1];
		System.arraycopy(arr, 0, temp, 0, pos);
		temp[pos] = s;
		System.arraycopy(arr, pos, temp, pos+1, arr.length - pos);
		
		arr = temp;
		++size;
		
	}
	
	public boolean remove(Person s) {
		
		if(s== null) return false;
		
		int index = -1;
		
		for(int i = 0; i < size; i++) {
			
			if(arr[i].equals(s)) {
				
				index = i;
				break;
			}
		}
		
		if(index != -1) {
			
			Person temp[] = new Person[arr.length];
			System.arraycopy(arr, 0, temp, 0, index);
			System.arraycopy(arr, index+1, temp, index, arr.length - (index+1));
			
			arr = temp;
			
			--size;
			
		}
		return true;
		
	}
	
	public Person searchLast(Person s) {
		
		for(int i = 0; i < arr.length; i++) {
			
			if(arr[i].getLast().equals(s.getLast())) return arr[i];
		}
		return null;
	}
	
	public String toString(){
        StringBuilder sb = new StringBuilder("[");
        for(int i = 0; i < size-1; ++i){
            sb.append(arr[i]+", ");
        }
        sb.append(arr[size-1]+"]");
        return sb.toString();
    }
    public int size() {
        return size;
    }	
}
