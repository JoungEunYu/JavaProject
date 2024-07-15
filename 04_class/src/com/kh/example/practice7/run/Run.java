package com.kh.example.practice7.run;
import com.kh.example.practice7.model.vo.Employee;
public class Run {

	public static void main(String[] args) {
		
		Employee em1 = new Employee();
		Employee em2 = new Employee(200, "최태식");
		Employee em3 = new Employee(300, "정은유", "부우부", "대리"
				, 29, '남', 3000000, 0.49, "010-757-786", "푱티악");
		
		em1.setEmpNo(100);
		System.out.println("사원 번호 : " + em1.getEmpNo());
		
		em1.setEmpName("홍길동");
		System.out.println("사원명 : " + em1.getEmpName());
		
		em1.setDept("영업부");
		System.out.println("부서 : " + em1.getDept());
		
		em1.setJob("과장");
		System.out.println("계급 : " + em1.getJob());
		
		em1.setAge(25);
		System.out.println("나이 : " + em1.getAge());
		
		em1.setGender('남');
		System.out.println("성별 : " + em1.getGender());
		
		em1.setSalary(2500000);
		System.out.println("월급 : " + em1.getSalary());
		
		em1.setBonusPoint(0.05);
		System.out.println("보너스 포인트 : " + em1.getBonusPoint());
		
		em1.setPhone("010-1234-5678");
		System.out.println("전화번호 : " + em1.getPhone());
		
		em1.setAddress("서울시 강남구");
		System.out.println("주소 : " + em1.getAddress());		
		
		System.out.println("-----------------------------------");

		System.out.println("사원 번호 : " + em2.getEmpNo());
		
		
		System.out.println("사원 번호 : " + em2.getEmpName());
		
		em2.setDept("축구부");
		System.out.println("부서 : " + em2.getDept());
		
		em2.setJob("회장");
		System.out.println("계급 : " + em2.getJob());
		
		em2.setAge(23);
		System.out.println("나이 : " + em2.getAge());
		
		em2.setGender('여');
		System.out.println("성별 : " + em2.getGender());
		
		em2.setSalary(100000000);
		System.out.println("월급 : " + em2.getSalary());
		
		em2.setBonusPoint(0.999);
		System.out.println("보너스 포인트 : " + em2.getBonusPoint());
		
		em2.setPhone("010-7777-7777");
		System.out.println("전화번호 : " + em2.getPhone());
		
		em2.setAddress("인천광역시 계양구");
		System.out.println("주소 : " + em2.getAddress());	
		
		System.out.println("-----------------------------------");
		
		
		System.out.println("사원 번호 : " + em3.getEmpNo());
		
		
		System.out.println("사원 번호 : " + em3.getEmpName());
		

		System.out.println("부서 : " + em3.getDept());
		
	
		System.out.println("계급 : " + em3.getJob());
		
		
		System.out.println("나이 : " + em3.getAge());
		
		
		System.out.println("성별 : " + em3.getGender());
		
	
		System.out.println("월급 : " + em3.getSalary());
		
	
		System.out.println("보너스 포인트 : " + em3.getBonusPoint());
		
	
		System.out.println("전화번호 : " + em3.getPhone());
		
	
		System.out.println("주소 : " + em3.getAddress());	
	}

}
