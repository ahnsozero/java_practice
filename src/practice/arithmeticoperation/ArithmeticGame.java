package practice.arithmeticoperation;

import java.util.Scanner;

public class ArithmeticGame {
	Scanner sc = new Scanner(System.in);
	
	public void method1() {		
		
		System.out.println("즐겁게 문제를 푸시다가 지겨우면 0을 누르세요~");
		System.out.println("# 엔터를 누르면 시작합니다.");
		System.out.println("==============================\n");
		String enter = sc.nextLine();
		
			while(true) {
				if(enter.equals("0")){
				System.out.println("종료합니다.");
								return;}
					
			else{ System.out.print("#난이도를 입력하세요! [상, 중, 하]\n>>");
					String level = sc.next();
		
					switch(level) {
					case "상" : high(); return;
					case "중" : middle(); return;
					case "하" : low(); return;//프로그램의 완전한 종료를 위해
					default : System.out.println("저세상 난이도를 고르셨습니다. 다시 입력 ㄱㄱ ");
								method1();
				}// 스위치문 끝
			
	
			}/*이프문 끝*/
		
		} /*와일문 끝*/ 

}	
		
		
		public void high() {
			
			System.out.println();	
			int	num1 = (int)(Math.random()*20)+1;
			int num2 = (int)(Math.random()*20)+1;
		
			
			
			
		}
		
		public void middle() {
			
		}
		
		public void low() {
			
			System.out.println("하급 난이도입니다. 1 ~ 20 범위로 출제됩니다.");	
			
			while(true) {
				int	num1 = (int)(Math.random()*20)+1;
				int	num2 = (int)(Math.random()*20)+1;
				int result = num1 + num2;
				int i = 0;
				
				int[] rightWrong = {0,0};// 정답, 오답
				
				
				System.out.println("Q"+ i +")" + num1 + "+" + num2 + "=" + "?\n>>");
				int user = sc.nextInt();				
				if(user == result) {
					System.out.println("#정답입니다!\n");
					rightWrong[0]++;
				}else if(user != result && user != 0) {	
					System.out.println("오답인디요..\n");	
					rightWrong[1]++;
				}else if(user == 0) {					
					System.out.println("============================");
					System.out.println("# 정답 횟수: " + rightWrong[0] + "회," + "오답 횟수: " + rightWrong[1]);
												return; //브레이크문 탈출
					
				}//이프 엘스문 끝	
			
			}//와일문 끝			
			
		}// low()메소드 끝

}
