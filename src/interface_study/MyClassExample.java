package interface_study;

public class MyClassExample {

	
	//여러가지 방법으로 지금 인터페이스를 이용해 만든 클래스를 동작하게 하고 있다. 
	// 인터페이스의 다양한 사용법에 대해서 공부하는 예제! 
	
	public static void main(String[] args) {
		
		// 필드를 이용해서 조작함  
		System.out.println("1) -----------");
		MyClass myClass1 = new MyClass();
		myClass1.rc.turnOn();
		myClass1.rc.setVolume(9);
		
		//직접 객체를 받는 생성자를 이용해서 조작함 
		System.out.println("2) -----------");
		MyClass myClass2 = new MyClass(new Audio());
		
		//첫번째 생성자를 이용해서 생성만 하고, 메서드를 이용해 동작함 - 메서드내부에서 new  
		System.out.println("3) -----------");
		MyClass myClass3 = new MyClass();
		myClass3.methodA();
		
		//생성자를 이용해서 생성하고, 직접 메서드를 부를 때 객체를 담는다
		System.out.println("4) -----------");
		MyClass myClass4 = new MyClass();
		myClass4.methodB(new Tv());

	}

}
