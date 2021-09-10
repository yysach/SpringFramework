package com.InversionOfControl;

public class Student {
	private int id;
	private String name;
	
	private Address address;
	
	public Student() {
		super();
	}
	
	
	public Student(int id,String name,Address address) {
		this.id=id;
		this.name=name;
		this.address=address;
	}


	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", address=" + address + "]";
	}
	
	

}
