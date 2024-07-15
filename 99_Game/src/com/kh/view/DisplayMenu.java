package com.kh.view;

import java.util.Scanner;

import com.kh.controller.PlayController;

public class DisplayMenu {

	private Scanner sc = new Scanner(System.in);
	private PlayController pc = new PlayController();

	public void mainMenu() {

		while (true) {
			System.out.println("======Console Game======");
			System.out.println("1. Up & Down");
			System.out.println("2. 가위바위보");
			System.out.println("3. 숫자 야구");
			System.out.println("9. 점수 조회");
			System.out.println("0. 게임 종료");

			System.out.print("메뉴를 선택하세요 : ");

			int menu = sc.nextInt();

			switch (menu) {
			case 1:
				pc.game01();
				break;
			case 2:
				pc.game02();
				break;
			case 3:
				pc.game03();
				break;
			case 9:
				pc.scoreeeee();
				break;
			default:
				System.out.println("게임종료");
				return;
			}
		}
	}
}
