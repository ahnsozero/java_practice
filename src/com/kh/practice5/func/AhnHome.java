package com.kh.practice5.func;

public class AhnHome {
	//객체마다 다르게 디폴트값 되어 있을 변수들
	public int stress; 
	public int hungry;
	public int happy;
		
	public void goToWork(String a) {
		stress += 5;		
		hungry += 5;
		
		System.out.println(a + "는 직장에 갑니다.");
		if(stress >= 9) {
			System.out.println("과로로 사망직전입니다. 퇴사하세요.");
		}
	}
	
	public void comeBackHome(String a) {
		happy += 5;
		
		if(happy >= 5) {
			System.out.println(a + "는 세상이 아름답게 보입니다.");			
		}
	}
	
	public void eat() {
		hungry -= 5;
		happy += 5;
		
		String result = (hungry <=0 ? "과식입니다." : "야식으로 치킨을 시키세요.");
		System.out.println(result);
		
	}
	
	public void sleep() {
		stress -= 5;	
		happy += 3;
		
		if(stress <= 2) {
			System.out.println("출근할 기력이 되었습니다.");
		}else{
				System.out.println("아직 기력이 충분하지 않습니다. 더 주무세요~");
				
				}
			}
		}
	
	
		


