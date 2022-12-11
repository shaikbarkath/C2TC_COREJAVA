package com.cg.ThisKeyword;

public class A4 {
	int data=10;
	A4(){
		B b=new B(this);
		b.display();
	}


}