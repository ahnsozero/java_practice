package practice3.model.vo;

public abstract class Animal {
	//필드부
	private String name;
	private String kinds;
	
	
	//생성자부
	protected Animal() {}
	protected Animal(String name, String kinds) {
		this.name = name;
		this.kinds = kinds;
		}
	
	// 메소드부
	// getter, setter메소드
	public String getName () {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getKinds() {
		return kinds;
	}
	public void setKinds(String kinds) {
		this.kinds = kinds;
	}
	
	@Override
	public String toString() {
		return "저의 이름은 " + name + " 이고, 종류는 " + kinds + " 입니다. ";
	}
	
	//추상메소드
	public abstract void speak();
	
}
