package com.kh.practice;

public class StringTest {
	
	public static void main(String[] args) {
		test2();
	}
	
	public static void test2() {
		
		// 1) equals : 문자열1.equals(문자열2) => 문자열1과 문자열2가 같은가? : boolean
		String str = "Hello";
		System.out.println("[1] " + str.equals("Hello"));
		System.out.println("[2] " + str.equals("Bye"));
		
		// 2) charAt : 문자열.charAt(인덱스) => 해당 문자열에서 인덱스 위치의 문자값 반환. : char
		System.out.println("[3] " + str.charAt(1)); // 'e' 값을 출력
		
		// 3) length : 문자열.length() : int => 해당 문자열의 길이를 반환
		System.out.println("[4] " + str.length());
		// => str 변수의 마지막 문자 출력
		System.out.println("[5] " + str.charAt(str.length()-1));
		
		// 4) toUpperCase : 문자열.toUpperCase() : String => 해당 문자열의 값을 모두 대문자로 변환하여 반환
		//    toLowerCase : 문자열.toLowerCase() : String => 이녀석은 몽땅 소문자로.
		System.out.println("[6] " + str.toUpperCase());
		System.out.println("[7] " + str.toLowerCase());
		
		// 5) contains : 문자열1.contains(문자열2) : boolean => 문자열1에 문자열2가 포함되어 있는가
		System.out.println("[8] " + str.contains("el"));
		System.out.println("[9] " + str.contains("bb"));
		
		// 6) indexOf : 문자열1.indexOf(문자열2) : int => 문자열1에 문자열2의 시작 인덱스 위치를 반환
		System.out.println("[10] " + str.indexOf("el"));
		System.out.println("[11] " + str.indexOf("bb"));
		
		// 7) substring : 문자열.substring(인덱스) : String => 문자열에서 해당 인덱스 기준으로 문자열을 잘라서 반환
		//				  문자열.substring(시작인덱스, 종료인덱스) : String => 시작인덱스부터 종료인덱스 직전까지
		System.out.println("[12] " + str.substring(2, 4));
		
		// 8) repeat : 문자열.repeat(개수) : String => 해당 문자열을 개수만큼 반복
		System.out.println("[13] " + "배고파".repeat(5));
		
		// 9) split : 문자열.split(대상문자열) : String[] => 해당 문자열을 대상문자열 기준으로 분리하여 배열행태로 반환
		String str2 = "카레/돈까스/밥/김치/닭갈비";
		System.out.println("[14] ");
		String[] menus = str2.split("/");
		for(int i = 0; i < menus.length; i++) {
			System.out.println(i + "번째 메뉴 : " + menus[i]);
		}
	}
	
	public static void test1() {

		String str1 = "apple";
		String str2 = "apple";
		
		// str1 == str2 : 주소값을 비교 
		System.out.println("[1] " + (str1 == str2));
		// => 문자열 값 자체를 대입하면 상수풀이라는 공간에 값이 저장되어
		// 같은 곳을 가리키게 됨 (주소값이 동일)
		
		System.out.println("[2] " + (str1 == "apple"));
		// => str1이 가리키는 주소와 "apple" 값 자체가 저장된 주소를 비교
		// str1, "apple" 모두 상수풀의 같은 곳에 저장되어 있따.
		
		String str3 = new String("apple");
		String str4 = new String("apple");
		
		System.out.println("[3] " + (str3 == str4));
		//=> 문자열 객체를 생성해서 값을 대입하면 메모리에 새로운 영역을 할당하므로
		// 각각 할당된 영역을 가리키게 된다. (주소값이 다름)
		
		System.out.println("[4] " + (str3 == "apple"));
		//=> str3가 가리키는 주소와 "apple" 값 자체가 저장된 주소를 비교
		// str3는 새로운 메모리 공간 할당 후 "apple" 값을 저장
		// "apple" 값 자체는 상수풀에 저장되어 있어 서로 다른 곳을 가리킴
		
		System.out.println("값을 비교하고자 할때(equals) : " + str3.equals("apple"));
		
		System.out.println("==========================");
		
		String str5 = "Hello";
		String str6 = "World";
		
		System.out.println("[5] " + str5);
		System.out.println("[6] " + str5.toString()); // String클래스에서 toString 메소드가 오버라이딩됨!
		
		int hash = System.identityHashCode(str5); // System 클래스 내에서 해쉬값(주소값)을 확인하는 기능을 제공하는 메소드
		System.out.println("[7] " + hash);
		
		str5 = str5.concat(str6);
		System.out.println("[8] " + str5);
		
		int hash2 = System.identityHashCode(str5);
		System.out.println("[9] " + hash2);
		
		System.out.println("[10] " + System.identityHashCode("HelloWorld"));
		
	}

}
