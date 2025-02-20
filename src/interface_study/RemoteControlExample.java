package interface_study;

public class RemoteControlExample {

	public static void main(String[] args) {
		RemoteControl rc; // 인터페이스 형을 가진 변수를 하나 지정한다
		
		
		//구현 객체를 만들어보자.
		//구현 객체는 인터페이스 형에 담아서 사용한다. 
		
		rc = new Tv();  // 담을 수 있다. 형 변환이 일어나 프로모션이 일어나는건가?
		rc = new Audio();
		
		//rc.setVolume(30);
		//rc.turnOff();
	}

}
