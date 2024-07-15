package com.kh.practice.charCheck.controller;

import com.kh.practice.charCheck.exception.CharCheckException;

public class CharacterController {
	
	public CharacterController() {
		
	}
	
	public int countAlpha(String s) throws CharCheckException {
		
		if(s.contains(" ")) {
			throw new CharCheckException("체크할 문자열 안에 공백이 포함되어 있습니다.");	
		}
		
		
		
		char[] arr = new char[s.length()];
		
		int count = 0;
		
		for(int i = 0; i < s.length(); i++) {
			arr[i] = s.charAt(i);
			if(arr[i] >= 'a' && arr[i] <= 'z' || arr[i] >= 'A' && arr[i] <= 'Z' ) {
				count++;
			}
		}
		
		return count;
	}

}
