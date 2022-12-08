package com.A;

public class Demo {
	private int id;
	private String name;
	private String EmployeeSalary;
	public Demo(int id, String name, String employeeSalary) {
		super();
		this.id = id;
		this.name = name;
		EmployeeSalary = employeeSalary;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmployeeSalary() {
		return EmployeeSalary;
	}
	public void setEmployeeSalary(String employeeSalary) {
		EmployeeSalary = employeeSalary;
	}
	@Override
	public String toString() {
		return "Demo [id=" + id + ", name=" + name + ", EmployeeSalary=" + EmployeeSalary + "]";
	}
	
	
 
	
	
}
