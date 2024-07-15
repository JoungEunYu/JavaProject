package com.kh.practice.map.view;

import java.util.Map.Entry;
import java.util.Scanner;
import java.util.TreeMap;

import com.kh.practice.map.controller.MemberController;
import com.kh.practice.map.model.vo.Member;

public class MemberMenu {

	private Scanner sc = new Scanner(System.in);
	private MemberController mc = new MemberController();

	public void mainMenu() {

		System.out.println("=========KH 사이트 =========");

		while (true) {
			System.out.println("****** 메인 메뉴 ******");

			System.out.println("1. 회원가입");
			System.out.println("2. 로그인");
			System.out.println("3. 같은 이름 회원 찾기");
			System.out.println("9. 종료");

			System.out.print("메뉴 번호 입력 : ");
			int menu = sc.nextInt();

			switch (menu) {
			case 1:
				joinMembership();
				break;
			case 2:
				logIn();

				break;
			case 3:
				sameName();
				break;
			case 9:
				System.out.println("프로그램 종료");
				return;
			default:
				System.out.println("잘못 입력하였습니다. 다시 입력해주세요");
				break;
			}
		}

	}

	public void memberMenu() {

		while (true) {

			System.out.println("1. 비밀번호 바꾸기");
			System.out.println("2. 이름 바꾸기");
			System.out.println("3. 로그아웃");

			System.out.print("메뉴 번호 입력 : ");
			int menu = sc.nextInt();

			switch (menu) {
			case 1:
				changePassword();
				break;
			case 2:
				changeName();
			case 3:
				System.out.println("로그아웃 되었습니다.");
				return;
			default:
				System.out.println("잘못 입력하였습니다. 다시 입력해주세요.");

			}
		}
	}

	public void joinMembership() {

		/*
		 * 회원가입하기 위해 아이디, 비밀번호, 이름을 받고 비밀번호와 이름은 Member객체에 담고 id와 객체는
		 * MemberController(mc)의 joinMembership()로 보냄. 받은 결과에 따라 true면 “성공적으로 회원가입
		 * 완료하였습니다.”, false면 “중복된 아이디입니다. 다시 입력해주세요.” 출력
		 */

		while (true) {

			System.out.print("아이디 : ");
			String id = sc.next();

			System.out.print("비밀번호 : ");
			String password = sc.next();

			sc.nextLine();
			System.out.print("이름 : ");
			String name = sc.nextLine();

			Member mb = new Member(password, name);
			if (mc.joinMembership(id, mb)) {
				System.out.println("성공적으로 회원가입 완료하였습니다.");
				break;
			} else {
				System.out.println("중복된 아이디입니다. 다시 입력해주세요.");
				break;
			}
		}

	}

	public void logIn() {

		while (true) {

			System.out.print("아이디 : ");
			String id = sc.next();

			System.out.print("비밀번호 : ");
			String password = sc.next();

			Member mb = new Member();
			if (mc.lonIn(id, password) != null) {
				System.out.println(mc.lonIn(id, password) + "님, 환영합니다!");
				memberMenu();
			} else {
				System.out.println("틀린 아이디 또는 비밀번호입니다. 다시 입력해주세요.");
			}
		}
	}

	public void changePassword() {

		while (true) {

			System.out.print("아이디 : ");
			String id = sc.next();

			System.out.print("현재 비밀번호 : ");
			String oldPassword = sc.next();
			System.out.print("새로운 비밀번호 : ");
			String newPassword = sc.next();

			if (mc.changePassword(id, oldPassword, newPassword)) {
				System.out.println("비밀번호 변경에 성공했습니다.");
				break;
			} else {
				System.out.println("비밀번호 변경에 실패했습니다. 다시 입력해주세요.");
			}
		}
	}

	public void changeName() {

		while (true) {
			System.out.print("아이디 : ");
			String id = sc.next();

			System.out.print("비밀번호 : ");
			String Password = sc.next();

			if (mc.lonIn(id, Password) != null) {
				System.out.println("현재 설정된 이름 : " + mc.lonIn(id, Password));

				System.out.print("변경할 이름 : ");
				String newName = sc.nextLine();
				mc.changeName(id, newName);

				System.out.println("이름 변경에 성공하였습니다.");
			} else {
				System.out.println("이름 변경에 실패했습니다. 다시 입력해주세요.");
			}
		}

	}

	public void sameName() {

		System.out.print("검색할 이름 : ");
		String searchName = sc.nextLine();
		
		TreeMap result = mc.sameName(searchName);
		// 검색 결과가 있는 지 여부 확인
		if(result.isEmpty()) {
			System.out.println("검색 결과가 없습니다.");
		} else {
			for(Object entry : result.entrySet()) {
				Entry<String, String> e = (Entry)entry;
				System.out.println(e.getValue() + "-" + e.getKey());
			}
		}

	}

}
