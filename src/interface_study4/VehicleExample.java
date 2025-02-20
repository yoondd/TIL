package interface_study4;

public class VehicleExample {

	public static void main(String[] args) {
		Vehicle vehicle = new Bus();
		vehicle.run();
		
		// 이제는 쓸 수 있어. 왜냐면 Vehicle로 형변환 했던 것을 다시 Bus로 바꾸었으니까.
		// 그런데, 의미적으로 바라볼때 이건 좋지못해. 다시 그걸 자식으로 바꿔서 사용한다고?
		// 클래스의 강제적 형변환처럼 이것또한 별로 좋지못한 코드다.
		Bus bus = (Bus) vehicle;
		bus.run();
		bus.checkFare();
 
	}

}
