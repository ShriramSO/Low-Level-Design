package Bank_Application;

import java.util.Scanner;

public class Bank_View_Model {
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		Bank_View b = new Bank_View();
		
		
		boolean clock = true;
		
		while(clock)
		{
			
			b.menu();
			
			int choice = sc.nextInt();
			
			switch(choice)
			{
			
			case 1 :
				b.createAcc();
				break;
				
			case 2 :
				b.depositAcc();
				break;
				
			case 3 :
				b.withdrawAcc();
				break;
				
			case 4 :
				b.view_Statement();
				break;
				
			case 5 :
				b.sendMoney();
				break;
				
			case 6 :
				b.transactionHistory();
				break;
				
			case 7 :
				clock = false;
				System.out.println("Thank for Banking...");
				break;
				
			default:
				System.out.println("Enter valid actions...");
			}
		}
		sc.close();
	}

}
