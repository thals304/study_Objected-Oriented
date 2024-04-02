package step7_01.objectArray;
/*
 * 24.04.02 time
 * today 소감문
 * */
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

class StudentEx_연습문제2{
	
	String id;
	String pw;
	
	void printData() {
		System.out.println("이름 : " + id + " 비밀번호 : " + pw);
		
	}
	
}



class Controller_연습문제2 { // Controller 
	
	StudentEx_연습문제2[] list = null; 
	int stdCnt = 0;
	
	void addStudentEx(StudentEx_연습문제2 st) {	// 연결리스트 - 추가
		
		
		
	}
	
	
	void removeStudentEx (int index) {	// 연결리스트 - 삭제
		
		
	}
	
	
	int checkId(StudentEx_연습문제2 st) { // 중복 체크 & 예외처리
		
		return 0;
		
	}
	
	
	void printStudentEx() {
		
		for (int i = 0; i < stdCnt ;i++) {
			list[i].printData();
		}
		
	}	
	
	
	String outData() {	// file 내부 내용
		
		return "";
		
	}
	
	
	void sortData() {  // 오름차순 알고리즘 분류
		
		
		
	}
	
	// 파일을 출력하는거다보니 내부 내용을 split해서 역으로 stdCnt, list를 저장
	void loadStudentEx (StudentEx_연습문제2[] temp , int count) { 
		
		this.stdCnt = count;
		this.list = temp;
		
	}
	
}


public class ObjectArrayEx09_연습2 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		Controller_연습문제2 controller = new Controller_연습문제2();
		
		String fileName = "student_db.txt";
		
		while (true) {
			
			System.out.println("1.가입 2.탈퇴 3.정렬 4.출력 5.저장 6.로드 7.종료");
			int sel = scan.nextInt();
			
			if (sel == 1) {
				
				
				
			}
			else if (sel == 2) {
				
				
			}
			else if (sel == 3) {
				
				controller.sortData();
				controller.printStudentEx();
				
			}
			else if (sel == 4) {
				
				controller.printStudentEx();
				
			}
			else if (sel == 5) {
				
               
                
			}
			else if (sel == 6) {
				
				
						
						
									
			}
			else if (sel == 7) {
				System.out.println("종료");
				break;
			}
			
		}

		scan.close();
		
	}

}
