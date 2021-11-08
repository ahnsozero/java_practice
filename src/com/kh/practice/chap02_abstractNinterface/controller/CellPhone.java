package com.kh.practice.chap02_abstractNinterface.controller;

							// 카메라 인터페이스를 상속함
public interface CellPhone extends Phone, Camera {
	// 인터페이스라 앞에 public abstract 생략가능
	String charge();	

}
