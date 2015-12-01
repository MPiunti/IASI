package com.unicredit.iasi.ws.domain;

public class Temperature {
	
	private Float celsius;
	private Float farenheit;
	
	//getter and setter
	public Float getCelsius() {
		return celsius;
	}
	public void setCelsius(Float celsius) {
		this.celsius = celsius;
	}
	public Float getFarenheit() {
		return farenheit;
	}
	public void setFarenheit(Float farenheit) {
		this.farenheit = farenheit;
	}
	
	@Override
	public String toString(){
		return " Celsius:" + celsius + "  Farenheit:" + farenheit;
	}
	
	

	
}
