package com.Cristiano;

public class Employee {
	int id=7;
	String Name="Ronaldo";
	String City="manchester";
	

	@Override
	public String toString() {
		return "Employee [id=" + id + ", Name=" + Name + ", City=" + City + "]";
	}

	public Employee addEmpolyee() {

		Employee emp = new Employee();
		System.out.println(emp);
		return emp;

	}

	public static void main(String[] args) {
		Employee e=new Employee();
		e.addEmpolyee();
		

	}
}
