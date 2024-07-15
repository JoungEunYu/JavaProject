package com.kh.practice;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionRun {

	public static void main(String[] args) {
	}

	/*
	 * 1. ArithemeticException, InputMismatchException 사용자로부터 2개의 정수를 입력받고, 첫 번째 입력된
	 * 값이 두 번째 입력된 값의 배수인지 확인하여 배수인 경우에는 "x은 x의 배수 입니다." 배수가 아닌 경우에는
	 * "x은 x의 배수가 아닙니다." 출력 (프로그램이 정상적으로 종료될 수 있도록 시작 지점에 "----- start -----" 마지막
	 * 지점에 "----- end -----"
	 */
	public static void exceptionTest1() {

		System.out.println("----- start -----");
		Scanner sc = new Scanner(System.in);

		try {
			int num1 = sc.nextInt();
			int num2 = sc.nextInt();

			if (num1 % num2 == 0) {
				System.out.printf("%d는 %d의 배수 입니다.", num1, num2);
			} else {
				System.out.printf("%d는 %d의 배수가 아닙니다.", num1, num2);
			}
		} catch (ArithmeticException | InputMismatchException e) {
			e.printStackTrace();
		}
		System.out.println("----- end -----");

	}

	/*
	 * NegativeArraySizeException, ArrayIndexOutOfBoundsException -5 ~ 5 사이의 난수를
	 * 발생시켜 해당 난수 크기로 배열을 생성한 후에 1부터 배열 크기만큼 1씩 증가시키면서 값을 저장한 후 출력 (프로그램이 정상적으로 종료되는
	 * 것을 확인하기 위해 처음과 끝에 "start", "end" 출력)
	 */

	public static void exceptionTest2() {
		System.out.println("----- start -----");
		try {
			int num = (int) (Math.random() * 11) - 5; // 0.0 ~ 0.9 -> 1.0 ~ 9.0 -> 최대수 - 최소수 +1 그게 10 대신 들어가고 +1 대신 최소수
														// 들어간다.
			int[] number = new int[num];

			int ini = 1;
			for (int i = 0; i < number.length; i++) {
				number[i] = ini;
				ini++;
			}
			for (int i = 0; i < number.length; i++) {
				System.out.print(number[i] + " ");
			}
		} catch (NegativeArraySizeException | ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		}
		System.out.println("----- end -----");
	}

	/*
	 * [사용자 정의 예외클래스 만들기] - Exception 클래스 상속 - 생성자 (기본/매개변수 1개 -> msg: String) 사용자에게
	 * 입력받은 값의 길이가 3 이하인 경우 예외를 발생시키기! - 클래스명 : ValueLengthException - main 메소드에서
	 * 예외처리
	 */

}




