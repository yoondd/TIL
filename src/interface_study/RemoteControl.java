package interface_study;

public interface RemoteControl {
	
	// 인터페이스가 갖는 상수. 이들은 모두 public static final을 갖게 된다. 
	public int MAX_VOLUME = 10;
	public int MIN_VOLUME = 0;
	
	// 인터페이스가 갖는 메서드 - 반드시 설계해야한다. 
	public void turnOn();
	public void turnOff();
	public void setVolume(int volume);
	
}
