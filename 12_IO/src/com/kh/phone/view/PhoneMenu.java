package com.kh.phone.view;

import java.util.Scanner;

import com.kh.phone.controller.PhoneController;
import com.kh.phone.model.vo.PhoneBook;

public class PhoneMenu {

	private Scanner sc = new Scanner(System.in);
	private PhoneController dao = new PhoneController();
	private PhoneBook[] pArr = new PhoneBook[10];
	public void mainMenu() {

		while (true) {
			System.out.println("1. 정보 저장하기");
			System.out.println("2. 정보 출력하기");
			System.out.println("9. 프로그램 종료");
			
			System.out.print("메뉴 : ");
			int menu = sc.nextInt();

			switch (menu) {
			case 1:
				fileSave();
				break;
			case 2:
				fileRead();
				break;
			case 9:
				System.out.println("프로그램을 종료합니다.");
				return;
			default:
				System.out.println("다시 입력하세요.");
			}
		}

	}

	public void fileSave() {
		
		sc.nextLine();
		
		System.out.print("이름 : ");
		String name = sc.nextLine();
		
		System.out.print("연락처 : ");
		String phone = sc.nextLine();
		
		System.out.print("소속 : ");
		String dept = sc.nextLine();
		
		System.out.print("이메일 : ");
		String email = sc.nextLine();
		
		System.out.print("메모 : ");
		String memo = sc.nextLine();
		
		PhoneBook book = new PhoneBook(name, phone, dept, email, memo);
		
		for(int i = 0; i < pArr.length; i++) {
			if (pArr[i] == null) {
				pArr[i] = book;
				break;
			}
		}
		
		dao.fileSave(pArr);
	}

	public void fileRead() {
		
		PhoneBook[] pList = dao.fileRead();
		pArr = dao.fileRead();
		for(PhoneBook p : pList) {
			if(p != null) {
				System.out.println(p);
			}
		}

	}
}
