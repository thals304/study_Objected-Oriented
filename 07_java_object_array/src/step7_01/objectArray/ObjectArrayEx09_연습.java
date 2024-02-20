package step7_01.objectArray;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

class StudentEx{
	
	String id;
	String pw;
	
	void printData() {
		System.out.println("이름 : " + id + " 비밀번호 : " + pw);
		
	}
	
}


class Controller { // Controller 
	
	StudentEx[] list = null; 
	int stdCnt = 0;
	
	void addStudentEx(StudentEx st) {	// 연결리스트 - 추가
		
		if (stdCnt == 0) {	
			list = new StudentEx[1];
		}
		else if (stdCnt > 0) {
			StudentEx[] temp = list;  // temp에 백업
			list = new StudentEx[stdCnt + 1];
			for (int i = 0; i < stdCnt; i++) {
				list[i] = temp[i];
			}
			temp = null;
		}
		list[stdCnt] = st;	// st는 추가할 값
		stdCnt++;
		
	}
	
	
	StudentEx removeStudentEx (int index) {	// 연결리스트 - 삭제
		
		StudentEx deleteObj = list[index]; // 인덱스를 받아와서 값을 삭제하는 방식
		if (stdCnt == 1) {
			list = null;
		}
		else if (stdCnt > 1) {
			StudentEx [] temp = list;
			list = new StudentEx[stdCnt -1];
			
			for (int i = 0; i < index; i++) {
				list[i] = temp[i];
			}
			for (int i = index; i < stdCnt -1; i++) {
				list[i] = temp[i + 1];
			}
			temp = null;
		}
		stdCnt--;
		
		return deleteObj;  // 굳이 return을 안해주고 데이터만 삭제해주어도 되는데
						// 타 언어의 pop()메서드와 같이 삭제하는 데이터를 return하는 방식처럼 구현해본 예시
		
	}
	
	
	int checkId(StudentEx st) { // 중복 체크 & 예외처리
		
		int check = -1;	
		for (int i = 0; i < stdCnt; i++) {
			if (list[i].id.equals(st.id)) { 
				check = i;
				break;
			}
		}
		return check;
		
	}
	
	
	void printStudentEx() {
		
		for (int i = 0; i < stdCnt ;i++) {
			list[i].printData();
		}
		
	}	
	
	
	String outData() {	// file 내부 내용
		
		String data = "";
		if (stdCnt == 0) {
			return data;	// ""
		}
		data += stdCnt;  // 1 or 2 
		data += "\n";    // 1\n or 2\n
		for (int i = 0; i < stdCnt; i++) {
			data += list[i].id;	// 1\nid 
			data += ",";		// 1\nid,
			data += list[i].pw;	// 1\nid,pw
			if (stdCnt - 1 != i) { // 맨 마지막 부분 빼고 \n로 구분 1\nid,pw\n2\nid,pw 이런 느낌
				data += "\n";
			}
		}
		return data;
		
	}
	
	
	void sortData() {  // 오름차순 알고리즘 분류
		
		for (int i = 0; i < stdCnt; i++) {
			for (int j = i; j < stdCnt ; j++) { // 왜 j = i부터인거지? 본인 다음 인덱스와 비교하기 위함
				if (list[i].id.compareTo(list[j].id) > 0) {	// list[j].id가 클 때
					StudentEx temp = list[i];
					list[i] = list[j];
					list[j] = temp;
				}
			}
		}
		
	}
	
	// 파일을 출력하는거다보니 내부 내용을 split해서 역으로 stdCnt, list를 저장
	void loadStudentEx (StudentEx[] temp , int count) { 
		
		this.stdCnt = count;
		this.list = temp;
		
	}
	
}


public class ObjectArrayEx09_연습 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		Controller controller = new Controller();
		
		String fileName = "student_db.txt";
		
		while (true) {
			
			System.out.println("1.가입 2.탈퇴 3.정렬 4.출력 5.저장 6.로드 7.종료");
			int sel = scan.nextInt();
			
			if (sel == 1) {
				
				StudentEx temp = new StudentEx();
				System.out.println("[가입] id 를 입력하세요 >>> ");
				temp.id = scan.next();			
				int check =  controller.checkId(temp); // 아이디 중복 체크
				
				if (check == -1) {
					System.out.println("[가입] pw 를 입력하세요 >>> ");
					temp.pw = scan.next();
					controller.addStudentEx(temp);	// temp에 있는 id, pw를 학생 list에 저장해줌
					System.out.println(temp.id + "님 가입을 환영합니다.");
				}
				else {
					System.out.println("중복아이디 입니다.");
				}	
				
			}
			else if (sel == 2) {
				
				controller.printStudentEx();	// 가입한 id, pw 출력
				
				StudentEx temp = new StudentEx();
				System.out.println("[탈퇴] id 를 입력하세요 >>> ");
				temp.id = scan.next();	
				int check = controller.checkId(temp);  // 예외처리를 위함
				
				if (check == -1) {
					System.out.println("없는 아이디입니다.");
				}
				else {
					StudentEx del_st = controller.removeStudentEx(check);
					System.out.println(del_st.id + "님 탈퇴 되었습니다.");
				}
				
			}
			else if (sel == 3) {
				
				controller.sortData();
				controller.printStudentEx();
				
			}
			else if (sel == 4) {
				
				controller.printStudentEx();
				
			}
			else if (sel == 5) {
				
                if (controller.stdCnt == 0) continue;
				
                FileWriter fw = null; // File Input
                
                try {
                	
					fw = new FileWriter(fileName);
					String data = controller.outData();
					if (!data.equals("")) { // stdCnt != 0인 경우
						fw.write(data);
						System.out.println(data);
					}
					
				} catch (Exception e) {
					e.printStackTrace();
				}
                finally {
                	try {fw.close();} catch (IOException e) {e.printStackTrace();}	
                }
                
			}
			else if (sel == 6) {
				
				FileReader fr = null;	// File Output
				BufferedReader br = null;
				
				try {
					
					File file = new File(fileName);	
					
					if (file.exists()) {
						
						fr = new FileReader(file);
						br = new BufferedReader(fr);
						
						String line = br.readLine();
						int count = Integer.parseInt(line); // 문자열 > 숫자
						StudentEx [] temp = new StudentEx[count]; // 객체 배열을 만듬
						// 파일에 적힌 글을 봐야 더 잘 이해될 거 같음
						for (int i = 0; i < count; i++) {
							temp[i] = new StudentEx();
							line = br.readLine();
							String[] value = line.split(","); // 문자열을 ,으로 자름
							temp[i].id = value[0];
							temp[i].pw = value[1];
						}
						
						controller.loadStudentEx(temp , count); // 이걸 왜 해주는거지?
						
					}
					
					controller.printStudentEx();
				}
				catch (Exception e) {
					e.printStackTrace();
				}
				finally {
					try {br.close();} catch (IOException e) {e.printStackTrace();}
					try {fr.close();} catch (IOException e) {e.printStackTrace();}
				}
									
			}
			else if (sel == 7) {
				System.out.println("종료");
				break;
			}
			
		}

		scan.close();
		
	}

}
