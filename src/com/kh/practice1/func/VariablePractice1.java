package com.kh.practice1.func;

import java.util.Scanner;

public class VariablePractice1 {
	// 클래스명 : VariablePractice1
	// 메인메소드를 제외한 모든 메소드 이 클래스에 작성
	// 
	
	// 1번 문제
	// 키보드로 정수 두 개를 입력 받아 두 수의 합, 차, 곱, 나누기한 몫을 출력하세요.
	// ex. 
	// 첫 번째 정수 : 23
	// 두 번째 정수 : 7
	//
	// 더하기 결과 : 30
	// 빼기 결과 : 16
	// 곱하기 결과 : 161
	// 나누기 몫 결과 : 3
	
	public void syCalculate() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("1번 문제");
		System.out.println("정수 두개의 값을 입력하시오." );
		
		System.out.printf("첫 번째 정수 : ");
		int firstN = sc.nextInt();
		
		System.out.printf("두 번째 정수 : ");
		int seconN = sc.nextInt();
				
		System.out.println();
		System.out.println("더하기 결과 : " + (firstN + seconN));
		System.out.println("빼기 결과 : " + (firstN - seconN));
		System.out.println("곱하기 결과 : " + (firstN * seconN));
		System.out.println("나누기 몫 결과 : " + (firstN / seconN));
				
	}
	
	// 2번 문제
	// 키보드로 가로, 세로 값을 실수형으로 입력 받아 사각형의 면적과 둘레를 계산하여 출력하세요.
	// 계산공식 ) 면적 : 가로 * 세로
	//         둘레 : (가로 + 세로) * 2
	// ex.
	// 가로 : 13.5
	// 세로 : 41.7
	//
	// 면적 : 562.95
	// 둘레 : 110.4
	
	public void takeSquare() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("2번 문제");
		System.out.println("사각형을 계산해 봅시다.");
		
		System.out.printf("가로 : ");
		double width = sc.nextDouble();
		
		System.out.printf("세로 : ");
		double height = sc.nextDouble();
		
		System.out.printf("면적 : %.2f\n", (width * height));
		
		System.out.printf("둘레 : %.1f\n", ((width * height)*2));
		
	}
		
	// 3번 문제
	// 영어 알파벳 문자열 값을 키보드로 입력 받아 문자에서 앞에서 세 개를 출력하세요.
	//
	// ex. 
	// 문자열을 입력하세요 : apple
	//
	// 첫 번째 문자 : a
	// 두 번째 문자 : p
	// 세 번쨰 문자 : p
	
	public void strDivide() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("3번 문제");
		System.out.printf("문자열을 입력하세요 : ");
		String str = sc.next();
//		String str = new String(sc.next()); String객체 생성으로도 가능
		
		System.out.println();
		
		char first = str.charAt(0);
		char second = str.charAt(1);
		char third = str.charAt(2);
		
		System.out.printf("첫 번째 문자 : %c\n", first);
		System.out.printf("두 번째 문자 : %c\n", second);
		System.out.printf("세 번째 문자 : %c\n", third);
								
	}
	
	// 4번 문제
	// 키보드로 입력 받은 값들을 변수에 기록하고 저장된 변수 값을 화면에 출력하여 확인하세요.
	//
	// ex.
	// 이름 : 이승철
	// 학년(숫자만) : 3
	// 반(숫자만) : 4
	// 번호(숫자만) : 15
	// 성적(소수점 아래 둘째자리까지) : 85.75
	
	//3학년 4반 15번 이승철 남학생의 성적은 85.75이다.
	
	public void studentGrade() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("4번 문제");
		
		System.out.println();
		
		System.out.printf("이름 : ");
		String name = sc.next();
		
		System.out.printf("학년(숫자만) : ");
		int grade = sc.nextInt();
		
		System.out.printf("반(숫자만) : ");
		int group = sc.nextInt();
		
		System.out.printf("번호(숫자만) : ");
		int num = sc.nextInt();
		
		System.out.printf("성적(소수점 아래 둘째자리까지) : ");
		double testPoint = sc.nextDouble();
		System.out.println();
		
		System.out.printf("%d학년 %d반 %d번 %s 학생의 성적은 %.2f이다.", grade, group, num, name, testPoint);
		
	}

}
