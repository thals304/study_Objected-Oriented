package step9_02.atm_v2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileManager {
	
	private FileManager() {}
	private static FileManager instance = new FileManager(); // 싱글턴 디자인 패턴
	public static FileManager getInstance() {
		return instance;
	}
	
	String fileName = "ATM.txt";
	String data = "";	// String 초기화
	UserManager um = UserManager.getInstance(); 
	// 왜 FileManager 클래스에서 UserManager 객체를 생성해준거지?
	// UserManager > User > Account 에 있는 변수를 사용하기 위해
	void setData() { // 도대체 얘는 어디서 사용한거지? 같은 클래스에 있는 메서드에서 사용함
		
		data = "";
		int userCount = um.userCnt;
		data += userCount; // 회원 수
		data += "\n";
		
		for (int i = 0; i < userCount; i++) {
			data += um.userList[i].id;
			data += "\n";
			data += um.userList[i].pw;
			data += "\n";
			data += um.userList[i].accCnt; // 계좌 개수
			data += "\n";
			
			if (um.userList[i].accCnt == 0) { // 계좌가 0개일 때
				data += "0\n";
			}
			else {
				for (int j = 0; j < um.userList[i].accCnt; j++) {
					data += um.userList[i].acc[j].accNumber;
					data += "/";
					data += um.userList[i].acc[j].money;
					if (j != um.userList[i].accCnt - 1) { // 계좌번호1/돈1, 계좌번호2/돈2, 계좌번호3/돈3 로 표현하기 위함
						data += ",";
					}
				}
				data += "\n";
			}
		}
		
	}
	
	
	void save() {
		
		setData();
		
		FileWriter fw = null;
		
		try {
			fw = new FileWriter(fileName);
			fw.write(data);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (fw != null) {try {fw.close();} catch (IOException e) {}}
		}
		
	}
	
	
	void load() {
		
		File file = new File(fileName);
		FileReader fr = null;
		BufferedReader br = null;
		
		try {
			
			if (file.exists()) {
				
				fr = new FileReader(file);
				br = new BufferedReader(fr);
				while (true) {
					String line = br.readLine();
					if (line == null) {
						break;
					}
					data += line;
					data += "\n";
				}
				// setData() 구조를 잘 알아야 load도 할 수 있을거 같음
				/* 
				 	[ setData() 구조 ]
				 	
				 	tmp[0] 회원수(userCount)
				 	tmp[1] 회원A 아이디(id)
				 	tmp[2] 회원A 비밀번호(pw)
				 	tmp[3] A계좌수(accCnt)
				 	tmp[4] A계좌번호1/돈1, A계좌번호2/돈2, A계좌번호3/돈3
				 +4 tmp[5] 회원B 아이디(id)
				 	회원B 비밀번호(pw)
				 	B계좌수(accCnt)
				 	B계좌번호1/돈1, B계좌번호2/돈2,
				 	.
				 	.
				 	.
				 	
				*/
				String[] tmp = data.split("\n"); // 한 줄 한 줄로 나누고 있음
				um.userCnt = Integer.parseInt(tmp[0]); // String > int
				um.userList = new User[um.userCnt];	
				for (int i = 0; i < um.userCnt; i++) {
					um.userList[i] = new User();	// 각 요소에 User클래스의 변수를 할당
				}
				
				int j = 0;
				// 왜 i += 4인거지? 회원 1명의 정보(id,pw,accCnt,acc)는 인덱스 4개에 담겨 있음
				// 즉, 회원의 시작 인덱스는 이전 회원 시작 인덱스로부터 + 4
				for (int i = 1; i < tmp.length; i += 4) { 
					
					String id = tmp[i];
					String pw = tmp[i+1];
					int accCnt = Integer.parseInt(tmp[i+2]);
					
					um.userList[j].id = id;
					um.userList[j].pw = pw;
					um.userList[j].accCnt = accCnt;
					String accInfo = tmp[i+3];	// 계좌는 아직 ' , ' & ' / ' 으로 split 되지 않았으므로 String에 저장
					
					if (accCnt == 1) { // 계좌1/돈1
						String[] temp = accInfo.split("/");
						
						String acc = temp[0];
						int money = Integer.parseInt(temp[1]);	// String > int
						
						um.userList[j].acc[0] = new Account();	// 각 배열 요소에 Account클래스의 변수들 할당
						um.userList[j].acc[0].accNumber = acc;
						um.userList[j].acc[0].money = money;
					}
					if (accCnt > 1){
						
						String[] temp = accInfo.split(",");
						
						for (int k = 0; k < temp.length; k++) {
							String[] parse = temp[k].split("/");
							String acc = parse[0];
							int money = Integer.parseInt(parse[1]);
							
							um.userList[j].acc[k] = new Account();
							um.userList[j].acc[k].accNumber = acc;
							um.userList[j].acc[k].money = money;
						}
					}
					j++;
				}
			}
			else { // file이 존재하지 않으면 다시 setData > save
				// um.setDummy();	// 얘는 왜 있는거? 그냥 테스트 용도
				setData();
				save();
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (br != null) {try {br.close();} catch (IOException e) {}}
			if (fr != null) {try {fr.close();} catch (IOException e) {}}
		}
	}
	
}
