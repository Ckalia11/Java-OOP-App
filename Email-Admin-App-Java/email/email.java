
// Chetan Kalia  

package emailapp;
import java.util.*;


public class email {

	private String first_name;
	private String last_name;
	private String department;
	private HashSet<Character>  password;
	private int mailbox_capacity;
	private int pass_length = 10;
	private String email;
	private String alternate_email;
	private String company_suffix = "bmo";
	
	public email(String first_name, String last_name) {
		this.first_name = first_name;
		this.last_name = last_name;
		System.out.println("Email name is Created : " + first_name + " " + last_name);
		this.department = set_department();
		System.out.println("The department you have chosen is : " + department);
		this.password = set_pass(pass_length);
		System.out.println("The random password generated is : " + password);
		this.email = "Your email is : " + first_name + "." + last_name + "@" + company_suffix + ".com";
		System.out.println(email);
	}
	
	private String set_department() {
		System.out.println("Please choose the department you work at :\n1 for sales\n2 for development\n3 for accounting\n Enter department code : " );
		Scanner in = new Scanner(System.in);
		int depart_num = in.nextInt();
		
		if(depart_num == 1) {
			return "sal";
		}
		
		else if(depart_num == 2) {
			return "dev";
		}
		
		else if(depart_num == 3) {
			return "acc";
		}
		
		else {
			return "";
		}
	}
	
	//HashSet doesn't allow for duplicates
	private HashSet<Character> set_pass (int length) {
		HashSet<Character> set = new HashSet<>();
		String password = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz123456789!@#$%^&*()";
	
		for(int i = 0; i < length; i ++) {
			int temp = (int) (Math.random() * password.length());
			
			while(set.contains(password.charAt(temp))) {
				temp += 1;
			}
			
			set.add(password.charAt(temp));
		}
			return set;
	}
	
	public void set_mailbox_capacity(int capacity) {
		
		this.mailbox_capacity = capacity;
		
	}
	
	public int get_mailbox_capacity() {
		
		return mailbox_capacity;
		
	}
	
	public void set_alternate_email(String alt_email) {
		this.alternate_email = alt_email;
		
	}
	
	
	public String get_alternate_email() {
		return alternate_email;
	}
	
}
