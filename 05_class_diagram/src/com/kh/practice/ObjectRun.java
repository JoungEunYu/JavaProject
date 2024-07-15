package com.kh.practice;

public class ObjectRun {
	public static void main(String[] args) {
		//학생을 대상으로 프로그래밍을 해본다면..
		// "학생"을 객체로 선정!
		// -> 학번, 이름, 나이, 성별
		// -> 기능 : 정보조회

		//변수를 사용하여 학생의 정보를 관리하면다면...
		
//		int no1 = 100; 			// 학번
//		String name1 = "정은유"; 	// 이름
//		int age1 = 20;		 	// 나이
//		char gender1 = '남'; 	// 성별
//
//		int no2 = 101;
//		String name2 = "최서은";
//		int age2 = 26;
//		char gender2 = '여';
//		
//		int no3 = 102;
//		String name3 = "엄희윤";
//		int age3 = 30;
//		char gender3 = '남';
		
		// => 너무 많은 변수가 사용되었다... 12개나 되넹
		// => 배열을 사용해보장
		
//		int[] noArr = {100, 101, 102};
//		String[] nameArr = new String[3];
//		int[] ageArr = new int[3];
//		char[] genArr = new char[3];
		
//		noArr[0] = 100;
//		nameArr[0] = "정은유";
//		ageArr[0] = 20;
//		genArr[0] = '남';
		
		//클래스를 사용해보자 (서로다른 종류의 데이터를 한 공간에 저장)
//		Student s1 = new Student();
//		s1.no = 100;
//		s1.name = "정은유";
//		s1.age = 20;
//		s1.gender = '남';
//		s1.inform();
		
		Student s3 = new Student(100, "윈터", 20, '여');
		s3.getName();
		s3.setName("윈터2");
		s3.inform();
		
		
		
	}
}
