
// Chetan Kalia 

package emailapp;

public class email_main {

	
	public static void main(String[] args) {
		email eml = new email("Chetan","Kalia");
		eml.set_alternate_email("ckalia149@gmail.com");
		System.out.println("Your alternate email is : " + eml.get_alternate_email());
		eml.set_mailbox_capacity(5);
		System.out.println("Your mailbox capacity is : " + eml.get_mailbox_capacity());
	}
}
