package com.kh.practice.file.view;

import java.util.Scanner;

import com.kh.practice.file.controller.FileController;

public class FileMenu {

	Scanner sc = new Scanner(System.in);

	FileController fc = new FileController();

	public void mainMenu() {

		while (true) {

			System.out.println("***** My Note *****");
			System.out.println("1. 노트 새로 만들기");
			System.out.println("2. 노트 열기");
			System.out.println("3. 노트 열어서 수정하기");
			System.out.println("9. 끝내기");

			System.out.print("메뉴 번호 : ");

			int menu = sc.nextInt();
			sc.nextLine();

			switch (menu) {
			case 1:
				fileSave();
				break;
			case 2:
				fileOpen();
				break;
			case 3:
				fileEdit();
				break;
			case 9:
				System.out.println("프로그램을 종료합니다.");
				return;
			default:
				System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
				break;
			}
		}

	}

	public void fileSave() {

		StringBuilder sb = new StringBuilder();

		while (true) {
			System.out.println("파일에 저장할 내용을 입력하세요");
			System.out.println("ex끝it 이라고 입력하면 종료됩니다.");
			System.out.print("내용 : ");

			String content = sc.nextLine();

			if (!content.equals("ex끝it")) { // 입력값이 "ex끝it"가 아닌경우
				sb.append(content);
			} else {
				break;
			}
		}

		while (true) {
			// 사용자 입력이 끝난 후 ("ex끝it" 입력 후)
			System.out.println("저장할 파일명을 입력해주세요(ex. myFile.txt) : ");
			String fileName = sc.nextLine();

			if (fc.checkName(fileName)) { // 이미 파일이 존재하는 경우
				System.out.println("이미 존재하는 파일입니다. 덮어쓰시겠습니까?(y/n) : ");
				char answer = sc.next().charAt(0);
				if (answer == 'y' || answer == 'Y') { // 덮어씌우는 경우
					fc.fileSave(fileName, sb);
					return;
				}
				// 덮어씌우지 않을 경우는 다시 파일명을 입력 받도록..
			} else { // 이미 파일이 존재하지 않을 경우
				fc.fileSave(fileName, sb);
				return;
			}
		}

	}

	public void fileOpen() {

		System.out.print("열 파일 명: ");
		String fileName = sc.nextLine();

		if (fc.checkName(fileName)) {
			// 파일이 존재하는 경우 (true) -> fileOpen 메소드의 매개변수로 넘겨 반환 값 출력
			System.out.println(fc.fileOpen(fileName));
		} else {
			// 파일이 존재하지 않는 경우 (false) => "없는 파일입니다." 출력후 mainMenu()로 돌아감
			System.out.println("없는 파일입니다.");
			return;
		}

	}

	public void fileEdit() {

		System.out.println("수정할 파일명 : ");
		String fileName = sc.nextLine();

		// 해당 파일이 존재하는지 확인
		if (fc.checkName(fileName)) {

			StringBuilder sb = new StringBuilder();

			while (true) {
				// 반환값이 true(파일이 존재하는 경우
				System.out.println("파일에 저장할 내용을 입력하세요");
				System.out.println("ex끝it 라고 입력하면 종료됩니다.");
				System.out.println("내용 : ");

				String content = sc.nextLine();
				if (!content.equals("ex끝it")) {
					sb.append(content);
				} else {
					fc.fileEdit(fileName, sb);
					return;   //break; 사용시에도 동일하게 메소드 종료
				}
			}

		} else {
			// 반환 값이 false(파일이 존재하지 않는 경우)
			System.out.println("없는 파일입니다.");
			return;
		}
	}

}
