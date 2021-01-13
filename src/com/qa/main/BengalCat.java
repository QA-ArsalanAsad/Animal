package com.qa.main;

public class BengalCat extends Animal implements Domesticateable {

	@Override
	public String type() {
		
		return "cat";
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
		return "meow";
	}

	@Override
	public String sleep() {
		
		return "zzzzzzzzz";
	}

	@Override
	public boolean domesticated() {
		return true;
	}

}
