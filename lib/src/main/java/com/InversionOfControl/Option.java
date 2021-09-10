package com.InversionOfControl;

public class Option {
	private int optionId;
	private String value;
	private boolean isCorrect;
	
	public Option() {
		super();
	}
	
	public Option(int id,String value) {
		this.value=value;
		this.optionId=id;
	}
	
	



	public boolean getIsCorrect() {
		return isCorrect;
	}

	public void setIsCorrect(boolean isCorrect) {
		this.isCorrect = isCorrect;
	}

	@Override
	public String toString() {
		return "Option [optionId=" + optionId + ", value=" + value + ", isCorrect=" + isCorrect + "]";
	}
	
	

}
