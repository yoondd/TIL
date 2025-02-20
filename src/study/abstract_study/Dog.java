package study.abstract_study;

public class Dog extends Animal {
	public Dog() {
		this.kind = "포유류";
	}
	
	@Override
	public void sound() {
		System.out.println("bowwow!");
	}
}
