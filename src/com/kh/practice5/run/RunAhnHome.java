package com.kh.practice5.run;

import com.kh.practice5.func.AhnHome;

public class RunAhnHome {

	public static void main(String[] args) {
		AhnHome mom = new AhnHome();
		mom.stress = 2;
		mom.hungry = 1;
		mom.happy = 2;
		
		mom.goToWork("엄마");
		System.out.println("엄마의 스트레스 지수 : " + mom.stress);
		
		mom.comeBackHome("엄마");
		
		mom.eat();
		
		mom.sleep();
		
		System.out.println();
		
		AhnHome dad = new AhnHome();
		dad.stress = 4;
		dad.hungry = 0;
		dad.happy = 3;
		
		dad.goToWork("아빠");
		System.out.println("아빠의 스트레스 지수 : " + dad.stress);
		
		dad.comeBackHome("아빠");
		
		dad.eat();
		
		dad.sleep();
		
		
	}

}
