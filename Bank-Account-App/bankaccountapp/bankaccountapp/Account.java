package bankaccountapp;

public abstract class Account implements InterestRate {
	
	String name;
	String ssn;
	double balance;
	String Accountnumber;
	double rate;
	String Account_Type;
	
	public Account(String name,String ssn, double init_deposit, String Account_Type) {
		this.name = name;
		this.ssn = ssn;
		this.balance = init_deposit;
		this.Account_Type = Account_Type;
		
		System.out.println("Name : " + name);
		System.out.println("Account Type : " + Account_Type);
//		System.out.println("New Account : ");
		System.out.println( "SSn number is : " + ssn);
		System.out.println("Initial Deposit : " + "$" + init_deposit );
		System.out.println("The base interest rate is : "  + get_base_rate());
		
		
		
		
		
	}
}
