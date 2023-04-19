package Problem3;

public class Marketing {
	
	private String eName;
	private String pName;
	private double sAmount;
	
	public Marketing(String e, String p, double s) {
		
		this.eName = e;
		this.pName = p;
		this.sAmount = s;
	
	}

	public String geteName() {
		return eName;
	}

	public void seteName(String eName) {
		this.eName = eName;
	}

	public String getpName() {
		return pName;
	}

	public void setpName(String pName) {
		this.pName = pName;
	}

	public double getsAmount() {
		return sAmount;
	}

	public void setsAmount(double sAmount) {
		this.sAmount = sAmount;
	}
	
	public boolean equals(Object ob) {
		
		if(ob == null) return false;
		if(!(ob instanceof Marketing)) return false;
		
		Marketing m = (Marketing) ob;
		
		return this.eName.equals(m.eName) && this.pName.equals(m.pName) &&
			   this.sAmount == m.sAmount;
	}
	
	public String toString() {
		
		return "Name: " + this.eName + "\n" + "Product Name: " + this.pName + "\n"
				+ "Amount: " + this.sAmount + "\n";
	}
	
}
