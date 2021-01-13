package com.qa.main;

public class Lion extends Animal {

	@Override
	public String type() {
		
		return "Lion";
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
		
		return "ROAR";
	}

	@Override
	public String sleep() {
		// TODO Auto-generated method stub
		return "zzz";
	}

}
