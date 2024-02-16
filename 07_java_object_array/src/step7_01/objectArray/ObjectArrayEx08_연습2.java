package step7_01.objectArray;
import java.util.Scanner;
// 24.02.16 time 13:40-14:12
/*
 * today 소감문
 * 어제 정답을 보고 이해하는 과정을 가지고 오늘은 코드를 이해하고 따라써보는 
 * 학습을 진행했는데 분명 똑같이 따라썼다고 생각했는데 코드가 잘 돌아가지 않는다.
 * 그래서 다시 한줄 한줄 보면서 어디 논리에서 틀렸는지 확인해 보고 수정할 것이다.
 * 그리고 아직 이 문제가 익숙하지 않아서 다시 풀고 안보고 풀 수 있을 정도의
 * 코드 구성을 할 수 있게 연습을 해봐야될 것 같다.
 * */
class Subject8_연습문제2{
	
	String name; // 과목
	int score;

}


class Student8_연습문제2{
	
	Subject8_연습문제2[] subjects;
	String name; // 학생

}


public class ObjectArrayEx08_연습2 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		// # 학생 추가 삭제 컨트롤러
		//   => 컨트롤러를 완성해 아래 3개의 정보를 추가하시오.
		//   김철수 : 과목3개 수학 50 국어50 영어 60 
		//   이만수 : 과목2개 수학 20 국어 30 
		//   이영희 : 과목1개 수학 100
		
		Student8_연습문제2[] studentList = new Student8_연습문제2[3];
		int studentCnt = 0;	// 학생 수
		
		while (true) {
			// 결과 출력
			for (int i = 0; i < studentCnt; i++) {
				System.out.println( "[" + (i+1) + "]"+ studentList[i].name);
				if (studentList[i].subjects != null) {
					for (int j = 0; j < studentList[i].subjects.length; j++) {
					System.out.println("[" + (j+1) + "]" + studentList[i].subjects[j].name + "과목 " + studentList[i].subjects[j].score + "점");
					}
					System.out.println();
				}
			}
			
			// 자료구조 연결리스트 - 추가: 객체 배열
			System.out.println("[1]학생 추가하기");		// 이름 입력받아 추가
			System.out.println("[2]과목 추가하기");		// 이름과 과목 입력받아 추가
			System.out.println("[3]성적 추가하기");		// 이름과 과목 그리고 성적 입력받아 추가
			System.out.println("[4]종료하기");
			int choice = scan.nextInt();
			
			if (choice == 1) {
				System.out.print("이름 입력 : ");
				String stdName = scan.next();
				
				studentList[studentCnt] = new Student8_연습문제2();	// studentList도 객체 배열이므로 
				studentList[studentCnt].name = stdName;
				studentCnt++;
				
				
			}
			else if (choice == 2) {
				for (int i = 0; i < studentCnt; i++) {
					System.out.println("[" + (i+1) + "]" + studentList[i].name);
				}
				System.out.print("학생 선택 : ");
				int select = scan.nextInt();
				select--;
				
				System.out.print("과목 입력 : ");
				String subject = scan.next();
				
				if (studentList[select].subjects == null) {
					
					studentList[select].subjects = new Subject8_연습문제2[1];
					studentList[select].subjects[0] = new Subject8_연습문제2(); // subjects도 객체 배열이므로 
					studentList[select].subjects[0].name = subject;
				}
				else {	// 과목은 여러 개일 수 있음
					int size = studentList[select].subjects.length;
					
					Subject8_연습문제2[] temp = studentList[select].subjects;
					studentList[select].subjects = new Subject8_연습문제2[size + 1];
					
					for (int i = 0; i < size ; i++) {
						studentList[select].subjects[i] = temp[i];
					}
					studentList[select].subjects[size] = new Subject8_연습문제2(); // subjects도 객체배열이므로
					studentList[select].subjects[size].name = subject;
					
					temp = null;
					
				}
					
				
			}
			else if (choice == 3) {
				for (int i = 0; i < studentCnt; i++) {
					System.out.println("[" + (i+1) + "]" + studentList[i].name);
				}
				System.out.print("학생 선택 : ");	// i + 1 학생번호 
				int select = scan.nextInt();
				select--;
				
				if (studentList[select].subjects != null) {
					for (int i = 0; i < studentList[select].subjects.length; i++) {
						System.out.println("[" + (i+1) + "]" + studentList[select].subjects[i]);
					}
					System.out.print("과목 선택 : ");	// i+1 과목 번호
					int num = scan.nextInt();
					num--;
					
					System.out.print("성적 입력 : ");
					int score = scan.nextInt();
					// 성적은 과목 하나당 성적 한 개 
					studentList[select].subjects[num].score = score;
					
				}
				else {
					System.out.println("과목을 먼저 추가해야 합니다.");
				}
				
			}
			else if (choice == 4) {
				System.out.println("종료");
				break;
			}
		
		}
		scan.close();
	}

	}


