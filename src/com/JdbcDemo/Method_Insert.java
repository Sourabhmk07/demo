package com.JdbcDemo;

import java.nio.charset.MalformedInputException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Method_Insert {

	void grtInsert(String name, String city, String mobile) {
		
		try {
			ConnectionTest ct = new ConnectionTest();
			Connection con = ct.getconnectionDetails();
			PreparedStatement prs = con.prepareStatement("insert into Student(name,city,mobile)values(?,?,?)");
			prs.setString(1, name);
			prs.setString(2, city);

			prs.setString(1, mobile);
			int i = prs.executeUpdate();
			System.out.println("Excute " + i);

		} catch (SQLException e) {

			e.printStackTrace();
		}

	}

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no data for insert ");
		int s = sc.nextInt();
		for (int i = 1; i <= s; i++) {
			System.out.println("Enter Name");
		String name = sc.next();
		System.out.println("Enter city");
		String city=sc.next();
		System.out.println("Enter mobile");
		String mobile=sc.next();
		Method_Insert mi=new Method_Insert();
		mi.grtInsert(name, city, mobile);
		

	}
	}

}
