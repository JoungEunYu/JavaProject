package com.kh.example.practice2.run;

import com.kh.example.practice2.model.vo.Product;

public class Run {

	public static void main(String[] args) {

		Product pr = new Product();
		
		pr.setName("똥");

		
		pr.setPrice(50000);

		
		pr.setBrand("캐피탈");

		
		pr.information();
	}
}