package step6_02.method;

import java.util.Arrays;
import java.util.Scanner;
// 24.02.13 time 14:32-14:42
/*
 * today 소감문
 * 이 문제도 내가 좋아하는 문제라 재밌게 풀었던 것 같다.
 * 이번에는 메소드도 다 지우고 run 메소드만 보고 하나씩 만들었던 것 같다.
 * 다음에는 객체도 다 지워보고 도전해보겠다.
 * */
/*
 * # 영화관 좌석예매 : 클래스 + 메서드
 * 1. 사용자로부터 좌석번호(index)를 입력받아 예매하는 시스템이다.
 * 2. 예매가 완료되면 해당 좌석 값을 1로 변경한다.
 * 3. 이미 예매가 완료된 좌석은 재구매할 수 없다.
 * 4. 한 좌석당 예매 가격은 12000원이다.
 * 5. 프로그램 종료 후, 해당 영화관의 총 매출액을 출력한다.
 * 예)
 * seat = 0 0 0 0 0 0 0
 * 
 * 좌석선택 : 1
 * seat = 0 1 0 0 0 0 0
 * 
 * 좌석선택 : 3
 * seat = 0 1 0 1 0 0 0
 * 
 * 좌석선택 : 3
 * seat = 0 1 0 1 0 0 0
 * 이미 예매가 완료된 자리입니다.
 * ----------------------
 * 매출액 : 24000원
 */

class Theater_연습문제2 {

	Scanner scan = new Scanner(System.in);

	int[] seat = new int[10];
	int bookCnt = 0;
	int money = 0;

	void showMenu() {
		System.out.println("[1] 예매하기");
		System.out.println("[2] 영수증 및 종료하기");
	}

	void choiceSeat() {
		System.out.println(Arrays.toString(seat));
		
		System.out.print("좌석 선택[0-9] : ");
		int seatIdx = scan.nextInt();

		if (seat[seatIdx] == 0) {
			seat[seatIdx] = 1;
			System.out.println("예매 완료");
			bookCnt++;
		} 
		else if (seat[seatIdx] == 1) {
			System.out.println("이미 예약된 자리입니다.");
		}

	}

	void showSales() {
		money = 12000 * bookCnt;
		System.out.println("결제 금액 : " + money + "원");
		// myMoney로 돈 입력해서 잔액까지 출력하도록
	}

	void run() {

		while (true) {

			// 메뉴 출력
			showMenu();

			// 메뉴 선택하기
			System.out.print("메뉴 선택 : ");
			int choice = scan.nextInt();

			// 예매하기
			if (choice == 1) {
				choiceSeat();
			}
			// 종료하기
			else if (choice == 2) {
				// 매출 현황 출력하기
				System.out.println("-----------------");
				showSales();

				System.out.println("프로그램 종료");
				break;
			}

		}
	}
}

public class MethodEx14_연습2 {

	public static void main(String[] args) {

		Theater_연습문제2 megabox = new Theater_연습문제2();
		megabox.run();

	}

}
