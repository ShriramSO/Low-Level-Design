package Bank_Application;

import java.util.Scanner;

public class Bank_View {
	
	public void menu()
	{
		System.out.println("1 . Create new Account");
		System.out.println("2 . Deposit Amount");
		System.out.println("3 . Withdraw Amount");
		System.out.println("4 . Check Balance");
		System.out.println("5 . Send Money to Another Account");
		System.out.println("6 . Bank Statement");
		System.out.println("7 . Exit");
	}
	
	Scanner sc = new Scanner(System.in);
	Bank_Model bank1 = new Bank_Model();
	Transaction t = new Transaction();
	
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
		t.transaction(c.getCustomer_id(), amount);
	}
	
	public void depositAcc()
	{
		System.out.println("Enter your Bank Customer Id");
		int id = sc.nextInt();
		System.out.println("Enter Amount");
		int amount = sc.nextInt();
		
		bank1.Deposit(id, amount);
		t.transaction(id, amount);
	}
	
	public void withdrawAcc()
	{
		System.out.println("Enter your Bank Customer Id");
		int id = sc.nextInt();
		System.out.println("Enter Amount");
		int amount = sc.nextInt();
		
		bank1.withdraw(id, amount);
		t.transaction(id, -amount);
	}

	public void view_Statement() {
		// TODO Auto-generated method stub
		System.out.println("Enter your Bank Customer Id");
		int id = sc.nextInt();
		
		bank1.balance_Statement(id);
	}

	public void sendMoney() {
		// TODO Auto-generated method stub
		System.out.println("Enter id of the sender Account...");
		int s_id = sc.nextInt();
		System.out.println("Enter Amount from the Account ");
		int amount = sc.nextInt();
		System.out.println("Enter id of the receiver Account...");
		int r_id = sc.nextInt();
		
		bank1.Deposit(r_id, amount);
		t.transaction(r_id, amount);
		bank1.withdraw(s_id, amount);
		amount *= -1;
		t.transaction(s_id, amount);
	}
	
	public void transactionHistory()
	{
		System.out.println("Enter id for the Bank Statement ");
		int t_id = sc.nextInt();
		t.printTrasaction(t_id);
	}
	
}
