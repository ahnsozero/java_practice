package com.kh.practice5.func;

import java.util.Arrays;
import java.util.Scanner;

public class DeliveryMinJok{
	//치킨 메소드
	public void method1() {
		
		String[] chick = {"BHC", "BBQ", "굽네"};
		
		System.out.println(Arrays.toString(chick));
		
		System.out.print("선택장애가 있는 당신, 고민할 시간은 제게 맡겨주십시오 > ");
			// 위의 chick[]배열 중 랜덤으로 치킨집을 골라줌	
			int name = (int)(Math.random()*3);
			System.out.println(chick[name] + " ★당첨★");
			
			//각 치킨집 대표메뉴까지 할당해서 랜덤으로 골라주는 스위치문
			switch(name){
			
			case 0 : { String[] menu = {"뿌링클", "맛초킹", "골드킹"};
						int choice = (int)(Math.random()*3);
						System.out.println("당신이 배민에 주문할 메뉴는 > " + menu[choice]);
				}										break;
				
			case 1 : { String[] menu = {"황금올리브", "황올양념", "자메이카"};
						int choice = (int)(Math.random()*3);	
						System.out.println("당신이 배민에 주문할 메뉴는 > " + menu[choice]);
			}											break;
			
			case 2 : {String[] menu = {"고추바사삭", "볼케이노", "갈비천왕"};
						int choice = (int)(Math.random()*3);
																					
						System.out.println("당신이 배민에 주문할 메뉴는 > " + menu[choice]);
			}
			
		}// 스위치 구문 끝		
		
	}// 메소드1 끝
	
	
	//피자 메소드
	public void method2() {
		
		Scanner sc = new Scanner(System.in);
		
		String[] pizza = {"도미노", "피자헛"};
		
		System.out.print(Arrays.toString(pizza) + "중에 피자집 만큼은 골라보쇼 > ");	
		//사용자로부터 피자집 입력받기
		String choice = sc.next();			
		
		//사용자가 보기에 없는 피자집을 입력했을 경우의 예외처리
		if(!(pizza[0].equals(choice)) && !(pizza[1].equals(choice))) {
				System.out.println("세상에 피자는 도미노 피자헛 둘뿐이야..");
						return;
				}		
		
		String[] menu = {"포테이토 피자", "불고기 피자", "슈프림 피자", "하와이안 피자"};  
		String[] drink = {"스프라이트", "코카콜라", "팹시콜라"};
				
		// 피자와 음료를 랜덤으로 골라 주는 중첩 for문
		for(int i = 0; i < 1; i++) {
			int whatPizza = (int)(Math.random()*4);
			System.out.println(menu[whatPizza]);//어떤 피자 메뉴를 뽑아줬는지 출력
			
				// 음료 골라주는 랜덤 for문 
				for(int j = 0; j <= i; j++) {
					int whatDrink = (int)(Math.random()*3);
					System.out.println(drink[whatDrink]);
				}// 안쪽 for문 끝
			
		}// 바깥쪽 for문 끝	
		
		// choice가 String타입이기때문에 "=="비교하면 주소값이 달라서 false가 나오므로
		// 이프구문 실행이 안된다. 따라서 String타입의 리터럴값을 비교하기 위해서는 .equals를 써야함.
		if(pizza[0].equals(choice)) {System.out.println("주문할 전화번호 여기있지롱~ > " + "577-3088");}		
		else{System.out.println("주문할 전화번호 여기있지롱~ > " + "577-9566");}
				
	}
	
}


