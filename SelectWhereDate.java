import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class SelectWhereDate {
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
			
			System.out.println("Trying to create statement...");
			Statement statement = conn.createStatement();
			System.out.println("Statement created : "+statement);
			
			System.out.println("Trying to execute statement...");

			Scanner scan = new Scanner(System.in);
			System.out.println("Enter Start Date of Hiring : ");
			String startDateOfHiring= scan.next(); //1-Jul-1981
			
			System.out.println("Enter End Date of Hiring : ");
			String endDateOfHiring= scan.next(); //31-Dec-1981
			
			ResultSet resultSet = statement.executeQuery("SELECT * FROM emp"
			+ " where hiredate>="+"'"+startDateOfHiring+"' and "
					+ "hiredate<="+"'"+endDateOfHiring+"'");
			System.out.println("Statement executed : got the result : "+resultSet);
			if(resultSet != null)
			{
				while(resultSet.next()) {
					int empno = resultSet.getInt(1);
					String empName = resultSet.getString(2);
					String empJob = resultSet.getString(3);
					java.sql.Date empDoj = resultSet.getDate(5);
					System.out.println("EMPNO   : "+empno);				
					System.out.println("ENAME   : "+empName);				
					System.out.println("JOB     : "+empJob);
					System.out.println("DOJ     : "+empDoj);
					System.out.println("--------------------------");
				}
			}
			else {
				EmployeeNotFoundException ex = new EmployeeNotFoundException("Employee NOT found : ");
				throw ex;
			}
			
			resultSet.close();			statement.close();			conn.close();
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}
