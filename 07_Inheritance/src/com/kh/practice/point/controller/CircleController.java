package com.kh.practice.point.controller;

import com.kh.practice.point.model.vo.Circle;

public class CircleController {
	
	private Circle c = new Circle();
	
	public String calcCircum(int x, int y, int radius) {
		c = new Circle(x, y, radius);
		return "둘레 : " + c.toString() + " / " + (c.getRadius() * 2 * Math.PI) + "\n";
	}
	
	public String calcArea(int x, int y, int radius) {
		c = new Circle(x, y, radius);
		return "넓이 : " + c.toString() + " / " + (c.getRadius() * c.getRadius() * Math.PI) + "\n";
	}

}
