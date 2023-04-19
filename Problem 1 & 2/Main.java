import java.util.*;
public class Main {

	/** Combines the lists that are populated here into a single list
	 *  and passes to computeSumOfSalaries
	 */
	public static void main(String[] args) {
		List<Staff> staff = new ArrayList<>();
		staff.add(new Staff("John", 110000, 2));
		staff.add(new Staff("Tom", 110000, 4));
		staff.add(new Staff("Edward", 120000, 1));
		staff.add(new Staff("Rich",90000, 3));
		staff.add(new Staff("Kevin", 100000,1));

		List<Teacher> teachers = new ArrayList<>();
		teachers.add(new Teacher("Andrew", 110000, 10000, 1800));
		teachers.add(new Teacher("Rabelais", 130000, 5500, 1500));
		teachers.add(new Teacher("Phil", 135000, 12000, 1000));
		teachers.add(new Teacher("Tony",95000, 8000, 2200));
		
		
		//Implementation steps
		//Step 1: implement the combine method, to combine the two lists
		List<Staff> combined = combine(staff, teachers);
		
		Statistics stats = new Statistics();
		
		//Step 2: pass the combined list to computeSumOfSalaries
		double salarySum = stats.computeSumOfSalaries(combined);
		System.out.println(salarySum);
	}
	//IMPLEMENT
	public static List<Staff> combine(List<Staff> staff, List<Teacher> teachers) {
		List<Staff> combined = new ArrayList<>(staff);
	    combined.addAll(teachers);
	    return combined;
	}

}
