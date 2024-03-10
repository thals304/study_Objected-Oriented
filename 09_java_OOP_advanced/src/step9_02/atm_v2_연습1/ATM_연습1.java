package step9_02.atm_v2_연습1;

import java.util.Scanner;

public class ATM_연습1 {
	// 근데 FileManager.getInstance().save();를 왜 play에서는 안해주지?
	Scanner scan = new Scanner(System.in);
	int identifier = -1;
	UserManager_연습1 um = UserManager_연습1.getInstance();
	
	void play() {
		// FileManager_연습1.getInstance().load;
		UserManager_연습1.getInstance().printAllUser();
		
		while(true) {
			System.out.println("[ATM]");
			System.out.println("[1.회원가입]\n[2.로그인]\n[0.종료]");
			System.out.print("메뉴 선택 : ");
			int sel = scan.nextInt();
			
			if (sel == 1) {
				join();
			}
			else if (sel == 2) {
				login();
			}
			else if (sel == 0) {
				break;
			}
		}
		
		
	}
	
	void join() {
		UserManager_연습1.getInstance().joinMember(); // login처럼 um.joinMember();로 호출하면 안되나?
	}
	
	void login() { // 근데 로그아웃(-1)인 상태에서만 로그인 가능하도록 해야되지 않나?
		identifier = um.logUser();
		
		if (identifier != -1) {
			loginMenu();
		}
		else {
			System.out.println("[메세지] 아이디와 패스워드를 확인해주세요");
		}
	}
	
	void loginMenu() {
		
		while(true) {
			System.out.println("[" + um.userList[identifier].id + "님, 환영합니다");
			System.out.println("[1.계좌생성]\n[2.계좌삭제]\n[3.조  회]\n[4.회원탈퇴]\n[0.로그아웃]");
			System.out.print("메뉴 선택 : ");
			int sel = scan.nextInt();
			
			if (sel == 1) {}
			else if (sel == 2) {}
			else if (sel == 3) {}
			else if (sel == 4) {}
			else if (sel == 0) {
				identifier = -1;
				System.out.println("[메세지]로그아웃 되었습니다");
				break;
			}
		}
		scan.close();
	}
}
