package com.JdbcDemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UPdate_Delete {
	public static void main(String[] args) throws SQLException {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/demo","root","root");
			PreparedStatement stml=con.prepareStatement("Delete from Student  where id=5");
			int i=stml.executeUpdate();
			System.out.println("Update Sucessfully" +i);
			
			
			
			
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		}
	}

}
