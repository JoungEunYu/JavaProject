package com.kh.practice.set;

import java.util.HashSet;
import java.util.Iterator;

public class SetPractice {
	
	/*
	 * Set 특징
	 * - 중복 허용 안됨
	 * - 순서 없음
	 * 
	 * 해시(Hash) 알고리즘 : 특정 기준에 따라 데이터를 분류하는 방식(알고리즘)
	 * - HashSet
	 * 
	 * 		* 중복 데이터 판단 : equals, hashCode 메소드
	 * 		[1] hashCode : 기준이 되는 값(데이터)를 정의
	 * 		[2] equals : hashCode 값이 같을 경우 동일 데이터 판단 로직 정의
	 * 
	 * Set 메소드
	 * - 데이터 추가 : add(데이터)
	 * - 데이터 삭제 : remove(데이터)
	 * - 데이터 길이 조회 : size()
	 * - 데이터 조회 
	 * 		[1] Iterator (반복자) 사용
	 * 			- Iterator 객체 생성 : set_참조변수.iterator()
	 * 			- 데이터 유/무 판단 : iterator_참조변수.hasNext()
	 * 			- 데이터 조회 : iterator_참조변수.next()
	 * 		[2] 향상된 for문(for-each)
	 * 			- for(Set에저장된데이터타입(자료형) 변수명 : Set_참조변수명) {
	 * 				// 변수명을 사용하여 데이터에 접근
	 * 			}
	 */

	public static void main(String[] args) {
		/*
		 * Object
		 * 		- equals() : 두 객체의 "주소값"을 비교하여 일치하면 true. 일치하지 않으면 false를 반환
		 * 		- hashCode() : 해당 객체의 "주소값"을 가지고 10진수 형태로 만들어 반환
		 */
		//------------------------------------------------------------------------------
		
		HashSet hSet1 = new HashSet();
		
		hSet1.add("기다운님 안녕하세요");
		hSet1.add(new String("기다운님 안녕하세요"));
		hSet1.add(new String("여러분"));
		hSet1.add(new String("힘내요"));
		
		System.out.println(hSet1);	// 저장 순서 유지되지 않음! 중복이 걸러짐!
		/*
		 * String
		 * 		- equals() : 재정의됨. "실제 담긴 문자열"을 가지고 동등비교하여 일치하면 true, 그렇지 않으면 false
		 * 		- hashCode() : 재정의됨. "실제 담긴 문자열"을 가지고 10진수 형태로 만들어서 반환
		 */
		//--------------------------------------------------------------------------------
		
		HashSet<Person> hSet2 = new HashSet<>();
		hSet2.add(new Person("허완", 34, 165));
		hSet2.add(new Person("양민욱", 31, 170));
		hSet2.add(new Person("안창원", 31, 181));
		hSet2.add(new Person("허완", 34, 165));
		
		System.out.println(hSet2);
		/* Person
		 * 		-equals() : 재정의. 실제 각 필드에 담긴 데이터들이 모두 일치하면 true, 그렇지 않으면 false
		 * 		-hashCode() : 재정의. 실제 각 필드에 담긴 데이터들을 합해서 10진수 반환
		 */
		//-----------------------------------------------------------------------------------
		// HashSet 공간에는 객체가 추가될 떄마다 동일객체인지 비교하여 추가함!
		// => 동일 객체 판단 기준 : hashCode 결과가 일치하고, equals 메소드 비교시 true일 떄
		
		// ** 데이터 조회하기 **
		// 향상된 for문(for-each) --> hSet2 데이터 출력		
//		 * 		[1] Iterator (반복자) 사용
//		 * 			- Iterator 객체 생성 : set_참조변수.iterator()
//		 * 			- 데이터 유/무 판단 : iterator_참조변수.hasNext()
//		 * 			- 데이터 조회 : iterator_참조변수.next()
		
		Iterator<Person> it = hSet2.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next()); 
		}

//		 * 		[2] 향상된 for문(for-each)
//		 * 			- for(Set에저장된데이터타입(자료형) 변수명 : Set_참조변수명) {
//		 * 				// 변수명을 사용하여 데이터에 접근
		for(Person ps : hSet2) {
			
			System.out.println(ps);
		}
		
	}

}
