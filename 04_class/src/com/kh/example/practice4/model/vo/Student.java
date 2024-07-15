package com.kh.example.practice4.model.vo;

public class Student {
	
	private static int grade;
	private int classroom;
	private String name;
	private double height;
	private char gender;
	
//	
//	public Student(int grade, int classroom, String name, 
//			double height, char gender)  {
//		this.grade = grade;
//		this.classroom = classroom;
//		this.name = name;
//		this.height = height;
//		this.gender = gender;
//	}
	
	{
		grade = 1;
		classroom = 1;
		name = "똥꼬";
		height = 100;
		gender = '남';
	}
//	
	public Student() {
		
	}

	
	public void information() 
	{
		
		System.out.printf("%d학년 %d반 %s는 %.1fcm인 %c자 입니다.", 
				grade, classroom, name, height, gender);
		
	}
	
	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
	
	public int getClassroom() {
		return classroom;
	}
	public void setClassroom(int classroom) {
		this.classroom = classroom;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	
	public char getgender() {
		return gender;
	}
	public void setgender(char gender) {
		this.gender = gender;
	}


}
