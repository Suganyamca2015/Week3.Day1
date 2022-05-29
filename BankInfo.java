package week3.day1;

public class BankInfo {
	public void savings()
	{
		System.out.println("Saving account Balance : 50000");
	}

	public void fixed()
	{
		System.out.println("Fixed account Balance: 200000");
	}
	
	public void deposit()
	{
		System.out.println("Deposit amount is : 2000");
	}
	
	public static void main(String[] args)
	{
		BankInfo bi = new BankInfo();
		bi.savings();
		bi.fixed();
		bi.deposit();
	}

}
