package core;

public class Pte extends Employee {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -4905068939205567262L;
	private Double hourlySalary;
public Pte(String name, String dateOfJoin, long phoneNo, long aadhaarNo,double hs) {
	super(name, dateOfJoin, phoneNo, aadhaarNo);
	// TODO Auto-generated constructor stub
	hourlySalary=hs;
}
@Override
public int hashCode() {

		return super.hashCode();
}
@Override
public boolean equals(Object obj) {

	return super.equals(obj);
}
@Override
public String toString() {
	return super.toString()+" hourlySalary=" + hourlySalary + "]\n";
}



}
