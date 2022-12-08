package com.A;

public class Employee {
	private int id;
	String name;
	private String Salaray;
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
	public String getSalaray() {
		return Salaray;
	}
	public void setSalaray(String salaray) {
		Salaray = salaray;
	}
	public Employee(int id, String name, String salaray) {
		super();
		this.id = id;
		this.name = name;
		Salaray = salaray;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", Salaray=" + Salaray + "]";
	}
	 

}
