package com.kh.hw.employee.controller;

import com.kh.hw.employee.model.vo.Employee;

public class EmployeeController {
	//필드부
	private Employee e = new Employee();
	
	//생성자부 : 생략 
	
	// 메소드부
	public void add(int empNo, String name, char gender, String phone) {
		//받은 매개변수만큼 매개변수가 있는 생성자를 통해 값을 저장
		// => 매개 변수 생성자로 객체 생성 후 e라는 변수에 할당
		e = new Employee(empNo, name, gender, phone);
	}
	
	public void add(int empNo, String name, char gender, String phone, String dept, int salary, double bonus) {
		
		e = new Employee(empNo, name, gender, phone, dept, salary, bonus);
		
	}
	
	public void modify(String phone) {
		e.setPhone(phone);
	}
	public void modify(int salary) {
		e.setSalary(salary);
	}
	public void modify(double bonus) {
		e.setBonus(bonus);
	}
	public Employee remove() {
		e = null;
		return e;
	}
	
	public String inform() {
		if (e == null) {
			return null;
		}
		else {
			return e.printEmployee();
		}
		
	}

}
