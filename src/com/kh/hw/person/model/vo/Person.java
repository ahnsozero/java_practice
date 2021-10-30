package com.kh.hw.person.model.vo;

public class Person {
	//필드부
	private String name;
	private int age;
	private double height;
	private double weight;
	
	
	//생성자부
	public Person() {}
	
	public Person(String name, int age, double height, double weight) {
		this.name = name;
		this.age = age;
		this.height = height;
		this.weight = weight;				
	}

	
	
	// 메소드부
	// getter, setter
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}	

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}	
	
	
//	@override
	public String toString() {
		return name + ", " + age + ", " + height + ", " + weight;
	}
	

}
