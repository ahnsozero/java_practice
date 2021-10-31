package com.kh.hw.person.model.vo;

public class Employee extends Person{
	// 필드부
	private int salary;
	private String dept;
	
	
	// 생성자부
	public Employee() {}
	public Employee(String name, int age, double height, double weight, int salary, String dept) {
		super(name, age, height, weight);// 펄슨에서 상속받은 생성자
		this.salary = salary;// 임플로이만의 변수 추가
		this.dept = dept;				
	}
	
	
	
	// 메소드부
	// getter,setter
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}	
	
	@Override
	public String toString() {
		return super.toString() + ", " + salary + ", " + dept;
	}

}
