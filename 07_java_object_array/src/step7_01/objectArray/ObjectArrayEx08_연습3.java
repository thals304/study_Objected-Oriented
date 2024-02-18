package step7_01.objectArray;
import java.util.Scanner;

import javax.security.sasl.SaslException;
// 24.02.18 time 20:18-20:55
/*
 * today 소감문
 * 이번 연습은 복습 겸 배열 크기를 바꾸거나 등등 응용 하기 도전해봤다.
 * 확실히 연습을 2번 정도 하니 직접 생각하면서 코드를 쭉 쓸 수 있게되 되었다.
 * 하지만 결과 출력 부분에서 계속 반복된 j를 i라고 쓰는 실수를 하고 과목 추가와 성적 추가 부분이
 * 아직도 어렵게 느끼는 몇몇 부분이 있다.
 * 그리고 객체 배열 각 요소에 어떤 클래스의 인스턴스들을 할당하는 부분이 어디에서 적용이 되고
 * 어디에서는 적용이 안되는 구분이 애매하고 확신이 없는 것 같다.
 * 그래도 자료구조에서 배운 추가에서 std가 studentList 배열의 크기보다 크면
 * 더이상 추가할 수 없다는 메시지 제공 및 성적 추가에서 조건문 else에서 이 코드가 정확히 어떤 의미를
 * 전달하고자 하는지 과목 추가 없이 성적 추가 불가라는 메시지를 써줌으로 내 코드를 보는 사람에게
 * 친절함을 보여준 것 같아서 잘한 부분이라고 생각한다. 
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
			
			// 결과 출력
			for (int i = 0; i < stdCnt; i++) {
				System.out.println("[" + (i+1)+ "]" + studentList[i].name + "학생");
				if (studentList[i].subjects != null) {
					for (int j = 0; j < studentList[i].subjects.length; j++) {
						System.out.println(studentList[i].subjects[j].name + "과목 " + studentList[i].subjects[j].score + "점");
					}
				}
			}
			// 자료구조 추가
			System.out.println("[1]학생 추가하기");		// 이름 입력받아 추가
			System.out.println("[2]과목 추가하기");		// 이름과 과목 입력받아 추가
			System.out.println("[3]성적 추가하기");		// 이름과 과목 그리고 성적 입력받아 추가
			System.out.println("[4]종료하기");
			int choice = scan.nextInt();
			
			if (choice == 1) {
				if(stdCnt == studentList.length) {
					System.out.println("더이상 학생을 추가할 수 없습니다.");
					continue;
				}
				
				System.out.print("이름 입력 : ");
				String name = scan.next();
				
				studentList[stdCnt] = new Student8_연습문제3();
				studentList[stdCnt].name = name;
				stdCnt++;
				
				
			}
			else if (choice == 2) {
			
				for (int i = 0; i < stdCnt; i++) {
					System.out.println("["+(i+1)+"]" + studentList[i].name);
				}
				System.out.print("이름 번호 입력 : "); 
				int select = scan.nextInt();
				select--;
				
				System.out.print("과목 입력 : ");
				String subject = scan.next();
				
				if (studentList[select].subjects == null) {
					studentList[select].subjects = new Subject8_연습문제3[1];
					studentList[select].subjects[0] = new Subject8_연습문제3();
					studentList[select].subjects[0].name = subject;
				}
				else {
					int size = studentList[select].subjects.length;
					Subject8_연습문제3[] temp = studentList[select].subjects;
					studentList[select].subjects = new Subject8_연습문제3[size + 1];
					
					for (int i = 0; i < size; i++) {	// size + 1이 아닌 이유? temp에는 length가 size일 때의 주소만 백업해놨기 때문
						studentList[select].subjects[i] = temp[i];
					}
					studentList[select].subjects[size] = new Subject8_연습문제3();
					studentList[select].subjects[size].name = subject;
					
					temp = null;
				}
			}
			else if (choice == 3) {
				for (int i = 0; i < stdCnt; i++) {
					System.out.println("[" +(i+1) +"]" + studentList[i].name);
				}
				System.out.print("이름 번호 선택 : ");
				int select = scan.nextInt();
				select--;
				
				if (studentList[select].subjects != null) {
					for (int j = 0; j < studentList[select].subjects.length; j++) {
						System.out.println("["+(j+1)+"]" + studentList[select].subjects[j].name);
					}
				}
				else {
					System.out.println("과목 추가 후 성적을 추가할 수 있습니다.");
					continue;
				}
				
				System.out.print("과목 번호 선택 : ");
				int num = scan.nextInt();
				num--;
				
				System.out.print("성적 입력 : ");
				int score = scan.nextInt();
				// studentList[select].subjects[num] = new Subject8_연습문제3(); 
				// 각 요소에 new Subject8_연습문제3 클래스의 새 인스턴스를 할당하는 코드	
				// 얘도 이거를 써줘야 하나? No. 안써주는 이유? 
				// 과목이 추가 되어있어야 성적을 입력할 수 있는 구조이므로 과목 추가부분에서 새 인스턴스를 할당하는 코드를 썼기 때문인건가?
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
