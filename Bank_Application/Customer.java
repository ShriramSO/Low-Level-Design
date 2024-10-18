package Bank_Application;

public class Customer {
	
	static int id = 1;
	int customer_id;
	String name;
	int age;
	int balance;
	
	public Customer(String name, int age, int balance) {
		customer_id = id++;
		this.name = name;
		this.age = age;
		this.balance = balance;
	}

	public int getCustomer_id() {
		return customer_id;
	}

	public void setCustomer_id(int customer_id) {
		this.customer_id = customer_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	@Override
	public String toString() {
		return "Customer [customer_id=" + customer_id + ", name=" + name + ", age=" + age + ", balance=" + balance
				+ "]";
	}
	
	
}
