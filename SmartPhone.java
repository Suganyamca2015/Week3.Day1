package week3.day1;

import week3.day2.Androidphone;

public class SmartPhone extends Androidphone {
	
	public void connectwhatsapp()
	{
		System.out.println("Sending Whatsapp Message");
	}
	
	public static void main(String[] args)
	{
		
		SmartPhone sp = new SmartPhone();
		sp.sendMsg();
		sp.makeCall();
		sp.saveContact();
		sp.takeVideo();
		sp.connectwhatsapp();		
	}

}
