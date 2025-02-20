package interface_study2;

public class CarExample {
	public static void main(String[] args) {
		
		// 내가 만든 자동차 객체를 한번 생성해볼까? 
		Car mycar = new Car(); //생성자 호출 
		mycar.run(); //한번 달려볼게. (달리면 각각의 roll 메서드가 실행되면서 각 바퀴가 어떤 브랜드인지 알려줄테니까.)
		
		System.out.println("------문제가 있는 필드만 변경하면? ");
		
		// 문제가 있는 필드만 변경을 해보자. 
		// 어떻게 이 필드들에게 금호타이어를 넣을 수가 있을까? 한국타이어였잖아??
		// 걱정마. 금호나 한국이나 모두 Tire를 규격삼아 제작했기때문에 모두 Tire로 형 변환이 일어날거야.
		mycar.flTire = new KTire(); 
		mycar.brTire = new KTire();
		
		
		// 다시 실행해볼까?
		mycar.run();
		
		
		//이와같이 다형성을 구현해낼 수 있다. 지금까지 공부한 내용은 인터페이스 필드의 다형성을 구현하는 내용이었다. 
		
	}
}
