package com.kh.practice.chap01_poly.controller;

import com.kh.practice.chap01_poly.model.vo.AniBook;
import com.kh.practice.chap01_poly.model.vo.Book;
import com.kh.practice.chap01_poly.model.vo.CookBook;
import com.kh.practice.chap01_poly.model.vo.Member;

public class LibraryController {

	private Member mem = new Member();
	private Book[] bList = new Book[5];

	{
		bList[0] = new CookBook("백종원의 집밥", "백종원", "tvN", true);
		bList[1] = new AniBook("한번 더 해요", "미티", "원모어", 19);
		bList[2] = new AniBook("루피의 원피스", "루피", "japan", 12);
		bList[3] = new CookBook("이혜정의 얼마나 맛있게요", "이혜정", "문학", false);
		bList[4] = new CookBook("최현석 날 따라해봐", "최현석", "소금책", true);

	}
//Member 타입으로 선언된 mem이라는 필드의 setter 메소드의 역할이구나!
	public void insertMember(Member mem) {

		this.mem = mem;
	}

	// Member 타입으로 선언된mem이라는 필드의 getter 메소드의 역할!!!!!!!!!!
	public Member myInfo() {
		return mem;
	}
	
	// Book[]  로 선언된 bList라는 필드의 getter 메소드 역할
	public Book[] selectAll() {
		return bList;
	}

	public Book[] searchBook(String keywords) {
		Book[] bb = new Book[5];
		int count = 0;
		for (int i = 0; i < bList.length; i++) {
			if (bList[i].getTitle().contains(keywords)) {
				bb[count] = bList[i];
				count++;
			}
		}
		return bb;
	}

	public int rentBook(int index) {
		int result = 0;

		if (bList[index] instanceof AniBook) {
			if (((AniBook) bList[index]).getAccessAge() > mem.getAge()) {
				//괄호가 많으면 변수로 뺴보세용
				result = 1;

			}
		} else if (bList[index] instanceof CookBook) {
			if (((CookBook)bList[index]).isCoupon() == true) {
				int couponCount = mem.getCouponCount();
				couponCount++;
				result = 2;
				mem.setCouponCount(couponCount);
				// mem.setCouponCount(mem.getCouponCount() + 1);
			}

		}
		return result;
	}

}
