package com.kh.example.practice3.run;
import com.kh.example.practice3.model.vo.Circle;

public class Run {

	public static void main(String[] args) {
		
		// Circle type의 객체 생성
		// 원의 둘레, 넓이 값 출력
		// incrementRadius() 메소드를 통해 반지름 1증가 후 다시 둘레 넓이 출력
		
		Circle c = new Circle();
		
		c.getAreaOfCircle();
		c.getSizeOfCircle();
		c.incrementRadius();
		c.getAreaOfCircle();
		c.getSizeOfCircle();


	}

}
