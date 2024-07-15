package com.kh.practice.token.controller;

import java.util.StringTokenizer;

public class TokenController {

	public TokenController() {

	}

	public String afterToken(String str) {
		// 매개변수로 받아온 str을 StringTokenizer를 이용하여
		// 띄어쓰기를 없애고 없앤 문자열 반환

		String[] af = new String[str.length()];

		StringTokenizer st = new StringTokenizer(str, " ");
		StringBuilder sb = new StringBuilder();
		

//		int index = 0;
//
		while (st.hasMoreTokens()) {
//			af[index] = st.nextToken();
			String token = st.nextToken();
			sb.append(token);
//			index++;
		}	
		return sb.toString();
//		}
//		String value = "";
//		for (int i = 0; i < af.length; i++) {
//			if (af[i] == null) {
//				break;
//			}
//			value += af[i];
//
//		}
//		return value;
	}

	public String firstCap(String input) {
		// tc에 firstCap()로 입력 받은 문자열을 넘기고 반환 값 출력
		String subStr = input.substring(0, 1); // 2번째 글자부터 마지막까지
		return subStr.toUpperCase() + input.substring(1);
		
	}

	public int findChar(String input, char one) {
		int count = 0;
		for(int i = 0; i < input.length(); i++) {
			if(input.charAt(i) == one) {
				count++;
			}
		}
		return count;
	}

}
