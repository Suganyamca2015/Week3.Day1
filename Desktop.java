package org.system;

public class Desktop extends Computer {
	
	public void desktopSize()
	{
		System.out.println("Desktop Size : 26inches");
	}
	
	public static void main(String []args)
	{
		Desktop myDesktop = new Desktop();
		myDesktop.computerModel();
		myDesktop.desktopSize();
	}

}
