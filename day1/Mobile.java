package week1.day1;

public class Mobile {

	public void makeCall() {
		 System.out.println("Make call");
		
		 String mobileModel="Motorola1";
		 float mobileWeight=1.3f;
	}
	
	public void sendMsg() {
	 System.out.println("send Message");
	
	 boolean isFullCharged=true;
	 int mobileCost=12000;
}


protected void AllowVoiceCall() {
	System.out.println("Allow voice call");
	
}

private void takeVideo() {
	System.out.println("take Video");
	
}



public static void main(String[] args) {
		Mobile 	obj=new Mobile();
				obj.makeCall();
				obj.sendMsg();
				obj.AllowVoiceCall();
				obj.takeVideo();
				
				
	}
}
