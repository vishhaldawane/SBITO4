import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class InsertTest {
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
			PreparedStatement pst = conn.prepareStatement("insert into emp values (?,?,?,?,?,?,?,?)");
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
			
			System.out.println("Enter new emp number : " );
			int empNumber = scan1.nextInt();
			//hint : run the select query with Statement interface
			// to find if employee exists - if (rs.next()) 
			// if found, EmployeeAlreayExistsException thrown...Checked Exception
			
			System.out.println("Enter new emp name   : " );
			String empName = scan2.nextLine();
			
			
			System.out.println("Enter new emp job    : " );
			String empJob = scan3.nextLine(); //new york
			
			System.out.println("Enter new emp manager: " );
			int managerCode= scan4.nextInt();
			
			System.out.println("Enter new emp joining: " );
			String str = scan5.next();
			java.sql.Date doj = Date.valueOf(str); 
			
			System.out.println("Enter new emp salary : " );
			double empSalary = scan6.nextDouble();
			
			System.out.println("Enter new emp comm   : " );
			double empComm= scan7.nextDouble();
			
			System.out.println("Enter new dept num   : " );
			int deptNumber = scan8.nextInt();
			
			pst.setInt(1, empNumber );
			pst.setString(2, empName);
			pst.setString(3, empJob);
			pst.setInt(4, managerCode);
			pst.setDate(5, doj );
			pst.setDouble(6, empSalary );
			pst.setDouble(7, empComm );
			pst.setInt(8, deptNumber );
			
			int rowsInserted = pst.executeUpdate();
			
			System.out.println("Statement executed : rows created : "+rowsInserted);
			pst.close();			conn.close();
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}
