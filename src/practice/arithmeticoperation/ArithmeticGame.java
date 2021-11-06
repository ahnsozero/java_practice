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
					case "상" : high(); return;//완벽한 프로그램 종료를 위해 break;가 아닌 return;문을 써준다.
					case "중" : middle(); return;
					case "하" : low(); return;
					default : System.out.println("저세상 난이도를 고르셨습니다. 다시 입력 ㄱㄱ \n");
								break;// 스위치문만 빠져나가고 다시 와일문 가동							
				}// 스위치문 끝
			
	
			}/*이프문 끝*/
		
		} /*와일문 끝*/ 

}	
		
		
		public void high() {
			
			System.out.println("상급 난이도입니다. 1 ~ 1000 범위로 출제됩니다.\n");	
			
			int[] rightWrong = {0,0};// 정답, 오답카운트셀 배열				
			int i = 0;//퀴즈앞 넘버				
			
			while(true) {				
				
				String[] ope = {"+", "-", "*", "/"}; //연산자 선언
				int j = (int)(Math.random()*4);	// 연산자 인덱스 랜덤으로 받기				
				int	num1 = (int)(Math.random()*1000)+1;// 첫번째 정수 랜덤으로 받기
				int	num2 = (int)(Math.random()*1000)+1;// 두번째 정수 랜덤으로 받기
				int[] result = {(num1+num2), (num1-num2), (num1*num2), (int)(num1/num2)}; //사칙연산에 따른 결과값	나누기 몫 0. 소수점 나오면 그냥 0으로 치게 int형으로 바꿈	
								
				System.out.print("Q"+ i +")" + num1 + ope[j] + num2 + "=" + "?\n>> ");
				int user = sc.nextInt();								
					if((user == result[j])) {
						System.out.println("#정답입니다!\n");
						rightWrong[0]+=1;
						i++;//퀴즈넘버 카운트
					}else if(user != result[j] && user != 0) {	
						System.out.println("오답인디요..\n");	
						rightWrong[1]+=1;
						i++;//퀴즈 넘버 카운트
					}else if(user == 0) {					
						System.out.println("============================");
						System.out.println("# 정답 횟수: " + rightWrong[0] + "회," + "오답 횟수: " + rightWrong[1]);
												break; //와일문 탈출					
					}/*이프 엘스문 끝*/				
			
			}//와일문 끝			
			
		}// high()메소드 끝
			
		
		
		public void middle() {
			
			System.out.println("중급 난이도입니다. 1 ~ 100 범위로 출제됩니다.\n");	
			
			int[] rightWrong = {0,0};// 정답, 오답카운트하는 배열			
			int i = 0;//퀴즈앞 넘버				
			
			while(true) {				
				
				String[] ope = {"+", "-", "*", "/"}; //연산자 선언
				int j = (int)(Math.random()*4);	// 연산자 인덱스 랜덤으로 받기				
				int	num1 = (int)(Math.random()*100)+1;// 첫번째 정수 랜덤으로 받기
				int	num2 = (int)(Math.random()*100)+1;// 두번째 정수 랜덤으로 받기
				int[] result = {(num1+num2), (num1-num2), (num1*num2), (int)(num1/num2)}; //사칙연산에 따른 결과값	나누기 몫 0. 소수점 나오면 그냥 0으로 치게 int형으로 바꿈	
								
				System.out.print("Q"+ i +")" + num1 + ope[j] + num2 + "=" + "?\n>> ");
				int user = sc.nextInt();								
					if((user == result[j])) {
						System.out.println("#정답입니다!\n");
						rightWrong[0]+=1;
						i++;//퀴즈넘버 카운트
					}else if(user != result[j] && user != 0) {	
						System.out.println("오답인디요..\n");	
						rightWrong[1]+=1;
						i++;//퀴즈 넘버 카운트
					}else if(user == 0) {					
						System.out.println("============================");
						System.out.println("# 정답 횟수: " + rightWrong[0] + "회," + "오답 횟수: " + rightWrong[1]);
												break; //와일문탈출					
					}/*이프 엘스문 끝*/				
			
			}//와일문 끝			
			
		}// middle()메소드 끝
			
		
		
		public void low() {
			
			System.out.println("하급 난이도입니다. 1 ~ 20 범위로 출제됩니다.\n");	
			
			int[] rightWrong = {0,0};// 정답, 오답카운트 하는 배열			
			int i = 0;//퀴즈앞 넘버				
			
			while(true) {				
				
				String[] ope = {"+", "-", "*", "/"}; //연산자 선언
				int j = (int)(Math.random()*4);	// 연산자 인덱스 랜덤으로 받기				
				int	num1 = (int)(Math.random()*20)+1;// 첫번째 정수 랜덤으로 받기
				int	num2 = (int)(Math.random()*20)+1;// 두번째 정수 랜덤으로 받기
				int[] result = {(num1+num2), (num1-num2), (num1*num2), (int)(num1/num2)}; //사칙연산에 따른 결과값	나누기 몫 0. 소수점 나오면 그냥 0으로 치게 int형으로 바꿈	
								
				System.out.print("Q"+ i +")" + num1 + ope[j] + num2 + "=" + "?\n>>");
				int user = sc.nextInt();								
					if((user == result[j])) {
						System.out.println("#정답입니다!\n");
						rightWrong[0]+=1;
						i++;//퀴즈넘버 카운트
					}else if(user != result[j] && user != 0) {	
						System.out.println("오답인디요..\n");	
						rightWrong[1]+=1;
						i++;//퀴즈 넘버 카운트
					}else if(user == 0) {					
						System.out.println("============================");
						System.out.println("# 정답 횟수: " + rightWrong[0] + "회," + "오답 횟수: " + rightWrong[1]);
												break; //브레이크문 탈출					
					}/*이프 엘스문 끝*/				
			
			}//와일문 끝			
			
		}// low()메소드 끝

}
