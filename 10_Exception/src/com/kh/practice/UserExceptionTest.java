package com.kh.practice;

public class UserExceptionTest {
	
	public void method() throws UserException{
		throw new UserException("사용자정의 예외발생");
	}

}
