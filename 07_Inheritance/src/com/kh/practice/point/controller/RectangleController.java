package com.kh.practice.point.controller;

import com.kh.practice.point.model.vo.Rectangle;

public class RectangleController {
	
	private Rectangle r = new Rectangle();
	
	public String calcPerimeter(int x, int y, int height, int width) {
		r = new Rectangle(x, y, height, width);
		return "둘레 : " + r.toString() + " / " + ((r.getWidth() + r.getHeight()) * 2) + "\n";
	}
	
	public String calcRectArea(int x, int y, int height, int width) {
		r = new Rectangle(x, y, height, width);
		return "넓이 : " + r.toString() + " / " + (r.getWidth() * r.getHeight()) + "\n";
	}

}
