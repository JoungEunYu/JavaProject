package com.kh.example.practice6.model.vo;

public class Book {
	
	private String title;
	private String publisher;
	private String author;
	private int price;
	private double discountRate;
	
	public Book() {
		
	}

	public Book(String title, String publisher, String author) {
		
		this.title = title;
		this.publisher = publisher;
		this.author = author;
		
	}
	
	public Book(String title, String publisher, String author,
				int price, double discountRate) {
		
		this.title = title;
		this.publisher = publisher;
		this.author = author;
		this.price = price;
		this.discountRate = discountRate;
		
	}
	
	
	
	public void inform() {
		
		System.out.printf("%s는 %s에서 출판된 %s의 책입니다.\n"
						  + "가격은 %d이고 할인률은 %.2f\n",
						  title, publisher, author, price, discountRate);
		
	}
	
}

	