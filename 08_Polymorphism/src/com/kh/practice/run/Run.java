package com.kh.practice.run;

import java.util.Scanner;

import com.kh.practice.model.vo.AniBook;
import com.kh.practice.model.vo.CookBook;

public class Run {

	public static void main(String[] args) {

		AniBook[] ani = new AniBook[5];

		ani[0] = new AniBook("누가 내 머리에 똥쌌어", "최서은", "태산아파트", 19);
		ani[1] = new AniBook("돈키호테", "돈서은", "kh교육원", 5);
		ani[2] = new AniBook("훈민정음", "세종대왕", "세종대학교", 1);
		ani[3] = new AniBook("구의증명", "동그라미", "무릉도원", 0);
		ani[4] = new AniBook("안녕하세요", "안녕이", "인사과", 30);
		
		CookBook[] cok = new CookBook[5];
		
		cok[0] = new CookBook("치킨", "박명수", "출판사", true);
		cok[1] = new CookBook("피자", "유재석", "츨츨사", true);
		cok[2] = new CookBook("콜라", "이기광", "낙원사", true);
		cok[3] = new CookBook("사이다", "강호동", "칠성", true);
		cok[4] = new CookBook("찜똥", "최서은", "태산아파트", false);
		
		// 사용자에게 책 제목을 집력받아 책 정보를 조호해보자.
		Scanner sc = new Scanner(System.in);
		System.out.print("조회하고자 하는 책 제목 입력 : ");
		String title = sc.nextLine();
		
		boolean found = false;
		for ( int i = 0; i < ani.length; i++ ) {
			if(ani[i].getTitle().equals(title)) {
				System.out.println(ani[i].toString());
				found = true; //입력된 제목에 해당하는 책을 찾았을 경우 값을 true로 변경
				break;
			}
		}
		if(!found) { // 입력된 책을 찾지 못했을 경우
					 // 요리책 목록에서 찾아보기.
			for( int i = 0; i < cok.length; i++ ) {
				if (cok[i].getTitle().equals(title)) {
					System.out.println(cok[i].toString());
					found = true;
					break;
				}
			}
			
		}
	}
}
