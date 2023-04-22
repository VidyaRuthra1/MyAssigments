package week1.day1;
public class Mobile {
public void sendSMS() {
	 System.out.println("send SMS");
}


protected void AllowVoiceCall() {
	System.out.println("Allow voice call");
	
}
private void takeVideo() {
	System.out.println("take Video");
	
}

	public static void main(String[] args) {
		Mobile obj=new Mobile();
				obj.sendSMS();
		obj.AllowVoiceCall();
		obj.takeVideo();
		
	}
}
