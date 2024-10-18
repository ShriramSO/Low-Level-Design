package Bank_Application;

import java.util.Scanner;

public class Bank_View {
	
	public void menu()
	{
		System.out.println("1 . Create new Account");
		System.out.println("2 . Deposit Amount");
		System.out.println("3 . Withdraw Amount");
		System.out.println("4 . Check Balance");
		System.out.println("5. Exit");
	}
	
	Scanner sc = new Scanner(System.in);
	Bank_Model bank1 = new Bank_Model();
	
	public void createAcc()
	{
		System.out.println("Enter your name");
		String name = sc.next();
		
		System.out.println("Enter your Age");
		int age = sc.nextInt();
		
		System.out.println("Enter Amount for Account creation");
		int amount = sc.nextInt();
		
		Customer c = new Customer(name , age , amount);
		
		bank1.add_Customer(c);
	}
	
	public void depositAcc()
	{
		System.out.println("Enter your Bank Customer Id");
		int id = sc.nextInt();
		System.out.println("Enter Amount");
		int amount = sc.nextInt();
		
		bank1.Deposit(id, amount);
	}
	
	public void withdrawAcc()
	{
		System.out.println("Enter your Bank Customer Id");
		int id = sc.nextInt();
		System.out.println("Enter Amount");
		int amount = sc.nextInt();
		
		bank1.withdraw(id, amount);
	}

	public void view_Statement() {
		// TODO Auto-generated method stub
		System.out.println("Enter your Bank Customer Id");
		int id = sc.nextInt();
		
		bank1.balance_Statement(id);
	}
	
	
}
