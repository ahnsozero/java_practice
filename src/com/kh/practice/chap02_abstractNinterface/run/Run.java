package com.kh.practice.chap02_abstractNinterface.run;

import java.util.Arrays;

import com.kh.practice.chap02_abstractNinterface.model.vo.PhoneController;

public class Run {

	public static void main(String[] args) {
		PhoneController pc = new PhoneController();
		
		String[] arr =  new String[2]; // 컨트롤러에서 반환되어온 result값을 받을 배열 선언
		arr = pc.method();	//스트링배열 arr에 컨트롤러에서 반환되어온 result 참조값은 대입	
		
		//for문 돌려서 arr[0], arr[1] 인덱스 안에 있는 값 출력
		for(int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}

	}

}
