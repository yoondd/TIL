package interface_study;

public class Tv implements RemoteControl {
	private int volume;
	
	public void turnOn() {
		System.out.println("tv ON!!!");
	}
	public void turnOff() {
		System.out.println("tv OFF!!!");
	}
	public void setVolume(int volume) {
		if( volume > RemoteControl.MAX_VOLUME ) {
			this.volume = RemoteControl.MAX_VOLUME;
		}else if( volume < RemoteControl.MIN_VOLUME ) {
			this.volume = RemoteControl.MIN_VOLUME;
		}else {
			this.volume = volume;
		}
		System.out.println( "Now volume: " + this.volume );
	}
}
