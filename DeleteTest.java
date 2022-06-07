import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class DeleteTest {
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
			PreparedStatement pst = conn.prepareStatement("delete from emp where empno=?");
			System.out.println("PreparedStatement created : "+pst);
			
			System.out.println("Trying to execute statement...");
			Scanner scan1 = new Scanner(System.in);
			
			System.out.println("Enter new emp number delete : " );
			int empNumber = scan1.nextInt();
			
			Statement statement = conn.createStatement();
			ResultSet rs = statement.executeQuery("select * from emp where empno="+empNumber);
			
			if(rs.next()) {
				pst.setInt(1, empNumber );
				int rowsDeleted = pst.executeUpdate();
				System.out.println("Statement executed : rows deleted : "+rowsDeleted);
			}
			else {
				EmployeeNotFoundException ex = new EmployeeNotFoundException("Employee not found : "+empNumber);
				throw ex;
			}
			
			pst.close();			conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}
