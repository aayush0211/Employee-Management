package tester;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import static empOperation.EmpOperations.*;
import core.Employee;
import empOperation.EmpOperations;

public class TesterOfEmp implements EmpOperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean flag = false;
		Map<Integer, Employee> empMap = new HashMap<>();
		populateMap(empMap);
		try (Scanner sc = new Scanner(System.in)) {
			while (!flag) {
				System.out.println("options as :- 1)Add full time employee\n" + "2)Add part time employee\n"
						+ "3)Delete an employee by Emp Id\n" + "4)Search employee details by Aadhaar number\n"
						+ "5)Display all employee details\n"
						+ "6)Display all employee details sorted by date of joining\n"
						+ "7)Display all employee details sorted by Emp_Id\n" + "8)Exit");
				try {
					switch (sc.nextInt()) {
					case 1:
						addFte(sc, empMap);
						break;
					case 2:
						addPte(sc, empMap);
						break;
					case 3:
						deleteEmp(sc, empMap);
						break;
					case 4:
						searchByAadhar(sc, empMap);
						break;
					case 5:
						displayAll(empMap);
						break;
					case 6:
						sortByDateOfJoin(empMap);
						break;
					case 7:
						sortByEmpId(empMap);
						break;
					case 8:
						flag = true;
						System.out.println("Bye !");
						break;
					default:
						System.out.println("Enter correct choice !");

					}
				} catch (Exception e) {
					e.printStackTrace();
					sc.nextLine();
				}

			}
		}
	}

}
