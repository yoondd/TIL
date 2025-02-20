package study.abstract_study;

public class Cat extends Animal {
	public Cat(){
		this.kind = "포유류";
	}
	
	@Override
	public void sound() {
		System.out.println("meow~ meow~");
	}
}
