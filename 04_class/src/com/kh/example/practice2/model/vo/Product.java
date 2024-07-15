package com.kh.example.practice2.model.vo;

public class Product {
	
	private String name;
	private int price;
	private String brand;
	
	public Product() {

	}
	
	//pName 변수의 getter/setter
	//getter 메소드 : 해당 변수의 값을 제공하는 기능을 제공하는 메소드
	
	public String getName() { // get변수명() // 카멜케이스로
		return name;
	}
	// setter 메소드 : 해당 변수에 값을 저장하는 기능을 수행하는 메소드
	public void setName(String name) { // set 변수명(해당변수의 자료형 변수명)
		this.name = name;
	}
	
	public int getPrice() { 
		return price;
	}
	
	public void setPrice(int price) { 
		this.price = price;
	}
	
	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) { 
		this.brand = brand;
	}
	
	public void information() {
		
		System.out.printf("%s은 %d원이고 %s에서 만듭니다", 
						   name, price, brand);
		
	}
}
