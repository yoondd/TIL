package interface_study;

public class Audio implements RemoteControl {
	private int volume;
	
	public void turnOn() {
		System.out.println("Audio on!!!!!!!");
	}	
	public void turnOff() {
		System.out.println("Audio off!!!!!!!!");
	}
	public void setVolume(int volume) {
		
		// 어떻게 RemoteControl.MAX_VOLUME으로 접근할 수 있는걸까? 이들은 static으로 어디에서나 그냥 쓰면 된다.
		if(volume > RemoteControl.MAX_VOLUME ) {
			this.volume = RemoteControl.MAX_VOLUME;
		}else if(volume < RemoteControl.MIN_VOLUME) {
			this.volume = RemoteControl.MIN_VOLUME;
		}else {
			this.volume = volume;
		}
		System.out.println("now audio volume: " + this.volume);
	}
}
