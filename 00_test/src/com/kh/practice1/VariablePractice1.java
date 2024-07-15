package com.kh.practice1;
import java.util.Scanner;

public class VariablePractice1 {

	public static void main(String[] args) {
		// Q. 이름, 성별, 나이, 키를 사용자에게 입력받아
		// 각각의 값을 변수에 담고 출력하세요.
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름을 입력하세요 : ");
		String name = sc.nextLine();
		
		System.out.print("성별을 입력하세요(남/여) : ");
		String sex = sc.next();
		
		System.out.print("나이을 입력하세요 : ");
		int age = sc.nextInt();
		
		System.out.print("키를 입력하세요 : ");
		double height = sc.nextDouble();
		
		System.out.printf("키는 %.1fcm인 %d살 %s자인 %s님 반갑습니다^^.", height, age, sex, name);
		
	}

}

