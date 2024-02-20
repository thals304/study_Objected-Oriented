package step9_01.atm_v1;

public class User {
	
	String id;
	int accCount;
	Account[] acc; // account 객체 배열 - number, money, printOwnAccount() 메소드
	
	void printAccount() {
		
		for (int i = 0; i < accCount; i++) {
			acc[i].printOwnAccount();
		}	
		
	}
	
}
