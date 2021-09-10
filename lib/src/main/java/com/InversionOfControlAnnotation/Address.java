package com.InversionOfControlAnnotation;


public class Address {
	
	private String street;
	private String city;
	private String state;
	private String country;
	
	public Address() {
		super();
	}
	
	
	public Address(String street, String city, String state, String country) {
		super();
		this.street = street;
		this.city = city;
		this.state = state;
		this.country = country;
	}


	@Override
	public String toString() {
		return "Address [street=" + street + ", city=" + city + ", state=" + state + ", country=" + country + "]";
	};
	

}
