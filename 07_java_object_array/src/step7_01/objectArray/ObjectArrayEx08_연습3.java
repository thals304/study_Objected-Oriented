package step7_01.objectArray;
import java.util.Scanner;
// 24.02.16 time
/*
 * today 소감문
 * 이번 연습은 복습 겸 배열 크기를 바꾸거나 등등 응용 하기 도전
 * */
class Subject8_연습문제3{
	
	String name; // 과목
	int score;

}


class Student8_연습문제3{
	
	Subject8_연습문제3[] subjects;
	String name; // 학생

}


public class ObjectArrayEx08_연습3 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		Student8_연습문제3[] studentList = new Student8_연습문제3[5]; // 객체 배열 생성
		int stdCnt = 0;	// 학생 수 카운트
		
		// # 학생 추가 삭제 컨트롤러
		//   => 컨트롤러를 완성해 아래 3개의 정보를 추가하시오.
		//   김철수 : 과목3개 수학 50 국어50 영어 60 
		//   이만수 : 과목2개 수학 20 국어 30 
		//   이영희 : 과목1개 수학 100
		
		
		
		while (true) {
			
			// 자료구조 추가
			System.out.println("[1]학생 추가하기");		// 이름 입력받아 추가
			System.out.println("[2]과목 추가하기");		// 이름과 과목 입력받아 추가
			System.out.println("[3]성적 추가하기");		// 이름과 과목 그리고 성적 입력받아 추가
			System.out.println("[4]종료하기");
			int choice = scan.nextInt();
			
			if (choice == 1) {
				
				
				
			}
			else if (choice == 2) {
				
				
			}
			else if (choice == 3) {
				
				
			}
			else if (choice == 4) {
				System.out.println("종료");
				break;
			}
		
		}

		scan.close();

	}

}
