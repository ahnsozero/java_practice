package com.kh.practice.chap01_poly.view;

import java.util.Scanner;

import com.kh.practice.chap01_poly.controller.LibraryController;
import com.kh.practice.chap01_poly.model.vo.Member;

public class LibraryMenu {
	
	LibraryController lc = new LibraryController();
	Scanner sc = new Scanner(System.in);
	
	public void mainMenu() {
		
		System.out.print("이름 : ");
		String name = sc.next();
		System.out.print("나이: ");
		int age = sc.nextInt();
		System.out.print("성별: ");
		sc.nextLine();		
		char gender = sc.nextLine().charAt(0);
		Member m = new Member(name, age, gender);
		lc.insertMember(m);

		while(true) {
			System.out.println("=====메뉴=====");
			System.out.println("1. 마이페이지");
			System.out.println("2. 도서 전체 조회");
			System.out.println("3. 도서 검색");
			System.out.println("4. 도서 대여하기");
			System.out.println("9. 프로그램 종료하기");
		
			System.out.print("메뉴번호 : ");
			int menuNum = sc.nextInt();		
			
		
			switch(menuNum) {
			case 1 : System.out.println(lc.myInfo().toString()); break;
			case 2 : selectAll(); break;
			case 3 : searchBook(); break;
			case 4 : rentBook(); break;
			case 9 : return;
		}
	}
		
	}
	
	public void selectAll() {
		lc.selectAll();
		for(int i=0;i < lc.selectAll().length; i++) {
			System.out.println(i + "번 도서 : " + lc.selectAll()[i].toString());
		}
		
		String book = sc.nextLine();
	}
	
	public void searchBook() {
		System.out.println("검색할 제목 키워드 :");
		String keyword = sc.next();
				
		lc.searchBook(keyword);// 라이브러리컨트롤러 서치북에 전달
		
	}
	
	public void rentBook() {
		selectAll();
		
		System.out.print("대여할 도서 번호 선택 :");
		int bookNum = sc.nextInt();
		switch(lc.rentBook(bookNum)) {
		case 0 : System.out.println("성공적으로 대여 완료");break;
		case 1 : System.out.println("나이제한으로 대여 불가");break;
		case 2 : System.out.println("성공적으로 대여 완료, 요리학원 쿠폰");break;
		
		}		
		
	}	

}
