package Problem3;

import java.util.Comparator;

public class NameComparator implements Comparator<Marketing>{

	@Override
	public int compare(Marketing p1, Marketing p2) {
		// TODO Auto-generated method stub
		return p1.geteName().compareTo(p2.geteName());
	}
	
	

}
