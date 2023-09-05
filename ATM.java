package atminterface;

public class ATM {

	public static void main(String[] args) {
		
		UserAccounts user1=new UserAccounts();
		user1.accno=28765432211l;
		user1.address="Nagpur";
		user1.balance=500000.00;
		user1.bankname="Maharashtra Bank";
		user1.branch="Sitabuldi";
		user1.name="Asha Kodape";
		user1.pin=9945;
		
		user1.checkPin();
	}
}
