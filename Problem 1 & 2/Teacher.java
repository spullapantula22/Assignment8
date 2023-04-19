
public class Teacher extends Staff {
	private double bonus;
	private double salary;
	
	public Teacher(String name, double salary, int numDependants, double bonus) {
		super(name, salary, numDependants);
		this.bonus = bonus;
		this.salary = salary;
	}
	@Override
	public double getSalary() {
		return this.salary + bonus;
	}
	public double getBonus() {
		return bonus;
	}
}
