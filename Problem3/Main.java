package Problem3;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Marketing> list = new ArrayList<Marketing>();
		
		list.add(new Marketing("Watson", "LG Phone", 1900));
		list.add(new Marketing("Mary", "Watch", 900));
		list.add(new Marketing("Jane", "Diamond Ring", 3500));
		list.add(new Marketing("John", "PS4", 2200));
		list.remove(3);
		
		List <Marketing> data = listMoreThan1000(list);
		Marketing []arr = data.toArray(new Marketing[0]);
		
		Arrays.sort(arr, getName());
		
		System.out.println(Arrays.toString(arr));
		System.out.println("Size = " + list.size());
	}
	
	public static List<Marketing> listMoreThan1000(List<Marketing> list){
	 // Implement a body
		
		List<Marketing> aList = new ArrayList<>();
		
		for(Marketing m : list) {
			
			if(m.getsAmount() > 1000) {
				
				aList.add(m);
			}
		}
		
		return aList;
	}
	
	public static NameComparator getName() {
		
		return new NameComparator();
	}

}
