package step6_01.classObject;
// 24.02.07 time 21:08-21:16
/*
 * today 소감문
 * 이 문제에서는 이미 예매가 완료된 좌석을 재구매할 수 없다고 할 때
 * 예매까지 끝나게 할지 고민을 했는데 이건 너무 불친절한 것 같기 때문에
 * 재구매 할 수 없는 자리라고만 이야기 해주고 메뉴 2를 누르기 전에는
 * 계속 예매가 가능하도록 만들어 줬다. 사실 이렇게 길게 설명을 했지만
 * 코드로는 break; 추가 or not 추가인 것 뿐이다.
 * 그리고 이번에는 scan.close();를 까먹지 않았다.
 * */
/*
 * # 영화관 좌석예매 : 클래스 + 변수
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

import java.util.Scanner;


class Ex07_연습문제1 {

	int[] seat = new int[7];
	int money = 0;
	int bookCnt = 0;
	
}


public class ClassEx07_연습1 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		Ex07_연습문제1 object =  new Ex07_연습문제1();
		
		while (true) {
			
			System.out.println("[MEGA MOVIE]");
			System.out.println("[1]좌석예매");
			System.out.println("[2]종료하기");
			
			System.out.print("메뉴 선택 : ");
			int sel = scan.nextInt();
			
			if		(sel == 1) {
				System.out.print("좌석 선택 [1-7]: ");
				int seatNum = scan.nextInt();
				
				if (object.seat[seatNum - 1] == 1) {	// seat 배열은 0-6까지
					System.out.println("이미 예매가 완료된 자리입니다.");
					
				}
				else if (object.seat[seatNum - 1] == 0) {
					object.seat[seatNum - 1] = 1;
					System.out.println("예매 완료");
					object.bookCnt ++;
				}
				
				for (int i = 0; i < object.seat.length; i++) {
					System.out.print(object.seat[i] + " ");
				}
				System.out.println();
			}
			else if (sel == 2) {
				break;
			}
		}
		object.money = object.bookCnt * 12000;
		System.out.println("------------------------");
		System.out.println("매출액 : " + object.money);
		
		scan.close();


	}

}
