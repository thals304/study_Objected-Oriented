package step9_01.atm_v1_연습1;

public class UserManager_연습1 {

	User_연습1[] user = null;
	int userCount = 0;
	
	void printAllUser() {	// printAllUser > printAccount > printOwnAccount 출력
		for (int i = 0; i < userCount; i++) {
			user[i].printAccount();
		}
	}
	
	void addUser() {
		
		if (userCount == 0) {
			
			user = new User_연습1[1];
			
			System.out.print("[가입] 아이디를 입력하세요 : ");
			String id = ATM_연습1.scan.next();
			
			user[userCount] = new User_연습1();
			user[userCount].id = id;
			System.out.println("[메시지] ID : '" + id + "' 가입 되었습니다\n");
			userCount++;
		}
		else {
			System.out.print("[가입] 아이디를 입력하세요 : ");
			String id = ATM_연습1.scan.next();
			
			boolean isDuple = false;
			for (int i = 0; i < userCount; i++) {
				if (user[i].id.equals(id)) {
					isDuple = true;
				}
			}
			if (!isDuple) {
				User_연습1[] temp = user;
				user = new User_연습1[userCount + 1];
				
				for (int i = 0; i < userCount; i++) {
					user[i].id = temp[i].id;
				}
				temp = null;
				
				user[userCount] = new User_연습1();
				user[userCount].id = id;
				System.out.println("[메시지] ID : '" + id + "' 가입 되었습니다\n");
				userCount++;
			}
			else {
				System.out.println("[메세지] '" + id + "'은 이미 가입된 아이디 입니다.\n");
			}
			
		}
	}
	int logUser() {
		int identifier = -1;
		System.out.print("[입력] 아이디를 입력하세요 : ");
		String id = ATM_연습1.scan.next();
		
		for (int i = 0; i < userCount; i++) {
			if (user[i].id.equals(id)) {
				identifier = i;
				System.out.println("[" + user[identifier].id + "] 님 로그인\n");
			}
		}
		return identifier;
	}
	void leave() {
		System.out.print("[입력] 탈퇴할 아이디 입력 :  ");
		String id = ATM_연습1.scan.next();
		
		int identifier = -1;
		for (int i = 0; i < userCount; i++) {
			if (user[i].id.equals(id)) {
				identifier = i;
				break;
			}
		}
		
		if (identifier == -1) {
			System.out.println("[메시지] 아이디를 다시 확인하세요.\n");
			return;
		}
		System.out.println("ID : '" + user[identifier].id + "' 가 탈퇴되었습니다.\n" );
		User_연습1[] temp = user;
		user = new User_연습1[userCount - 1];
		int j = 0;
		for (int i = 0; i < userCount; i++) {
			if (i != identifier) {
				user[j] = temp[i];
				j++;
			}
		}
		temp = null;
		userCount--;
	}
}
