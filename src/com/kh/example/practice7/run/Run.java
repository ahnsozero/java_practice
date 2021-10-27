package com.kh.example.practice7.run;

import com.kh.example.practice7.model.vo.Employee;

public class Run {

	public static void main(String[] args) {
		Employee emp = new Employee();
		
		//setter 메소드로 각 매개변수에 값 대입
		emp.setEmpNo(100);		
		emp.setEmpName("홍길동");
		emp.setDept("영업부");
		emp.setJob("과장");
		emp.setAge(25);
		emp.setGender('남');
		emp.setSalary(2500000);
		emp.setBonusPoint(0.05);
		emp.setPhone("010-1234-5678");
		emp.setAddress("서울시 강남구");
		
		
		//getter 메소드호출해서 setter메소드를 통해 대입된 값들을 리턴시켜준다.
		System.out.println("empNo : " + emp.getEmpNo());
		System.out.println("empName : " + emp.getEmpName());
		System.out.println("dept : " + emp.getDept());
		System.out.println("job : " + emp.getJob());
		System.out.println("age : " + emp.getAge());
		System.out.println("gender : " + emp.getGender());
		System.out.println("salary : " + emp.getSalary());
		System.out.println("bonusPoint : " + emp.getBonusPoint());
		System.out.println("phone : " + emp.getPhone());
		System.out.println("address : " + emp.getAddress());		

	}

}
