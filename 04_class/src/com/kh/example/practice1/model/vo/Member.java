package com.kh.example.practice1.model.vo;

public class Member {
	
	private String memberId;	// - memberId : String
	private String memberPwd;	// - memberPwd : String
	private String memberName;	// - memberName : String
	private int age;			// - age : int
	private char gender;		// - gender : char
	private String phone;		// - phone : String
	private String email;		// - email : String
	
	public Member() {			// + Member()
		
	}
	
	public void changeName(String name) {	// + changeName(name:String):void
		// memberName 변수의 값을 전달된 name 값으로 변경
		memberName = name;
	}
	
	public void printName() {	// + printName() : void
		// memberName 변수의 값을 출력
		System.out.println(memberName);
	}
}
