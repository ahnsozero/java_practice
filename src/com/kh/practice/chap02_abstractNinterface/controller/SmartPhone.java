package com.kh.practice.chap02_abstractNinterface.controller;

	//추상메소드가 있는 추상클래스
public abstract class SmartPhone implements CellPhone, TouchDisplay{
	//필드부
	private String maker; // 제조사 정보
	
	//생성자부	
	public SmartPhone(){}
	
	//메소드부
	// getter, setter
	public String getMaker() {
		return maker; 
	}
	
	public void setMaker(String maker) {
		this.maker = maker;
	}	
	
	public String printInformation() {
		return "";
	}	

}
