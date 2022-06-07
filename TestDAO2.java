import java.util.List;

import dao.Employee;
import dao.EmployeeDAOImpl;
import myexceptions.EmployeeNotFoundException;

public class TestDAO2 {
	public static void main(String[] args) {
		EmployeeDAOImpl empDAO = new EmployeeDAOImpl();
		
		List<Employee> empList = empDAO.readAllEmployees();
			
			for (Employee empObj : empList) {
		
				System.out.println("EMPNO   : "+empObj.getEmployeeNumber());				
				System.out.println("ENAME   : "+empObj.getEmployeeName());				
				System.out.println("JOB     : "+empObj.getJob());
				System.out.println("DOJ     : "+empObj.getEmployeeHiringDate());
				
				System.out.println("MANAGER : "+empObj.getEmployeeManagerCode());				
				System.out.println("SALARY  : "+empObj.getBasicSalary());				
				System.out.println("COMM    : "+empObj.getCommission());
				System.out.println("DEPTNO  : "+empObj.getDepartmentNumber());
				System.out.println("----------------------------");
			}
		empDAO.closeDBResources();
	}
}
