package com.kh.practice.chap02.loop;

import java.util.Scanner;

public class LoopPractice {
	Scanner sc = new Scanner(System.in);

	public void pracitce1() {

		System.out.print("1 이상의 숫자를 입력하세요. : ");
		int num = sc.nextInt();

		if (num < 1) {
			System.out.print("1 이상의 숫자를 입력해주세요.");
		} else if (num >= 1) {
			for (int i = 1; i <= num; i++) {
				System.out.print(i);
				if (i != num) {
					System.out.print(" ");
				}
			}
		}

	}

	public void practice2() {

		while (true) {
			System.out.print("1 이상의 숫자를 입력하세요. : ");
			int num = sc.nextInt();

			if (num < 1) {
				System.out.println("1 이상의 숫자를 입력해주세요.");
			} else {
				for (int i = 1; i <= num; i++) {
					System.out.print(i);
					if (i != num) {
						System.out.print(" ");
					}
				}
				break;

			}
		}
//		
//		System.out.print("1이상의 숫자를 입력하세요 : ");
//		int num = sc.nextInt();
//		
//		do {
//			if (num >= 1) {
//				for(int i=1; i<=num; i++) {
//					System.out.print(i);
//					if (i!=num) {
//						System.out.print(" ");						
//					}
//				}
//				break;
//			} else {
//				System.out.println("1 이상의 숫자를 입력해주세요.");
//				
//				System.out.print("1이상의 숫자를 입력하세요: ");
//				num = sc.nextInt();			
//				}
//		}while(true);
	}

	public void practice3() {

		System.out.print("1이상의 숫자를 입력하세요 : ");
		int num = sc.nextInt();
		for (int i = num; i > 0; i--) {
			System.out.print(i);
			if (i > 1) {
				System.out.print(" ");
			}
		}
	}

	public void pracitce4() {

		while (true) {
			System.out.print("1이상의 숫자를 입력하세요 : ");
			int num = sc.nextInt();

			if (num < 1) {
				System.out.println("1이상의 숫자를 입력하세요.");
			} else {
				for (int i = num; i > 0; i--) {
					System.out.print(i);
					if (i > 1) {
						System.out.print(" ");
					}
				}
				break;
			}

		}
	}

	public void practice5() {
		System.out.print("정수를 하나 입력하세요 : ");
		int num = sc.nextInt();
		int sum = 0;

		for (int i = 1; i <= num; i++) {
			sum = sum + i;
			if (i != num) {
				System.out.print(i + " + ");
			} else {
				System.out.print(i);
				System.out.print(" = " + sum);
			}
		}
	}

	public void practice6() {
		System.out.print("첫 번째 숫자 : ");
		int num1 = sc.nextInt();
		System.out.print("두 번째 숫자 : ");
		int num2 = sc.nextInt();

		if (num1 < 1 || num2 < 1) {
			System.out.print("1 이상의 숫자를 입력해주세요.");
		} else {
			int min = num1 < num2 ? num1 : num2;
			int max = num1 < num2 ? num2 : num1;

			for (int i = min; i <= max; i++) {
				System.out.print(i);
				if (i != max) {
					System.out.print(" ");
				}
			}
		}
	}

	public void practice7() {
		while (true) {
			System.out.print("첫 번째 숫자 : ");
			int num1 = sc.nextInt();
			System.out.print("두 번째 숫자 : ");
			int num2 = sc.nextInt();

			if (num1 < 1 || num2 < 1) {
				System.out.println("1 이상의 숫자를 입력해주세요.");
			} else {
				if (num1 > num2) {
					for (int i = num2; i <= num1; i++) {
						System.out.print(i + " ");
					}
				} else if (num2 > num1) {
					for (int i = num1; i <= num2; i++) {
						System.out.print(i + " ");
					}
				}
				break;
			}
		}
	}

	public void practice8() {
		System.out.print("숫자 : ");
		int num = sc.nextInt();

		System.out.println("==== " + num + "단" + " ====");

		for (int i = 1; i <= 9; i++) {
			System.out.println(num + " * " + i + " = " + (num * i));
		}
	}

	public void pracitce9() {
		System.out.print("숫자 : ");
		int num = sc.nextInt();

		if (num >= 10) {
			System.out.print("9이하의 숫자만 입력해주세요.");
		} else {
			for (int j = num; j <= 9; j++) {
				System.out.println("==== " + j + "단" + " ====");
				for (int i = 1; i <= 9; i++) {
					System.out.println(j + " * " + i + " = " + (j * i));
				}
			}
		}
	}

	public void practice10() {
		while (true) {
			System.out.print("숫자 : ");
			int num = sc.nextInt();

			if (num >= 10) {
				System.out.println("9이하의 숫자만 입력해주세요.");
			} else {
				for (int j = num; j <= 9; j++) {
					System.out.println("==== " + j + "단" + " ====");
					for (int i = 1; i <= 9; i++) {
						System.out.println(j + " * " + i + " = " + (j * i));
					}
				}
				break;
			}
		}
	}

	public void practice11() {
		System.out.print("시작 숫자 : ");
		int num1 = sc.nextInt();
		System.out.print("공차 : ");
		int num2 = sc.nextInt();

		for (int i = 1; i <= 10; i++) {
			System.out.print(num1);
			num1 += num2;
			if (i < 10) {
				System.out.print(" ");
			}
		}
	}

	public void practice12() {
		
		while(true) {
		
		System.out.print("연산자(+, -, *, /, %) : ");
		String giho = sc.next();

		if (giho.equals("exit")) {
			System.out.print("프로그램을 종료합니다.");
			break;
		} else {

			System.out.print("정수1 : ");
			int num1 = sc.nextInt();

			System.out.print("정수2 : ");
			int num2 = sc.nextInt();

			int result;

			switch (giho) {
			case "+":
				result = num1 + num2;
				System.out.println(num1 + " + " + num2 + " = " + result);
				break;
			case "-":
				result = num1 - num2;
				System.out.println(num1 + " - " + num2 + " = " + result);
				break;
			case "*":
				result = num1 * num2;
				System.out.println(num1 + " * " + num2 + " = " + result);
				break;
			case "/":
				if (num2 != 0) {
					result = num1 / num2;
					System.out.println(num1 + " / " + num2 + " = " + result);
				} else {
					System.out.println("0으로 나눌 수 없습니다. 다시 입력해주세요.");
				}
				break;
			case "%":
				result = num1 % num2;
				System.out.print(num1 + " % " + num2 + " = " + result);
				break;
			default:
				System.out.println("없는 연산자입니다. 다시 입력해주세요.");
				}
			} 
		}
	}

	public void practice13() {
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();

		for (int i = 1; i <= num; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

	public void practice14() {
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();

		for (int i = num; i > 0; i--) {
			for (int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
