package com.kh.practice.dimension;

import java.util.Scanner;

public class DimensionPractice {

	Scanner sc = new Scanner(System.in);

	public void practice1() {
		// 1. 3행 3열짜리 문자열 배열 선언 및 할당
		String[][] arr = new String[3][3];
		// 2. 인덱스 0행 0열부터 2행 2열까지 차례대로 "(0,0)" 형식으로 값을 저장
		// arr.length => 2차원 배열의 길이. 즉, 행의 길이
		for (int i = 0; i < arr.length; i++) { // i : 행의 인덱스로 사용

			// arr[i].length => 1차원 배열의 길이. 즉, 열의 길이
			// String[] strArr; strArr과 arr[i]의 자료형은 동일함
			for (int j = 0; j < arr[i].length; j++) { // j : 열의 인덱스
				// arr[i][j]는 문자열 데이터다!
				arr[i][j] = "(" + i + ", " + j + ")";
			}
		}
		// 3. 저장된 값들을 출력
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j]);
			}
			System.out.println();
		}
	}

	public void practice2() {
		int[][] arr = new int[4][4];
		int a = 1;

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = a++;
			}
		}
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.printf("%2d ", arr[i][j]);

				System.out.println();
			}
		}
	}

	public void practice3() {

		int[][] arr = new int[4][4];
		int a = 16;

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = a--;
			}
		}
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.printf("%2d ", arr[i][j]);
			}
			System.out.println();
		}
	}

	public void parctice4() {

		// 4행 4열 정수형 배열 선언 및 할당
		int[][] sumArr = new int[4][4];

		// 0행 0열부터 2행 2열까지는 1 ~ 10까지 임의의 정수값 저장
		// 3행에는 각 열의 합을, 3열에는 각 행의 합, 3행 3열에는 가로 세로 합

		for (int i = 0; i < sumArr.length; i++) {
			for (int j = 0; j < sumArr[i].length; j++) {

				int lastRow = sumArr.length - 1; // 마지막 행의 인덱스
				int lastCol = sumArr[i].length - 1; // 마지막 열의 인덱스

				// 랜덤값을 각 위치에 저장 ( (0,0) ~ (2,2) )
				if (i != lastRow && j != lastCol) {
					sumArr[i][j] = (int) (Math.random() * 10 + 1);
				}

				// 마지막 행의 위치에 현재 값을 더하기
				if (i < lastRow) {
					sumArr[lastRow][j] += sumArr[i][j];
				}

				// 마지막 열의 위치에 현재 값을 더하기
				if (j < lastCol) {
					sumArr[i][lastCol] += sumArr[i][j];
				}
			}
		}
		for (int i = 0; i < sumArr.length; i++) {
			for (int j = 0; j < sumArr[i].length; j++) {
				System.out.printf("%5d", sumArr[i][j]);
			}
			System.out.println();
		}
	}

	public void practice5() {

		System.out.print("행 크기 : ");
		int rowNum = sc.nextInt();
		System.out.print("열 크기 : ");
		int colNum = sc.nextInt();

		char[][] alpa = new char[rowNum][colNum];

		for (int i = 0; i < rowNum; i++) {
			for (int j = 0; j < colNum; j++) {
				alpa[i][j] = (char) (Math.random() * 26 + 65);
				// * 범위에 속하는 값(= 최댓값 - 최솟값 + 1) + 초기값 >> 랜덤 범위
			}
		}
		for (int i = 0; i < rowNum; i++) {
			for (int j = 0; j < colNum; j++) {
				System.out.print(alpa[i][j] + " ");
			}
			System.out.println();
		}
	}

	public void practice6() {
		String[][] strArr = new String[][] { { "이", "까", "왔", "앞", "힘" }, { "차", "지", "습", "으", "냅" },
				{ "원", "열", "니", "로", "시" }, { "배", "심", "다", "좀", "다" }, { "열", "히", "! ", "더", "!! " } };

		// strArr[0][0] - sytArr[1][0] - strArr[2][0] ...

		for (int i = 0; i < strArr.length; i++) {
			for (int j = 0; j < strArr[i].length; j++) {
				System.out.print(strArr[j][i]);
				System.out.print(" ");
			}
		}
	}

	public void practice7() {

		System.out.print("행의 크기 : ");
		int row = sc.nextInt();
		int[][] arr = new int[row][];

		char value = 'a';
		for (int i = 0; i < row; i++) {
			System.out.println(i + "행의 열 크기 : ");
			int col = sc.nextInt();
			arr[i] = new int[col];

			// 각 행의 1차원 배열에 a부터 ~ 값을 대입?
			for (int j = 0; j < col; j++) {
				arr[i][j] = value++;
			}
		}
		// 배열 데이터 값 출력
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print((char) arr[i][j] + " ");
			}
			System.out.println();
		}
	}

	public void practice8() {

		String[] name = new String[] { "강건강", "남나나", "도대담", "류라라", "문미미", "박보배", "송성실", "윤예의", "진재주", "차천축", "피풍표",
				"홍하하" };

		String[][] arr = new String[3][2];
		String[][] arr2 = new String[3][2];
		int index = 0;
		int index2 = 0;

		// arr의 행에 해당하는 값을 반복하는 반복문
		for (int i = 0; i < arr.length; i++) {
			// arr의 열에 해당하는 값을 반복하는 반복문
			// j가 arr[i].length 만큼 // arr[i].length는 열의 개수 즉, 2
			for (int j = 0; j < arr[i].length; j++) {
				// arr[0][0] = {강건강}, arr[0][1] = {남나나}
				// name[0] = {강건강}, name[1] = {남나나}

				// arr[1][0] = {도대담}, arr[1][1] = {류라라}
				// name[2] = {도대담}, name[3] = {류라라}

				// arr[2][0] = {문미미}, arr[2][1] = {박보배}
				// name[4] = {문미미}, name[5] = {박보배}
				arr[i][j] = name[index];
				index++;

			}
		}

		for (int i = 0; i < arr2.length; i++) {
			for (int j = 0; j < arr2[i].length; j++) {
				arr2[i][j] = name[index2];
				index2++;
			}
		}

		System.out.println("== 1분단 ==");
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j]);
				if (j < arr[i].length - 1) {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		System.out.println("== 2분단 ==");
		for (int i = 0; i < arr2.length; i++) {
			for (int j = 0; j < arr2[i].length; j++) {
				System.out.print(arr2[i][j]);
				if (j < arr[i].length - 1) {
					System.out.print(" ");
				}
			}
			System.out.println();
		}

	}

	public void practice9() {

		String[] name = { "강건강", "남나나", "도대담", "류라라", "문미미", "박보배", "송성실", "윤예의", "진재주", "차천축", "피풍표", "홍하하" };

		String[][] part1 = new String[3][2];
		String[][] part2 = new String[3][2];

		int cont = 0;
		int count = 0;

		// 1분단 2차원 배열에 이름 대입
		for (int i = 0; i < part1.length; i++) {
			for (int j = 0; j < part1[1].length; j++) {
				part1[i][j] = name[cont];
				cont++;
			}
		}

		// 2분단을 2차원 배열에 이름 대입
		for (int i = 0; i < part2.length; i++) {
			for (int j = 0; j < part2[i].length; j++) {
				part2[i][j] = name[count];
				count++;
			}
		}

		// 1분단 출력
		System.out.println("== 1분단 ==");

		for (int i = 0; i < part1.length; i++) {
			for (int j = 0; j < part1[i].length; j++) {
				System.out.print(part1[i][j]);
				if (j < part1[i].length - 1) {
					System.out.print(" ");
				}
			}
			System.out.println();
		}

		System.out.println("== 2분단 ==");

		for (int i = 0; i < part2.length; i++) {
			for (int j = 0; j < part2[i].length; j++) {
				System.out.print(part2[i][j]);
				if (j < part2[i].length - 1) {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		System.out.println("=======================");
		System.out.print("검색할 학생 이름을 입력하세요 : ");
		String srch = sc.nextLine();

		// 검색하신 차천축 학생은 2분단 두번째 줄 오른쪽에 있습니다.
		// 차천축과 모든 배열의 값을 비교
		// 차천축이 있으면 종료 후 출력
		// 차천축 위치값을 어떻게 인지 하지..
		// 1분단과 2분단
		// 1, 2, 3번쨰 줄 -> part1[0][j], part1[1][j], part1[2][j]
		// 오른쪽 왼쪽 -> part1[i][0], part1[i][1]
		// 그 위치를 출력

		int check1 = 0;
		String locat;
		int jNum = 0;
		String iRL = "";
		int iNum = 0;
		String jmt = "";

		for (int i = 0; i < part1.length; i++) {
			for (int j = 0; j < part1[i].length; j++) {
				if (part1[i][j].equals(srch)) {
					check1++;
					iNum = i;
					jNum = j;
					if (check1 > 0) {
						locat = "1분단";
						switch (iNum) {
						case 0:
							iRL = "오른쪽";
							break;
						case 1:
							iRL = "왼쪽";
							break;
						default:
							break;
						}
						switch (jNum) {
						case 0 : 
							jmt = "첫";
							break;
						case 1 :
							jmt = "두";
							break;
						case 2 : 
							jmt = "세";
							break;
						default : break;
							
						}
						System.out.printf("검색하신 %s 학생은 %s %s 번째 줄 %s에 있습니다." ,srch, locat, jmt, iRL);

					}
				}
			}
		}
	}

}
