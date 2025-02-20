package interface_study;

public class SmartTv implements RemoteControl, Searchable {
	private int volume;
	
	public void turnOn() {
		System.out.println("Smart Tv ON!!!!!!!!");
	}
	public void turnOff() {
		System.out.println("Smart Tv Off!!!!!");
	}
	public void setVolume(int volume) {
		if(volume > RemoteControl.MAX_VOLUME ) {
			this.volume = RemoteControl.MAX_VOLUME;
		}else if(volume < RemoteControl.MIN_VOLUME) {
			this.volume = RemoteControl.MIN_VOLUME;
		}else {
			this.volume = volume;
		}
		System.out.println( "Smart Tv Volume: " + this.volume );
	}
	
	public void search(String url) {
		System.out.println( "Searching: " + url );
	}
}
