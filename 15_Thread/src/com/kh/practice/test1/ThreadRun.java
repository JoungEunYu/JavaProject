package com.kh.practice.test1;

public class ThreadRun {

	/*
	 * Thread : 프로세스(실행 중인 프로그램) 내에서 가지고 있는 최소 작업 단위
	 */
	
	// main 메소드 실행 시 메인스레드가 실행됨
	public static void main(String[] args) {
		
		Task1 tas = new Task1();
		
		// Task2 객체 생성 (Thread2) --> Thread 객체 생성 시 인스턴스 전달
		Task2 task = new Task2();
		Thread t2 = new Thread(task);
		
		tas.start();
		t2.start();
		
		System.out.println("==== " + Thread.currentThread().getName() + " ====");
	}

}
