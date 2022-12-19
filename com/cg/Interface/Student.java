package com.cg.Interface;

public class Student implements Readable,writeable {
	public void reads() {
		System.out.println("student reads..");
	}

	public void writes() {
		System.out.println("student  writes...");
	}

	public static void main(String[] args) {
		Student s = new Student();
		s.reads();
		s.writes();

	}

}