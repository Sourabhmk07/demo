package com.JdbcDemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionTest {
	public Connection getconnectionDetails() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/demo","root","root");
		} catch (Exception  e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}
		Connection con=null;
		return con;
		
		
		
		
	}
	
	

}
