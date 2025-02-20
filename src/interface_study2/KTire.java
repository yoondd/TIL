package interface_study2;

//타이어 규격에 맞게 잘 만든 금호타이어 
public class KTire implements Tire {
	@Override
	public void roll() {
		System.out.println("금호 타이어 구르는 중.....");
	}
}
