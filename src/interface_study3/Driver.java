package interface_study3;

//애초에 설계할때 drive메서드는 Vehicle 규격에 맞춘 클래스만 넣을 수 있구나.
public class Driver {
	public void drive(Vehicle vehicle) {
		vehicle.run();
	}
}
