package com.kh.practice.chap01_poly.model.vo;

public class CookBook extends Book{
	
	private boolean coupon;
	
	public CookBook() {
		
		// super() 생략
		
	}
	
	public CookBook(String title, String author, String publisher, boolean coupon) {
		super(title, author, publisher);
		this.coupon = coupon;
	}

	public boolean isCoupon() {
		return coupon;
	}

	public void setCoupon(boolean coupon) {
		this.coupon = coupon;
	}
	
	public String toString() {
		return "CookBook " + super.toString() + "], " + "coupon : " + coupon + "]\n";
	}

}
