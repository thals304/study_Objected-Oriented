package step9_02.atm_v2;

import java.util.Random;
import java.util.Scanner;

public class AccountManager {

	private AccountManager() {}
	private static AccountManager instance = new AccountManager(); // 싱글턴 디자인 패턴
	public static AccountManager getInstance() {
		return instance;
	}
	
	Scanner scan = new Scanner(System.in);
	Random ran = new Random();
	UserManager um = UserManager.getInstance();	
	// 왜 AccountManager 클래스에서 UserManager 객체를 생성해준거지?
	// 연결성 때문. UserManager > userList 배열 > User > acc 배열 > Account
	void createAcc(int identifier) {
		
		int accCntByUser = um.userList[identifier].accCnt; // 계좌 개수
		
		if (accCntByUser == um.ACC_MAX_CNT) { // 최대 계좌 개설 가능 개수 : 3개
			System.out.println("[메세지]계좌개설은 3개까지만 가능합니다.");
			return; // 메서드 종료
		}
		
		um.userList[identifier].acc[accCntByUser] = new Account(); // 배열 요소에 Account 클래스의 변수들 할당
		
		String makeAccount = "";	// 계좌(accNumber)는 String 타입 // "" 또는 null로 초기화 시켜주기
		while (true) {
			// 마지막 ""를 해준 이유? 랜덤 숫자는 int 타입이므로 ""을 추가해서 전체를 문자열 취급이 되도록
			makeAccount = ran.nextInt(9000000) + 1000001 + "";	// [0-8999999] + 1000001 // 1000001 ~ 10000000
			if (!um.getCheckAcc(makeAccount)){	// false , 계좌번호가 중복이 아니면
				break;
			}
			// true, 중복이면 계속 while문 돌면서 다시 랜덤값 정해주고 다시 중복 확인하는 구조
		}
		um.userList[identifier].acc[accCntByUser].accNumber = makeAccount;
		um.userList[identifier].accCnt++;
		System.out.println("[메세지]'" + makeAccount + "'계좌가 생성되었습니다.\n");
		
	}
	
	
	void printAcc(int identifier) {
		// um.userList[identifier].id, um.userList[identifier].accNumber등 길게 쓰기 싫어서 변수에 주소? 저장
		User temp = um.userList[identifier]; 
		System.out.println("====================");
		System.out.println("ID : " + temp.id);
		System.out.println("====================");
		for (int i = 0; i < temp.accCnt; i++) {
			System.out.println("accNumber:" +temp.acc[i].accNumber + " / money: " + temp.acc[i].money);
		}
		System.out.println("=============================\n");
		
	}
	
}
