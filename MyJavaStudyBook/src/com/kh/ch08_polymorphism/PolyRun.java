package com.kh.ch08_polymorphism;

public class PolyRun {
	public static void main(String[] args) {
		/*
		 * * 다형성 : 부모 타입으로부터 파생된 여러가지 타입의 자식 객체들을
		 * 			부모 타입 하나로 다룰 수 있는 기술
		 * 			=> 편리하고 코드 길이가 감소됨!
		 * 
		 * 		클래스 참조변수     =    new 클래스생성자;
		 * 	  (부모타입이 올수 있음)    (자식클래스인 경우 사용 가능)
		 * 실제로 어디까지 접근가능한가    실제로 어떤형태로 메모리에 생성이 되었는가
		 * 
		 */
		//-------------------------------------------------------
		/*
		 * * "상속 구조"의 클래스 간의 형변환
		 *	[1] 업캐스팅 (UpCasting)
		 *		: 자식 타입 -> 부모타입으로 형변환
		 *		: 자동 형변환
		 *		부모타입 참조변수 = 자식객체;		
		 *
		 *	[2] 다운캐스팅 (DownCasting)
		 *		: 부모타입 -> 자식타입으로 형변환
		 *		: 강제(명시적) 형변환
		 * 		ex) ((자식클래스명)참조변수).자식메소드();
		 * 
		 * 		* instanceof 연산자 : 현재 레퍼런스(참조변수)가 실제로 어떤 클래스타입을 참조하는 지 확인
		 * 		=> 연산 결과 true / false
		 * 
		 * 		[표현법]
		 * 			참조변수 instanceof 클래스타입
		 */
		//---------------------------------------------------------------------------
		/*
		 * * 동적 바인딩
		 * 		- 프로그램 실행 전에는 컴파일되면서 정적바인딩됨 (참조변수 타입의 메소드를 가리킴)
		 * 		- 실제로 참조하는 자식클래스에 해당 메소드가 오버라이딩 되어 있다면
		 * 		  프로그램 실행 시 동적으로 그 자식클래스에 오버라이딩된 메소드를 찾아서 실행
		 */
		Parent[] parent = new Parent[3];
		
		parent[0] = new Son();
		parent[1] = new Son();
		parent[2] = new Daughter();
		
		// 자식클래스에 추가된 메소드를 호출
		for(int i = 0; i < parent.length; i++) {
			// 다운 캐스팅 후 자식타입에 추가된 메소드 호출
			// 단, 다양한 자식 타입이 있을 수 있으므로 참조하는 객체 확인 후 형변환 
			if(parent[i] instanceof Son) {
				((Son)parent[i]).printSon();
			}
			if(parent[i] instanceof Daughter) {
				((Daughter) parent[i]).printDaughter();
			}
		
		}
		System.out.println("-----------------------------");
		for(int i = 0; i < parent.length; i++) {
			parent[i].print();
		}
		
	}

}


















