package com.kh.controller;

import java.util.Scanner;

import com.kh.model.vo.User;

public class PlayController {

	private Scanner sc = new Scanner(System.in);

	private User user = new User("정은유", 0);

	public void game01() {

		// 1~50 사이의 랜덤값을 추출해서 저장하고 사용자로부터 정수를 입력받은 뒤,
		// 랜덤값보다 크면 "Down" 출력, 작으면, "Up" 출력
		// 같은 값이면 "Catch" 출력 후 User 에 점수 10점 추가 (단, 5번 기회안에 성공해야 점수 획득)
		int ran = (int) (Math.random() * 50 + 1);
		int chance = 5;

		while (chance > 0) {
			System.out.print("정수를 입력하세요 : ");
			int num = sc.nextInt();

			if (ran == num) {
				System.out.println("Catch");
				user.setScore(user.getScore() + 10);
				break;
			} else if (ran < num) {
				System.out.println("Down");
				chance--;
			} else if (ran > num) {
				System.out.println("Up");
				chance--;
			}
		} System.out.println("더 이상 못봐주겠다 그만해");
	}

	public void game02() {
		int ran = (int) (Math.random() * 3 + 1);

		System.out.print("가위! 바위! 보!!! : ");
		// 랜덤값 1,2,3 을 뽑아서 1인 경우 가위, 2인 경우 바위, 3인 경우 보
		// 사용자로부터 가위 바위 보를 입력받아 랜덤값과 비교하여 이긴경우 + 10
		// 진경우 -10

		String srp = sc.next();
		int numberingSrp = 0;

		switch (srp) {
		case "가위": 
			numberingSrp = 1;
			if (numberingSrp == ran) {
				System.out.println("비겼습니다.");
			} else if (numberingSrp == ran - 1) {
				System.out.println("졌습니다... 수준하고는..");
				user.setScore(user.getScore() - 10);
			} else if (numberingSrp == ran - 2) {
				System.out.println("이겼습니다 웬일이래요?!");
				user.setScore(user.getScore() + 10);
			}
			break;

		case "바위":  
			numberingSrp = 2;
			if (numberingSrp == ran) {
				System.out.println("비겼습니다.");
			} else if (numberingSrp < ran) {
				System.out.println("졌습니다... 수준하고는..");
				user.setScore(user.getScore() - 10);
			} else if (numberingSrp > ran) {
				System.out.println("이겼습니다 웬일이래요?!");
				user.setScore(user.getScore() + 10);
			}
			break;

		case "보": 
			numberingSrp = 3;
			if (numberingSrp == ran) {
				System.out.println("비겼습니다.");
			} else if (numberingSrp == ran + 2) {
				System.out.println("졌습니다... 수준하고는..");
				user.setScore(user.getScore() - 10);
			} else if (numberingSrp == ran + 1) {
				System.out.println("이겼습니다 웬일이래요?!");
				user.setScore(user.getScore() + 10);
			}
			break;
		default:
			System.out.println("한글을 다시 배워 오세요");
			return;
		}
	}

	public void game03() {

	}

	public void scoreeeee() {
		System.out.println(user.toString());
	}

}
