import java.util.*;
public class Statistics implements EmployeeData {
	/** 
	 * Polymorphically computes and returns the sum
	 * of all the salaries of all the staff/teachers in the list.
	 */
	@Override
	public double computeSumOfSalaries(List<Staff> aList) {
		// TODO Auto-generated method stub
		double sum = 0;
		
		for(Staff elem: aList) {
			
			sum += elem.getSalary();
		}
		//implement
		//compute sum of all salaries of people in aList and return
		return sum;
	}
}
