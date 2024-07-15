package com.kh.practice.student.controller;

import com.kh.practice.student.model.vo.Student;

public class StudentController {
	
	private Student[] sArr = new Student[5];
	
	public static final int CUT_LINE = 60;
	
	public StudentController() {
		
		sArr[0] = new Student("김길동", "자바", 100);
		sArr[1] = new Student("박길동", "디비", 50);
		sArr[2] = new Student("이길동", "화면", 85);
		sArr[3] = new Student("정길동", "서버", 60);
		sArr[4] = new Student("홍길동", "자바", 20);
		
	}
	
	public Student[] printStudent() {
		return sArr;
	}
	
	public int sumScore() {
		int total = 0;
		for(int i = 0; i < sArr.length; i++) {
			total += sArr[i].getScore(); 
		}
		return total;
		
	}
	
	public double[] avgScore() {
		
		//1. double 배열 만들기
		double[] avg = new double[2];
		//2. sumScore의 리턴 값을 0번째 인덱스에 저장
		avg[0] = sumScore();
		//3. 합의 평균을 1번째 인덱스에 저장
		avg[1] = sumScore() / sArr.length;
		//4. 배열 리턴
		return avg;
	}
	
	
}
