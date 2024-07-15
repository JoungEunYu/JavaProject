package com.kh.practice.chap02;

import java.lang.Math;

public class Practice {
	public void method1() {
		for (int i = 1; i <= 10; i++) {
			System.out.printf("%d", i);
			if (i != 10) { // i 값이 10이 아닐 때 띄어쓰기 출력
				System.out.print(" ");
			}
		}
		System.out.println("\n---------------------");

		for (int i = 10; i >= 1; i--) {
			System.out.printf("%d", i);
			if (i != 1) {
				System.out.print(" ");
			}
		}
		System.out.println("\n---------------------");
	}

	public void method2() {
		int s = 0;
		for (int i = 1; i <= 10; i++) {
			s += i;
		}

		System.out.printf("%d", s);
	}

	public void method3() {
		// 랜덤값까지의 총 합을 구하여 출력 (1 ~ 10 사이의 랜덤값)
		/*
		 * [랜덤값 구하는 방법] - Math : java.lang.Math * random() : 랜덤값을 반환해주는 메소드 => 사용법 :
		 * Math.random() 값의 범위 : 0.0 ~ 0.99999xx (0.0 <= n < 1.0) => 1~10 사이의 랜덤값 ->
		 * int(Math.random() * 10 + 1)
		 */

		int s = 0;
		int random = (int) (Math.random() * 10 + 1);

		System.out.println("랜덤값은 " + random + "입니다.");

		for (int i = 1; i <= random; i++) {
			s += i;
		}
		System.out.print(s);
	}

	public void method4() {
		// 분기문 : break (반복문 종료시키는 분기문)
		// 1 ~ 100 사이의 랜덤값을 추출하여 해당 랜덤값이 짝수 일때 반복문 종료
		// 홀수 일 때는 해당 값을 출력.

		while (true) {
			int random = (int) (Math.random() * 100 + 1);
			if (random % 2 == 0) {
				System.out.print("종료");
				break;
			}

			System.out.println(random);

		}
	}
	
	public void method5() {
		//1부터 10까지 정수 중에 짝수만 출력
		
		for ( int i = 1 ; i <= 10; i++) {
			if (i % 2 != 0) {
				continue;
			}			
				System.out.println(i);
		}
	}
}
