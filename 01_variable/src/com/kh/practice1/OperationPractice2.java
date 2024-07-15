package com.kh.practice1;
import java.util.Scanner;
public class OperationPractice2 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("가로 : ");
		double width = sc.nextDouble();
		
		System.out.print("세로 : ");
		double height = sc.nextDouble();
		
		double area = width * height;
		double doll = (width + height) * 2;	
		
		System.out.println("면적 : " + area);
		System.out.print("둘레 : ");
		
	}

}
