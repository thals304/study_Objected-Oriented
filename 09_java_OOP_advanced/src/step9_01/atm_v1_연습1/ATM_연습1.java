package step9_01.atm_v1_연습1;

import java.util.Random;
import java.util.Scanner;

public class ATM_연습1 {

	static Scanner scan= new Scanner(System.in);
	Random ran = new Random();
	UserManager_연습1 userManger = new UserManager_연습1();
	int identifier = -1;
	
	void printMainMenu() {
		
		while(true) {
			System.out.println("\n[ATM]");
			System.out.println("[1.회원가입] [2.로그인] [3.로그아웃] [4.회원탈퇴] [0.종료] ");
			System.out.print("메뉴 선택 :");
			int sel = scan.nextInt();
			
			if (sel == 1) {
				join();
			}
			else if (sel == 2){
				login();
			}
			else if (sel == 3) {}
			else if (sel == 4) {}
			else if (sel == 0) {
				System.out.println("프로그램을 종료합니다");
				break;
			}
		}
	}
	
	void join() {
		
		userManger.addUser();
	}
	
	void login() {
		
		identifier = userManger.logUser();
		if(identifier != -1) {
			printAccountMenu();
		}
		else {
			System.out.println("[메세지] 로그인 실패. 아이디를 다시 확인해 주세요");
		}
	}
	void logout() {
		if (identifier == -1) { // 근데 이미 로그아웃 또는 회원 가입이 안된 아이디인건데 이 멘트를 써도 되나?
			System.out.println("[메세지] 로그인을 하신 후에 이용하실 수 있습니다");
		}
		else {
			identifier = -1;
			System.out.println("[메세지] 로그아웃 되었습니다");
		}
	}
	void printAccountMenu() {
		
		while(true) {
			System.out.println("[1.계좌생성] [2.계좌삭제] [3.조회] [0.로그아웃] ");
			System.out.print("메뉴 선택 : ");
			int sel = scan.nextInt();
			
			String makeAccount = Integer.toString(ran.nextInt(90001) + 10000);
			
			if (sel == 1) {
				
				if (userManger.user[identifier].accCount == 0) {
					userManger.user[identifier].acc = new Account_연습1[1];
					
					userManger.user[identifier].acc[0] = new Account_연습1();
					userManger.user[identifier].acc[0].number = makeAccount;
				}
				else {
					Account_연습1[] temp = userManger.user[identifier].acc;
					int tempAccCount = userManger.user[identifier].accCount;
					userManger.user[identifier].acc = new Account_연습1[tempAccCount + 1];
					
					for (int i = 0; i < tempAccCount; i++) {
						userManger.user[identifier].acc[i] = temp[i];
					}
					temp = null;
					userManger.user[identifier].acc[tempAccCount] = new Account_연습1();
					userManger.user[identifier].acc[tempAccCount].number = makeAccount;
					userManger.user[identifier].accCount++;
				}
			}
			else if (sel == 2) {
				if (userManger.user[identifier].accCount == 0) {
					System.out.println("[메시지] 더 이상 삭제할 수 없습니다\n");
					continue;
				}
				else if (userManger.user[identifier].accCount == 1) {
					System.out.println("[메시지] 계좌번호 : '" + userManger.user[identifier].acc[0].number + "' 삭제되었습니다\n");
					userManger.user[identifier].acc = null;
				}
				else {
					
					System.out.print("삭제하고 싶은 계좌 입력 : ");
					String acc = scan.next();
					
					int tempAccCount = userManger.user[identifier].accCount;
					int delIdx = -1;
					for (int i = 0; i < tempAccCount; i++) {
						if (acc.equals(userManger.user[identifier].acc[i].number)) {
							delIdx = i;
						}
					}
					
					if (delIdx != -1) {
						System.out.println("[메시지] 계좌번호 : '" + userManger.user[identifier].acc[delIdx].number + "' 삭제되었습니다\n");
						Account_연습1[] temp = userManger.user[identifier].acc;
						userManger.user[identifier].acc = new Account_연습1[tempAccCount + 1];
						
						int j = 0;
						for (int i = 0; i < tempAccCount; i++) {
							if (i != delIdx) {
								userManger.user[identifier].acc[j] = temp[i];
								j++;
							}
						}
						temp = null;
						userManger.user[identifier].accCount--;
					}
				}
			}
			else if (sel == 3) {
				if (userManger.user[identifier].accCount == 0) {
					System.out.println("[메시지] 생성된 계좌가 없습니다 \n");
				}
				else {
					userManger.user[identifier].printAccount();
				}
			}
			else if (sel == 0) {
				logout();
				break;
			}
			}
		}
	}

