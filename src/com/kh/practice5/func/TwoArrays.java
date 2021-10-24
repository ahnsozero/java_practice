package com.kh.practice5.func;

import java.util.Scanner;

public class TwoArrays {
	
	public void method1() {
		
		/*1번 문제 
		문자열을 입력 받아 문자 하나하나를 배열에 넣고 검색할 문자가 문자열에 몇 개 들어가 있는지
		개수와 몇 번째 인덱스에 위치하는지 인덱스를 출력하세요.
		ex.
		문자열 : application
		문자 : i
		application에 i가 존재하는 위치(인덱스) : 4 8 
		i 개수 : 2*/
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자열을 입력해주세여 > " );
		String str = sc.next();
		System.out.println("문자열 : " + str);	
		
		System.out.print("검색할 문자 : ");
		String ch = sc.next();
		// 문자열로 받은 ch를 charAt()을 이용하여 search에 문자로 받아 대입
		char search = ch.charAt(0); 
		
		
		
		//입력받은 문자열 갯수길이만큼의 arr배열 선언
		char[] arr = new char[str.length()];
		
		String index = " "; 
		//같은 문자가 들어있을 인덱스를 받기위한 idex 변수 선언
		String result = str + "에 " + search + " 가" + " 존재하는 위치(인덱스) : ";	
		// 위에 스트링index를 맨밑 print구문으로 합춰서 출력하기위해 스트링 타입result변수 안에 담았다.
		int count = 0; // 같은 문자의 갯수를 셀 count변수 선언
		for(int i = 0; i < str.length(); i++) {// arr배열 각각의 인덱스에 문자열str에 있는 각각의 문자를 
												// charAt()으로 하나씩 추출해서 저장
			arr[i] = str.charAt(i);	
			
			//현재 인덱스에 들어있는 문자와 검색할문자가 같다면 true로 if구문 실행
			if(arr[i] == search) {
				
				index += i + " ";// 문자열 연산은 문자열로 자동형변환돼서 더해진다.
				count++;//검색한 문자열이 같을때마다 +1씩 센다.
			}
		}		
			System.out.println(result + index);	//같은 문자가 있는 인덱스 출력..
			System.out.println(search + " 의 갯수 : " + count);		
	}
		
	
	
	
		public void method2() {
		
		/*2번 문제
		사용자가 배열의 길이를 직접 입력하여 그 값만큼 정수형 배열을 선언 및 할당하고
		배열의 크기만큼 사용자가 직접 값을 입력하여 각각의 인덱스에 값을 초기화 하세요.
		그리고 배열 전체 값을 나열하고 각 인덱스에 저장된 값들의 합을 출력하세요.
		ex.
		정수 : 5
		배열 0번째 인덱스에 넣을 값 : 4
		배열 1번째 인덱스에 넣을 값 : -4
		배열 2번째 인덱스에 넣을 값 : 3
		배열 3번째 인덱스에 넣을 값 : -3
		배열 4번째 인덱스에 넣을 값 : 2
		4 -4 3 -3 2 
		총 합 : 2*/
		
			Scanner sc = new Scanner(System.in);
			
			System.out.print("정수 : ");
			int array = sc.nextInt();
			
			int[] arr = new int[array];//입력받은 정수 값으로 배열선언 및 할당
			
			String result = " ";// 출력에 배열에 저장된 수를 출력하기 위한 String형 그릇
			int sum = 0; //인덱스 합해서 저장할 sum변수 선언
			// 사용자에게 입력받으 정수로 배열길이만큼 포문 돌리기
			for(int i = 0; i <= arr.length-1; i++) {				
				System.out.print("배열 " + i + "번째 인덱스에 넣을 값 : " );
				int index = sc.nextInt(); // 인덱스마다 사용자에게 입력값 받기
				System.out.println();//개행
				
				result += index + " "; // 스트링형 result에 index에 들어있는 값을 더하면 
										// 스트링형으로 형변환돼서 연산된다.
				sum += index; // 각각 인덱스에 저장된값 합하기
			}
			System.out.println(result);		
			System.out.println("총합 : " + sum);
		}
		
		
		
		
		public void method3() {
					
		/*3번 문제
		사용자가 입력한 값이 배열에 있는지 검색하여
		있으면 “OOO 치킨 배달 가능“, 없으면 “OOO 치킨은 없는 메뉴입니다“를 출력하세요.
		단, 치킨 메뉴가 들어가있는 배열은 본인 스스로 정하세요.
		ex.
		치킨 이름을 입력하세요 : 양념 치킨 
		이름을 입력하세요 : 불닭
		양념치킨 배달 가능 불닭치킨은 없는 메뉴입니다.*/
			
			Scanner sc = new Scanner(System.in);			
			
			String[] chicken = {"뿌링클", "허니콤보", "황금올리브", "맵슐랭", "양념치킨"};
			//'치킨이름'배열과 인덱스값 동시에 선언
						
			System.out.print("주문하실 메뉴를 입력해주세요 : ");
			String menu = sc.next();
			
			//인덱스에 있는 값과 사용자가 입력한 값을 비교하여 결과값 출력
			for(int i = 0; i <= chicken.length-1; i++) {
				if(chicken[i].equals(menu)) {
					System.out.println(chicken[i] + " 치킨 배달 가능");
											break;
					}	
					else {
						System.out.println(menu + "은(는) 없는 메뉴입니다.");
											break;
					}	
				}
			}		
		
		
		
		
		public void method4() {
			
		/*4번 문제
		다음과 같은 실행 예제를 구현하세요.
		ex.
		정수 입력 : 4
		****
		***
		**		
		*			
		*/	
			Scanner sc = new Scanner(System.in);
			
			System.out.print("정수 입력 : ");
			int num = sc.nextInt(); // 사용자에게 정수입력 받음
			
			for(int i = 0; i <= num-1; i++ ) {	// 사용자에게 입력받은 정수만큼 행을 돌린다.			
				for(int j = num; j > i; j--) { // [i]행이 하나씩 늘어나면 [j]열은 반대로 -1씩 감소해야한다.
					System.out.print("*");
				}// 안쪽 for문 끝	
				System.out.println();
			}//바깥쪽 for문 끝
		}//method4()끝
	}// Arrays클래스 끝