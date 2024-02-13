package step6_02.method;

import java.util.Arrays;
import java.util.Random;

// 24.02.13 time 14:19-14:29
/*
 * today 소감문
 * omr 문제는 내가 좋아하는 문제여서 어떤 방법으로 풀 던지 자신있었기 때문에
 * 클래스 + 메서드를 사용해서 잘 표현한 것 같다.
 * 근데 틀은 자 잡혀져 있고 그 안에 있는 요소만 내가 표현하면 되는거라 
 * 다음에는 처음부터 내가 모든 틀을 다 잡을 수 있도록 훈련해야될 것 같다. 
 * */

/*
 * # OMR카드 : 클래스 + 메서드
 * 1. 배열 answer(omr)는 시험문제의 정답지이다.
 * 2. 배열 hgd에 1~5 사이의 랜덤 숫자 5개를 저장한다.
 * 3. answer(omr)와 hgd 값을 비교해 정오표를 출력한다.
 * 4. 한 문제당 20점이다.
 * 예)
 * omr = {1, 3, 4, 2, 5}
 * hgd    = {1, 1, 4, 4, 3}
 * 정오표 = {O, X, O, X, X}
 * 성적   = 40점
 */


class ScoreMng_연습문제2 {
	
	Random ran = new Random();
	
	int[] omr = {1, 4, 3, 2, 5};		// 모범답안
	int[] hgd = new int[5];				// 학생답안
	
	int answerCnt = 0;					// 정답을 맞춘 개수
	int score = 0;						// 성적
	
	// 1.me 답안 완성하기
	void makeAnswer() {
		for (int i = 0; i < hgd.length; i++) {
			hgd[i] = ran.nextInt(5) + 1;	// [0-4] + 1
		}
	}
	
	
	
	// 2.정답 출력하기
	void showAnswer() {
		
		// omr카드 출력
		System.out.print("OMR = ");
		System.out.println(Arrays.toString(omr));
		
		// me카드 출력
		System.out.print("hgd = ");
		System.out.println(Arrays.toString(hgd));
		
	}
	
	
	
	// 3.정답 비교하기
	void checkAnswer() {
		// answerCnt = 0; // 위에서 answerCnt를 사용하는 곳이 없는데 굳이 다시 초기화 시켜줘야 하나? 
		System.out.print("정오표 = [ ");
		for (int i = 0; i < omr.length; i++) {
			if (omr[i] == hgd[i]) {
				System.out.print("O ");
				answerCnt++;
			}
			else
				System.out.print("X ");
			
		}
		System.out.println("]");
		
		score = 20 * answerCnt;
		System.out.println("성적 : " + score +"점");
		
		
	}
	
	
	// 4.실행하기
	void run() {
		
		makeAnswer();
		showAnswer();
		checkAnswer();
		
	}
	
}

public class MethodEx13_연습2 {

	public static void main(String[] args) {
		
		ScoreMng_연습문제2 sm = new ScoreMng_연습문제2();
		sm.run();
		
		/*
		 * # 유용한 단축키
		 * 
		 * 1) ctrl + 메서드 호출부 클릭 > 메서드 정의부로 이동
		 * 2) 1)번 작업 이후 alt 왼쪽,오른쪽방향키로 메서드 호출부 정의부 자유롭게 이동
		 * 
		 * */
		
		

	}

}
