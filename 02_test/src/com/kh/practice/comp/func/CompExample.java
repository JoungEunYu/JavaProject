package com.kh.practice.comp.func;

import java.util.Scanner;

public class CompExample {

	Scanner sc = new Scanner(System.in);

	public void practice1() {
		System.out.print("정수 : ");
		int num = sc.nextInt();

		if (num < 1) {
			System.out.print("양수가 아닙니다.");
		} else {
			for (int i = 1; i <= num; i++) {
				if (i % 2 == 0) {
					System.out.print("수");
				} else {
					System.out.print("박");
				}
			}
		}

	}

	public void practice2() {

		while (true) {

			System.out.print("정수 : ");
			int num = sc.nextInt();

			if (num < 1) {
				System.out.println("양수가 아닙니다.");
			} else {
				for (int i = 1; i <= num; i++) {
					if (i % 2 == 0) {
						System.out.print("수");
					} else {
						System.out.print("박");
					}

				}
				break;
			}
		}

	}

	public void practice3() {
		System.out.print("문자열 : ");
		String str = sc.nextLine();
		System.out.print("문자 : ");
		String word = sc.next();

		char b = word.charAt(0);
		int cont = 0;

		for (int i = 0; i < str.length(); i++) {
			char a = str.charAt(i);
			if (a == b) {
				cont++;

			}
		}
		System.out.printf("%s 안에 포함된 %s 개수 : %d", str, word, cont);
	}

}
