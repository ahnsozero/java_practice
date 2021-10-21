package com.kh.practice4.func;

import java.util.Arrays;
import java.util.Scanner;

public class Practice4 {
	
	public void tenArrays() {
				
		//  1번 문제 !
			
//			10개의 값을 저장할 수 있는 정수형 배열을 선언 및 할당하고
//			1~10 사이의 난수를 발생시켜 배열에 초기화 후
//			배열 전체 값과 그 값 중에서 최대값과 최소값을 출력하세요.
//			ex.
//			5 3 2 7 4 8 6 10 9 10
//			최대값 : 10
//			최소값 : 2
		
		// 10개의 값을 저장할 수있는 arr 배열 선언
		int[] arr = new int[10];
		
		// arr배열의 인덱스 0~9번까지 for문으로 반복돌림
		for(int i = 0; i <= arr.length-1; i++) {
			arr[i] = (int)(Math.random()*10)+1;
			// 배열 arr에 인덱스 0~9까지 정수 1~10까지의 난수 대입
		}		
		System.out.println(Arrays.toString(arr));// 배열 전체값 출력
		
		// 최대값 max 선언과 arr[0]담겼을 난수를 max에 대입
		int max = arr[0];
		// 최소값 min 선언과 arr[0]에 담겼을 난수를 min에 대입
		int min = arr[0];
		//for문 하나로 최대값 인덱스 i, 최솟값 인덱스 j를 동시에 돌려준다.
		for(int i = 0, j = 0; i <= arr.length-1 && j <= arr.length-1; i++, j++) {
			if(max < arr[i]) { // max에 대입된 arr[0]을 기준으로 for문으로 돌리면서 arr[0], arr[1],...비교하고
								// max값보다 값이 크면	
				max = arr[i]; // max에 그 인덱스 값을 대입해준다. 
				}
			if(min > arr[j]) { // min에 대입된 arr[10]을 기준으로 for으로 돌리면서 arr[9], arr[8]..순으로 비교하고
								// min값보다 값이 작으면
				min = arr[j]; // min에 그 인덱스 값을 대입해준다.
				}
			}
		System.out.println(max); // for문 밖에서 최댓값 출력 
		System.out.println(min); // 최솟값 출력
		
	}	
	
	
	
	public void icantRotto() {
					
		// 2번 문제 !
			
//			로또 번호 자동 생성기 프로그램을 작성하는데 중복 값 없이 출력하세요.
//			ex.
//			39 1 41 34 2 27
		
		//로또 번호 배열 6개 선언
		int[] rotto = new int[6];
		// 중복을 확인할 변수에 rotto[0]을 대입
		int overlap = rotto[0];
		// rotto 인덱스 for문으로 0~5까지 돌리기
		for(int i = 0; i <= rotto.length-1; i++) {
			rotto[i] = (int)(Math.random()*46)+1;
			// 로또배열 6자리에 1~46까지 int형태의 난수 대입하기
			
			//현재 인덱스i와 j의 0 ~ i-1(i보다 작을때까지) 비교하여 중복된 숫자가 존재하면 i--
			//현재 인덱스와 그전에 입력된 인덱스의 비교를 위해서 조건식에 현재 인덱스[i]는 이전 인덱스[j]보다 작아야한다.
				for (int j = 0; j < i; j++) {
				if(rotto[i] == rotto[j]) {					
					i--; //로또[i]값과 로또[j]값의 중복이 나왔기때문에
							// i값을 감소시키고 해당하는 인덱스에 다시 중복되지 않는 값을 받을 받도록,
					break; // 가장 가까운 for문을 끝내버린다.
				}
			} //중복은 2시간해도 노답이라 어려워서 결국.. 구글링에 승복하고 말았습니다ㅠㅠ
				
	}		
		System.out.println(Arrays.toString(rotto));
	}
			
	
	
	public void icantMethod() {
	
//			3번 문제 !
			
//			문자열을 입력 받아 문자열에 어떤 문자가 들어갔는지 배열에 저장하고
//			문자의 갯수와 함께 출력하세요.
//			ex.
//			문자열 : application
//			문자열에 있는 문자 : a, p, l, i, c, t, o, n
//			중복되지 않는 문자 개수 : 8
		
		// 사용자로부터 키보드값을 입력받기 위한 스캐너 객체 생성
		Scanner sc = new Scanner(System.in); 
		
		System.out.print("문자열을 입력하쇼 > ");
		String str = sc.next();
		// 사용자에게 입력받은 문자열을 str변수에 대입해준다.
		
		// 사용자가 입력한 문자열 길이만큼의 문자타입의 배열을 선언해준다.
		char[] ch = new char[str.length()];
		
		// 문자형 배열 ch안에 담겨있는 단일문자들의 갯수
		int sum = ch.length;
		//사용자가 입력한 문자열 길이만큼 인덱스를 for문으로 돌려준다.
		for(int i = 0; i <= str.length()-1; i++) {
			ch[i] = str.charAt(i); //위에 선언한 char타입 ch[]각각의 인덱스에 
									//사용자가 입력한 문자 하나하나를 charAt()을 이용하여 추출해서 대입시킨다. 
						
			for(int j = 0; j < i; j++) {
				if(ch[i] == ch[j]) {
					sum -= 2;					
					break; 
				}
			}
		}
		System.out.println("문자열 : " + str);
		System.out.println("문자열에 있는 문자 : " + Arrays.toString(ch));
		System.out.println("중복되지 않는 문자 갯수 : " + sum);
			
	}
}
