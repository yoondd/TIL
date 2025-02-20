package interface_study4;

public class Bus implements Vehicle {
	
	@Override
	public void run() {
		System.out.println("bus run!");
	}
	public void checkFare() {
		System.out.println("승차요금을 확인합니다..");
	}
	
}
