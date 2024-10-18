package Bank_Application;

import java.util.ArrayList;

public interface Customer_Template {
	
	public void add_Customer(Customer c);
	
	public void Deposit(int id , int amount);
	
	public void withdraw(int id , int amount );
	
	public void balance_Statement( int id );
	
	//public ArrayList transaction_history(int id);
}
