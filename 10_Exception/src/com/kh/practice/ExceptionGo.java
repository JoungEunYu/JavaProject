package com.kh.practice;

public class ExceptionGo {

	public static void main(String[] args) {
		
		UserExceptionTest uet = new UserExceptionTest();
		
		try {
			uet.method();
		} catch(UserException e) {
			e.printStackTrace();
		}

	}

}
