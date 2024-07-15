package com.kh.practice.test1;

//Thread 정의 방법 1) Thread 클래스 상속

public class Task1 extends Thread {

	// 2) Thread에서 실행시킬 작업을 run 메소드에 재정의
	@Override
	public void run() {
		String hello = "Hello World!";
		String name = Thread.currentThread().getName();
		// currentThread() : 현재 실행하고 있는 Thread 정보를 반환

		System.out.println(name + ":" + hello);
	}

	
	
}
