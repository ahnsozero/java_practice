package practice3.controller;

import practice3.model.vo.Animal;
import practice3.model.vo.Cat;
import practice3.model.vo.Dog;

public class AnimalManager {

	public static void main(String[] args) {
		Animal[] ani = new Animal[5]; //애니몰타입의 객체 배열 5칸 선언
		
		// 각 인덱스 0~4까지에 Dog와 Cat객체로 넣어놓기
		// 나는 강쥐를 더 좋아해서 더 많이~
		ani[0] = new Dog("찌개", "시고르브자브종" , 8);
		ani[1] = new Cat("참치", "코리안숏", "대한민국 골목길", "그레이");	
		ani[2] = new Dog("마요", "꼬질한말티즈", 4);
		ani[3] = new Dog("육삼", "대두비숑", 6);
		ani[4] = new Cat("깐부", "낭만고양이", "체리필터", "치즈색");
		
		// 반복문으로 인덱스 0~4번까지 돌리기~
		for(int i = 0; i < 5 ; i++) {
			ani[i].speak();
		}

	}

}
