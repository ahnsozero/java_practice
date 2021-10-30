package com.kh.hw.person.controller;

import com.kh.hw.person.model.vo.Employee;
import com.kh.hw.person.model.vo.Student;

public class PersonController {
	
	private Student[] s = new Student[3];
	private Employee[] e = new Employee[10];
	
	
	
	public int[] personCount() {
		int[] count = {0, 0}; //각 객체배열에 저장된 객체의 수를 담을 배열 count 선언 		
		for(int i = 0; i < s.length; i++) {
			// 스튜던트배열안에 값이 비어있지 않으면 1씩 카운트를 센다.
			if(s[i] != null) {
				count[0]++;
			}
		}
		
		for(int i = 0; i < e.length; i++) {
			// 임플로이배열안에 값이 비어있지 않으면 1씩 카운트를 센다.
			if(e[i] != null) {
				count[1]++;
			}
		}		
			return count;
	}
	
	
	public void insertStudent(String name, int age, double height, double weight, int grade, String major) {		
		for(int i = 0; i < s.length; i++) {
			if(s[i] == null) {// 스튜던트배열의 빈 인덱스에만 매개값을 넣기위해 
			s[i] = new Student(name, age, height, weight, grade, major);
					// 스튜던트 객체생성과 동시에 스튜던트배열 인덱스에 생성된 객체가 들어간다.
							break; // 브레이크를 걸어놓지 않으면 첫번째 입력받은 정보가
									// 스튜던트배열 갯수만큼 똑같이 입련된다.
									//인덱스1개당 스튜던트 객체를 하나씩 저장하기 위해서이다.
			}
		}
	}
	
	public Student[] printStudent() {
		
		return s;
	}
	
	
	public void insertEmployee(String name, int age, double height, double weight, int salary, String dept) {
		for(int i = 0; i < e.length; i++) {
			if(s[i] == null) {// 임플로이배열의 빈 인덱스에만 매개값을 넣기 위해
			e[i] = new Employee(name, age, height, weight, salary, dept);
							break;
			}
		}
	}
	
	
	public Employee[] printEmployee() {
		return e;
	}


}
