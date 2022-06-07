import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class UpdateTest {
	public static void main(String[] args) {
		
		try {
			//1. load the driver...
			System.out.println("Trying to load the driver...");
			DriverManager.registerDriver(new oracle.jdbc.OracleDriver());
			System.out.println("Loaded the driver.....");
			
			System.out.println("Trying to connect to the DB...");
			Connection conn = DriverManager.getConnection("jdbc:oracle:thin:"
					+ "@localhost:1521:xe",
					"system", "sysgitc");
			System.out.println("connected to the db...."+conn);
			
			System.out.println("Trying to create PreparedStatement...");
			PreparedStatement pst = conn.prepareStatement("UPDATE emp set ename=?,job=?,mgr=?,hiredate=?,sal=?,comm=?,deptno=? where empno=?");
			System.out.println("PreparedStatement created : "+pst);
			
			System.out.println("Trying to execute statement...");
			Scanner scan1 = new Scanner(System.in);
			Scanner scan2 = new Scanner(System.in);
			Scanner scan3 = new Scanner(System.in);
			Scanner scan4 = new Scanner(System.in);
			Scanner scan5 = new Scanner(System.in);
			Scanner scan6 = new Scanner(System.in);
			Scanner scan7 = new Scanner(System.in);
			Scanner scan8 = new Scanner(System.in);
			
			System.out.println("Enter new emp number to modify : " );
			int empNumber = scan1.nextInt();
			
			Statement statement = conn.createStatement();
			ResultSet rs = statement.executeQuery("select * from emp where empno="+empNumber);
			
			int empNumberFound;
			String empNameFound;
			String empJobFound;
			int empManagerFound;
			Date empDateFound;
			double empSalaryFound;
			double empCommFound;
			int empDeptFound;
			
			if(rs.next()) {
				empNumberFound = rs.getInt(1);
				empNameFound = rs.getString(2);
				empJobFound = rs.getString(3);
				empManagerFound = rs.getInt(4);
				empDateFound = rs.getDate(5);
				empSalaryFound = rs.getDouble(6);
				empCommFound = rs.getDouble(7);
				empDeptFound = rs.getInt(8);
				System.out.println("---CURRENT EMPLOYEE DETAILS ----");
				System.out.println("EMP NUMBER : "+empNumberFound);
				System.out.println("EMP NAME   : "+empNameFound);
				System.out.println("EMP JOB    : "+empJobFound);
				System.out.println("EMP MANAGER: "+empManagerFound);
				
				System.out.println("EMP JOINING: "+empDateFound);
				System.out.println("EMP SALARY : "+empSalaryFound);
				System.out.println("EMP COMM   : "+empCommFound);
				System.out.println("EMP DEPTNO : "+empDeptFound);
				
				System.out.println("Enter modified emp name   : " );
				String empName = scan2.nextLine();
				
				System.out.println("Enter modified emp job    : " );
				String empJob = scan3.nextLine(); //new york
				
				System.out.println("Enter modified emp manager: " );
				int managerCode= scan4.nextInt();
				
				System.out.println("Enter modified emp joining: " );
				String str = scan5.next();
				java.sql.Date doj = Date.valueOf(str); 
				
				System.out.println("Enter modified emp salary : " );
				double empSalary = scan6.nextDouble();
				
				System.out.println("Enter modified emp comm   : " );
				double empComm= scan7.nextDouble();
				
				System.out.println("Enter modified dept num   : " );
				int deptNumber = scan8.nextInt();
				
				pst.setString(1, empName); //update query ? fill up process
				pst.setString(2, empJob);
				pst.setInt(3, managerCode);
				pst.setDate(4, doj );
				pst.setDouble(5, empSalary );
				pst.setDouble(6, empComm );
				pst.setInt(7, deptNumber );
				
				pst.setInt(8, empNumber ); //for this emp number to update
				
				int rowsUpdated = pst.executeUpdate();
				System.out.println("Statement executed : rows updated: "+rowsUpdated);
			}
			else {
				EmployeeNotFoundException ex = new EmployeeNotFoundException("This employee number does not exists : "+empNumber);
				throw ex;
			}
			
			//hint : run the select query with Statement interface
			// to find if employee exists - if (rs.next()) 
			// if found, EmployeeAlreayExistsException thrown...Checked Exception
			
						

			pst.close();			conn.close();
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}
