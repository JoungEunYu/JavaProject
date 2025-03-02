package com.kh.ch11_api;

import java.util.StringTokenizer;

public class API02_String {
	public static void main(String[] args) {
		// java.lang.String
		System.out.println("===== java.lang.String =====");
		
		String str = "Hello, World!";
		
		// toString() : 저장된 값을 반환 (오버라이딩)
		System.out.println(str.toString());
		
		// 문자열.charAt(인덱스) : char
		// => 문자열에서 해당 인덱스 위치의 문자를 추출해서 반환
		System.out.println("인덱스 7번 위치의 문자 : " + str.charAt(7));
		char dddddddddddd = str.charAt(7);
		System.out.println("ch : " + dddddddddddd);
		
		// 문자열A.concat(문자열) : String
		// => 문자열A이랑 전달된 문자열A을 합쳐서 새로운 문자열로 반환
		String str2 = str.concat("###");
		System.out.println("str2 : " + str2);
		
		String str3 = str + "###";
		System.out.println("str3 : " + str3);
		
		System.out.println("str2 == str3 ? " + (str2 == str3));
		// => 저장된 값은 동일하나 저장된 위치가 다르므로 false
		
		// 문자열A.equals(문자열B) : boolean
		// => 문자열A와 문자열B에 저장된 값을 비교하여 같으면 true, 다르면 false를 반환
		System.out.println("st2.equals(str3) : " + (str2.equals(str3)));
		
		// 문자열.trim() : String
		// => 문자열의 앞, 뒤의 공백을 제거한 후 새로운 문자열을 반환
		System.out.println("str.trim() : " + str.trim());
		String str4 = "    JA V A   ";
		System.out.println("str4.trim() : " + str4.trim());
		
		// 문자열.length()
		// => 문자열의 길이 반환
		System.out.println("문자열 길이 : " + str.length());
		
		// 문자열.toCharArray() : char[]
		// => 문자열을 문자형 배열로 반환
		char[] chArr = str.toCharArray();
		for(int i = 0; i < chArr.length; i++) {
			System.out.println(i + "번째 : " + chArr[i]);
		}
		
		// 문자열.toUpperCase() : String
		// => 문자열을 모두 대문자로 변환하여 반환
		// 문자열.toLowercase() : String
		// => 문자열을 모두 소문자로 변환하여 반환
		
		System.out.println(str.toUpperCase());
		System.out.println(str.toLowerCase());
		//-----------------------------------------------------
		String language = "Java,Oracle,JDBC,HTML,CSS,JS,Spring";
		
		// 1) 문자열.split(구분자) : String[]
		String[] lArr = language.split(",");
		System.out.println("langs 배열의 길이 : " + lArr.length);
		for(String lang : lArr) {
			System.out.println(lang);
		}
		
		System.out.println("--------------------------------");
		StringTokenizer st = new StringTokenizer(language, ",");
		// 2) StringTokenizer 클래스 사용
		// 토큰 개수로 접근하여 데이터 조회
		
//		System.out.println(st.countTokens());
//		
//		for(int i = 0; i < 7; i++) {
//		System.out.println(st.nextToken());
//		}
//		System.out.println("--------------------------------");
		
		while(st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
	}
}













