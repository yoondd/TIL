package interface_study2;

//타이어 규격에 맞게 잘 만들어둔 한국타이어 
public class HTire implements Tire {
	@Override
	public void roll() {
		System.out.println("한국타이어 구르는중.... ");
	}
}
