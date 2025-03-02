package com.kh.ch05_object;

public class Student {
	/*
	 * 접근제한자 : 접근할 수 있는 범위를 제한하는 것
	 * 	public(+) > protected(#) > [default](~) > private(-)
	 */
	
	//필드부
	
	private String name;
	private int age;
	private double height;
	private String phone;
	private String address;
	
	//생성자부
	public Student() {
		
	}
	public Student(String name, int age, double height, String phone, String address) {
		
		this.name = name;
		this.age = age;
		this.height = height;
		this.phone = phone;
		this.address = address;
		
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	//메소드부
	public String toString() {
		return String.format("이름은 %s이고요.. 나이는 %d입니다. 키는 묻지마세요 %f이니까.. %s로 전화주세요 부재시 %s로 찾아오세요..", name, age, height, phone, address);
		// 반환타입 "void"가 아닐때는 반드시 return 값; 부분이 있어야 함.
		// 		=> void : 반환값이 없음을 의미
		
		
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
}
