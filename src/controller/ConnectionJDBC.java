package controller;
import java.sql.*;
import java.util.Properties;


public class ConnectionJDBC {
	// Attributes
	private static Connection conn;
	private static Properties userInfo = new Properties();
	
	// Methods
	public static Connection initConnection() {
		
		userInfo.setProperty("user", "root");
		userInfo.setProperty("password", "");
		
		if(conn == null) {
			try {
				conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/tp5_sgbd?useSSL=false", userInfo);
			}
			catch(SQLException e){
				e.printStackTrace();
			}
		}
		
		return conn;
	}
	

}
