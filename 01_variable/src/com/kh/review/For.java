package com.kh.review;

public class For {
	/*
	 * 반복문 : 특정 코드를 반복적으로 수행
	 * 
	 * - for문
	 * 
	 * 		for(초기식; 조건식; 증감식) {
	 * 			// 반복 수행할 코드
	 * 		}
	 * 
	 * 		- 실행 순서 : 초기식 -> 조건식 -> 조건식의 결과가 true이면 -> 반복 수행할 코드 실행 -> 증감식 -> 조건식
	 * 					조건식이 거짓일 경우 반복문 종료
	 * 
	 * * 초기식, 조건식, 증감식은 생략 가능. 단, ';'는 필수로 입력
	 * 	=> 증감식 생략 : for(초기식; 조건식; ) {}
	 *  => 조건식 생략 : for(초기식; ; 증감식) {}
	 *  => 초기식 생략 : for(; 조건식; 증감식) {}
	 *  
	 *  - while 문 
	 *  	
	 *  	// 초기식;
	 *  	while(조건식) {
	 *  		// 반복 수행할 코드
	 *  		// 증감식;
	 *  	}
	 *  
	 *  - do while 문 : 조건에 상관없이 1회 수행 후 조건에 따라 반복
	 *  
	 *  		do {
	 *  			// 반복 수행할 코드
	 *  		} while(조건식);
	 *  
	 *  -------------------------------------------------------
	 *  
	 *  * 분기문 (break / continue)
	 *  
	 *  		- break : 반복 실행중 종료하고자 할 때 사용
	 *  		- continue : 뒤에 실행 코드를 무시하고 증감식 또는 조건식으로 이동
	 */

	public static void main(String[] args) {
		
		// 1 ~ 100 까지의 총 합 (단, 3의 배수이거나 5의 배수일 경우는 합산에서 제외)
		
		int total = 0;
		for(int i = 1; i <= 100; i++) {
		    if(i % 3 == 0 || i % 5 == 0) {
		        continue;
		    }
		    else {
		        total = total + i;
		    }
		}
		System.out.print(total);

	}

}
