package com.kh.hw.shape.controller;

import com.kh.hw.shape.model.vo.Shape;

public class TriangleController {
	
	private Shape s = new Shape();
	
	public double calcArea(double height, double width) {
		
		s = new Shape(3, height, width); // 초기화
		
		return s.getHeight() * s.getWidth() / 2;
	}
	
	public void paintColor(String color) {
		
		s.setColor(color);
		
	}
	
	public String print() {
		return String.format("삼각형 " + s.information());
	}

}
