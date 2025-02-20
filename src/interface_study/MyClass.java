package interface_study;


//내가 만든 클래스에 적용해서 한번 사용해보자.
public class MyClass {
	
	// field
	RemoteControl rc = new Tv();
	
	// contructor
	MyClass(){}
	
	MyClass(RemoteControl rc){
		this.rc = rc;
		rc.turnOn();
		rc.setVolume(5);
	}
	
	
	// method
	void methodA() {
		RemoteControl rc = new Audio();
		rc.turnOn();
		rc.setVolume(6);
	}
	void methodB(RemoteControl rc) {
		rc.turnOn();
		rc.setVolume(7);
	}
}
