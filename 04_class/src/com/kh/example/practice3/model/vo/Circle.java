package com.kh.example.practice3.model.vo;

public class Circle {
	
	private static final double PI = 3.14;
	private static int radius = 1;
	private double d;
	private double n;
	
	public Circle() {
		
	}
	
	public void incrementRadius() {
		
		radius++;
		
	}
	
	public void getAreaOfCircle() {
		
		n = radius * radius * PI;
		System.out.printf("%.2f는 넓이 입니다.\n",n);
		
	}
	
	public void getSizeOfCircle() {
		
		d = 2 * radius * PI;
		System.out.printf("%.2f는 둘레 입니다.\n", d);
		
	}

}
