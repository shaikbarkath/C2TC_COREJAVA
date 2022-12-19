package com.cg.ThisKeyword;

public class Demo {
	Demo()
    {
    	System.out.println("hello a");
    }
    Demo(int x)
    {
    	this();
    	System.out.println(x);
    }

}