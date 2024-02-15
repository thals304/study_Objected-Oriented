package step7_01.objectArray;
import java.util.Scanner;

class Subject8{
	
	String name; // 과목
	int score;

}


class Student8{
	
	Subject8[] subjects;
	String name; // 학생

}


public class ObjectArrayEx08_연습 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		// # 학생 추가 삭제 컨트롤러
		//   => 컨트롤러를 완성해 아래 3개의 정보를 추가하시오.
		//   김철수 : 과목3개 수학 50 국어50 영어 60 
		//   이만수 : 과목2개 수학 20 국어 30 
		//   이영희 : 과목1개 수학 100
		
		Student8[] studentList = new Student8[3];
		int studentCnt = 0;	// 학생 수
		
		while (true) {
			// 결과 출력
			for (int i = 0; i < studentCnt; i++) {
				System.out.println("[" + (i+1) + "]" + studentList[i].name + "학생>>>");
				// 해당 학생의 과목이 null이면 for문 조건식 증감식으로 돌아가서 다음 학생의 이름 출력 
				// studentList[i].subjects가 null이다 null이 아니다라는 의미가 정확히 뭐지?/
			    // Subject8 의 name & score가 둘다 없는 경우 null
				// 하나라도 있으면 != null -> 만약 과목 name만 있는 경우 score는 null 이라고 나오는건가? 
			
				if (studentList[i].subjects != null) {
					for (int j = 0; j < studentList[i].subjects.length; j++) {
						System.out.println("[" + (j+1) + "]" + studentList[i].subjects[j].name + "과목 = " + studentList[i].subjects[j].score + "점");
					}
				}
				System.out.println();
			}
			// 자료구조 추가
			System.out.println("[1]학생 추가하기");		// 이름 입력받아 추가
			System.out.println("[2]과목 추가하기");		// 이름과 과목 입력받아 추가
			System.out.println("[3]성적 추가하기");		// 이름과 과목 그리고 성적 입력받아 추가
			System.out.println("[4]종료하기");
			int choice = scan.nextInt();
			
			if (choice == 1) {
				
				System.out.print("이름 입력 : ");
				String name = scan.next();	
				
				studentList[studentCnt] = new Student8();
				studentList[studentCnt].name = name;
				studentCnt++;
				
			}
			else if (choice == 2) {
				
				for (int i = 0; i < studentCnt; i++) {
					System.out.println("[" + (i+1) + "]" + studentList[i].name);
				}
				System.out.print("학생 선택 : "); // 학생 번호 i+1로 선택
				int select = scan.nextInt();
				select--;	// 위에서 학생 출력은 i+1로 했어서 1을 다시 줄여줘야 인덱스로 사용 가능
				
				System.out.print("과목 입력 : ");
				String subject = scan.next();
				
				if (studentList[select].subjects == null) { // subjects 배열이 null인 경우
					
					studentList[select].subjects = new Subject8[1];
					studentList[select].subjects[0] = new Subject8();
					studentList[select].subjects[0].name = subject;
					
				}
				else {
					
					int size = studentList[select].subjects.length;
					
					Subject8[] temp = studentList[select].subjects; // 크기를 늘리기 전 임시 저장 장소 temp에 주소 백업
					studentList[select].subjects = new Subject8[size + 1]; // 배열 크기 늘리기
					
					for(int i = 0; i < size; i++) {
						studentList[select].subjects[i] = temp[i];
					}
					
					studentList[select].subjects[size] = new Subject8(); 
					studentList[select].subjects[size].name = subject; // 입력한 학생에게 과목 추가하기
					
					temp = null;	// 다시 temp null로 만들기
					
				}
			}
			else if (choice == 3) {
				
				for (int i = 0; i < studentCnt; i++) {
					System.out.println("[" + (i+1) + "]" + studentList[i].name);
				}
				System.out.print("학생 선택 : ");
				int select = scan.nextInt();
				select--;
				// 단순히 과목 출력인데 이 조건을 쓴 이유? 과목이 없는데 성적을 입력하면 안되기 때문 
				// 그래서 else는 생략했지만 null인 경우 while 조건문으로 다시 돌아감
				if (studentList[select].subjects != null) { 
					for (int i = 0; i < studentList[select].subjects.length; i++) {
						System.out.println("[" + (i+1) + "]" + studentList[select].subjects[i].name);
					}
				}
				
				System.out.print("과목 선택 : ");
				int num = scan.nextInt();
				num--;
				
				System.out.print("성적 입력 : ");
				int score = scan.nextInt();
				
				studentList[select].subjects[num].score = score;
				
			}
			else if (choice == 4) {
				System.out.println("종료");
				break;
			}
		
		}

		scan.close();

	}

}
