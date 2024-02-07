package step6_01.classObject;
// 24.02.07 time 20:54-21:04
/*
 * today 소감문
 * 일단 다행인던 랜덤 숫자에 중복이 없어야 한다는 것이 나에게 
 * 너무 다행이었다. 클래스와 객체 등 신경써야 될 것이 너무 많은데 
 * 랜덤 중복까지 들어가면 아마 이전에 했던 중복이 기억이 잘 안나기 때문에
 * 시간도 오래 걸리고 정답예시 풀이만 보고 있을지도 모른다.
 * 정오표를 String 배열로 할 지 char 배열로 할 지 고민했는데
 * 그냥 char로 했다.
 * */
/*
 * # OMR카드 : 클래스 + 변수
 * 1. 배열 answer는 시험문제의 정답지이다.
 * 2. 배열 hgd에 1~5 사이의 랜덤 숫자 5개를 저장한다.
 * 3. answer와 hgd 값을 비교해 정오표를 출력한다.
 * 4. 한 문제당 20점이다.
 * 예)
 * answer = {1, 3, 4, 2, 5}
 * hgd    = {1, 1, 4, 4, 3}
 * 정오표     = {O, X, O, X, X}
 * 성적        = 40점
 */

import java.util.Arrays;
import java.util.Random;

class Ex06_연습문제1{
	int[] answer = {1, 3, 4, 2, 5};		// 시험답안
	int[] hgd = new int[5];				// 학생답안
	
	int answerCnt = 0;					// 정답 맞춘 개수
	int score = 0;						// 성적
}




public class ClassEx06_연습1 {

	public static void main(String[] args) {
		Random ran = new Random();
		
		Ex06_연습문제1 object = new Ex06_연습문제1();
		
		char[] totalCorrect = new char[object.answer.length];
		
		for (int i = 0; i < object.hgd.length; i++) {
			object.hgd[i] = ran.nextInt(5) + 1; // [0-4] + 1
		}
		
		
		for (int i = 0; i < object.answer.length; i++ ) {
			if (object.answer[i] == object.hgd[i]) {
				totalCorrect[i] = 'O';
				object.answerCnt ++;
			}
			else {
				totalCorrect[i] = 'X';
			}
		}
		object.score = 20 * object.answerCnt;
		
		System.out.println("answer = " + Arrays.toString(object.answer));
		System.out.println("hgd    = " + Arrays.toString(object.hgd));
		System.out.println("정오표    = " +Arrays.toString(totalCorrect));
		System.out.println("성적     = " + object.score);
		
	}

}
