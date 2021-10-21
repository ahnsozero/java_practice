package com.kh.practice3.func;

import java.util.Arrays;
import java.util.Scanner;

public class Practice3 {
	
	public void method1() {
		
		// 정수 두개와 연산자를 입력받고 입력된 연산자에 따라 알맞은 결과를 출력!
		// 단, 해당 프로그램은 연산자 입력에 "exit"라는 값이 입력될 때까지 무한 반복하며
		// exit가 입력되면 "프로그램을 종료합니다."를 출력하고 종료합니다.
		// 또한 연산자가 나누기이면서 두 번째 정수가 0으로 들어오면
		// "0으로 나눌 수 없습니다. 다시 입력해주세요."를 출력하며,
		// 없는 연산자가 들어올 시 "없는 연산자입니다. 다시 입력해주세요."라고 출력하고
		// 두 경우 모두 처음으로 돌아가 사용자가 다시 연산자부터 입력하도록 하세요.
		
		// ex.
		
		// 연산자(+, -, *, /, %) : +
		// 정수 1 : 10
		// 정수 2 : 4
		// 10 + 4 = 14
				
		// 연산자(+, -, *, /, %) : ^
		// 정수 1 : 10
		// 정수 2 : 4
		//없는 연산자입니다. 다시 입력해주세요.
				
		// 연산자(+, -, *, /, %) : exit
		// 프로그램을 종료합니다.
		
		Scanner sc = new Scanner(System.in);
		
		int first;
		int second;
			
		while(true) {
			
			System.out.print("첫번째 정수 : ");
			first = sc.nextInt();
			
			System.out.print("두번째 정수 : ");
			second = sc.nextInt();
			
			System.out.print("연산자입력(+,-,*,/,%) ※종료시 'exit' 입력※ : ");
			String op = sc.next();
				// 입력받은 연산자의 예외상황
				if(op.equals("exit")) {
						System.out.println("프로그램을 종료합니다.");
							break;
					}
				if(op.equals("/") && second == 0) {
							System.out.println("0으로 나눌 수 없습니다. 다시 입력해주세요.");
							continue;
				}
				if(!op.equals("+") && !op.equals("-") && !op.equals("*") && !op.equals("/") && !op.equals("%")) {
							System.out.println("없는 연산자입니다. 다시 입력해주세요.");
							continue;
				}
				// 입력받은 연산자에 따른 출력값
				switch(op) {
				case "+" : System.out.println(first + "+" + second + "=" + (first+second));
									return;
				case "-" : System.out.println(first + "-" + second + "=" + (first-second));
									return;
				case "*" : System.out.println(first + "*" + second + "=" + (first*second));	
									return;
				case "/" : System.out.println(first + "/" + second + "=" + (first/second));
									return;
//				case "/" : if(num 2 == 0) {
//									System.out.println("0으로 나눌 수 없습니다. 다시 ㄱ");
//								}else {
//									reult = num1 / num2;
//								}
//						braek;	// 스위치문에서 if문으로 연산자가 나누기이면서 두 번째 정수가 0으로 들어오면
									// "0으로 나눌 수 없습니다. 다시 입력해주세요."를 출력까지 한꺼번에 처리가능
				case "%" : System.out.println(first + "%" + second + "=" + (first%second));	
									return;
						}
		}		// break;는 스위치에서 스위치문만 나가가고, 반복문에서는 반복문만 나간다.
				// continue;는 스위치랑 전혀 연관이 없다. 반복문에서만 쓰인다.
	}
	
	
	
	
	public void method2() {
		
		
		// 2번 공차만들기
	
//		사용자로부터 시작 숫자와 공차를 입력 받아
//		일정한 값으로 숫자가 커지거나 작아지는 프로그램을 구현한세요.
//		단, 출력되는 숫자는 총 10개입니다.
//		* '공차'는 숫자들 사이에서 일정한 숫자의 차가 존재하는 것을 말한다.
//		ex) 2, 7, 12, 22 ...
//			5	5	5	5
		
//		Scanner sc = new Scanner(System.in);
//		
//		int[] arr = new int[10];
//		
//		System.out.print("숫자를 입력해주세요 > ");
//		int num1 = sc.nextInt();
//				
//		System.out.print("공차를 입력해주세요 > ");
//		int num2 = sc.nextInt();
//		
//		for(int i = 0; i < arr.length ; i++) {
//						
//			arr[i] = num1 += num2; // 공차를 더하는 구현
////			arr[i] = num1 -= num2; // 공차를 빼는 구현
//		}
//			System.out.println(Arrays.toString(arr));
			
			
			//쌤이 짜준 gogngcha 코드
			Scanner sc = new Scanner(System.in);
			
			int[] arr = new int[10];
			
			System.out.print("숫자를 입력해주세요 > ");
			int num = sc.nextInt();
					
			System.out.print("공차를 입력해주세요 > ");
			int gongcha = sc.nextInt();
			
			int sum = num;// 합계를 담을 sum이라는 변수에 초기값 num의 값을 대입
			String str = " "; // 초기값 num을 제외한 나머지 결과값을 담을 문자열 str이라는 변수를 선언
			
			for(int i=1; i<=10; i++) {
				sum += gongcha; // 합계를 담을 sum이라는 변수에 gongcha값을 더해서 대입
				str += sum +(" "); // 결과값을 담을 str 변수에 sum에 담긴 값을 문자열로 변환하여 대입 ex) 6" "+9" "
			}
			System.out.println(num+" "+str);// 초기값 num에 공백을 붙인 뒤 반복문에서 완성한 결과값 str을 붙여서 출력
									
		}
		
	}


