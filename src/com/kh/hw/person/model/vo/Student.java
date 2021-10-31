package com.kh.hw.person.model.vo;

public class Student extends Person{
	//필드부
	private int grade; //학년
	private String major; //전공
	
	
	//생성자부
	public Student() {}
	public Student(String name, int age, double height, double weight, int grade, String major) {
		super(name, age, height, weight);// 펄스에서 상속받은 생성자
		this.grade = grade; // 스튜던트필드의 변수 추가
		this.major = major;
	}
	
	
	// 메소드부 
	// getter, setter
	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
	public String getMajor() {
		return major;
	}
	public void setMajor(String major) {
		this.major = major;
	}
	
	
	@Override
	public String toString() {
		return super.toString() + ", " + grade + ", " + major;
	}	

}
