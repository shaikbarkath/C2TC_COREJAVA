package com.cg.abstractclass;

import java.util.Scanner;

public class Main1 {

	private static Scanner s;

	public static void main(String[] args) {
		s = new Scanner(System.in);
		String title=s.nextLine();
		MyMovie m = new MyMovie();
		m.setTitle(title);
		System.out.println("the title is :"+m.getTitle());

	}

}