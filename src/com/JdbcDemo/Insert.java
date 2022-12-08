package com.JdbcDemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class Insert {
	public static void main(String[] args) throws SQLException {
		try {
			String sql="insert into Student(name,city,mobile)values('Vishal','Mumbai','222505552')";
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/demo","root","root");
			//Statement statement=con.createStatement();
			PreparedStatement stmt=con.prepareStatement("insert into Student(name,city)values(?,?)");
			stmt.setString(1, "Pratik");
			stmt.setString(2, "Pune");
			int i=stmt.executeUpdate();
			System.out.println("Excute Statement" +i);
			
			
			
			
			
			
			
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		}
	}

}
