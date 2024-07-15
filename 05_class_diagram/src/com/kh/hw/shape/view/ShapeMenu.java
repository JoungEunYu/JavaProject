package com.kh.hw.shape.view;

import java.util.Scanner;

import com.kh.hw.shape.controller.SquareController;
import com.kh.hw.shape.controller.TriangleController;

public class ShapeMenu {

	private Scanner sc = new Scanner(System.in);

	private SquareController scr = new SquareController();

	private TriangleController tc = new TriangleController();

	public void inputMenu() {

		while (true) {

			System.out.println("==== 도형 프로그램 ====");
			System.out.println("3. 삼각형");
			System.out.println("4. 사각형");
			System.out.println("9. 프로그램 종료");
			System.out.print("메뉴 번호 : ");

			int num = sc.nextInt();

			if (num == 3) {
				triangleMenu();
			} else if (num == 4) {
				squareMenu();
			} else if (num == 9) {
				System.out.println("프로그램을 종료합니다.");
				return;
			} else {
				System.out.println("잘못된 번호입니다. 다시 입력하세요.");
			}
		}
	}

	public void triangleMenu() {

		while (true) {

			System.out.println("1. 삼각형 면적");
			System.out.println("2. 삼각형 색칠");
			System.out.println("3. 삼각형 정보");
			System.out.println("9. 메인으로");
			System.out.print("메뉴 번호 : ");
			int num = sc.nextInt();

			switch (num) {
			case 1:
				inputSize(3, 1); // inputSize(type, menuNum)
				break;
			case 2:
				inputSize(3, 2);
				break;
			case 3:
				printInformation(3);
				break;
			case 9:
				System.out.println("메인으로 돌아갑니다.");
				return;
			default:
				System.out.println("잘못된 번호입니다. 다시 입력해주세요.");
			}
		}
	}

	public void squareMenu() {

		while (true) {

			System.out.println("1. 사각형 둘레");
			System.out.println("2. 사각형 면적");
			System.out.println("3. 사각형 색칠");
			System.out.println("4. 사각형 정보");
			System.out.println("9. 메인으로");
			System.out.print("메뉴 번호 : ");
			int num = sc.nextInt();

			switch (num) {
			case 1:
				inputSize(4, 1); // inputSize(type, menuNum)
				break; // 4 : 사각형 , 1 : 메뉴 1번
			case 2:
				inputSize(4, 2);
				break;
			case 3:
				inputSize(4, 3);
				break;
			case 4:
				printInformation(4);
				break;
			case 9:
				System.out.println("메인으로 돌아갑니다.");
				return;
			default:
				System.out.println("잘못된 번호입니다. 다시 입력해주세요.");
			}
		}

	}

	public void inputSize(int type, int menuNum) {

		// 중첩 if로하면 좋다
		if (type == 3 && menuNum == 1) {

			System.out.print("높이 : ");
			int h = sc.nextInt();

			System.out.print("너비 : ");
			int w = sc.nextInt();

			System.out.println("삼각형 면적 : " + tc.calcArea(h, w));

		} else if (type == 3 && menuNum == 2) {
			System.out.print("색깔을 입력하세요: ");
			String color = sc.next();
			tc.paintColor(color);
			System.out.println("색이 수정되었습니다.");

		} else if (type == 3 && menuNum == 3) {
			printInformation(3);

		} else if (type == 4 && (menuNum == 1 || menuNum == 2)) {
			System.out.print("높이 : ");
			int h = sc.nextInt();
			System.out.print("너비 : ");
			int w = sc.nextInt();

			if (menuNum == 1) {

				System.out.println("사각형 둘레 : " + scr.calcPerimeter(h, w));

			} else if (menuNum == 2) {

				System.out.println("사각형 면적 : " + scr.calcArea(h, w));

			}

		} else if (type == 4 && menuNum == 3) {
			System.out.print("색깔을 입력하세요 : ");
			String color = sc.next();
			scr.paintColor(color);
			System.out.println("색이 수정되었습니다.");
		} else if (type == 4 && menuNum == 4) {
			printInformation(4);
		}

	}

	public void printInformation(int type) {
		if (type == 3) {
			System.out.print(tc.print());
			return;
		} else if (type == 4) {
			System.out.print(scr.print());
			return;
		}
	}

}
