package Bank_Application;

import java.util.ArrayList;
import java.util.Scanner;

public class Bank_Model implements Customer_Template{
	
	ArrayList<Customer> list;
	
	public Bank_Model() {
		list = new ArrayList();
	}


	@Override
	public void add_Customer(Customer c) {
		// TODO Auto-generated method stub
		list.add(c);
		System.out.println("your account is created , account number is "+list.get(list.size()-1).customer_id);
	}

	@Override
	public void Deposit(int id , int amount) {
		// TODO Auto-generated method stub
		for(Customer c : list)
		{
			if(c.getCustomer_id() == id)
			{
				int bal = c.getBalance();
				bal += amount;
				c.setBalance(bal);
				break;
			}
		}
	}

	@Override
	public void withdraw(int id , int amount) {
		// TODO Auto-generated method stub
		for(Customer c : list)
		{
			if(c.getCustomer_id() == id)
			{
				int bal = c.getBalance();
				if(bal > amount)
				{
					bal -= amount;
					c.setBalance(bal);
					break;
				}
				else {
					System.out.println("Insufficient Balance...");
				}
			}
		}
	}

	@Override
	public void balance_Statement(int id ) {
		// TODO Auto-generated method stub
		int balance = 0;
		for(Customer c : list)
		{
			if(c.getCustomer_id() == id)
			{
				balance = c.getBalance();
			}
		}
		System.out.println(balance);
	}

//	@Override
//	public ArrayList transaction_history(int id) {
//		// TODO Auto-generated method stub
//		return null;
//	}
//	
	
}
