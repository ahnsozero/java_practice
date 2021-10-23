package com.kh.practice5.func;

import java.util.Scanner;

public class AhnSister {
		
	public String name;
	public String position;
	public int age;
	
	// 매겨변수에 먹을 나이 입력
	public void eatAge(int age) {
		this.age += age;
		System.out.println(name + "가 " + this.age + "살 먹었습니다. ㅠㅠ" );
	}
	
	// 좋아하는 프로그램 입력받아 출력
	public void watchNetplix() {
		Scanner sc = new Scanner(System.in);
		System.out.print("시청할 프로그램 > ");
		String program = sc.nextLine();
		
		System.out.println(position + "이 " + program + "을(를) 시청합니다.");
	}
	
	// 매개변수에 내가 좋아하는 것 대입해서 출력하기
	public void like(String b) {
		System.out.println(name + "가 " + b + "을(를) 좋아합니다. 아니, 사랑할지도.." );
	}

}
