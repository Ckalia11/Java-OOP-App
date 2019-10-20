package bankaccountapp;

public class Checking extends Account {
	
	int debitcardnumber;
	int debitcardpin;
	
	public Checking(String name, String ssn, double init_deposit, String Acc_type) {
		super(name,ssn,init_deposit,Acc_type);
//		System.out.println("New checking account ");
//		System.out.println("Name : " + name);
		
		set_debitcardnumber(235678345);
		this.debitcardnumber = get_debitcardnumber();
		System.out.println("The debit card number is : " + debitcardnumber);
		set_debitcardpin(3456);
		this.debitcardpin = get_debitcardpin();
		System.out.println("The debit card pin is : " + debitcardpin);

	}
	
	private void set_debitcardnumber(int debitcardnumber) {
		this.debitcardnumber = debitcardnumber;
	}
	
	private int get_debitcardnumber() {
		return debitcardnumber;
	}
	
	private void set_debitcardpin(int debitcardpin) {
		this.debitcardpin = debitcardpin;
	}
	
	private int get_debitcardpin() {
return debitcardpin;
	}
}
