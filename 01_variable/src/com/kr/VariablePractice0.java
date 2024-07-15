package com.kr;

public class VariablePractice0 {
	
	public static void main(String[] args) {
		
		/* 
		 * 예제 1) 변수를 사용해서 아래 코드를 이해하기 쉽도록 변경해보기.
		 * - 연도에 해당하는 값을 정수형(int) 타입의 year 이름의 변수로 선언
		 * - 현재 연도를 year 변수에 대입
		 * 
		 * - 나이에 해당하는 값을 정수형(int) 타입의 age 이름의 변수로 선언 및 대입
		 * */
		// 변수를 사용하지 않은 경우
		System.out.println("[1] 현재 2024년이고, 올해 20살입니다.");
		
		//변수 선언 및 대입
		int year = 2024;
		int age = 20;
		
		System.out.println("[2] 현재 " + year + "년이고, 올해 " + age + "살입니다.");
		System.out.printf("[3] 현재 %d년이고, 올해 %d살입니다. \n",year , age);
		

		final int LIMIT_WEIGHT = 80;		
		System.out.println("몸무게가 " + LIMIT_WEIGHT + "kg 이상인 경우 탑승을 못합니다.");
		
		/*
		 * 형변환 : 연산을 할 때 자료형의 종류가 다른 경우 현변화이 발생한다.
		 * - 자동형변환 규칙 
		 * 	[1] 값의 범위가 작은 범위에서 큰 범위로 형변환이 발생한다.
		 * 	[2] 정수형과 실수형의 연산시에는 정수형에서 실수형으로 형변화 발생
		 * 
		 * */
		
		int num1 = 10;
		double dNum1 = 5.5;
		char ch = 'A';
		int c = 'A';
		int sh = 65;
		
		System.out.println(num1 + dNum1);
		System.out.println(num1 + (int)dNum1);
		System.out.println((int)ch);
		System.out.println(c);
		System.out.println(ch + 3);
		System.out.println((char)sh);
		System.out.println((char)(ch + 3));
		}

}
