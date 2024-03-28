
package step6_02.method;

import java.util.Random;
import java.util.Scanner;
/*
 *  24.03.29 time 01:14-01:35
 *  today 소감문
 *  오랜만에 매서드를 해서 조금 어색하긴 한데
 *  그전에 내가 이 문제를 풀었을 때 어려워했던 부분들을 문제를 풀면서 
 *  아 그때 그랬었지 하면서 이번에는 디테일하게 놓치지 않는 부분들도 생겼고
 *  이제는 생각을 하면서 차분히 푸니까 더 잘 풀게 되는 것 같다.
 *  그리고 신기한 점은 그때는 내 답이 왜 아닌거지? 이러면서
 *  정답예시도 받아들이지 못했던 것 같은데 지금은 결과가 좋게 나오더라도
 *  지금 내 코드에서 더 좋은 방법은 없을까 하면서 정답예시를 보며 공부하려는 좋은 습관이
 *  생기고 있는거 같아서 너무 좋다.
 * */
class Ex09_연습2 {

	Random ran = new Random();
	Scanner scan = new Scanner(System.in);
	
	//문제 1)
	void setRandomValuesinArray(int[] scores) {
		for (int i = 0; i < scores.length; i++) {
			scores[i] = ran.nextInt(100) + 1; // [0-99] + 1
			if (i != scores.length - 1) {
				System.out.print(scores[i] + " , ");
			}
			else System.out.print(scores[i]);
			
		}
		
	}
	// scores 라는 배열의 주소를 매서드에 보낸 것이므로 위에서 바뀐 내용이 밑에서 적용됨
	//문제 2)
	void printSumAndAverage(int[] scores) {  
		int total = 0;
		for (int i = 0; i < scores.length; i++) {
			total += scores[i];
		}
		double avg = total / (double)(scores.length);
		
		System.out.println("총점 (" + total +") " + "평균 (" + avg + ")" );
	}
	
	//문제 3)
	void printWinner(int[] scores) {
		int cnt = 0;
		for (int i = 0; i < scores.length; i++) {
			if (scores[i] >= 60) {
				cnt ++;
			}
		}
		System.out.println("합격생 : " + cnt +"명");
	}
	
	//문제 4)
	void printScore1(int[] scores) {
		System.out.print("인덱스 입력 : ");
		int idx = scan.nextInt();
		System.out.println("성적 : "+ scores[idx] +"점");
	}
	
	//문제 5)
	void printScore2(int[] scores) {
		System.out.print("성적 입력 : ");
		int score = scan.nextInt();
		for (int i = 0; i <scores.length; i++) {
			if (scores[i] == score) {
				System.out.println("인덱스 : " + i);
				break;
			}
		}
	}
	
	//문제 6)
	void printScore3(int[] hakbuns, int[] scores) {
		System.out.print("학번 입력 : ");
		int hakbun =  scan.nextInt();
		
		int checkIdx = -1;
		for (int i = 0; i < hakbuns.length; i++) {
			if (hakbuns[i] == hakbun) {
				checkIdx = i;
			}
		}
		
		if (checkIdx == -1) System.out.println("없는 학번 입니다.");
		else 				System.out.println("성적 : " + scores[checkIdx] +"점");
	}
	
	//문제 7)
	void printNumberOne(int[] hakbuns, int[] scores) {
		int maxScore = scores[0];
		int maxIdx = 0;
		for (int i = 0; i < scores.length; i++) {
			if (maxScore < scores[i]) {
				maxScore = scores[i];
				maxIdx = i;
			}
		}
		System.out.println(hakbuns[maxIdx] +"번(" + scores[maxIdx] + "점)");
	}
	
}



public class MethodEx09_연습2 {

	public static void main(String[] args) {
		
		int[] hakbuns = { 1001, 1002, 1003, 1004, 1005 };
		int[] scores  = new int[5];
		
		Ex09_연습2 object = new Ex09_연습2(); // 객체 생성
		// 문제1) scores배열에 1~100점 사이의 랜덤 정수를 5개 저장하는 메서드
		// 예 1) 87, 11, 92, 14, 47
		object.setRandomValuesinArray(scores);
		
		System.out.println();
		
		// 문제2) 전교생의 총점과 평균 출력하는 메서드
		// 예 2) 총점(251) 평균(50.2)
		object.printSumAndAverage(scores);
		
		// 문제3) 성적이 60점 이상이면 합격이며 합격생 수를 출력하는 메서드
		// 예 3) 2명
		object.printWinner(scores);
		
		// 문제4) 인덱스를 입력받아 성적 출력하는 메서드
		// 정답4) 인덱스 입력 : 1 성적 : 11점
		object.printScore1(scores);
		
		// 문제5) 성적을 입력받아 인덱스 출력하는 메서드
		// 정답5) 성적 입력 : 11 인덱스 : 1
		object.printScore2(scores);
		
		// 문제6) 학번을 입력받아 성적 출력하는 메서드 // 단, 없는학번 입력 시 예외처리
	    // 단, 없는학번 입력 시 예외처리
		// 정답6) 학번 입력 : 1003 성적 : 45점
		object.printScore3(hakbuns, scores);
		
		// 문제7) 1등 학생의 학번과 성적 출력하는 메서드
		// 정답7) 1004번(98점)
		object.printNumberOne(hakbuns, scores);
	}

}
