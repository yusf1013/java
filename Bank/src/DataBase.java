import java.util.Scanner;

public class DataBase
{
	Scanner jin = new Scanner(System.in);
	
	
	public void accMenu ()
	{
		int size=0, choice;
		Account [] arrayofAcc = new Account[100];
		//Account workingAccount;
		AccountMenu accountWork= new AccountMenu();
		MainMenu mainMenu = new MainMenu();
		
		while(true)
		{
			System.out.println("Please enter your choice");
			System.out.println("1. Create account \n2. Select/Change account \n3. Exit");
			choice=jin.nextInt();
			
			if(choice==1)
			{
				if(size==100)
				{
					System.out.println("Memory Full");
				}
				
				else
				{
					arrayofAcc[size]=accountWork.createAccount();
					size++;
					System.out.println("Account Created");
				}
			}
			
			else if(choice==2)
			{
				if(size==0) 
				{
					System.out.println("Error! No account has been created yet!");
					continue;
				}
				
				else
				{
					while(true)
					{
						boolean notFound=true;
						System.out.println("Please enter your account number.");
						int accNum=jin.nextInt();
					
						for(int i=0; i<size; i++)
						{
							if(accNum==arrayofAcc[i].getAccNum())
							{
								mainMenu.mainMenu(arrayofAcc[i]);
								notFound=false;
								break;
							}
						}
					
						if(notFound) 
							System.out.println("Not Found. Please try again");
						else
							break;
					}
					//workingAccount=accountWork.changeAcc(Account [] arrayofAcc, size);
					//break;
				}
			}
			
			else if(choice==3)
				return;
		}
	}
}
