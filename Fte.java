package core;

import java.util.Objects;

public class Fte extends Employee {

		/**
	 * 
	 */
	private static final long serialVersionUID = -5806264222147823150L;
		private Double monthlySalary;
	public Fte(String name, String dateOfJoin, long phoneNo, long aadhaarNo,double ms) {
		super(name, dateOfJoin, phoneNo, aadhaarNo);
		// TODO Auto-generated constructor stub
		monthlySalary=ms;
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
		return super.toString()+" monthlySalary=" + monthlySalary + "]\n";
	}
	


}
