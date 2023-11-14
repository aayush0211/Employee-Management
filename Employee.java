package core;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;

public abstract class Employee implements Comparable<Employee>,Serializable {
   
	/**
	 * 
	 */
	private static final long serialVersionUID = 8784024475969842166L;
	private String name;
	private LocalDate dateOfJoin;
	private long phoneNo;
	private long aadhaarNo;  
	private Integer id;
	private static int count;
	static {count=0;}

	public Employee(String name, String dateOfJoin, long phoneNo, long aadhaarNo) {
		
		this.name = name;
		this.dateOfJoin = LocalDate.parse(dateOfJoin);
		this.phoneNo = phoneNo;
		this.aadhaarNo = aadhaarNo;
		this.id =++count;
	}
	

	@Override
	public int compareTo(Employee o) {
		//
		
		return id.compareTo(o.id);
	}


	@Override
	public int hashCode() {
		return Objects.hash(id);
	}


	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Employee)
		{
			Employee temp=(Employee)obj;
			return id==temp.id;
		}
		return false;
	}


	@Override
	public String toString() {
		return "Employee [name=" + name + ", dateOfJoin=" + dateOfJoin + ", phoneNo=" + phoneNo + ", aadhaarNo="
				+ aadhaarNo + ", id=" + id +" ";
	}


	public Integer getId() {
		return id;
	}


	public long getAadhaarNo() {
		return aadhaarNo;
	}


	public LocalDate getDateOfJoin() {
		return dateOfJoin;
	}
	
	
	

}
