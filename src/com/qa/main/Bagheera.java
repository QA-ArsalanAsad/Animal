package com.qa.main;

public class Bagheera extends Animal implements Cartoonable {

	@Override
	public String type() {
		
		return "Bagheera";
	}

	@Override
	public int legs() {
		// TODO Auto-generated method stub
		return 4;
	}

	@Override
	public boolean tail() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public String makeNoise() {
		// TODO Auto-generated method stub
		return "bear necessities";
	}

	@Override
	public String sleep() {
		// TODO Auto-generated method stub
		return "zzzz";
	}

	@Override
	public String cartoon() {
		
		return "I am a cartoon";
	}
	

}
