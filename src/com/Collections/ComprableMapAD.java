package com.Collections;

public class ComprableMapAD implements Comparable<ComprableMapAD> {
	private int id;
	private String name;
	private String city;
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
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public ComprableMapAD(int id, String name, String city) {
		super();
		this.id = id;
		this.name = name;
		this.city = city;
	}
	@Override
	public String toString() {
		return "ComprableMapAD [id=" + id + ", name=" + name + ", city=" + city + "]";
	}
	@Override
	public int compareTo(ComprableMapAD emp) {
		if(id==emp.id)
		return 0;
		if(id>emp.id)
			return 1;
		else
			return -1;
	}
	

}
