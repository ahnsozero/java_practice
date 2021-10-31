package com.kh.hw.person.view;

import java.util.Scanner;

import com.kh.hw.person.controller.PersonController;

public class PersonMenu {
	
	private Scanner sc = new Scanner(System.in);	 
	private PersonController pc = new PersonController();
		
	public void mainMenu() {
				
		int m = pc.personCount()[0];// 스튜던트 배열에 카운트된 학생수
		int n = pc.personCount()[1];// 임플로이 배열에 카운트된 사원수
				
		System.out.println("학생은 최대 " + pc.printStudent().length + "명까지 저장할 수 있습니다.");
		System.out.println("현재 저장된 학생은 " + m +"명입니다.");
		System.out.println("사원은 최대 " + pc.printEmployee().length + "명까지 저장할 수 있습니다.");
		System.out.println("현재 저장된 사원은 " + n + "명입니다.");
		
		System.out.println();
		
		while(true) {//무한 반복의 굴레..그래야 break;로 스위치문 빠져나와도 다시 와일문으로 시작할 수 있다.
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
							break;//스위치문만 탈출하고 다시 와일문 시작으로 돌아감
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
			
			System.out.println();//개행
					
			switch(stmNum) {
			case 1 : if(pc.printStudent().length == pc.personCount()[0]) { // 스튜던트배열길이와 스튜던트배열 카운트 숫자가 같다면,
						System.out.println("잘못 입력하셨습니다. 다시 입력해주세요\n");// 더 입력못하게 막음
						studentMenu();
					}else { insertStudent(); //안같다면 다시 입력하게 해줌
									break;//스위치문 탈출
					}
			case 2 : printStudent(); break;// 스위치문 탈출
			case 9 : System.out.println("메인으로 돌아갑니다."); mainMenu();
			default : System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");	
								continue;// 스위치문 처음이 아니라 와일문으로 돌아감							
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
		
		System.out.println();//개행
						
			switch(emmNum) { 
			case 1 : if(pc.printEmployee().length == pc.personCount()[1]) {//임플로이배열길이와 == 임플로이 배열 카운트 숫자가 같다면,
				System.out.println("잘못 입력하셨습니다. 다시 입력해주세요\n");// 더 입력못하게 막음
				employeeMenu();
			}else { insertEmployee();//안같다면 다시 입력하게 해줌
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
						break;// 와일문 종료하고 호출시킨 메소드가 있는 곳으로 돌아감 
				}else {	System.out.print("그만하시려면 N(또는 n), 이어하시려면 아무키나 누르세요 : ");
						String anyKey = sc.next();
						if("N".equals(anyKey) || "n".equals(anyKey)) {
							studentMenu();
						}else {
								continue;// 와일문 처음으로 돌아감
						}
				}//if문 끝
		}// 와일문 끝
	}//insertStudent() 끝
	
	public void printStudent() {		 
		for(int i = 0; i < pc.printStudent().length; i++) {
//			if(pc.printStudent()[i] != null)// 내 머리로는 이거 없이 될거 같은데 이거 안하면 자꾸 널포인트익셉션뜸ㅠㅠ, 왜 넣어야 하는지 모르겠음ㅠ
			System.out.println(pc.printStudent()[i].toString());// toString()은 원래 객체 풀주소 나오는 메소드인데, 
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
			if(pc.printEmployee()[i] != null)// 널포인트익셉션이라고 컴파일러한테 혼나서 어쩔 수 없이 넣음.. 
												//왜 넣어야 하는지 모르겠음ㅠ 그냥 포문인데 인덱스번호 늘어날때마다 순차적으로 들어가는게 당연한거 아닌가?ㅠㅠ
			System.out.println(pc.printEmployee()[i].toString()); 
		} System.out.println();//개행
	}
	
}
