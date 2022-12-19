package com.cg.abstractclass;

public abstract class Bike {
	Bike(){
		System.out.println("bike constructor is called");
	}
	abstract void run();
	
	void changegear() {
		System.out.println("gear is changed");
	}

}
