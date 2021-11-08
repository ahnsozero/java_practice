package com.kh.practice.chap02_abstractNinterface.model.vo;

import com.kh.practice.chap02_abstractNinterface.controller.GalaxyNote9;
import com.kh.practice.chap02_abstractNinterface.controller.Phone;
import com.kh.practice.chap02_abstractNinterface.controller.V40;

public class PhoneController {
	//필드부
	private String[] result = new String[2];
	
	//메소드부
	public String[] method() {
		
		Phone[] ph = new Phone[2]; // Phone[] 객체배열 2칸짜리 생성
		ph[0] =  new GalaxyNote9(); // 갤럭시노트9 객체 생성하여 대입
		ph[1] =  new V40(); // 브이40 객체 생성하여 대입
		
		for(int i = 0; i < ph.length; i++) {
			if(ph[i] instanceof GalaxyNote9) {
				// 부모타입 Phone타입을 자식객체 갤럭시노트9이 맞는지 확인후 형변환
				result[i] = ((GalaxyNote9) ph[i]).printInformation();
			}else if(ph[i] instanceof V40) {
				// 부모타입 Phone타입을 자식객체 V40이 맞는지 확인후 형변환
				result[i] = ((V40) ph[i]).printInformation(); 			
			}// else if 문 끝
			
		}//for 끝			
		return result;
	}

}
