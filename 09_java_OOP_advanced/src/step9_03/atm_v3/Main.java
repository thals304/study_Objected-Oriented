package step9_03.atm_v3;
// 연결성 : Main > ATM > (UserManager > User, AccountManager  > Account) , FileManager
// 단 , 회원 추가, 탈회/ 계좌 생성, 입출금 이체, 계좌 삭제 등에서 FileManager의 saveData 사용
public class Main {
	
	public static void main(String[] args) {

		new ATM().showMenu();
		
	}
	
}


