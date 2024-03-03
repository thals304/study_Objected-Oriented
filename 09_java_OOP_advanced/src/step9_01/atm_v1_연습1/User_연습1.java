package step9_01.atm_v1_연습1;

public class User_연습1 {

	String id;
	int accCount;
	Account_연습1[] acc;
	
	void printAccount() {
		for (int i = 0; i < acc.length; i++) {
			acc[i].printOwnAccount();
		}
	}

}
