package Problem3;

import java.util.Comparator;

public class SalesComparator implements Comparator<Marketing> {

	@Override
	public int compare(Marketing p1, Marketing p2) {
		// TODO Auto-generated method stub
		if(p1.getsAmount() < p2.getsAmount()) return -1;
		
		else if(p1.getsAmount() > p2.getsAmount()) return 1;
		
		else {
			
			return 0;
		}
	}

}
