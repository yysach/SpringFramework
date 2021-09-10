package com.InversionOfControlAnnotation;

import java.util.List;

public class Question {
	private int id;
	private String value;
	private List<Option> options;
	
	
	public Question() {
		super();
	}


	public Question(int id, String value,List<Option> options) {
		super();
		this.id = id;
		this.value = value;
		this.options=options;
	}


	@Override
	public String toString() {
		return "Question [id=" + id + ", value=" + value + ", options=" + options + "]";
	}

}
