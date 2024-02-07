package step6_01.classObject;

import java.util.Arrays;
import java.util.Scanner;

// 24.02.07 time
/*
 * today 소감문
 * 이미 다른 방법들로 많이 풀어본 문제라서 큰 어려움은 없었지만,
 * 내가 약한 예외처리 문제 7번에서 예외처리를 위한 추가 변수를 쓰는 건
 * 떠올랐지만 그걸 제대로 사용하지는 못한 것 같아 더 익숙함과 꼼꼼함이 필요한 것 같다.
 * */

class Ex04_연습문제1 {

	int[] hakbuns = {1001, 1002, 1003, 1004, 1005};
	int[] scores  = new int[5];
	
}



public class ClassEx04_연습1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Ex04_연습문제1 object = new Ex04_연습문제1();
		
		// 문제1) scores배열에 1~100점 사이의 정수를 5개 저장
		// 예   1) 87, 11, 92, 14, 47
		for (int i = 0; i < object.scores.length; i++ ) {
			System.out.print("정수 입력 : ");
			object.scores[i] = scan.nextInt();
		}
		System.out.println(Arrays.toString(object.scores));
		
		// 문제2) 전교생의 총점과 평균 출력
		// 예   2) 총점(251) 평균(50.2)
		int total = 0;
		for (int i = 0; i < object.scores.length; i++) {
			total += object.scores[i];
		}
		double avg = total / (double)object.scores.length; 
		System.out.println("총점: " + total);
		System.out.println("평균: " + avg);
		
		// 문제3) 성적이 60점 이상이면 합격. 합격생 수 출력
		// 예   3) 2명
		int cnt = 0;
		for (int i = 0; i < object.scores.length; i++) {
			if (object.scores[i] >= 60) {
				cnt++;
			}
		}
		System.out.println("합격생 수 : " + cnt);
		
		// 문제4) 인덱스를 입력받아 성적 출력
		// 정답4) 인덱스 입력 : 1	성적 : 11점
		System.out.print("인덱스 입력 : ");
		int idx = scan.nextInt();
		for (int i  = 0; i < object.scores.length; i++) {
			if (object.scores[idx] == object.scores[i]) {
				System.out.println("성적 : " + object.scores[i] +"점");
			}
		}
		
		// 문제5) 성적을 입력받아 인덱스 출력
		// 정답5) 성적 입력 : 11		인덱스 : 1
		System.out.print("성적 입력 : ");
		int score = scan.nextInt();
		for (int i  = 0; i < object.scores.length; i++) {
			if ( score == object.scores[i]) {
				System.out.println("인덱스 : " + i);
			}
		}
		
		// 문제6) 학번을 입력받아 성적 출력
		// 정답6) 학번 입력 : 1003	성적 : 92점
		System.out.print("학번 입력 : ");
		int grade = scan.nextInt();
		for (int i = 0; i < object.hakbuns.length; i++) {
			if (grade == object.hakbuns[i]) {
				System.out.println("성적 : " + object.scores[i] +"점");
			}
		}
		
		// 문제7) 학번을 입력받아 성적 출력
		// 		단, 없는학번 입력 시 예외처리
		// 예   7)
		// 학번 입력 : 1002		성적 : 11점
		// 학번 입력 : 1000		해당학번은 존재하지 않습니다.
		
		System.out.print("학번 입력 : ");
		grade = scan.nextInt();
		int check = 1;
		for (int i  = 0; i < object.hakbuns.length; i++) {
			if (grade == object.hakbuns[i]) {
				check = i;
			}
		}
		if (check == -1) {
			System.out.println("해당 학번은 존재하지 않습니다");
		}
		else System.out.println("성적 : " + object.scores[check] + "점");
		
		// 문제8) 1등 학생의 학번과 성적 출력
		// 정답8) 1003번(92점)
		int max = object.scores[0];
		int maxIdx = 0;
		for (int i = 0; i < object.scores.length; i++) {
			if (max < object.scores[i]) {
				max = object.scores[i];
				maxIdx = i;
			}
		}
		System.out.println("1등 학생의 학번(성적) : " + object.hakbuns[maxIdx] + "번(" + max +"점)" );

	}

}
