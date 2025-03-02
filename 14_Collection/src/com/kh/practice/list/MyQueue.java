package com.kh.practice.list;

import java.util.ArrayList;

public class MyQueue {

	/*
	 * 큐(Queue) : FIFO(First In First Out)
	 * 			  처음 저장된 데이터가 가장 먼저 꺼내올 수 있는 구조
	 * - 데이터 추가 : 순서대로 추가
	 * - 데이터 제거 : 처음 위치부터 제거
	 * 
	 * --------------------------
	 * MyQueue
	 * --------------------------
	 * - queue : ArrayList<String> = new ArrayList<>();
	 * ----------------------------
	 * + enQueue(data:String) : void
	 * + deQueue() : String
	 * ----------------------------
	 * 
	 */
	
	private ArrayList<String> queue = new ArrayList<>();
	
	public void enQueue(String data) { 
		
		queue.add(data);
		
	}
	
	public String deQueue() {
		
		if(queue.isEmpty()) {
			return "없어요. 아니 없어요.";
		}
		else {
			return queue.remove(0);
		}
		
	}
	
}
