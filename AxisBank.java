package week3.day1;

public class AxisBank extends BankInfo {

	public void deposit()
	{
		System.out.println("My Deposit amount : 1000");	
	}
	
	public static void main(String []args)
	{
		AxisBank ab = new AxisBank();
		ab.deposit();
		ab.savings();
		ab.fixed();
	
	}
}