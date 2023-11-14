package employeeValidationRules;

import java.util.Map;

import core.Employee;

public interface EmployeeValidationRules {

	public static long duplicateValidation(Map<Integer,Employee>empMap,long aadharNo) throws EmployeeException
	{
		for(Employee e:empMap.values())
		{
			if(e.getAadhaarNo()==aadharNo)
				throw new EmployeeException("Employee already register with this aadharNo !");
		}
		return aadharNo;
	}
	public static Employee signInValidation(Map<Integer,Employee>empMap,long aadharNo) throws EmployeeException
	{
		for(Employee e:empMap.values())
		{
			if(e.getAadhaarNo()==aadharNo)
				return e;
		}
				throw new EmployeeException("Employee not register !");
		
	}
	
}
