package com.kh.practice.point.view;

import java.util.Scanner;

import com.kh.practice.point.controller.CircleController;
import com.kh.practice.point.controller.RectangleController;

public class PointMenu {

	private Scanner sc = new Scanner(System.in);

	private CircleController cc = new CircleController();

	private RectangleController rc = new RectangleController();

	public void mainMenu() {

		while (true) {

			System.out.println("===== 메뉴 =====");
			System.out.println("1. 원");
			System.out.println("2. 사각형");
			System.out.println("9. 끝내기");

			System.out.print("메뉴 번호 : ");
			int num = sc.nextInt();

			if (num == 1) {
				circleMenu();
			} else if (num == 2) {
				rectangleMenu();
			} else if (num == 9) {
				System.out.println("종료합니다.");
				return;
			} else {
				System.out.println("다시 입력해주세요");
			}
		}

	}

	public void circleMenu() {

		while (true) {
			System.out.println("===== 원 메뉴 =====");
			System.out.println("1. 원 둘레");
			System.out.println("2. 원 넓이");
			System.out.println("9. 메인으로");

			System.out.print("메뉴 번호 : ");
			int num = sc.nextInt();

			switch (num) {
			case 1:
				calcCircum();
				return;
			case 2:
				calcCircleArea();
				return;
			case 9:
				return;
			default:
				System.out.println("다시 입력해주세요");
				break;

			}
		}

	}

	public void rectangleMenu() {
		
		while (true) {
			System.out.println("===== 메뉴 =====");
			System.out.println("1. 사각형 둘레");
			System.out.println("2. 사각형 넓이");
			System.out.println("3. 메인으로");

			System.out.print("메뉴 번호 : ");
			int num = sc.nextInt();

			switch (num) {
			case 1:
				calcPerimeter();
				return;
			case 2:
				calcRectArea();
				return;
			case 3:
				return;
			default:
				System.out.println("다시 입력해주세요");
				break;

			}
		}

	}




	public void calcCircum() {
		
		System.out.print("x 좌표 : ");
		int x = sc.nextInt();
		System.out.print("y 좌표 : ");
		int y = sc.nextInt();
		System.out.print("반지름 : ");
		int rad = sc.nextInt();
		
	
		System.out.print(cc.calcCircum(x, y, rad));
	}

	public void calcCircleArea() {
		
		System.out.print("x 좌표 : ");
		int x = sc.nextInt();
		System.out.print("y 좌표 : ");
		int y = sc.nextInt();
		System.out.print("반지름 : ");
		int rad = sc.nextInt();

		System.out.print(cc.calcArea(x, y, rad));
	}

	public void calcPerimeter() {
		
		System.out.print("x 좌표 : ");
		int x = sc.nextInt();
		System.out.print("y 좌표 : ");
		int y = sc.nextInt();
		System.out.print("높이 : ");
		int hi = sc.nextInt();
		System.out.print("너비 : ");
		int wid = sc.nextInt();
		
		System.out.print(rc.calcPerimeter(x, y, hi, wid));

	}

	public void calcRectArea() {
		
		System.out.print("x 좌표 : ");
		int x = sc.nextInt();
		System.out.print("y 좌표 : ");
		int y = sc.nextInt();
		System.out.print("높이 : ");
		int hi = sc.nextInt();
		System.out.print("너비 : ");
		int wid = sc.nextInt();
		
		System.out.print(rc.calcRectArea(x, y, hi, wid));

	}

}
