package com.kh.practice.chap02_abstractNinterface.controller;

public class GalaxyNote9 extends SmartPhone implements NotePen{
	
	//기본 생성자
	public GalaxyNote9() {
		super.setMaker("삼성");// 스마트폰 조상 세터메소드를 이용해 초기화
	}
	
	//메소드부	
	public String makeCall() {// 인터페이스 Phone을 구현
		return "번호를 누르고 통화버튼을 누름\n";
	}
	public String takeCall() {// 인터페이스 Phone을 구현
		return "전화받기 버튼을 누름\n";		
	}
	public String picture() {//인터페이스 Camera를 구현
		return "1300만 듀얼카메라\n";		
	}
	public String charge() {// 인터페이스 CellPhone에서 SmartPhone이 받고 구현
		return "고속충전, 고속 무선 충전\n";
	}
	public String touch() {// 인터페이스 TouchDisplay에서  SmartPhone이 받고 구현
		return "정전식, 와콤펜 지원\n";
	}	
	public boolean bluetoothPen() {// 인터페이스 NotePen 구현
		return true;
	}	
	public String printInformation() {// 추상클래스 SamrtPhone 구현
		return "갤럭시 노트9은 " + super.getMaker() + "에서 만들어졌고 제원은 다음과 같다.\n"
				+ makeCall() + takeCall() + picture() + charge() + touch() 
				+ "블루투스 펜 탑재 여부 : " +bluetoothPen() + "\n";			
		
	}
	
	

}
