package com.kh.practice;

public class Student {
	private int no;			//학번
	private String name;	//이름
	private int age;		//나이
	private char gender;	//성뱔
	
	public Student() {
	
	}
	
	public Student(int no, String name, int age, char gender) {
		this.no = no;
//		this.no = 101;
		this.name= name;
		this.age = age;
		this.gender = gender;
	}
	
	// 정보 조회
	
	public void inform() {
		
		System.out.println("[" + no + name + age + gender + "]");
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
}
