package com.kh.practice.list.library.run;

import com.kh.practice.list.library.view.BookMenu;

// 실행용 클래스 : Run --> main 메소드 작성
public class Run {
	public static void main(String[] args) {

		// BookMenu 객체 생성 후 
		BookMenu bm = new BookMenu(); 

		// mainMenu()메소드 호출 하여 실행
		bm.mainMenu();
	}
}
