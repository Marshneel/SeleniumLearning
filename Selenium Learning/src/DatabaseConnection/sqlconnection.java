package DatabaseConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class sqlconnection {

	public static void main(String[] args) {
		
		String connectionURL = "jdbc:sqlserver://localhost:1433;"+
		                       "databaseName=SN_aBILLity_Portal;integratedSecurity=true;";
		
		Connection con = null;
		Statement stmt = null;
		ResultSet rs = null;
		
		try {
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			con = DriverManager.getConnection(connectionURL);
			System.out.println("Connection Established");
			
			String SQL = "select * from wlr3_no_test_reason";
			stmt = con.createStatement();
			rs = stmt.executeQuery(SQL);

		        while(rs.next()){
			System.out.println(rs.getString(1) + "  " +rs.getString(2) + "  " +rs.getString(3));
		        }	
		 
		} catch (ClassNotFoundException | SQLException e) {


			e.printStackTrace();
		}
		
		

	}

}
