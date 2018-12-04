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
		userInfo.setProperty("password", "root");
		
		if(conn == null) {
			try {
				conn = DriverManager.getConnection("jdbc:mysql://localhost:8889/tp_sgbd?useSSL=false", userInfo);
			}
			catch(SQLException e){
				e.printStackTrace();
			}
		}
		
		return conn;
	}
	

}
