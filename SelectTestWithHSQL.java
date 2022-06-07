import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SelectTestWithHSQL {
	public static void main(String[] args) {
		
		
		
		
		
		
		
		
		try {
			//1. load the driver...
			System.out.println("Trying to load the driver...");
			//DriverManager.registerDriver(new oracle.jdbc.OracleDriver());
			DriverManager.registerDriver(new org.hsqldb.jdbc.JDBCDriver());
			System.out.println("Loaded the HSQLDB driver.....");
			
			System.out.println("Trying to connect to the DB...");
			Connection conn = DriverManager.getConnection("jdbc:hsqldb:hsql://localhost/xdb","SA","");
			
			//Connection conn = DriverManager.getConnection("jdbc:oracle:thin:"
			//		+ "@localhost:1521:xe",
			//		"system", "sysgitc");
			System.out.println("connected to the HSQLDB ...."+conn);
			
			System.out.println("Trying to create statement...");
			Statement statement = conn.createStatement();
			System.out.println("Statement created : "+statement);
			
			System.out.println("Trying to execute statement...");
			ResultSet resultSet = statement.executeQuery("SELECT * FROM dept");
			//ResultSet resultSet = statement.executeQuery("SELECT * FROM emp");
			//ResultSet resultSet = statement.executeQuery("SELECT * FROM customer");
			
			System.out.println("Statement executed : got the result : "+resultSet);
			
			while(resultSet.next()) {
				int deptno = resultSet.getInt(1);
				String deptName = resultSet.getString(2);
				String locName = resultSet.getString(3);
				System.out.println("DEPTNO   : "+deptno);
				System.out.println("DNAME    : "+deptName);
				System.out.println("LOCATION : "+locName);
				System.out.println("--------------------------");
			}
			resultSet.close();			statement.close();			conn.close();
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}
