package step9_01.atm_v1;
// 분석 연결성 순서: Main > ATM > UserManager > User > Account
// 코드 구현 순서 : 단위별로 만들기 ex) join() 관련된 걸 다 만든 후 테스트를 통해 확인 
public class Main { 
	
	public static void main(String[] args) {
		
		ATM atm = new ATM();
		atm.printMainMenu(); // main에서 ATM의 printMainMenu() 메서드와 연결성 시작
		
	}
	
}
