package com.kh.practice.array;

import java.util.Scanner;

public class ArrayPractice {
	Scanner sc = new Scanner(System.in);

	public void practice1() {
		int[] a = new int[10];

//		for(int i = 1; i <= 10; i++) {
//			a[i - 1] = i;	//i - 1 위치에 i 값을 저장.
//		}

		for (int i = 0; i < 10; i++) {
			a[i] = i + 1; // a[0] = 0 + 1;
		}

		for (int i = 0; i < 10; i++) {
			System.out.print(a[i]);
			if (i != 9) {
				System.out.print(" ");
			}
		}

	}

	public void practice2() {
		int[] arr = new int[10];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = arr.length - i;
		}

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]);
			if (i != arr.length - 1) {
				System.out.print(" ");
			}
		}
	}

	public void practice3() {

		System.out.print("양의 정수를 입력하세요 : ");
		int num = sc.nextInt();

		int[] arr = new int[num];

		if (num > 0) {
			for (int i = 0; i < arr.length; i++) {
				arr[i] = i + 1;
			}
			for (int i = 0; i < arr.length; i++) {
				System.out.print(arr[i]);
				if (i != arr.length - 1) {
					System.out.print(" ");
				}
			}
		} else {
			System.out.println("잘못 입력하셨습니다.");
		}

	}

	public void practice4() {

		String[] arr = new String[5];

		arr[0] = "사과";
		arr[1] = "귤";
		arr[2] = "포도";
		arr[3] = "복숭아";
		arr[4] = "참외";

		System.out.println(arr[1]);
	}

	public void practice5() {

		System.out.print("문자열 : ");
		String word = sc.nextLine();
		System.out.print("문자 : ");
		char alpa = sc.nextLine().charAt(0);

		// 문자열의 길이 : 문자열_변수/값.length()
		// 배열 길이 : 배열_변수/값.length

		char[] arr = new char[word.length()];
		// 입력받은 문자열을 배열에 문자 하나하나 저장 => 문자형 배열

		for (int i = 0; i < arr.length; i++) {
			arr[i] = word.charAt(i);
		}
		System.out.printf("%s에 %c가 존재하는 위치(인덱스) : ", word, alpa);
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == alpa) {
				count++;
				System.out.print(i + " ");

			}
		}
		System.out.println();
		System.out.println(alpa + "의 개수 : " + count);
	}

	public void practice6() {

		// "월" ~ "일" 까지 초기화된 문자열 배열 만들어라
		// 0~6까지 숫자를 입력받아
		// 입력한 숫자와 같은 인덱스에 있는 요일 출력
		// 범위에 없는 숫자 입력시 "잘못 입력하셨습니다"를 출력

		System.out.print("0 ~ 6 사이 숫자 입력 : ");
		int num = sc.nextInt();

		String[] week = new String[7];
		week[0] = "월요일";
		week[1] = "화요일";
		week[2] = "수요일";
		week[3] = "목요일";
		week[4] = "금요일";
		week[5] = "토요일";
		week[6] = "일요일";

		if (num >= 0 && num < 7) {

			System.out.print(week[num]);

		} else {
			System.out.print("잘못 입력하셨습니다.");
		}

	}

	public void practice7() {
		// 사용자가 배열의 길이를 직접 입력
		// 그 값만큼 정수형 배열을 선언 및 할당
		// 배열의 크기만큼 사용자가 직접 값을 입력하여 각각의 인덱스에 초기화
		// 배열 전체 값을 나열하고 각 인덱스에 저장된 값들의 합 출력

		System.out.print("정수 : ");
		int num = sc.nextInt();

		int[] arr = new int[num];

		int total = 0;

		for (int i = 0; i < arr.length; i++) {
			System.out.printf("배열 %d번째 인덱스에 넣을 값 : ", i);
			int indexValue = sc.nextInt();
			arr[i] = indexValue;

		}
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
			total = total + arr[i];
		}
		System.out.println();
		System.out.print("총 합 : " + total);
	}

	public void practice8() {
		// 3이상 홀수 자연수를 입력 받아
		// 배열의 중간까지는 1부터 1씩 증가하여 오름차순으로 값 넣기
		// 중간 이후부터 끝까지는 1씩 감소하여 내림차순으로 값을 넣기
		// 단, 입력한 정수가 홀수가 아니거나 3미만일 경우 "다시 입력하세요" 출력하고
		// 다시 정수를 받도록하기.

		while (true) {

			System.out.print("정수 : ");
			int num = sc.nextInt();

			int num1 = num / 2 + 1;

			if (num >= 3 && num % 2 == 1) {
				int[] arr = new int[num];
				for (int i = 0; i < arr.length; i++) {
					if (i < num1) {
						arr[i] = i + 1;
						System.out.print(arr[i] + ", ");
						// i = 0
						// i = 1
						// i = 2
					} else {
						arr[i] = arr[i - 1] - 1;
						// i = 3
						// i = 4
						if (i < arr.length - 1) {
							System.out.print(arr[i] + ", ");
						} else {
							System.out.print(arr[i]);
						}
					}

				}
				break;
			} else {
				System.out.println("다시 입력하세요");
			}
		}
	}

	public void practice9() {

		// 사용자가 배열 맘대로 만들기 (치킨명)
		// 사용자가 입력한 값이 배열에 있는 지 비교
		// 있으면 치킨 배달 가능
		// 없으면 없는 치킨입니다. 출력

		String[] menu = new String[] { "양념", "불닭", "후라이드" };

		System.out.print("치킨 이름을 입력하세요 : ");
		String chick = sc.nextLine();
		int check = 0;

		for (int i = 0; i < menu.length; i++) {
			if (menu[i].equals(chick)) {
				check++;
			}
		}
		if (check > 0) {
			System.out.println(chick + "치킨 배달 가능");
		} else {
			System.out.println(chick + "치킨은 없는 메뉴 입니다.");
		}

	}

	public void practice10() {

		// 주민번호 성별자리 이후 부토 *로 가리기
		// 단 원본 배열 값은 변경 없이 배열 복사본으로 변경

		System.out.print("주민등록번호 (-포함) : ");
		String myId = sc.nextLine();

		char[] idNum = new char[14];

		for (int i = 0; i < idNum.length; i++) {
			idNum[i] = myId.charAt(i);
		}
		// idNum[8] ~ idNum[13] 까지 *로 복사하기.

		char[] idCopy = idNum.clone();

		for (int i = 8; i < 14; i++) {
			idCopy[i] = '*';

		}

		System.out.print(idCopy);
		// System.out.println(Arrays.toString(copy));
		// [1, 2, 3, 4, 5, 6, -, *, *, *, *, *, *, * ] -> 자동으로 출력
	}

	public void practice11() {

		int[] arr = new int[10];

		for (int i = 0; i < arr.length; i++) {

			int rand = (int) (Math.random() * 10 + 1);
			arr[i] = rand;

			System.out.print(arr[i] + " ");

		}
	}

	public void practice12() {

		int[] arr = new int[10];
		

		for (int i = 0; i < arr.length; i++) {

			int rand = (int) (Math.random() * 10 + 1);
			arr[i] = rand;

			System.out.print(arr[i] + " ");

			// arr[0]과 arr[1] 비교
			// 더 큰 숫자를 big에 저장
			// arr[2]를 big과 비교
			// 더큰 숫자를 big에 저장

		}
		
		int big = arr[0];
		int small = arr[0];
		
		for (int i = 0; i < arr.length; i++) {

			if (big < arr[i]) {
				big = arr[i];
			} else if (small > arr[i]) {
				small = arr[i];
			}

		}
		System.out.print("\n최대값 : " + big);
		System.out.print("\n최소값 : " + small);
	}
	
	public void practice13() {
		// 길이가 10인 정수형 배열을 선언 및 할당
		int[] numbers = new int[10];
		
		for (int i = 0; i < numbers.length; i++) {
			// 1 ~ 10까지 랜덤값을 저장
			numbers[i] = (int)(Math.random() * 10 + 1);
			
			// i - 1(현재 위치의 직전 위치)위치까지 중복값이 있는 지 확인
			for(int j = 0; j < i; j++) {
				// i번쨰 위치의 값과 j번째 위치의 값을 비교
				// 같으면 다시 랜덤값을 저장 --> 현재 위치의 값을 다시 저장할 수 있도록..
				if(numbers[i] == numbers[j]) {
					i--;
					break;
				}
			}
		}
		
		for(int i = 0; i < numbers.length; i++) {
			System.out.print(numbers[i] + " ");
		}
	}

} // Arrays.sort(배열명); => 배열을 오름차순으로 정렬

