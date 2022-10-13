package DB;

import java.sql.*;

public class DBConnect {

	public static Connection conn = null;

	public static Connection getConnection() {
		
		try{
			
			Class.forName("oracle.jdbc.OracleDriver");
			
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String id = "system";
			String pw = "1234";
			
			conn = DriverManager.getConnection(url, id, pw);
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		return conn;
	}	
}
	
