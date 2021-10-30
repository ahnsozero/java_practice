package com.kh.hw.person.view;

import java.util.Scanner;

import com.kh.hw.person.controller.PersonController;

public class PersonMenu {
	
	private Scanner sc = new Scanner(System.in);	 
	private PersonController pc = new PersonController();
		
	public void mainMenu() {
				
		int m = pc.personCount()[0];// 스튜던트배열에 카운트된 학생수
		int n = pc.personCount()[1];// 임플로이배열에 카운트된 사원수
				
		System.out.println("학생은 최대 " + pc.printStudent().length + "명까지 저장할 수 있습니다.");
		System.out.println("현재 저장된 학생은 " + m +"명입니다.");
		System.out.println("사원은 최대 " + pc.printEmployee().length + "명까지 저장할 수 있습니다.");
		System.out.println("현재 저장된 사원은 " + n + "명입니다.");
		
		System.out.println();
		
		while(true) {
			System.out.println("1. 학생메뉴");
			System.out.println("2. 사원메뉴");
			System.out.println("9. 끝내기");
			System.out.print("메뉴 번호 : ");
			int menuNum = sc.nextInt();
		
			System.out.println();//개행
		
			switch(menuNum) {
			case 1 : studentMenu(); break;
			case 2 : employeeMenu(); break;
			case 9 : System.out.println("종료합니다."); return;
			default : System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");	
							break;//스위치문만 탈출
			}//스위치문 끝
		}// 와일문 끝			
	}//mainMenu()끝
	
	public void studentMenu() {
		
		while(true) {
			System.out.println("1. 학생 추가");
			System.out.println("2. 학생 보기");
			System.out.println("9. 메인으로");
			if (pc.printStudent().length == pc.personCount()[0]) {
				System.out.println("학생을 담을 수 있는 공간이 꽉 찼기 때문에 학생 추가 메뉴는 더 이상 활성화 되지 않습니다.");
			}
			System.out.print("메뉴 번호 : ");
			int stmNum = sc.nextInt();
		
			System.out.println();// 개행
		
			switch(stmNum) {
			case 1 : if(pc.printStudent().length == pc.personCount()[0]) {
						System.out.println("잘못 입력하셨습니다. 다시 입력해주세요\n");
						studentMenu();
					}else { insertStudent();
									break;//스위치문 탈출
					}
			case 2 : printStudent(); break;// 스위치문 탈출
			case 9 : System.out.println("메인으로 돌아갑니다."); mainMenu();
			default : System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");	
								continue;// 와일문 조건식으로 다시..							
			}//스위치문 끝			
		}//와일문 끝
	}//studentMenu() 끝
	
	public void employeeMenu() {
		while(true) {
		System.out.println("1. 사원 추가");
		System.out.println("2. 사원 보기");
		System.out.println("9. 메인으로");
		if (pc.printEmployee().length == pc.personCount()[1]) {
			System.out.println("사원을 담을 수 있는 공간이 꽉 찼기 때문에 사원 추가 메뉴는 더 이상 활성화 되지 않습니다.");
		}
		System.out.print("메뉴 번호 : ");
		int emmNum = sc.nextInt();
		
		System.out.println(); // 개행
		
			switch(emmNum) {
			case 1 : if(pc.printEmployee().length == pc.personCount()[1]) {
				System.out.println("잘못 입력하셨습니다. 다시 입력해주세요\n");
				employeeMenu();
			}else { insertEmployee();
							break;
			}
			case 2 : printEmployee(); break;
			case 9 : System.out.println("메인으로 돌아갑니다."); mainMenu();
			default : System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");	
									continue;
			}//스위치문 끝
		}//와일문 끝
	}//employeeMenu() 끝
	
	public void insertStudent() {
		while(true) {
			System.out.print("학생 이름 : ");
			String name = sc.next();
			System.out.print("학생 나이 : ");
			int age = sc.nextInt();
			System.out.print("학생 키 : ");
			double height = sc.nextDouble();
			System.out.print("학생 몸무게 :");
			double weight = sc.nextDouble();
			System.out.print("학생 학년 : ");
			int grade = sc.nextInt();
			System.out.print("학생 전공 : ");
			String garde = sc.next();
				
			pc.insertStudent(name, age, height, weight, grade, garde);			
			
			if(pc.printStudent().length == pc.personCount()[0]) {
				System.out.println("학생을 담을 수 있는 공간이 꽉 찼기 때문에 학생 추가를 종료하고 학생 메뉴로 돌아갑니다.");
						break;
				}else {	System.out.print("그만하시려면 N(또는 n), 이어하시려면 아무키나 누르세요 : ");
						String anyKey = sc.next();
						if("N".equals(anyKey) || "n".equals(anyKey)) {
							studentMenu();
						}else {
								continue;
						}
				}//if문 끝
		}// 와일문 끝
	}//insertStudent() 끝
	
	public void printStudent() {		 
		for(int i = 0; i < pc.printStudent().length; i++) {
			if(pc.printStudent()[i] != null)
			System.out.println(pc.printStudent()[i].toString());
		} System.out.println();//개행
	}
	
	public void insertEmployee() {
		while(true) {
			System.out.print("사원 이름 : ");
			String name = sc.next();
			System.out.print("사원 나이 : ");
			int age = sc.nextInt();
			System.out.print("사원 키 : ");
			double height = sc.nextDouble();
			System.out.print("사원 몸무게 :");
			double weight = sc.nextDouble();
			System.out.print("사원 급여 : ");
			int salary = sc.nextInt();
			System.out.print("사원 부서 : ");
			String dept = sc.next();
					
			pc.insertEmployee(name, age, height, weight, salary, dept);
			
			if(pc.printEmployee().length == pc.personCount()[1]) {
				System.out.println("사원을 담을 수 있는 공간이 꽉 찼기 때문에 사원 추가를 종료하고 사원 메뉴로 돌아갑니다.");
						break;				
				}else {	System.out.print("그만하시려면 N(또는 n), 이어하시려면 아무키나 누르세요 : ");
						String anyKey = sc.next();
					if("N".equals(anyKey) || "n".equals(anyKey)) {
								employeeMenu();
					}else {
									continue;
					}
			}//if문 끝
		}//while문 끝
	}//insertEmployee() 끝
	
	public void printEmployee() {
		for(int i = 0; i < pc.printEmployee().length; i++) {
			if(pc.printEmployee()[i] != null)
			System.out.println(pc.printEmployee()[i].toString());
		} System.out.println();//개행
	}
	
}
