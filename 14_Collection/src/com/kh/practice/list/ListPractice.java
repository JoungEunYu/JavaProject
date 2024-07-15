package com.kh.practice.list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

class ListPractice {

	/*
	 * * List 특징 * : 중복이 가능하고, 순서가 있는 콜렉션
	 * 
	 * * ArrayList - 배열 구조 - 데이터 조회가 빠름. - 데이터 추가 삭제가 복잡하여 오래 걸림
	 * 
	 * ArrayList<E> 참조변수명 = new ArrayList<>(); List<E> 참조변수명 = new ArrayList<>();
	 * ==> 다형성
	 * 
	 * * LinkedList - 리스트 구조 - 데이터 추가/삭제가 빠르다. - 데이터 조회가 느림
	 * 
	 * LinkedList<E> 참조변수명 = new LinkedList<>(); List<E> 참조변수명 = new LinkedList<>();
	 * 
	 * * List 관련 메소드 - size() / 저장된 데이터 크기 - add(데이터) / 데이터 추가 - remove(인덱스) / 데이터
	 * 삭제 - get(인덱스) / 데이터 조회 -
	 */

	public static void main(String[] args) {
		myQueueTest();
	}

	public static void linkedListTest() {
		LinkedList<Integer> list = new LinkedList<>();

		// 사용자에게 정수 값을 입력 받아
		Scanner sc = new Scanner(System.in);
		System.out.print("정수값을 입력하세요 : ");
		int length = sc.nextInt();

		// 그 길이 만큼 랜덤 값을 저장 ( 랜덤값 범위 : 1 ~ length )
		for (int i = 0; i < length; i++) {
			int lalala = (int) (Math.random() * length + 1);
			list.add(lalala);
		}

		// 저장된 출력 : printItem 메소드 사용
		printItem(list);
	}
	
	public static void stackTest() {
		/*
		 * 스택(Stack) : LIFO (Last In First Out)
		 * 				제일 마지막에 저장된 데이터가 제일 처음으로 꺼내올 수 있는 구조
		 * - 데이터 추가 : 순서대로 추가 (끝에 추가)
		 * - 데이터 제거 : 마지막에 위치부터 제거
		 */
		
		/*
		 * MyStack
		 * --------------------------
		 * arrStack : ArrayList<String> = new ArrayList<>();
		 * -----------------------------
		 * + push(data:String) : void    // 데이터 추가
		 * + pop() : String 			 // 데이터 제거
		 * 								 // isEmpty() => 데이터가 없을 경우 "리스트가 비었습니다." 반환
		 * 								 // remove() => arrStack(리스트)에서 데이터 제거 후 해당데이터를 반환
		 * ----------------------------		  
		 */
		MyStack stack = new MyStack();
		stack.push("레몬");
		stack.push("아보카도");
		stack.push("파인애플");
		
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
	}
	
	public static void myQueueTest() {
		MyQueue my = new MyQueue();
		
		my.enQueue("레몬");
		my.enQueue("아보카도");
		my.enQueue("파인애플");
		
		System.out.println(my.deQueue());
		System.out.println(my.deQueue());
		System.out.println(my.deQueue());
		
		
	}

	public static void arrayListTest() {
		// 문자열 데이터를 관리하는 ArrayList 객체 생성
		List<String> list = new ArrayList<>();

		list.add("아구찜");
		list.add("찜닭");
		list.add("갈비찜");

		// 데이터 조회 : get
		printItem(list);
		System.out.println("------------------------------------");
		for (String item : list) {
			System.out.println(item);
		}
		System.out.println("------------------------------------");
		// 아구찜과 찜
		list.add(1, "돈가스");
		printItem(list);
		System.out.println("------------------------------------");
		// "돈가스" 삭제 : remove
		list.remove(1);
		printItem(list);
		System.out.println("------------------------------------");
		// 갈비찜을 돈가스로 변경
		list.set(2, "돈가스");
		printItem(list);
		System.out.println("-------------------------22-----------");

		swapList(list, 1, 0);
		printItem(list);
		System.out.println("-------------------------33-----------");

		printItem(list);

	}

	public static <E> void swapList(List<E> list, int n1, int n2) {
		E temp;
		temp = list.get(n1);
		list.set(n1, list.get(n2));
		list.set(n2, temp);
	}

	public static <E> void printItem(List<E> list) {
		for (int i = 0; i < list.size(); i++) {
			System.out.println((i + 1) + "번째 : " + list.get(i));
		}
	}
}
