package com.kh.practice.student.view;

import com.kh.practice.student.controller.StudentController;
import com.kh.practice.student.model.vo.Student;

public class StudentMenu {
	
	private StudentController ssm = new StudentController();
	
	public StudentMenu() {
		// StudentController에 printStudent()의 반환 값을 통해 학생 정보
		System.out.println("========== 학생 정보 출력 ==========");
		Student[] sArr = ssm.printStudent();
		for(int i = 0; i < sArr.length; i++) {
			System.out.println(sArr[i].inform());
		}
		System.out.println("========== 학생 성적 출력 ==========");
		
		System.out.println("========== 성적 결과 출력 ==========");
	}

}
