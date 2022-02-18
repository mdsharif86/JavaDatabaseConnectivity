import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBC_Example {

	public static void main(String[] args) throws SQLException {
		Connection conn;
		conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/dbmicrotech", "root", "root");
		
		Statement stmt;
		stmt = conn.createStatement();
		ResultSet rs = stmt.executeQuery("SELECT * FROM tblCustomer");
		
		System.out.println("Cust ID \t Cust Name \t Cust State");
		while (rs.next()) {
			System.out.println(rs.getString("custId")+"\t"+rs.getString("custName")+"\t"+rs.getString("custState"));
		}

	}

}
