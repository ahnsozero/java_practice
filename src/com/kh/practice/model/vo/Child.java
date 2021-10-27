package com.kh.practice.model.vo;

public class Child extends Parents{
	//필드부
	private int z;
	
		
	//생성자부
	public Child() {}
	
	public Child(int x, int y, int z) {
		super(x,y);
		this.z = z;
	}
	
	
	//getter,setter메소드
	public int getZ() {
		return z;
	}

	public void setZ(int z) {
		this.z = z;
	}
	

}
