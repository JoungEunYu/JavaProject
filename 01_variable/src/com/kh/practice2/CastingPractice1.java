package com.kh.practice2;
import java.util.Scanner;
public class CastingPractice1 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자 : ");
		String ch = sc.nextLine();
		
		char ok = ch.charAt(0);
		System.out.print(ok + " unicode : " + (int)ok);
		
		
	}

}
