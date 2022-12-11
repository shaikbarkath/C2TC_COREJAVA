package com.cg.ThisKeyword;

public class S2 {
	void m(S2 a)
	{
		System.out.println("method is invoked");
	}
	void p()
	{
		m(this);
	}


}