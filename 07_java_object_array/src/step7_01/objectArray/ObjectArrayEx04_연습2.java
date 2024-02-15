package step7_01.objectArray;
// 24.02.14 time 22:30-22:43
/*
 * today 소감문
 * 일단 기존의 회원가입 문제보다는 하라는게 적어서 객체 배열의 이해에 초점을 맞출 수 있어
 * 좋았다. sel == 1에서는 객체를 만들어서 값을 저장하고 그 다음에 cnt를 이용해 객체배열에 대입했다.
 * 이 부분은 아직 완벽하게 알겠다고 와닿지는 않지만 그래도 왜 이런 코드가 나왔는지 이해는 된다.
 * 그리고 sel == 2에서는 배열의 요소의 삭제로 바로 가능하다는 점이 신기했던 것 같다.
 * 나는 요소 안의 객체 변수들을 다 삭제해야된다고 생각했는데 객체 배열에서(자료구조)연결 리스트 - 삭제 에서는 
 * 배열의 연결리스트 - 삭제로 봐도 된다는 점을 깨달았던 것 같다.
 * 하지만 나의 약점은 자료구조 부분을 다 까먹은 것이다. 그래서 for문의 조건식이 이해가 안된거 같다. 
 * */
import java.util.Scanner;


class User_연습문제2 {
	
	String id;
	int money;
	
}

public class ObjectArrayEx04_연습2 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		User_연습문제2[] userList = new User_연습문제2[100];
		
		for (int i = 0; i < userList.length; i++) {
			userList[i] = new User_연습문제2();
		}
		int cnt = 0;
		
		while (true) {
			
			System.out.println("1.회원가입");
			System.out.println("2.탈퇴");
			System.out.println("3.출력");
			System.out.println("4.종료");
			int sel = scan.nextInt();
			
			if (sel == 1) {
				User_연습문제2 temp = new User_연습문제2();
				
				System.out.print("아이디 입력 : ");
				temp.id = scan.next();
				System.out.print("금액 입력 : ");
				temp.money = scan.nextInt();
				
				userList[cnt] = temp;
				cnt++;
				
				
			}
			else if (sel == 2) { // 연결리스트 자료구조 - 삭제 
				System.out.print("인덱스 입력 :");
				int idx = scan.nextInt();
				for (int i = idx; i < cnt - 1; i++) {
					userList[i] = userList[i+1];  // 밑에서 요소의 id, money를 각각 삭제하지 않고 요소를 삭제해버리는 것 같음
					/*userList[i].id = userList[i + 1].id;
					userList[i].money = userList[i + 1].money;*/
				}
				cnt--;
				
				
			}
			else if (sel == 3) {
				
				for (int i = 0; i < cnt; i++) {
					System.out.println("id : " + userList[i].id + " / " + "money : " + userList[i].money);
				}
			}
			else if (sel == 4) {
				break;
			}		
			
		}

		scan.close();

	}

}
