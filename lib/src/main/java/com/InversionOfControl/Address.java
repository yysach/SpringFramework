package com.InversionOfControl;

public class Address {
	private String street;
	private String city;
	private String state;
	private String country;
	public Address() {
		super();
	}
	
	public Address(String street,String city,String state,String country) {
		this.city=city;
		this.state=state;
		this.street=street;
		this.country=country;
	}

	@Override
	public String toString() {
		return "Address [street=" + street + ", city=" + city + ", state=" + state + ", country=" + country + "]";
	}
	
}
