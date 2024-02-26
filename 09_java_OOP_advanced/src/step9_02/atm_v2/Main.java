package step9_02.atm_v2;
// 분석 연결 순서 : Main > ATM > (UserManager > User > Account), FileMAnager, (AccountManager > Account)
// 싱글턴을 이용해 AccountManager, UserManager, FileManager 중 하나라도 수정되면 같이 변경되도록 함
public class Main {
	
	public static void main(String[] args) {
		
		// 이전 9-1 (version1)
		// ATM atm = new ATM();
		// atm.printMainMenu();
		new ATM().play(); // 왜 이런 형태인거지? 합쳐서 쓴 형태도 가능 (version2)
		
	}
	
}


