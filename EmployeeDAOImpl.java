package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import myexceptions.EmployeeAlreadyExistsException;
import myexceptions.EmployeeNotFoundException;
import myexceptions.EmptyTableException;

public class EmployeeDAOImpl implements EmployeeDAO {

	Connection conn; //global connection
	public void closeDBResources() {
		try {
			conn.close();
			System.out.println("DB connection is closed....");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public EmployeeDAOImpl() {
		try {
			System.out.println("Trying to load the driver...");
			DriverManager.registerDriver(new oracle.jdbc.OracleDriver());
			System.out.println("Loaded the driver.....");
			
			System.out.println("Trying to connect to the DB...");
			conn = DriverManager.getConnection("jdbc:oracle:thin:"
					+ "@localhost:1521:xe",
					"system", "sysgitc");
			System.out.println("connected to the db...."+conn);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	@Override
	public void createEmployee(Employee empObj) throws EmployeeAlreadyExistsException {
		// TODO Auto-generated method stub

	}

	@Override
	public Employee readEmployee(int empNumber) throws EmployeeNotFoundException {
		
		Employee empObj = null;
		
		try {
			System.out.println("Trying to create statement...");
			Statement statement = conn.createStatement();
			System.out.println("Statement created : "+statement);
			
			System.out.println("Trying to execute statement...");
			ResultSet resultSet = statement.executeQuery("SELECT * FROM emp where empno="+empNumber);
			
			System.out.println("Statement executed : got the result : "+resultSet);
			
			if(resultSet.next()) {
				empObj = new Employee(); //create a blank employee object
				
				//and fill it up if record is there
				empObj.setEmployeeNumber(resultSet.getInt(1));
				empObj.setEmployeeName(resultSet.getString(2));
				empObj.setJob(resultSet.getString(3));
				empObj.setEmployeeManagerCode(resultSet.getInt(4));
				empObj.setEmployeeHiringDate(resultSet.getDate(5));
				empObj.setBasicSalary(resultSet.getDouble(6));
				empObj.setCommission(resultSet.getDouble(7));
				empObj.setDepartmentNumber(resultSet.getInt(8));
			}
			else {
				throw new EmployeeNotFoundException("Employee Number does not exits : "+empNumber);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return empObj;
	}

	@Override
	public List<Employee> readAllEmployees() throws EmptyTableException {
		
		List<Employee> empList = new <Employee>ArrayList();
		
		Employee empObj = null;
		
		try {
			System.out.println("Trying to create statement...");
			Statement statement = conn.createStatement();
			System.out.println("Statement created : "+statement);
			
			System.out.println("Trying to execute statement...");
			ResultSet resultSet = statement.executeQuery("SELECT * FROM emp ");
			
			System.out.println("Statement executed : got the result : "+resultSet);
			
			while(resultSet.next()) {
				empObj = new Employee(); //create a blank employee object
				
				//and fill it up if record is there
				empObj.setEmployeeNumber(resultSet.getInt(1));
				empObj.setEmployeeName(resultSet.getString(2));
				empObj.setJob(resultSet.getString(3));
				empObj.setEmployeeManagerCode(resultSet.getInt(4));
				empObj.setEmployeeHiringDate(resultSet.getDate(5));
				empObj.setBasicSalary(resultSet.getDouble(6));
				empObj.setCommission(resultSet.getDouble(7));
				empObj.setDepartmentNumber(resultSet.getInt(8));
				
				empList.add(empObj); // list is being populated with new object 
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return empList;
	}
	
	@Override
	public void updateEmployee(Employee empObj) throws EmployeeNotFoundException {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteEmployee(int empNumber) throws EmployeeNotFoundException {
		// TODO Auto-generated method stub

	}

}
