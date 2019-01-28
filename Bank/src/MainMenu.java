import java.util.Scanner;

public class MainMenu 
{
	public void mainMenu(Account workingAccount)
	{
		Scanner jin = new Scanner(System.in);
		int choice, amount;
		
		while(true)
		{
			System.out.println("What do you want to do?");
			System.out.println("1. Withdraw. \n2. Deposit \n3. Check balance \n4. Check everything \n5. Go back \n \n");
		
			choice=jin.nextInt();
		
			if(choice==1)
				{
					System.out.println("Please enter amount");
					amount=jin.nextInt();
					workingAccount.withdraw(amount);
				}
		
				else if(choice==2)
				{
					System.out.println("Please enter amount");
					amount=jin.nextInt();
					workingAccount.deposit(amount);
				}
		
				else if (choice==3)
					System.out.println(workingAccount.getBalance());
			
				else if(choice==4)
					workingAccount.printAll();
				
				else if(choice==5)
					return;
				
				else
					System.out.println("Invalid input. PLease try again");
		}
	}
}
