package com.kh.ch07_inheritance;

public class Fruit {
	private String name; // 이름
	private int price; // 가격

	// getter/setter

	public Fruit() {

	}

	public Fruit(String name, int price) {
		this.name = name;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	// toString() 메소드 : Object 클래스의 정의된 메소드
	@Override
	public String toString() {
		return "이름 : " + name + ", 가격 : " + price;
	}
}
