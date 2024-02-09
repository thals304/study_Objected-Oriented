package step6_01.classObject;

import java.util.Scanner;

// 24.02.09 time  22:00-22:31
/*
 * today 소감문
 * 정답예시와 비교를 안해봐서 내 답이 정답이 아닐 수도 있지만
 * 문제를 이해한대로 햄버거 주문 받고 영수증을 표시하는 건 정확하게 표현했다고
 * 생각한다. 물론 중간 중간 주석으로 아쉬운 부분들을 써놓긴 했지만 그 부분들은 
 * 실력이 더 성장하고 나서 수정해봐야 될 것 같다.
 * */
/*
 * # 영수증 출력하기 : 클래스 + 변수
 * 1. 햄버거 주문을 받아 영수증을 출력한다.
 * 2. 출력내용은 각 메뉴의 주문 수량과 총 금액 및 잔돈을 표시한다.
 * 
 * 	맘스터치
 *----------------------
 *ITEM	QTY	AMT
 *치즈버거	1	2500
 *불고기버거	1	3800
 *감자튀김	1	1500
 *콜      라	1	1000
 *----------------------
 *합계금액		8800
 *받은금액		10000
 *----------------------
 *잔       돈		1200
 */


class Ex10_연습문제1 {
	
	int[] menuPrices   = {    2500,       3800,     1500,  1000};
	String[] menuNames = {"치즈버거", "불고기버거", "감자튀김", "콜	라"};
	int[] orderCnt = new int[4];	// orderCnt를 배열로 한 이유? [0]치즈버거 : 개 , [1]불고기 버거 : 개, [2] 감자튀김 : 개, [3] 콜라 : 개 를 저장하고 싶은거 같음
	int totalPrice = 0;
	
}


public class ClassEx10_연습1 {

	public static void main(String[] args) {
		 Scanner scan = new Scanner(System.in); 
		 
		 Ex10_연습문제1 object = new Ex10_연습문제1();
		 
		 while (true) {
			 System.out.println("====맘스터치====");
			 System.out.println("[1] 주문 ");
			 System.out.println("[2] 영수증 출력 ");
			 System.out.print("선택 : ");
			 int choose = scan.nextInt();
			 
			 if (choose == 1) {
				 System.out.println("====메뉴====");
				 System.out.println("[1] 치즈버거  2500");
				 System.out.println("[2] 불고기버거 3800");
				 System.out.println("[3] 감자튀김  1500");
				 System.out.println("[4] 콜  라   1000");
				 // 각각 몇 개 살 지 for문 돌면서 입력하도록 하면 될 듯 근데 다시 1번 선택후 추가 개수를 입력하기는 쉽지 않고 다시 개수 입력해야함
				 for(int i = 0; i < object.menuNames.length; i++) {
					 System.out.print(object.menuNames[i] + " 구매 개수 입력 : ");
					 int num = scan.nextInt();
					 object.orderCnt[i] = num;
				 }
						 }
			 else if (choose == 2) {
				 System.out.println("-------------");
				 for (int i = 0; i < object.menuNames.length; i++) {
					 object.totalPrice += object.menuPrices[i] * object.orderCnt[i];
				 }
				 System.out.println("합계금액 : " + object.totalPrice);
				 
				 System.out.print("받은금액 : ");
				 int myMoney = scan.nextInt();
				 
				 System.out.println("-------------");
				 
				 if ( myMoney >= object.totalPrice) {
					 System.out.println("잔   돈 :  " + (myMoney - object.totalPrice));
					 break;
				 }
				 else {
					 System.out.println("받은 금액이 구매 금액보다 적습니다.");
					 object.totalPrice = 0;	// 초기화 안해주면 totalPrice가 계속 n배 누적
				 }
			 }
		 }
		 scan.close();
		 System.out.println("프로그램 종료");
		 
	}

}
