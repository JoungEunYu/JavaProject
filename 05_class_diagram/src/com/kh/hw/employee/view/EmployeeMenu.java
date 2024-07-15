package com.kh.hw.employee.view;

import java.util.Scanner;

import com.kh.hw.employee.controller.EmployeeController;
import com.kh.hw.employee.model.vo.Employee;

public class EmployeeMenu {

	// 필드부
	private Scanner sc = new Scanner(System.in);

	private EmployeeController ec = new EmployeeController();

	// 기본생성자
	public EmployeeMenu() {

		while (true) {

			System.out.println("1. 사원 추가");
			System.out.println("2. 사원 수정");
			System.out.println("3. 사원 삭제");
			System.out.println("4. 사원 출력");
			System.out.println("9. 프로그램 종료");

			System.out.print("메뉴 번호를 누르세요 : ");
			int menu = sc.nextInt();

			switch (menu) {
			case 1:
				insertEmp();
				break;
			case 2:
				updateEmp();
				break;
			case 3:
				deleteEmp();
				break;
			case 4:
				printEmp();
				break;
			case 9:
				System.out.println("프로그램을 종료합니다.");
				return;
			default:
				System.out.println("잘못 입력했습니다. 다시 입력해주세요.");
			}
		}

	}

	// 1. 사원추가
	public void insertEmp() {
		
		System.out.print("사원 번호 : ");
		int no = sc.nextInt();
		
		sc.nextLine();
		
		System.out.print("사원 이름 : ");
		String name = sc.nextLine();
		
		System.out.print("사원 성별 : ");
		char gender = sc.next().charAt(0);
		
		System.out.print("전화 번호 : ");
		String phone = sc.next();
		
		System.out.print("추가 정보를 더 입력하시겠습니까?(y/n)");
		String yn = sc.next();
		
//		if(yn == 'y' || yn == 'Y') {
		if(yn.toUpperCase().equals("Y")) {
			// 문자열.toUpperCase() : 문자열의 값을 모두 대문자로 변경.
			// 문자열.toLowerCase() : 문자열의 값을 모두 소문자로 변경.
			// String사용할 떄 사용가능.
			System.out.print("사원 부서 : ");
			String dept = sc.next();
			
			System.out.print("사원 연봉 : ");
			int salary = sc.nextInt();
			
			System.out.print("보너스 율 : ");
			double bonus = sc.nextDouble();
			
			ec.add(no, name, gender, phone, dept, salary, bonus);
		} 
		else {
			// 기본 정보만으로 사원 추가
			ec.add(no, name, gender, phone);
		}

	}

	// 2. 사원 수정
	public void updateEmp() {
		
		System.out.println("가장 최신의 사원 정보를 수정하게 됩니다.");
		System.out.println("사원의 어떤 정보를 수정하시겠습니까?");
		
		System.out.println("1. 전화번호");
		System.out.println("2. 사원 연봉");
		System.out.println("3. 보너스 율");
		System.out.println("9. 돌아가기");
		System.out.print("메뉴 번호를 누르세요 : ");
		
		int menu = sc.nextInt();
		
		String message = "수정할 ";
		switch(menu) {
		case 1: 
			message += "전화번호 : ";
			break;
		case 2:
			message += "사원 연봉 : ";
			break;
		case 3:
			message += "보너스 율 : ";
			break;
		case 9:
			System.out.println("메인메뉴로 돌아갑니다.");
			return;
		default: System.out.println("잘못 입력하셨습니다.");
			return;
		}
		
		System.out.println(message);
		if (menu == 1) {
			String newPhone = sc.next();
			ec.modify(newPhone);
		} else if (menu == 2) {
			int newSal = sc.nextInt();
			ec.modify(newSal);
		} else if (menu == 3) {
			double newBonus = sc.nextDouble();
			ec.modify(newBonus);
		}

	}

	// 3. 사원 삭제
	public void deleteEmp() {
		
		System.out.print("정말 삭제하시겠습니까? (y/n)");
		char yn = sc.next().charAt(0);
		
		if(yn == 'y' || yn == 'Y') {
			Employee result = ec.remove();
			if(result == null) {
				System.out.println("삭제에 성공했습니다.");
			} else {
				System.out.println("삭제에 실패했습니다.");
			}
		}

	}

	// 4. 사원 출력
	public void printEmp() {
		
		String info = ec.inform();
		
		if (ec.inform() == null) {
			System.out.println("저장된 사원 정보가 없습니다.");
		} else {
			System.out.println(ec.inform());
		}

	}

}
