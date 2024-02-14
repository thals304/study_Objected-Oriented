
package step6_02.method;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

// 24.02.14 time 12:05-12:35
/*
 * today 소감문
 * 1번에서 저장된 socres를 그대로 문제 2-7번까지 사용할 수 있다는 점에서 
 * 이해가 안되었는데 주소를 넘겨주는 것이므로 바뀐 값으로 사용이 가능했던 것이다.
 * 이 점을 이해하고 나서부터는 코드를 짜는데 어려움이 없었다.
 * 근데 랜덤 숫자가 중복일 때 5번은 중복이더라도 다 출력이 되므로 상관없는데 7번에서
 * 1등이 여러 개가 출력이 안된다는 점에서 밑에를 바꾸는 것보다 랜덤 숫자인데 중복이 안되도록
 * 만들어 주는 것이 더 맞다고 생각한다.
 * */
class Ex09_연습문제1 {

	Random ran = new Random();
	Scanner scan = new Scanner(System.in);
	
	//문제 1)
	void setRandomValuesinArray(int[] scores) {
		for (int i = 0; i < scores.length; i++) {
		     int r = ran.nextInt(100) + 1;	// [0-99] + 1
		     scores[i] = r;
		}
		System.out.println(Arrays.toString(scores));
	}
	
	//문제 2)
	void printSumAndAverage(int[] scores) {	
		// 문제 1번의 scores에 저장된 랜덤 숫자들을 사용해야 되는데
		// 어떻게 scores 배열에 저장된 값을 그대로 가져올 수 있는거지? 주소(링크)가 넘어갔기 때문
		int total = 0;
		for (int i = 0; i < scores.length; i++) {
			total += scores[i];
		}
		double avg = total / (double)scores.length;
		System.out.println("총점 : " + total);
		System.out.println("평균 : " + avg);
 	}
	
	//문제 3)
	void printWinner(int[] scores) {
		int cnt = 0;
		for (int i = 0; i < scores.length; i++) {
			if (scores[i] >= 60) {
				cnt++;
			}
		}
		System.out.println("합격자 수 : " + cnt +"명");
	}
	
	//문제 4)
	void printScore1(int[] scores) {
		System.out.print("인덱스 입력 : ");
		int idx1 = scan.nextInt();
		
		for (int i = 0; i < scores.length; i++) {
			if (scores[i] == scores[idx1]) {
				System.out.println("성적 : " + scores[i]);
			}
		}
	}
	
	//문제 5)
	void printScore2(int[] scores) {
		System.out.print("성적 입력 : ");
		int score = scan.nextInt();
		
		for (int i = 0; i < scores.length; i++) {
			if (scores[i] == score) {
				System.out.println("인덱스 : " + i);
			}
		}
	}
	
	//문제 6)
	void printScore3(int[] hakbuns, int[] scores) {
		System.out.println(Arrays.toString(hakbuns));
		System.out.println(Arrays.toString(scores));
		
		System.out.print("학번 입력 : ");
		int hakbun = scan.nextInt();
		
		int check = -1;
		for (int i = 0; i < hakbuns.length; i++) {
			if (hakbuns[i] == hakbun) {
				check = i;
			}
		}
		
		if (check == -1) {
			System.out.println("존재하지 않는 학번입니다.");
		}
		else {
			System.out.println("성적 : " + scores[check]);
		}
		
	}
	
	//문제 7)
	void printNumberOne(int[] hakbuns, int[] scores) {
		int max = scores[0];
		int maxIdx = 0;
		for (int i = 0; i < scores.length; i++) {
			if (max < scores[i]) {
				max = scores[i];
				maxIdx = i;
			}
		}
		System.out.println("1등 학생 학번 : " + hakbuns[maxIdx]);
		System.out.println("1등 학생 점수 : " + max);
	}
	
}

public class MethodEx09_연습1 {

	public static void main(String[] args) {
		
		int[] hakbuns = { 1001, 1002, 1003, 1004, 1005 };
		int[] scores  = new int[5];
		
		Ex09_연습문제1 e = new Ex09_연습문제1();
		// 문제1) scores배열에 1~100점 사이의 랜덤 정수를 5개 저장하는 메서드
		// 예 1) 87, 11, 92, 14, 47
		e.setRandomValuesinArray(scores);
		
		// 문제2) 전교생의 총점과 평균 출력하는 메서드
		// 예 2) 총점(251) 평균(50.2)
		e.printSumAndAverage(scores);
		
		// 문제3) 성적이 60점 이상이면 합격이며 합격생 수를 출력하는 메서드
		// 예 3) 2명1
		e.printWinner(scores);
		
		// 문제4) 인덱스를 입력받아 성적 출력하는 메서드
		// 정답4) 인덱스 입력 : 1 성적 : 11점
		e.printScore1(scores);
		
		// 문제5) 성적을 입력받아 인덱스 출력하는 메서드
		// 정답5) 성적 입력 : 11 인덱스 : 1
		e.printScore2(scores);
		
		// 문제6) 학번을 입력받아 성적 출력하는 메서드 // 단, 없는학번 입력 시 예외처리
	    // 단, 없는학번 입력 시 예외처리
		// 정답6) 학번 입력 : 1003 성적 : 45점
		e.printScore3(hakbuns, scores);
		
		// 문제7) 1등 학생의 학번과 성적 출력하는 메서드
		// 정답7) 1004번(98점)
		e.printNumberOne(hakbuns, scores);

	}

}
