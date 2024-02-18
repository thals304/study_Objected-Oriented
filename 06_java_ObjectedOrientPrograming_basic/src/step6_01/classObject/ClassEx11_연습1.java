package step6_01.classObject;
// 24.02.18 time 21:19-22:05
/*
 * today 소감문
 * 자료구조를 다 까먹었는데 이 문제를 또 보게 되서 당황했고
 * 어떻게 풀 지를 고민하면서 다시 자료구조 공부를 하고 돌아왔다.
 * 근데 이 문제는 진짜 어렵고 고민할 게 많다보니 더 미궁속에 빠지는 느낌이라
 * 정답예시를 보고 이해해 보는게 맞다고 생각한다.
 * 안그러면 계속 나는 모르는 상태로 남아있을 거고 분명 뒤에서 다른 문법을 배우면
 * 또 이 문제를 풀도록 나올거 같은데 그때가서도 못풀어서 과제만 누적될 거 같다.
 * identifier를 예외처리 , 중복처리, 인덱스 번호로 사용한 부분에 대해
 * 현재 로그인한 사람이 이체, 입금, 회원탈퇴 등이 가능하게 하고 싶었던 고민이
 * 풀린 것 같다.
 * */
/*
 * # ATM[4단계] : 전체 기능구현
 * 1. 회원가입
 * . id와 pw를 입력받아 가입
 * . 가입 시 돈 1000원 부여
 * . id 중복체크
 * 2. 회원탈퇴
 * . 로그인시에만 이용가능
 * 3. 로그인
 * . id와 pw를 입력받아 로그인
 * . 로그아웃 상태에서만 이용가능
 * 4. 로그아웃
 * . 로그인시에만 이용가능
 * 5. 입금
 * . 로그인시에만 이용가능
 * 6. 이체
 * . 로그인시에만 이용가능
 * 7. 잔액조회
 * . 로그인시에만 이용가능
 */

import java.util.Scanner;

import javax.lang.model.element.Element;


class Ex11_연습문제1 {

	String[] arAcc = new String[5];
	String[] arPw  = new String[5];
	int[] arMoney  = new int[5];
	
	int accCnt = 0;
	int identifier = -1;
	
}


public class ClassEx11_연습1 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		Ex11_연습문제1 e = new Ex11_연습문제1();
		
		while (true) {
			System.out.println("계좌번호\t비밀번호\t계좌잔액");
			for (int i = 0; i < e.accCnt; i++) {
				System.out.println( e.arAcc[i]+ "\t" + e.arPw[i] + "\t" + e.arMoney[i]);
			}
		    System.out.println("=====================");
		    System.out.print("상태 : ");
			if (e.identifier == -1) {
				System.out.println("로그아웃");
			}
			else {
				System.out.println(e.arAcc[e.identifier] +"님 로그인");
			}
			System.out.println("=====================");
			
			System.out.println("[Mega Bank]");
			System.out.println("[1]회원가입");
			System.out.println("[2]회원탈퇴");
			System.out.println("[3]로그인");
			System.out.println("[4]로그아웃");
			System.out.println("[5]입금하기");
			System.out.println("[6]이체하기");
			System.out.println("[7]잔액조회");
			System.out.println("[0]종료하기");
			
			System.out.print("메뉴 선택 : ");
			int sel = scan.nextInt();
			// identifier로 예외처리, 중복처리, 인덱스로 활용
			if (sel == 1) {
				// 자료구조 - 추가
				if (e.accCnt == e.arAcc.length) {
					System.out.println("[메세지]더이상 회원을 추가할 수 없습니다.");
					continue;
				}
				System.out.print("[회원가입]가입 계좌번호 입력 : ");
				String myId = scan.next();
				
				int check = 1;
				for (int i = 0; i < e.accCnt; i++) {
					if (e.arAcc[i].equals(myId)) {
						check = -1;
					}
				}
				if (check == -1) {
					System.out.println("[메세지]중복된 계좌번호 입니다.");
					continue;
				}
				else {
					System.out.print("[회원가입]비밀번호 입력 : ");
					String myPw = scan.next();
					e.arAcc[e.accCnt] = myId;
					e.arPw[e.accCnt] = myPw;
					e.arMoney[e.accCnt] += 1000;
					e.accCnt++;
					System.out.println("[메세지]회원가입을 축하합니다. 가입 축하 금액 1000원 드립니다.");
				}
				
			}
			else if (sel == 2) {
				if (e.identifier == -1) {
					System.out.println("[메세지]로그인 후 이용 가능합니다.");
					continue;
				}
				else {
					for (int i = e.identifier; i < e.accCnt - 1; i++) { // e.accCnt - 1해줘야 하나?
						e.arAcc[i] = e.arAcc[i+1];
						e.arPw[i] = e.arPw[i+1];
						e.arMoney[i] = e.arMoney[i+1];
					}
					
					e.accCnt--; // e.e.arAcc[accCnt] = null; 안해줘도 되나?
					e.identifier = -1;
					System.out.println("[메세지]회원탈퇴되었습니다. 감사합니다.");
				}
			}
			else if (sel == 3) {
				if (e.identifier != -1) {
					System.out.println(e.arAcc[e.identifier] + "님 로그인 중..");
					continue;
				}
				else {
					System.out.print("[로그인]계좌 번호 : ");
					String myId = scan.next();
					System.out.print("[로그인]비밀 번호 : ");
					String myPw = scan.next();
					
					for (int i = 0; i < e.accCnt; i++) {
						if (e.arAcc[i].equals(myId) && e.arPw[i].equals(myPw)) {
							e.identifier = i;
						}
					}
					if (e.identifier == -1) {
						System.out.println("[메세지]계좌 번호와 비밀 번호를 다시 확인해주세요");
						continue;
					}
					else {
						System.out.println( e.arAcc[e.identifier]+ "님 환영합니다.");
					}
				}
				
			}
			else if (sel == 4) {
				if (e.identifier == -1) {
					System.out.println("[메세지] 로그인 후에 이용가능합니다.");
					continue;
				}
				else {
					e.identifier = -1;
					System.out.println("[메세지] 로그아웃 되었습니다.");
				}
				
			}
			else if (sel == 5) {
				if (e.identifier == -1) {
					System.out.println("[메세지] 로그인 후에 이용가능합니다.");
					continue;
				}
				else {
					
					System.out.print("[입금] 입금 금액 ");
					int myMoney = scan.nextInt();
					
					e.arMoney[e.identifier] += myMoney;
					System.out.println("[메시지] 입금 완료");
				}
			}
			else if (sel == 6) {
				if (e.identifier == -1) {
					System.out.println("[메세지] 로그인 후에 이용가능합니다.");
					continue;
				}
				else {
					System.out.print("[이체] 이체할 계좌번호 입력 : ");
					String otherId = scan.next();
					// 이체할 계좌가 존재하는지 확인하고 싶은데
					int check = -1;
					for (int i = 0; i < e.accCnt; i++) {
						if (e.arAcc[i].equals(otherId)) {
							check = i;
						}
					}
					if (check == -1) {
						System.out.println("[메세지] 이체할 계좌번호를 다시 확인해주세요.");
						continue;
					}
					else {
						System.out.print("[이체]이체 금액 ");
						int sendMoney = scan.nextInt();
						
						if (e.arMoney[e.identifier] >= sendMoney) {
							e.arMoney[e.identifier] -= sendMoney;
							e.arMoney[check] += sendMoney;
							System.out.println("[메세지] 이체 완료");
						}
						else {
							System.out.println("[메세지] 계좌 잔액이 부족합니다.");
							continue;
						}
					}
				}
			}
			else if (sel == 7) {
				System.out.println("[잔액조회]" + e.arAcc[e.identifier] + "님의 잔액 : " + e.arMoney[e.identifier] + "원");
			}
			else if (sel == 0) {
				System.out.println("프로그램 종료");
				break;
			}
			
		}		
		
	}

}
