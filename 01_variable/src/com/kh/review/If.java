package com.kh.review;
import java.util.Scanner;

public class If {
	public static void main(String[] args) {
		/* 
		 * 조건문 : 조건에 따라 프로그램 흐름을 제어하고자 할 때 사용
		 *  - "조건식"을 통해서 참인지 거짓인지 판단하여 그에 해당하는 코드를 실행
		 *  	* 조건식의 결과 : true / false
		 *  	* 연산자 : 비교 연산자(대소/동등), 논리연산자 (&&, ||, ..) 주로 사용
		 *  
		 *  - if / switch
		 *  
		 *  	* if문
		 * 
		 * 			if(조건식1) {
		 * 				// 조건식1의 결과가 참일 때 실행할 코드
		 * 			} else if(조건식2) {
		 *				// 조건식1의 결과가 거짓이면서 조건식2의 결과가 참일 때 실행할 코드
		 * 			} 
		 * 			else {
		 *				// 조건식1, 조건식2의 결과가 모두 거짓일 때 실행할 코드
		 * 			}
		 * 
		 * 		* switch문
		 * 
		 * 			switch (조건식 => 비교대상) {
		 * 				case 값1 : // 비교 대상 == 값1인 경우 실행코드;
		 * 						  break; // break를 만나면 switch문이 종료
		 * 				default : // 모든 case 값에 해당되지 않을 경우 실행할 코드
		 * 			}
		 */
		
		// 대문자인지 확인하는 코드 => 조건문을 사용
		
		Scanner sc = new Scanner(System.in);
		
		char word = sc.nextLine().charAt(0);
		
		if (word >= 65 && word <= 90) {
			System.out.println("대문자");
		}
		else {
			System.out.println("대문자아님");
		}
		
		
	}

}
