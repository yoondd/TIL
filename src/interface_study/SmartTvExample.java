package interface_study;

public class SmartTvExample {

	public static void main(String[] args) {
		
		SmartTv smartTv = new SmartTv();
		
		RemoteControl rc = smartTv;
		Searchable sc = smartTv;
		
		rc.setVolume(20);

	}

}
