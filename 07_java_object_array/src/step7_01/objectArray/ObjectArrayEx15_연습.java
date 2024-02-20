package step7_01.objectArray;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.ArrayList;

// DTO (DataTransferObject) : 데이터 전송 모델 객체
class StudentDTO{
	
	String id;
	String pw;
	
}


class StudentController{
	
	ArrayList<StudentDTO> studentList = new ArrayList<StudentDTO>(); // 어레이리스트 생성
	
	void addStudent(StudentDTO studentDTO) {
		studentList.add(studentDTO); // 주소(링크)를 어레이리스트에 add함
	}
	
	
	StudentDTO removeStudent(int index) { // 인덱스에 해당하는 요소를 deleteObj에 저장 
		StudentDTO deletedObj = studentList.get(index);
		studentList.remove(index);
		return deletedObj;	// 이미 삭제한 값인데 왜 return? pop()메서드처럼 삭제하는 데이터 return
	}
	
	
	int checkId(StudentDTO studentDTO) { // 아이디 중복 체크, 예외처리, 인덱스 역할
		int check = -1;
		for (int i = 0; i < studentList.size(); i++) {
			if (studentList.get(i).id.equals(studentDTO.id)) {
				check = i;
				break; // break 반드시 써줘야함
			}
		}
		return check;
	}
	
	
	void printStudent() {
		
		for (StudentDTO studentDTO : studentList) {	// foreach문 사용
			System.out.println("이름 : " + studentDTO.id + " / 비밀번호 : " + studentDTO.pw);
		}
		
	}	
	
	
	String outData() {
		
		String data = "";
		int lineCnt = studentList.size();
		if (lineCnt == 0){
			return data;
		}
		
		data += lineCnt;
		data += "\n";
		for (int i = 0; i < lineCnt; i++) {
			data += studentList.get(i).id;
			data += ",";
			data += studentList.get(i).pw;
			if (lineCnt - 1 != i) {
				data += "\n";
			}
		}
		return data;
		
	}
	
	
	void sortData() {
		// 아이디 정렬 (오름차순) : 버블 정렬
		for (int i = 0; i < studentList.size(); i++) {
			for (int j = i ; j < studentList.size(); j++) { 
				if (studentList.get(i).id.compareTo(studentList.get(j).id) > 0) { // 문자열이므로
					// get(index)는 가져오기만 가능 수정하려면 set (index, value)
					StudentDTO temp = studentList.get(i);
					studentList.set(i, studentList.get(j));
					studentList.set(j, temp);
				}
			}
		}
	}
	
	
	void loadStudent(ArrayList<StudentDTO> studentList ) {
		this.studentList = studentList;
	}	
	
	
	int getSize() {
		return studentList.size();
	}
	
}

public class ObjectArrayEx15_연습 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		StudentController controller = new StudentController();	// 객체 생성
		
		String fileName = "student_arraylist_db.txt";
		
		
		while (true) {
			
			System.out.print("1.가입 2.탈퇴 3.정렬 4.출력 5.저장 6.로드 7.종료 >>> ");
			int sel = scan.nextInt();
			
			if (sel == 1) {
				
				StudentDTO temp = new StudentDTO();	// 객체 생성
				System.out.print("[가입] id 를 입력하세요 >>> ");
				temp.id = scan.next();	// temp 객체에 id, pw 저장 	
				int check =  controller.checkId(temp); // 중복 처리
				
				if (check == -1) { // 중복이 아닐 때
					System.out.print("[가입] pw 를 입력하세요 >>> ");
					temp.pw = scan.next();
					controller.addStudent(temp); // temp 주소(링크)
					System.out.println(temp.id + "님 가입을 환영합니다.");
				}
				else {
					System.out.println("중복아이디 입니다.");
				}	
				
			}
			else if (sel == 2) {
				
				controller.printStudent(); // 어레이 리스트에 저장된 id / pw 출력
				
				StudentDTO temp = new StudentDTO(); // 객체 생성
				
				System.out.print("[탈퇴] id 를 입력하세요 >>> ");
				temp.id = scan.next();	// temp 객체에 id, pw 저장 	
				
				int check = controller.checkId(temp); // 예외처리
				if (check == -1) {
					System.out.println("없는 아이디입니다.");
				}
				else { // check가 인덱스 역할을 함
					System.out.println(controller.removeStudent(check).id + "님 탈퇴 되었습니다.");
				}
				
			}
			else if (sel == 3) {
				
				controller.sortData();
				controller.printStudent();
				
			}
			else if (sel == 4) {
				
				controller.printStudent();
				
			}
			else if (sel == 5) {

				FileWriter fw = null;
				
                if (controller.getSize() == 0) continue;
				
                try {
					
                	fw = new FileWriter(fileName);
					String data = controller.outData();
					
					if (!data.equals("")) {
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
				
				FileReader fr = null;
				BufferedReader br = null;
				try {
					
					File file = new File(fileName);
					
					if (file.exists()) {
						
						fr = new FileReader(file);
						br = new BufferedReader(fr);
						ArrayList<StudentDTO> studentList = new ArrayList<StudentDTO>();
						
						String line = br.readLine();
						int lineCnt = Integer.parseInt(line);
						
						for (int i = 0; i < lineCnt; i++) {
							StudentDTO temp = new StudentDTO();
							line = br.readLine();
							String value[] = line.split(",");
							temp.id = value[0];
							temp.pw = value[1];
							studentList.add(temp);
						}
						controller.loadStudent(studentList);
						
					}
					controller.printStudent();
					
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
				scan.close();
				break;
			}
		}

	}

}
