package com.InversionOfControlAnnotation;

public class Option {
	private int id;
	private String value;
	private boolean isCorrect;
	
	
	public Option() {
		super();
	}
	public Option(int id, String value) {
		super();
		this.id = id;
		this.value = value;
	}
	
	public Option(int id, String value, boolean isCorrect) {
		super();
		this.id = id;
		this.value = value;
		this.isCorrect = isCorrect;
	}
	public void setIsCorrect(boolean flag) {
		this.isCorrect= flag;
	}
	
	public boolean getIsCorrect() {
		return this.isCorrect;
	}
	@Override
	public String toString() {
		return "Option [id=" + id + ", value=" + value + ", isCorrect=" + isCorrect + "]";
	}

}
