package step9_02.atm_v2_연습1;

import java.util.Scanner;

import step9_02.atm_v2.UserManager;

public class UserManager_연습1 {

	private UserManager_연습1() {}
	static private UserManager_연습1 instance = new UserManager_연습1();
	static public UserManager_연습1 getInstance() {
		return instance;
	}
	Scanner scan = new Scanner(System.in);
	
	final int ACC_MAX_CNT = 3;
	User_연습1[] userList = null;
	int userCnt = 0;
	
	void printAllUser() {
		
		for (int i = 0; i < userCnt; i++) {
			System.out.println((i+1) + ".ID(" + userList[i].id + ")\tPW(" + userList[i].pw + ")\t");
			if (userList[i].accCnt != 0) {
				for (int j = 0;j < userList[i].accCnt; j++) {
					System.out.println("(" + userList[i].acc[j].accNumber + ":" + userList[i].acc[j].money + ")");
				}
			}
			System.out.println();
		}
	}
	
	boolean checkId(String id) {
		boolean isDuple = false;
		for (int i = 0; i < userCnt; i++) {
			if (id.equals(userList[i].id)) {
				isDuple = true;
			}
		}
		return isDuple;
	}
	
	void joinMember() {
		
		System.out.print("[회원가입] 아이디를 입력하세요 : ");
		String id = scan.next();
		System.out.print("[회원가입] 패스워드를 입력하세요 : ");
		String pw = scan.next();
		
		boolean isResult  = checkId(id);
		
		if (isResult) {
			System.out.println("[메세지] 아이디가 중복");
			return;
		}
		if (userCnt == 0) {
			userList = new User_연습1[userCnt + 1];
			userList[userCnt] = new User_연습1();
		}
		else {
			User_연습1[] temp = userList;
			userList = new User_연습1[userCnt + 1];
			for (int i = 0; i < userCnt; i++) {
				userList[i] = temp[i];
			}
			temp = null;
			
			userList[userCnt] = new User_연습1();
		}
		userList[userCnt].id = id;
		userList[userCnt].pw = pw;
		userCnt++;
		
		System.out.println("[메세지] 회원가입을 축하합니다.");
	}
	
	int logUser() {
		int identifier = -1;
		
		System.out.print("[로그인] 아이디를 입력하세요 : ");
		String id = scan.next();
		System.out.print("[로그인] 패스워드를 입력하세요 : ");
		String pw = scan.next();
		
		for (int i = 0; i < UserManager_연습1.instance.userCnt; i++) {	// 왜 굳이 같은 클래스에 있는 변수를 이렇게 표현한거지? 그냥 userCnt가 더 난데
			if (userList[i].id.equals(id)) {
				identifier = i;
			}
		}
		
		return identifier;
	}

}
