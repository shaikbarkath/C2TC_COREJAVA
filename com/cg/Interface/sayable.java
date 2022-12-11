package com.cg.Interface;

public interface sayable {
	default void say() {
		System.out.println("hello ,this is default method");
	}
	void sayMore(String msg);

}
