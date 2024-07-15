package com.kh.example.practice7.model.vo;

public class Employee {
	
	private int empNo;
	private String empName;
	private String dept;
	private String job;
	private int age;
	private char gender;
	private int salary;
	private double bonusPoint;
	private String phone;
	private String address;
	
	public Employee() {
		
	}
	
	public Employee(int empNo, String empName) {
		this.empNo = empNo;
		this.empName = empName;
	}
	
	public Employee(int empNo, String empName, String dept,
			String job, int age, char gender, int salary,
			double bonusPoint, String phone, String address) {
		this.empNo = empNo;
		this.empName = empName;
		this.dept = dept;
		this.job = job;
		this.age = age;
		this.gender = gender;
		this.salary = salary;
		this.bonusPoint = bonusPoint;
		this.phone = phone;
		this.address = address;
	}
	
	//EmpNo
	public int getEmpNo() {
		return empNo;
	}
	public void setEmpNo(int empNo) {
		this.empNo = empNo;
	}
	
	//EmpName
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	
	//Dept
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	
	//Job
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	
	//Age
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	//Gender
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	
	//Salary
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	//BonusPoint
	public double getBonusPoint() {
		return bonusPoint;
	}
	public void setBonusPoint(double bonusPoint) {
		this.bonusPoint = bonusPoint;
	}
	
	//Phone
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	//Address
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	
}
