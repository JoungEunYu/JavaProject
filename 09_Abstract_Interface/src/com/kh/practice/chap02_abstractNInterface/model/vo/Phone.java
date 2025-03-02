package com.kh.practice.chap02_abstractNInterface.model.vo;

public interface Phone {
	
	public static final char[] NUMBERPAD = {'1', '2', '3', '4', '5', 
											'6', '7', '8', '9', '*',
											'0', '#'};
	
	public abstract String makeCall();
	
	public abstract String takeCall();
	
	//public abstract 생략 가능
}
