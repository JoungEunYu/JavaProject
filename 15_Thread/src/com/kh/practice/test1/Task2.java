package com.kh.practice.test1;


//Thread 정의 방법 2) Runnable 인터페이스 구현
public class Task2 implements Runnable {

	// 이 Thread에서 실행시킬 작업을 run() 메소드에 재정의
	@Override
	public void run() {
		
		String name = Thread.currentThread().getName();
		System.out.println(name + ":" + "Hi Thread?" );
	
		
	}
}
