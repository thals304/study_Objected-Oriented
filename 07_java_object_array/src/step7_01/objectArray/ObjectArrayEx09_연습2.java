package step7_01.objectArray;
/*
 * 24.04.03 time 16:05-
 * today 소감문
 * 기본적인 연결성은 이렇다.
 * class Controller_연습문제2 - StudentEx_연습문제 객체 배열 생성
 * main - Controller_연습문제2 객체 생성 - sel==1 - StudentEx_연습문제 객체 생성
 *                                          - Controller_연습문제2 클래스의 checkId , addStudentEx 메서드 사용                         
 *                                 - sel==2 - StudentEx_연습문제 객체 생성
 *                                          - Controller_연습문제2 클래스의 checkId , removeStudentEx 메서드 사용
 *                                 - sel==3 - Controller_연습문제2 클래스의 sortData , printStudentEx 메서드 사용
 *                                 - sel==4 - Controller_연습문제2 클래스의 printStudentEx 메서드 사용
 *                                 - sel==5 - Controller_연습문제2 클래스의 outData 메서드 사용
 *                                 - sel==6 - StudentEx_연습문제 객체 생성
 *                                          - Controller_연습문제2 클래스의 loadStudentEx 메서드 사용
 * 오랜만에 클래스와 메서드, 객체 배열을 해봤는데 쉽지 않은거 같긴하다.
 * 그래서 내 힘으로 하지 못하고 정답을 보면서 따라해보고 이해하는 연습을 한 것 같다.
 * 근데 어레이 리스트에서 "각 배열 요소에 클래스의 인스턴스들을 할당" 하는 과정을 안하는 이유를 모르겠다.
 * -> 단순 배열이면 할당해 주는 코드를 써야하지만 어레이 리스트는 먼저 배열의 크기를 늘리고 기존 정보를 
 * 복사한 후에 추가 객체를 할당하므로 따로 필요 없음
 * 그리고 코드가 너무 길다보니까 왜 뒤에서 클래스를 분류해서 따로따로 쓰는지 이번에 바로 알게 된 것 같다.
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
	
	StudentEx_연습문제2[] list = null; // StudentEx_연습문제2 객체 배열 생성
	int stdCnt = 0;
	
	void addStudentEx(StudentEx_연습문제2 st) {	// 연결리스트 - 추가
		
		if(stdCnt == 0) {
			list = new StudentEx_연습문제2[stdCnt + 1];
		}
		else if (stdCnt > 0) {
			StudentEx_연습문제2[] temp = list;
			list = new StudentEx_연습문제2[stdCnt + 1];
			
			for(int i = 0; i < stdCnt; i++) {
			 // 클래스 인스턴스 할당을 할 필요가 없는 이유?
				list[i] = temp[i];
			}
			temp = null;
		}
		list[stdCnt] = st;
		stdCnt ++;
		
		
	}
	
	
	StudentEx_연습문제2 removeStudentEx (int index) {	// 연결리스트 - 삭제
		
		StudentEx_연습문제2 deleteObj = list[index];
		
		if (stdCnt == 1) {
			list = null;
		}
		if (stdCnt > 1) {
			StudentEx_연습문제2[] temp = list;
			list = new StudentEx_연습문제2[stdCnt - 1];
			
			int j = 0;
			for (int i = 0; i < stdCnt; i++) {
				if (i != index) {
					list[j] = temp[i];
					j++;
				}
			}
			temp = null;
		}
		stdCnt--;
		
		return deleteObj;
	}
	
	
	int checkId(StudentEx_연습문제2 st) { // 중복 체크 & 예외처리
		int check = -1;
		for (int i = 0; i < stdCnt; i++) {
			if (list[i].id.equals(st)) {
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
			return data;
		}
		data += stdCnt;
		data += "/n";
		for (int i = 0; i < stdCnt; i++) {
			data += list[i].id;
			data += ",";
			data += list[i].pw;
			if (stdCnt - 1 != i) {
				data += "\n";
			}
		}
		return data;
		
	}
	
	
	void sortData() {  // 오름차순 알고리즘 분류
		
		for (int i = 0 ; i < stdCnt; i++) {
			for (int j = i; j < stdCnt; j++) {
				if (list[i].id.compareTo(list[j].id) > 0) {
					StudentEx_연습문제2 temp = list[i];
					list[i] = list[j];
					list[j] = temp;
				}
			}
		}
		
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
				
				StudentEx_연습문제2 temp = new StudentEx_연습문제2();
				System.out.print("[회원가입] 아이디 입력 :");
				temp.id = scan.next();
				
			    int check = controller.checkId(temp);
			    
			    if(check == -1) {
			    	System.out.print("[회원가입] pw 입력 : ");
			    	temp.pw = scan.next();
			    	controller.addStudentEx(temp);
			    	System.out.println(temp.id +"님 환영합니다.");
			    }
			    else {
			    	System.out.println("중복 아이디입니다.");
			    }
					
				
				
			}
			else if (sel == 2) {
				
				controller.printStudentEx();
				
				StudentEx_연습문제2 temp = new StudentEx_연습문제2();
				System.out.print("[회원탈퇴] 탈퇴할 아이디 입력 : ");
				temp.id = scan.next();
				
				int check = controller.checkId(temp);
				
				if (check != -1) {
					StudentEx_연습문제2 del_st = controller.removeStudentEx(check);
					System.out.println(del_st.id + "님 탈퇴되셨습니다.");
				}
				else {
					System.out.println("없는 아이디입니다.");
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
               
               FileWriter fw = null;
               
               try {
            	   fw = new FileWriter(fileName);
            	   String data = controller.outData();
            	   
            	   if (!data.equals("")) {
            		   fw.write(data);
            		   System.out.println(data);
            	   }
               }
               catch(IOException e) {
            	   e.printStackTrace();
               }
               finally {try{fw.close();} catch(IOException e) {e.printStackTrace();}}
                
			}
			else if (sel == 6) {
				File file = new File(fileName);
				
			    if(file.exists()) {
			    	
			    	FileReader fr = null;
			    	BufferedReader br = null;
			    	
			    	try {
			    		fr = new FileReader(file);
			    		br = new BufferedReader(fr);
			    		
			    		String line = br.readLine();
			    		int count = Integer.parseInt(line);
			    		
			    		StudentEx_연습문제2[] temp = new StudentEx_연습문제2[count];
			    		
			    		for (int i = 0; i < count; i++) {
			    			temp[i] = new StudentEx_연습문제2(); // 각 배열 요소에 클래스 인스턴스들 할당
			    			line = br.readLine(); // 파일에서 stdCnt 다음 회원 id , pw 가 들어있음
			    			String[] value = line.split(",");
			    			temp[i].id = value[0];
			    			temp[i].pw = value[1];
			    		}
			    		
			    		controller.loadStudentEx(temp, count);
			    	}
			    	catch (IOException e) {
			    		e.printStackTrace();
			    	}
			    	finally {
			    		if (br != null) {try{br.close();} catch(IOException e) {e.printStackTrace();}}
			    		if (fr != null) {try{fr.close();} catch(IOException e) {e.printStackTrace();}}
			    	}
			    	
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
