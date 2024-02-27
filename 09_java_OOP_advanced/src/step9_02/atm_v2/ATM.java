package step9_02.atm_v2;

import java.util.Scanner;

public class ATM {
	
	Scanner scan = new Scanner(System.in);
	int identifier = -1; // -1 : 회원탈퇴, 로그아웃 / 현재 로그인한 인덱스 번호
	UserManager um = UserManager.getInstance();
	
	void play() {
		
		FileManager.getInstance().load(); // 파일은 일단 보류
		UserManager.getInstance().printAllUser();
		
		while (true) {
			
			System.out.println("[ATM]");
			System.out.println("[1.회원가입]\n[2.로그인]\n[0.종료]");
			System.out.print("메뉴 선택 : ");
			int sel = scan.nextInt();
			
			if		(sel == 1)  join();
			else if (sel == 2)  login();  
			else if (sel == 0)  break;
			
		}
		
	}
	
	
	void login() {
		
		identifier = um.logUser();
		if (identifier != -1) loginMenu();
		else 				  System.out.println("[메세지]아이디와 패스워드를 확인해주세요.");

	}
	
	
	void loginMenu() {
		
		while (true) {
			
			System.out.println("[" + um.userList[identifier].id + "님, 환영합니다.]");
			System.out.println("[1.계좌생성]\n[2.계좌삭제]\n[3.조    회]\n[4.회원탈퇴]\n[0.로그아웃]");
			System.out.println("메뉴 선택 : ");
			int selectMenu = scan.nextInt();

			if (selectMenu == 1) {
				AccountManager.getInstance().createAcc(identifier);
				FileManager.getInstance().save();
			}
			else if (selectMenu == 2) {
				// 구현한게 정답이 맞나? FileManager.getInstance().save();는 언제마다 해줘야 하는가? 회원 & 계좌 추가, 삭제 등에서
				if (UserManager.getInstance().userList[identifier].accCnt == 0) {
					System.out.println("더이상 삭제할 수 없습니다.");
					continue;
				}
				if (UserManager.getInstance().userList[identifier].accCnt == 1) {
					System.out.println("[메시지] 계좌번호 '" + UserManager.getInstance().userList[identifier].acc[0].accNumber+"' 삭제되었습니다.\n");
					UserManager.getInstance().userList[identifier] = null;
					FileManager.getInstance().save(); // 삭제했으니 같이 수정된 파일도 저장
				}
				else {
					System.out.print("삭제 하고 싶은 계좌 번호를 입력하세요 : ");
					String deleteAccount = scan.next();
					
					int tempAccAccount = um.userList[identifier].accCnt;
					int delIdx = -1;
					for (int i = 0; i < tempAccAccount; i++) {
						if (um.userList[identifier].acc[i].accNumber.equals(deleteAccount)) {
							delIdx = i;
							break;
						}
					}
					
					if (delIdx == -1) {
						System.out.println("[메시지] 계좌번호를 확인하세요.");
						continue;
					}
					else {
						System.out.println("[메시지] 계좌번호 '" + UserManager.getInstance().userList[identifier].acc[delIdx].accNumber+"' 삭제되었습니다.\n");
						Account[] temp = um.userList[identifier].acc;
						um.userList[identifier].acc = new Account[tempAccAccount - 1];
						
						int j = 0;
						for (int i = 0; i < tempAccAccount; i++) {
							if (delIdx != i) {
								um.userList[identifier].acc[j++] = temp[i];
							}
						}
						temp = null;
						um.userList[identifier].accCnt--;
						FileManager.getInstance().save();
					}
				}
				
			}
			else if (selectMenu == 3) {
				AccountManager.getInstance().printAcc(identifier);
			}
			else if (selectMenu == 4) { // 회원 탈퇴가 계좌 메뉴에 있는 이유? 회원 탈퇴는 로그인 상태에서만 가능하므로
				identifier = um.deleteMember(identifier);
				break;
			}
			else if (selectMenu == 0) {
				identifier = -1; 
				System.out.println("로그아웃 되었습니다.");
				break;
			}
			
		}
		
	}
	
	
	void join() {
		UserManager.getInstance().joinMember();
	}

	
}
