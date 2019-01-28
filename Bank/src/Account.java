import java.util.Scanner;

public class Account
{
		private String accName;
		private int accNum;
		private int balance;
		
		Scanner jin = new Scanner(System.in);

		public Account(String accName, int accNum, int balance)
		{
			this.accName=accName;
			this.accNum=accNum;
			this.balance=balance;
		}
		
		public void withdraw (int amount)
		{
			if(amount>balance || amount<0) 
				System.out.println("Error");
				
			else	
				balance-=amount;
		}
		
		public void deposit (int amount)
		{
			if(amount<0) 
				System.out.println("Error");
				
			else
				balance+=amount;
		}
		
		public int getBalance()
		{
			return balance;
		}
		
		public int getAccNum()
		{
			return accNum;
		}
			
		public void printAll()
		{
			System.out.println("Account name: " + accName + "\tAccount Number: " + accNum +"\tBalance: " + balance);
		}
}
