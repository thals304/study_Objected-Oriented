package step9_01.atm_v1;

public class Account { // 계좌
	
	String number;  // 계좌 번호
	int money;      // 계좌 money
	
	void printOwnAccount() {
		System.out.println(this.number +  " : " + this.money);
	}
	
}
