package com.kh.practice.list.library.model.vo;

// 정렬 기능 추가를 위한 Comparable 인터페이스 구현(상속)
public class Book implements Comparable<Book> { // 변수와 생성자를 정의하고 get,set 메소드를 이용하여 값 변환하는 클래스

	// 필드부 선언, 접근 아무나 못하게 private로 선언
	private String title;
	private String author;
	private String category;
	private int price;

	public Book() {
		// 기본 생성자
	}

	// title, author, category, price를 초기화를 위한 생성자
	public Book(String title, String author, String category, int price) {
		this.title = title;
		this.author = author;
		this.category = category;
		this.price = price;
	}

	// private 변수에 접근하기 위해 get, set 메서드 선언
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	// toString을 재정의하고 다른 메서드에서 사용
	@Override
	public String toString() {
		return "\t(" + title + "/" + author + "/" + category + "/" + price + ")";
	}

	// 왜 존자하는지 모름
	public int hashCode() {
		return 0;
	}

	public boolean equals() {
		return true;
	}

	// => Comparable 인터페이스 메소드
	@Override
	public int compareTo(Book o) {
		// 정렬 기준에 대하여 작성
		// --> 도서명(String) 오름차순
		/*
		 * * String의 경우 compareTo 메소드가 재정의 되어 있음
		 * 	 => 반환 값에 따라 정렬 순서가 정해짐
		 * 		- 0 : 동일한 문자열
		 * 		- 음수 : A.compareTo(B) --> A B 순서로 정렬
		 * 		- 양수 : A.compareTo(B) --> B A 순서로 정렬
		 */
		return this.title.compareTo(o.title);
	}
}
