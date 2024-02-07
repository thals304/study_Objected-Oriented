package step6_01.classObject;

import java.util.Scanner;
// 24.02.07 time 20:39-20:51
/*
 * today 소감문
 * Ex04문제를 합친 느낌이라 자신있게 풀 수 있었던 것 같다.
 * 그리고 내가 Ex4에서 어려워 한 예외 처리를 여기서 다시 복습해서 좋았다.
 * scan.close(); 계속 까먹는데 처음에 쓰고 시작해야 될 것 같다.
 * */
/*
 * # 학생성적 관리 프로그램[3단계] : 클래스 + 변수
 * 1. 학번을 입력하면, 해당 학생의 성적이 출력된다.
 * 2. 단, 없는 학번 입력에 관한 예외상황을 반드시 처리해야 한다.
 * 3. 1등과 꼴등 학생의 정보를 확인할 수 있다.
 */


class Ex05_연습문제1{
	
	String name = "";
	
	int[] arHakbun = {1001, 1002, 1003, 1004, 1005};
	int[] arScore  = {  92,   38,   87,  100,   11};

}



public class ClassEx05_연습1 {

	public static void main(String[] args) {

		
		Scanner scan = new Scanner(System.in);

		Ex05_연습문제1 mega = new Ex05_연습문제1();
		mega.name = "메가IT 고등학교";
		
		while (true) {
			
			// 메뉴 출력
			//System.out.println("=== " + mega.name + "===");
			System.out.println("1.전교생 성적확인");
			System.out.println("2.1등학생 성적확인");
			System.out.println("3.꼴등학생 성적확인");
			System.out.println("4.성적확인하기");
			System.out.println("5.종료하기");
			
			// 메뉴 선택
			System.out.print("메뉴 선택 : ");
			int choice = scan.nextInt();
			
			if		(choice == 1) {
				System.out.println("전교생 성적");
				for (int i = 0; i < mega.arScore.length; i++ ) {
					System.out.println("["+mega.arHakbun[i]+"번] "+ mega.arScore[i]+"점");
				}
			}
			else if (choice == 2) {
				int max = mega.arScore[0];
				int maxIdx = 0;
				for (int i = 0; i < mega.arScore.length; i++) {
					if (max < mega.arScore[i]) {
						max = mega.arScore[i];
						maxIdx = i;
					}
				}
				System.out.println("1등 " + mega.arHakbun[maxIdx] +" 성적 : "+ max +"점");
			}
			else if (choice == 3) {
				int min = mega.arScore[0];
				int minIdx = 0;
				for (int i = 0; i < mega.arScore.length; i++) {
					if (min > mega.arScore[i]) {
						min = mega.arScore[i];
						minIdx = i;
					}
				}
				System.out.println("꼴등" + mega.arHakbun[minIdx] +" 성적 : "+ min +"점");
				
			}
			else if (choice == 4) {
				System.out.print("학번 입력 :");
				int grade = scan.nextInt();
				int check = -1;	// 예외처리 변수
				for (int i = 0; i < mega.arHakbun.length; i++) {
					if (grade == mega.arHakbun[i]) {
						check = i;
					}
				}
				
				if (check == -1) {
					System.out.println("해당 학번은 존재하지 않습니다.");
				}
				else System.out.println(mega.arScore[check]);
			}
			else if (choice == 5) {
				System.out.println("프로그램 종료");
				break;
			}
		}
		scan.close();

	}

}
