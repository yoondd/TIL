package study.abstract_study;

public abstract class Animal {
	public String kind;
	
	public void breathe() {
		System.out.println("Breathe! hoo~hoo~");
	}
	
	public abstract void sound();
}
