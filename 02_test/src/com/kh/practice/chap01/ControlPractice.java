package com.kh.practice.chap01;
import java.util.Scanner;

public class ControlPractice {
	
	Scanner sc = new Scanner(System.in);
	
	public void practice1() {
		System.out.println("1. 입력");
		System.out.println("2. 수정");
		System.out.println("3. 조회");
		System.out.println("4. 삭제");
		System.out.println("7. 종료");
		
		System.out.printf("메뉴 번호를 입력하세요 : ");
		int num = sc.nextInt();
		
		if (num == 1) {
			System.out.println("조회 메뉴입니다.");
		}
		else if (num == 2) {
			System.out.println("수정 메뉴입니다.");
		}
		else if (num == 3) {
			System.out.println("조회 메뉴입니다.");
		}
		else if (num == 4) {
			System.out.println("삭제 메뉴입니다.");
		}
		else if (num == 7) {
			System.out.println("프로그램이 종료됩니다.");
		}
	}
	
	public void practice2() {
		
		System.out.print("숫자를 한 개 입력하세요 : ");
		int num = sc.nextInt();
		
		if (num % 2 == 0 && num > 0 ) {
			System.out.println("짝수다");
		}
		else if (num % 2 != 0 && num > 0) {
			System.out.println("홀수다");
		}
		else if (num < 0) {
			System.out.println("양수만 입력해주세요.");
		}
		
	}
	
	public void practice3() {
		
		System.out.print("국어점수 : ");
		int korea = sc.nextInt();
		System.out.print("수학점수 : ");
		int math = sc.nextInt();
		System.out.print("영어점수 : ");
		int english = sc.nextInt();
		
		int total = korea + english + math;
		float avg = total / 3;
		
		if (korea >= 40 && english >= 40 && math >= 40 && avg >= 60) {
			System.out.printf("국어 : %d \n", korea);
			System.out.printf("수학 : %d \n", math);
			System.out.printf("영어 : %d \n", english);
			System.out.printf("합계 : %d \n", total);
			System.out.printf("합계 : %.1f \n", avg);
			System.out.println("축하합니다, 합격입니다!");
		}
		else {
			System.out.println("불합격입니다.");
		}
	}
	
	public void practice4() {
		
		System.out.print("1~12 사이의 정수 입력 : ");
		int month = sc.nextInt();
		
		switch (month) {
		case 1 :
		case 2 :
		case 12 :
			System.out.printf("%d월는 겨울입니다.", month);
			break;
		case 3 :
		case 4 :
		case 5 :
			System.out.printf("%d월는 봄입니다.", month);
			break;
		case 6 :
		case 7 :
		case 8 :
			System.out.printf("%d월는 여름입니다.", month);
			break;
		case 9 :
		case 10 :
		case 11 :
			System.out.printf("%d월는 가을입니다.", month);
			break;

		default : 
			System.out.printf("%d월은 잘못 입력된 달입니다.", month);		}
	}
	
	public void practice5() {
		
		String coId = "myId";
		String coPw = "myPassword12";
		
		System.out.print("아이디 : ");
		String id = sc.nextLine();
		System.out.print("비밀번호 : ");
		String pw = sc.nextLine();
		
		if (coId.equals(id) && coPw.equals(pw)) {
			System.out.println("로그인 성공");
		}
		else if ( coId.equals(id) && !coPw.equals(pw)) {
			System.out.println("비밀번호가 틀렸습니다.");
		}
		else if ( !coId.equals(id) && coPw.equals(pw)) {
			System.out.println("아이디가 틀렸습니다.");
		}
		
	}
	
	public void practice6() {
		
		String admin = "관리자";
		String mem = "회원";
		String non = "비회원";
		
		System.out.print("권한을 확인하고자 하는 회원 등급 : ");
		String myS = sc.nextLine();
		
		if (myS.equals(admin)) {
			System.out.println("회원관리, 게시글 관리, 게시글 작성, 게시글 조회, 댓글 작성");
		}
		else if (myS.equals(mem)) {
			System.out.println("게시글 작성, 게시글 조회, 댓글 작성");
		}
		else if (myS.equals(non)) {
			System.out.println("게시글 조회");
		}
	}
	
	public void practice7() {
		
		System.out.print("키(m)를 입력해 주세요 : ");
		double height = sc.nextDouble();
		
		System.out.print("몸무게(kg)를 입력해 주세요 : ");
		double kg = sc.nextDouble();
		
		double bmi = kg / (height * height);
		
		if (bmi < 18.5) {
			System.out.printf("BMI 지수 : %f \n", bmi);
			System.out.println("저체중");
		}
		else if (bmi < 23) {
			System.out.printf("BMI 지수 : %.14f \n", bmi);
			System.out.println("정상체중");
		}
		else if (bmi < 25) {
			System.out.printf("BMI 지수 : %f \n", bmi);
			System.out.println("과체중");
		}
		else if (bmi < 30) {
			System.out.printf("BMI 지수 : %f \n", bmi);
			System.out.println("비만");
		}
		else if (bmi >= 30) {
			System.out.printf("BMI 지수 : %f \n", bmi);
			System.out.println("고도 비만");
		}
	}
	
	public void practice8() {
		
		System.out.print("피연산자1 입력 : ");
		int num1 = sc.nextInt();
		System.out.print("피연산자2 입력 : ");
		int num2 = sc.nextInt();
		System.out.print("연산자를 입력(+,-,*,/,%) : ");
		String giho = sc.next();
		
		if (num1 > 0 && num2 > 0) {
			if (giho.equals("+")) {
				double plus = (double)num1 + num2;
				System.out.printf("%d + %d = %f", num1, num2, plus);
			}
			else if (giho.equals("-")) {
				double minus = (double)num1 - num2;
				System.out.printf("%d - %d = %f", num1, num2, minus);
			}
			else if (giho.equals("*")) {
				double mul = (double)num1 * num2;
				System.out.printf("%d * %d = %f", num1, num2, mul);
			}
			else if (giho.equals("/")) {
				double div = (double)num1 / num2;
				System.out.printf("%d / %d = %f", num1, num2,div);
			}
			else if (giho.equals("%")) {
				double per = (double)num1 % num2;
				System.out.printf("%d % %d = %f", num1, num2, per);
			}
		}
		else {
			System.out.println("잘못 입력하셨습니다. 프로그램을 종료합니다.");
		}

	}
	
	public void practice9() {
		
		System.out.print("중간 고사 점수 : ");
		int middle = sc.nextInt();
		System.out.print("기말 고사 점수 : ");
		int last = sc.nextInt();
		System.out.print("과제 점수 : ");
		int study = sc.nextInt();
		System.out.print("출석 회수 : ");
		double atten = sc.nextInt();
		
		double middle20 = middle * 0.2;
		double last20 = last * 0.3;
		double study20 = study * 0.3;
		double total = middle20 + last20 + study20 + atten;
		
		
		System.out.println("=================결과=================");

		if (atten < 14) {
			System.out.printf("Fail [출석 회수 부족 (%d/20)]", (int)atten);
			
		}
		else {
			System.out.printf("중간 고사 점수(20) : %.1f\n", middle20);
			System.out.printf("기말 고사 점수(30) : %.1f\n", last20);
			System.out.printf("과제 점수	(30) : %.1f\n", study20);
			System.out.printf("출석 점수	(20) : %.1f\n", atten);
			System.out.printf("총점 : %.1f\n", total);
			
			if (total >= 70) {

				System.out.print("PASS");
			}

			else {

				System.out.print("Fail [점수 미달]");
			}
		}

	}
	
	public void practice10() {
		
		System.out.println("실행할 기능을 선택하세요.");
		System.out.println("1. 메뉴 출력");
		System.out.println("2. 짝수/홀수");
		System.out.println("3. 합격/불합격");
		System.out.println("4. 계절");
		System.out.println("5. 로그인");
		System.out.println("6. 권한 확인");
		System.out.println("7. BMI");
		System.out.println("8. 계산기");
		System.out.println("9. P/F");
		
		System.out.printf("선택 : ");
		int finum = sc.nextInt();
		
		switch (finum) {
		case 1 : 
			practice1();
			break;
		case 2 : 
			practice2();
			 break;
		case 3 : 
			practice3();
			break;
		case 4 : 
			practice4();
			break;
		case 5 : 
			practice5();
			break;
		case 6 : 
			practice6();
			break;
		case 7  :
			practice7();
			break;
		case 8 : 
			practice8();
			break;
		case 9 : 
			practice9();
			break;
		}
		
	}
	
	public void practice11() {
		
		System.out.print("비밀번호 입력(1000~9999) : ");
		int number = sc.nextInt();
		
//		맨 앞자리 수는 1~9 사이.
//		4자리 이상 x.
//		중복된 숫자가 있으면 안됨.
//		5342
		
		int first = number / 1000;
		int second = (number % 1000) / 100;
		int third = (number %100) / 10;
		int forth = number % 10 ;
		
		if (number <= 9999 && number >= 1000) {
			if( first != second && second != third && 
					third != forth && first != forth)
				{System.out.print("성공");}
			else {
				System.out.print("실패");
			}
		}
		else {
			System.out.print("자리수 안맞음");
		}
		
	}
}
