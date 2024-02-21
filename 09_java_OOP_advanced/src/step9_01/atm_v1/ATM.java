package step9_01.atm_v1;
import java.util.Random;
import java.util.Scanner;

public class ATM {
	// static으로 하면 패키지에 있는 다른 클래스에서 바로 사용 가능
	static Scanner scan = new Scanner(System.in);
	Random ran   = new Random();
	UserManager userManager = new UserManager(); // userManger 객체 생성 - user 객체 배열, printAllUser() 메소드
	int identifier = -1;
	
	// 메인 메뉴 - UserManger 클래스와의 연결성 시작
	void printMainMenu() {
				
		while (true) {
			
			System.out.println("\n[ MEGA ATM ]");
			System.out.println("[1.회원가입] [2.로그인] [3.로그아웃] [4.회원탈퇴] [0.종료]  ");
			System.out.print("메뉴 선택 : ");
			int sel = scan.nextInt();
			
			if (sel == 1) {
				join();
			}
			else if (sel == 2) {
				login();
			}
			else if (sel == 3) {
				logout();
			}
			else if (sel == 4) {
				leave();
			}
			else if (sel == 0) {
				System.out.println("[메시지] 프로그램을 종료합니다.");
				break;
			}
			
		}
		
		
	}

	
	void join() {	
		userManager.addUser();
	}
	
	
	void login() {
		
		identifier = userManager.logUser();
		
		if (identifier != -1) {
			printAccountMenu(); // ATM의 printAccountMenu() 메뉴로 감
		}
		else {
			System.out.println("[메세지] 로그인실패.");
		}
		
	}
	
	
	void logout() {
		
		if (identifier == -1) {
			System.out.println("[메시지] 로그인을 하신 후 이용하실 수 있습니다.");
		}
		else {
			identifier = -1;
			System.out.println("[메시지] 로그아웃 되었습니다.");
		}
		
	}
	
	
	void leave() {
		userManager.leave();
	}
	
	// 계좌 메뉴
	void printAccountMenu() {
		
		while (true) {
			
			System.out.println("[1.계좌생성] [2.계좌삭제] [3.조회] [0.로그아웃] ");
			System.out.print("메뉴 선택 : ");
			int sel = scan.nextInt();
			// 이걸 왜 해주는 거지? makeAccount의 역할? 랜덤으로 user의 계좌번호를 만들어줌
			// Integer.toString() 는 숫자 > 문자열
			String makeAccount = Integer.toString(ran.nextInt(90001) + 10000); // [0-90000] + 10000
			 
			if (sel == 1) {
				
				if (userManager.user[identifier].accCount == 0) {
					userManager.user[identifier].acc = new Account[1];
					
					userManager.user[identifier].acc[0] = new Account(); // 배열의 각 요소에 Account 클래스의 인스턴스들을 할당
					userManager.user[identifier].acc[0].number = makeAccount;
				
				}
				else { // user의 계좌가 1개 이상 일 때
					// 왜 위에와 다르게 getUser를 하는거지?
					// userManager.getUser(identifier).acc와 userManager.user[identifier].acc의 차이?
					// 차이 없음. 예시로서 미리 private이라는 가정 하에 getUser(index)를 사용해 본 것 뿐
					Account[] temp = userManager.getUser(identifier).acc; // acc는 객체 배열
					int tempAccCount = userManager.getUser(identifier).accCount; // user 배열 크기 
					userManager.user[identifier].acc = new Account[tempAccCount+1];
					for (int i = 0; i < tempAccCount; i++) {
						userManager.user[identifier].acc[i] = temp[i];
					}
					userManager.user[identifier].acc[tempAccCount] = new Account(); // 배열의 각 요소에 Account 클래스의 인스턴스들을 할당
					userManager.user[identifier].acc[tempAccCount].number = makeAccount;
					
				}
				userManager.user[identifier].accCount++;
				System.out.println("[메시지]'"+ makeAccount +"'계좌가 생성되었습니다.\n");
				
			} 	
			else if (sel == 2) {
				
				if (userManager.user[identifier].accCount == 0) {
					System.out.println("[메시지] 더 이상 삭제할 수 없습니다.\n");
					continue;
				}
				
				if (userManager.user[identifier].accCount == 1) {
					System.out.println("[메시지] 계좌번호 :'"+ userManager.user[identifier].acc[0].number+"' 삭제 되었습니다.\n");
					userManager.user[identifier].acc = null;
				}
				else {
					
					System.out.print("삭제 하고 싶은 계좌 번호를 입력하세요 : ");
					String deleteAccount = scan.next();
					int tempAccCount = userManager.user[identifier].accCount; // user 배열 크기 
					int delIdx = -1;
					for (int i = 0; i < tempAccCount; i++) { // 삭제할 계좌 번호를 인덱스로 
						if (deleteAccount.equals(userManager.user[identifier].acc[i].number)) {
							delIdx = i;
						}
					}
					
					if (delIdx == -1) {
						System.out.println("[메시지] 계좌번호를 확인하세요.\n");
						continue;
					}
					else {
						System.out.println("[메시지] 계좌번호 :'"+ userManager.user[identifier].acc[delIdx].number+"' 삭제 되었습니다.\n");
						// Account[] temp = userManager.getUser(identifier).acc; 로 안하는 이유?
						Account[] temp = userManager.user[identifier].acc;
						userManager.user[identifier].acc = new Account[tempAccCount-1];
						
						
						for (int i = 0; i < delIdx; i++) {
							userManager.user[identifier].acc[i] = temp[i];
						}
						for (int i = delIdx; i < tempAccCount - 1; i++) {
							userManager.user[identifier].acc[i] = temp[i+1];
						}
					}
					
				}
				userManager.user[identifier].accCount--;
				
			}
			
			else if (sel == 3) {
				// 계죄 조회
				if (userManager.user[identifier].accCount == 0) {
					System.out.println("[메시지] 생성된 계좌가 없습니다.\n");
				}
				else {
					userManager.user[identifier].printAccount();
				}
				
			}   
			else if (sel == 0) {
				
				logout(); // 로그인 한 identifier의 계좌를 로그아웃 시켜줘야함
				break;
				
			}
			
		}
		
	}	
}
