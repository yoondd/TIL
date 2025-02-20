package study.abstract_study;

public class AnimalExample {

	public static void animalSound(Animal animal) {
		animal.sound();
	}
	
	public static void main(String[] args) {
		
		//정상적으로 Animal을 토대로 만든 Dog와 Cat을 가지고 각 클래스에서 재정의한 sound를 실행한다 
		Dog dog = new Dog();
		Cat cat = new Cat();
		dog.sound();
		cat.sound();
		System.out.println("-----");
		
		//형변환을이용한다 
		Animal animal = null;
		animal = new Dog();
		animal.sound();
		
		animal = new Cat();
		animal.sound();
		System.out.println("-----");
		
		
		// 매개변수의 형변환도 이용해본다 
		animalSound(new Dog());
		animalSound(new Cat());
		
		
	}

}
