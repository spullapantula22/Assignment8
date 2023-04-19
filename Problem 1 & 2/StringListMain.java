
public class StringListMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MyStringList l = new MyStringList();
		
		l.add(new Person("Goldman", "Yellow", 25));
		l.add(new Person("Yeddler", "Green",  40));
		
		System.out.println(l.searchLast(new Person("Goldman")));
		
	}

}
