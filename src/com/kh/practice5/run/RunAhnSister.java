package com.kh.practice5.run;

import com.kh.practice5.func.AhnSister;

public class RunAhnSister {

	public static void main(String[] args) {
		
		AhnSister sy = new AhnSister();
		sy.name = "소영이";
		sy.position = "큰딸";
		sy.age = 28;
		
		sy.eatAge(3);
		sy.watchNetplix();
		sy.like("서강준");
		
		System.out.println("-----------------------------------");
		
		AhnSister se = new AhnSister();
		se.name = "소은이";
		se.position = "작은딸";
		se.age = 26;
		
		se.eatAge(5);
		se.watchNetplix();
		se.like("티모시");

	}

}
