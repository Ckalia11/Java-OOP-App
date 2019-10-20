package bankaccountapp;

public class Savings extends Account {
	
	int safetydepositboxid;
	int safetydepositboxkey;
	
	public Savings(String name, String ssn, double init_deposit, String Acc_type) {

		super(name, ssn, init_deposit, Acc_type);
//		System.out.println("New savings account " );
//		System.out.println("Name : " + name);
		
		set_safteydepositboxid(34567);
		this.safetydepositboxid = get_safteydepositboxid();
		System.out.println("The safety deposit box id is : " + safetydepositboxid);
		set_safetydepositboxkey(89766);
		this.safetydepositboxkey = get_safetydepositboxkey();
		System.out.println("The safety deposit box key is : " + safetydepositboxkey);
		
	}
	
	private void set_safteydepositboxid(int safetydepositboxid) {
		this.safetydepositboxid = safetydepositboxid;
	}
	
	private int get_safteydepositboxid() {
return safetydepositboxid;	}
	
	private void set_safetydepositboxkey(int safetydepositboxkey) {
			this.safetydepositboxkey = safetydepositboxkey;
		}
		
	private int get_safetydepositboxkey() {
return safetydepositboxkey;		}
	
}
