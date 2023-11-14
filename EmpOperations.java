package empOperation;

import java.time.LocalDate;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

import core.Employee;
import core.Fte;
import core.Pte;
import employeeValidationRules.EmployeeException;
import employeeValidationRules.EmployeeValidationRules;

public interface EmpOperations extends EmployeeValidationRules {

	static void addFte(Scanner sc,Map<Integer,Employee>empMap) throws EmployeeException
	{
		System.out.println("enter your details as :- name, dateOfJoin, phoneNo, aadhaarNo and monthlySalary :- ");
		Employee e=new Fte(sc.next(),sc.next(),sc.nextLong(),EmployeeValidationRules.duplicateValidation(empMap,sc.nextLong()),sc.nextDouble());
		empMap.put(e.getId(),e);
		System.out.println("successfully register.");
	}
	static void addPte(Scanner sc,Map<Integer,Employee>empMap) throws EmployeeException
	{
		System.out.println("enter your details as :- name, dateOfJoin, phoneNo, aadhaarNo and hourlySalary :- ");
		Employee e=new Pte(sc.next(),sc.next(),sc.nextLong(),EmployeeValidationRules.duplicateValidation(empMap,sc.nextLong()),sc.nextDouble());
		empMap.put(e.getId(),e);
		System.out.println("successfully register.");
	}
	static void deleteEmp(Scanner sc,Map<Integer,Employee>empMap) throws EmployeeException
	{
		System.out.println("enter your Emp id :-  ");
		Integer temp=sc.nextInt();
		Employee e=empMap.remove(temp);
		if(e==null) throw new EmployeeException("Employee not register !");
		System.out.println(e);
		System.out.println("successfully removed !.");
	}
	static void searchByAadhar(Scanner sc,Map<Integer,Employee>empMap) throws EmployeeException
	{
		System.out.println("enter your Aadhar No :-  ");
		Employee e=EmployeeValidationRules.signInValidation(empMap,sc.nextLong());
		
		
		System.out.println(e);

	}
	static void displayAll(Map<Integer,Employee>empMap) 
	{
		empMap.forEach((k,v)->System.out.println(k+" "+v));
		//empMap.forEach(System.out::println(k+v));
	}
	static void sortByDateOfJoin(Map<Integer,Employee>empMap) 
	{

		empMap.values().stream()
		.sorted((e1,e2)->e1.getDateOfJoin().compareTo(e2.getDateOfJoin()))
		.forEach(System.out::println);
	}
	static void sortByEmpId(Map<Integer,Employee>empMap) // natural sorting
	{

		empMap.values().stream()
		.sorted()
		.forEach(System.out::println);
	
		TreeMap temp=new TreeMap<>(empMap);
		temp.forEach((k,v)->System.out.println(k+" "+v));
		
	}
	static void populateMap(Map<Integer,Employee>empMap)
	{
		Employee e1=new Pte("Govinda","2015-08-18",876956787,657638678,500);
		Employee e2=new Pte("Govinda","2015-08-18",8769567,657638678,500);
		Employee e3=new Fte("Govinda","2015-08-18",8769567,657638678,500);
		Employee e4=new Pte("Govinda","2015-08-18",8769567,65763867,500);
		Employee e5=new Fte("Goutam","2020-08-18",8769567,657638678,500);
		Employee e6=new Pte("Govinda","2015-08-18",876956,657638,500);
		Employee e7=new Pte("Hansa","2022-08-18",876956,6576386,500);
		Employee e8=new Pte("Priyanka","2013-08-18",876956,657638,500);
		System.out.println(empMap.put(e1.getId(),e1));
		System.out.println(empMap.put(e2.getId(),e2));
		System.out.println(empMap.put(e3.getId(),e3));
		System.out.println(empMap.put(e4.getId(),e4));
		System.out.println(empMap.put(e5.getId(),e5));
		System.out.println(empMap.put(e6.getId(),e6));
	System.out.println(	empMap.put(e7.getId(),e7));
		System.out.println(empMap.put(e8.getId(),e8));		
		
		
	}
	
	
	
	
	
}
