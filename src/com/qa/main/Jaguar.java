package com.qa.main;

public class Jaguar extends Animal {

	@Override
	public String type() {
		
		return "Jaguar";
	}

	@Override
	public int legs() {
		
		return 4;
	}

	@Override
	public boolean tail() {
		
		return true;
	}

	@Override
	public String makeNoise() {
		
		return "slightly weaker roar";
	}

	@Override
	public String sleep() {
		
		return "I dont sleep";
	}
	

}
