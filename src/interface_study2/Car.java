package interface_study2;


// 타이어를 사용할 자동차를 만든다.
public class Car {
	
	// 각 위치의 타이어칸에다가 규격에 맞게 잘 만들어둔 한국타이어를 세팅한다. 
	// 왜 Tire형으로 사용했냐고? 나중에 변경할 때 한국타이어가 아닌 금호타이어가 올 수도 있거든. 
	// 즉, Tire라는 인터페이스로 구현한 타이어들이 올거고, 해당 타이어들은 형 변환이 일어날거야. 
	Tire flTire = new HTire();
	Tire frTire = new HTire();
	Tire blTire = new HTire();
	Tire brTire = new HTire();
	
	
	// run이라는 메서드가 실행되면 4개의 바퀴가 굴러가면서, 자신의 브랜드가 무엇인지를 알려줄 것이다.
	public void run() {
		flTire.roll();
		frTire.roll();
		blTire.roll();
		brTire.roll();
	}
	
}
