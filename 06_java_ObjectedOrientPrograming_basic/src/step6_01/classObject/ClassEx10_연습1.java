package step6_01.classObject;

import java.util.Scanner;

// 24.02.08 time 
/*
 * today 소감문
 * 
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
			 int choose = scan.nextInt();
			 
			 if (choose == 1) {
				 
			 }
			 else if (choose == 2) {
				 
			 }
		 }
		 
	}

}
