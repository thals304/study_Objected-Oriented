package step9_01.atm_v1;

public class UserManager {
	
	User[] user = null; // user 객체 배열 - id, acc 객체 배열, printAccount() 메소드
	int userCount = 0;
	
	void printAllUser() {
		for(int i = 0; i < userCount; i++) {
			user[i].printAccount();
		}
	}
	
	
	void addUser() { // user 객체 배열 - 추가
		
		if (userCount == 0) {
			
			user = new User[1];
			
			System.out.print("[가입] 아이디를 입력하세요 : ");
			String id = ATM.scan.next(); // 이런 형태는 처음 봄 : ATM에서 static Scanner를 써줘서 다른 클래스에도 Scanner scan = new Scanner(System.in); 쓰지 않고도 사용 가능하도록
			
			user[userCount] = new User(); // 배열 각 요소에 User 클래스의 인스턴스들을 할당
			user[userCount].id = id;
			System.out.println("[메시지] ID : '" + id+ "' 가입 되었습니다.\n");
			userCount++;
			
			
		}
		else {
			
			System.out.print("[가입] 아이디를 입력하세요 : ");
			String id = ATM.scan.next();
			
			boolean isDuple = false; // 중복 체크
			for (int i = 0; i < userCount; i++) {
				if (user[i].id.equals(id)) {
					isDuple = true;
				}
			}
			
			if (!isDuple) { // !isDuple 의미 : isDuple == false 
				
				User[] temp = user; // temp에 백업
				user = new User[userCount + 1];
				for(int i = 0; i < userCount; i++) {
					user[i] = temp[i];
				}
				temp = null;
				
				user[userCount] = new User(); // 배열 각 요소에 User 클래스의 인스턴스들을 할당
				user[userCount].id = id;
				System.out.println("[메시지] ID : '" + id+ "' 가입 되었습니다.\n");
				userCount++;
				
			}
			else {
				System.out.println("[메시지] '"+ id + "'은 이미 가입된 아이디 입니다.\n");
			}
			
		}
		
	}
	
	
	User getUser(int idx) { // 
		return user[idx];
	}
	
	
	
	int logUser() {
		
		int identifier = -1; // identifier를 예외처리, 인덱스로 사용
		System.out.print("[입력] 아이디를 입력하세요 : ");
		String name = ATM.scan.next(); // ATM에서 static Scanner를 써줘서 다른 클래스에도 Scanner scan = new Scanner(System.in); 쓰지 않고도 사용 가능하도록
		
		for (int i = 0; i < userCount; i++) {
			if (name.equals(user[i].id)) { // 입력한 아이디 인덱스 찾기
				identifier = i; 
				System.out.println("[" + user[identifier].id + "] 님 로그인.\n");
			}
		}
		
		return identifier;
		
	}
	
	
	void leave() {
		
		System.out.print("[입력] 탈퇴할 아이디를 입력하세요 : ");
		String name = ATM.scan.next(); // ATM에서 static Scanner를 써줘서 다른 클래스에도 Scanner scan = new Scanner(System.in); 쓰지 않고도 사용 가능하도록
		int identifier = -1; // identifier를 예외처리, 인덱스로 사용
		for (int i = 0; i < userCount; i++) {
			if (name.equals(user[i].id)) {
				identifier = i;			
			}
		}
		
		if(identifier == -1) {
			System.out.println("[메시지] 아이디를 다시 확인하세요.");
			return; // return을 왜 하는 거지? return; 은 메서드 종료로 사용됨 
		}
		// return 으로 인해 else를 쓰지 않고 자료구조 - 삭제 코드를 쓸 수 있게 됨
		System.out.println("ID : '" + user[identifier].id + "' 가 탈퇴되었습니다.");
		// user 객체 배열 - 삭제
		User[] temp = user; // 백업
		user = new User[userCount - 1];
		
		for(int i = 0; i < identifier; i++) {
			user[i] = temp[i];
		}
		for(int i = identifier; i < userCount-1; i++) {
			user[i] = temp[i + 1];
		}
		/*
		int j = 0;
		for (int i = 0; i < userCount; i++) {
			if (i != identifier) {
				user[j] = temp[i];
				j++;
			}
		}
		*/
		temp = null;
		userCount--;
		
	}
	
}
