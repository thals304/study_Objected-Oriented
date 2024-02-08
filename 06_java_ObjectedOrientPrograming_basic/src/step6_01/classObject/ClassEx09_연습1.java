package step6_01.classObject;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

// 24.02.08 time 12:10-12:30
/*
 * today 소감문
 * 일단 엄청 어려운 문제가 아니었다.
 * 그래도 셔플을 공부한지 얼마 되지 않아 조금 헷갈려서 정답예시를 또 참고했다.
 * 그리고 가장 큰 문제였던 건 while문이 종료가 안되는 것이다.
 * 도대체 무엇이 문제인지 고민을 엄청 했는데 엄천 간단하면서도 많이
 * 실수하는 answerCnt의 초기화를 안해서 answerCnt가 10이면 프로그램이
 * 종료하지 못했던 것이다.
 * 카운트 치기화는 반드시 꼭 기억해야 할 사항이다.
 * 
 * */
/*
 * # 기억력 게임 : 클래스 + 변수
 * 1. front 배열 카드 10장을 섞는다.
 * 2. front 배열에서 같은 카드를 골라 카드의 위치를 입력한다.
 * 3. 선택한 2장의 카드가 같은 카드이면, back 배열에 표시한다.
 * 4. 모든 카드가 뒤집히면(back배열의 0이 사라지면) 게임은 종료된다. 
 */

class Ex09_연습문제1 {

	int[] front = { 1, 1, 2, 2, 3, 3, 4, 4, 5, 5 };
	int[] back = new int[10];
	int answerCnt = 0;

}

public class ClassEx09_연습1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Random ran = new Random();
		Ex09_연습문제1 object = new Ex09_연습문제1();

		// 셔플
		for (int i = 0; i < 1000; i++) {
			int rNum = ran.nextInt(object.front.length);
			int temp = object.front[0];
			object.front[0] = object.front[rNum];
			object.front[rNum] = temp;
		}

		while (true) {
			System.out.println(Arrays.toString(object.front));
			System.out.println(Arrays.toString(object.back));
			object.answerCnt = 0;	// 초기화 필요 !!
			
			for (int i = 0; i < object.back.length; i++) {
				if (object.back[i] == 1) {
					object.answerCnt++;
				}
			}

			if (object.answerCnt != 10) {
				System.out.print("카드1 위치 입력 : ");
				int card1 = scan.nextInt();
				System.out.print("카드2 위치 입력 : ");
				int card2 = scan.nextInt();
				
				for (int j = 0; j < object.front.length; j++) {
					if (object.front[card1] == object.front[card2]) {
						object.back[card1] = 1;
						object.back[card2] = 1;
					}
				}
			}
			else {
				System.out.println("모든 카드가 다 뒤집혔습니다. 게임을 종료합니다.");
				break;
			}
		}
		scan.close();

	}

}
