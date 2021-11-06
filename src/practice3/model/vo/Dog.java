package practice3.model.vo;

public class Dog extends Animal{
	// 필드부
	public static final String PLACE = "애견카페";
	private int weight;
	
	//생성자부
	public Dog() {}
	public Dog(String name, String kinds, int weight) {
		super(name, kinds);
		this.weight = weight;		
	}
	
	//메소드부
	// getter, setter
	public int getWeight() {
		return weight;
	}
	public void setWeight (int weight) {
		this.weight = weight;
	}
	
	// 애니몰에게 상속받은 추상메소드 몸통을 구현
	@Override
	public void speak() {
		System.out.println(super.toString() + "몸무게는 " + weight + "kg 입니다.");
	}
	
}
