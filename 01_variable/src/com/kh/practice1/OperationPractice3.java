package com.kh.practice1;
import java.util.Scanner;
public class OperationPractice3 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("국어 : ");
		double korea = sc.nextDouble();
		System.out.print("영어 : ");
		double english = sc.nextDouble();
		System.out.print("수학 : ");
		double math = sc.nextDouble();
		
		int total = (int)(korea + english + math);
		int avg = total / 3;
		System.out.println("총점 : " + total);
		System.out.print("평균 : " + avg);
		
		
	}
}
