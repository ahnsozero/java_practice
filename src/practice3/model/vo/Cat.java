package practice3.model.vo;
					//애니몰클래스 상속	
public class Cat extends Animal {
	//필드부
	private String location;
	private String color;
	
	//생성자부
	public Cat() {}
	public Cat(String name, String kinds, String location, String color) {
		super(name, kinds);
		this.location = location;
		this.color = color;
	}
	
	
	//메소드부
	// getter, setter
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	// 애니몰에게 상속받은 추상메소드 몸통을 구현
	@Override
	public void speak() {
		System.out.println(super.toString() + location + "에 서식하며, 색상은 " + color +"입니다.");
	}
	
	
	
}
