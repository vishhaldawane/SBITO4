package dao;

import java.util.List;

import myexceptions.EmployeeAlreadyExistsException;
import myexceptions.EmployeeNotFoundException;
import myexceptions.EmptyTableException;

public interface EmployeeDAO {
	//CRUD
	void 			createEmployee(Employee empObj) throws EmployeeAlreadyExistsException;
	Employee 		readEmployee(int empNumber) throws EmployeeNotFoundException;
	List<Employee>  readAllEmployees() throws EmptyTableException;
	void 			updateEmployee(Employee empObj) throws EmployeeNotFoundException;
	void 			deleteEmployee(int empNumber) throws EmployeeNotFoundException;
}
