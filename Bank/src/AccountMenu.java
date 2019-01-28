import java.util.Scanner;

public class AccountMenu
{
	private int accNum=10001;
	Scanner jin = new Scanner(System.in);
	
	public Account createAccount()
	{
		System.out.println("Please enter account name");
		String accName=jin.nextLine(); 
		int balance=setBalance();
		Account acc=new Account (accName, accNum, balance);
		accNum++;
		return acc;
	}
	
	public int setBalance()
	{
		return 500;
	}
	
	public Account changeAcc(Account[] arrayOfAcc, int size)
	{	
		while(true)
		{
			System.out.println("Please enter your account number.");
			int accNum=jin.nextInt();
		
			for(int i=0; i<size; i++)
			{
				if(accNum==arrayOfAcc[i].getAccNum())
				return arrayOfAcc[i];
			}
		
			System.out.println("Not Found. Please try again");
		}
	}
}
