package com.kh.hw.person.controller;

import com.kh.hw.person.model.vo.Employee;
import com.kh.hw.person.model.vo.Student;

public class PersonController {
	
	private Student[] s = new Student[3];
	private Employee[] e = new Employee[10];
	
	private int[] count = new int[2]; // 스튜던트배열과 임프로이배열에 저장된 객체의 수를 셀 배열 count 선언
										// 정수형이기때문에 0번, 1번 인덱스에 각각 0이 기본값으로 셋팅되어 있다.
	
	public int[] personCount() {			
			
			return count;
	}	
	
	public void insertStudent(String name, int age, double height, double weight, int grade, String major) {		
		 
			s[count[0]] = new Student(name, age, height, weight, grade, major);
					// 스튜던트 객체생성과 동시에 스튜던트배열 인덱스에 생성된 객체가 들어간다.
			count[0]++;// 스튜던트 배열에 저장된 스튜던트 객체 늘어날때마다 같이 동시에 count의 0번 인덱스 1씩 증가
	}		
			
	public Student[] printStudent() {
		
		return s;
	}
	
	
	public void insertEmployee(String name, int age, double height, double weight, int salary, String dept) {
		
			e[count[1]] = new Employee(name, age, height, weight, salary, dept);
			count[1]++; // 임플로이 배열에 저장된 임플로이 객체 늘어날때마다 같이 동시에 count의 1번 인덱스 1씩 증가
							
		}
	
	
	public Employee[] printEmployee() {
		
		return e;
	}

}
