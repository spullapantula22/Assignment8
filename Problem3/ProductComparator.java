package Problem3;

import java.util.Comparator;

public class ProductComparator implements Comparator<Marketing>{

	@Override
	public int compare(Marketing p1, Marketing p2) {
		// TODO Auto-generated method stub
		return p1.getpName().compareTo(p2.getpName());
	}
}
