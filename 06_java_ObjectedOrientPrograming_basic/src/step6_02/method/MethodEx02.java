package step6_02.method;

import java.io.FileWriter;
import java.io.IOException;

/*
 * 
 *  # 메서드의 4가지 형태
 * 
 * 		- 입력값(파라메타 , 매개변수 , 인수 , 인자 , 아규먼트)과 결과값(return)의 유무에 따라 4가지 형태로 구분할 수 있다.
 * 
 * 		입력값이 있고 , 결과값이 있다. ( 11 )
 * 		입력값이 있고 , 결과값이 없다. ( 10 )
 * 		입력값이 없고 , 결과값이 있다. ( 01 )
 * 		입력값이 없고 , 결과값이 없다. ( 00 )
 * 
 * */


class MethodType {
	
	// 입력값도 없고 결과값도 없는 경우
	void type00() {
		System.out.println("================");
		System.out.println("1. 로그인");
		System.out.println("2. 로그아웃");
		System.out.println("3. 개인정보조회");
		System.out.println("4. 개인정보수정");
		System.out.println("5. 회원탈퇴");
		System.out.println("=================\n");
		//return ; 결과값이 없는 경우 return 키워드 생략 가능
	}
	
	// 입력값은 있고 결과값은 없는 경우
	void type10(String fileName) { // 매개 변수, 파라메타, 아규먼트, 인수, 인자
		
		try {
			FileWriter fw = new FileWriter(fileName);
			fw.close();
		} 
		catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	// 입력값은 없고 결과값은 있는 경우
	double type01() {
		return 3.141592;
	}
	
	// 입력값과 결과값이 모두 있는 경우
	int type11(String birth) {
		String temp = birth.substring(0, 4);
		int age = 2024 - Integer.parseInt(temp) + 1;
		
		return age;
	}
}


public class MethodEx02 {

	public static void main(String[] args) {

		MethodType object = new MethodType();
		// 입력값도 없고 결과값도 없는 경우
		object.type00();
		// scan.close();
		// fr.close();
		// br.close();
		System.out.println();
		
		// 입력값은 있고 결과값은 없는 경우
		object.type10("제임스고슬링.txt");
		object.type10("팀버너스리.hwp");
		object.type10("데니스리치.pptx");
		
		// 오류 : 파라미터 타입이 일치해야만 함
		// object.type10('C'); 
		// object.type10(300);
		
		// 오류 : 파라미터 개수가 일치해야만 함
		// object.type10("사람1.txt", "사람2.hwp");
		// object.type10("사람1.txt", "사람2.hwp", "사람3.pptx");
		
		// 입력값은 없고 결과값은 있는 경우
		double pi = object.type01();
		System.out.println("PI : " + pi);
		System.out.println();
		
		// 입력값과 결과값이 모두 있는 경우
		int age = object.type11("200001010");
		System.out.println("나이 : " + age );
		
		System.out.println("나이 : " + object.type11("19900101"));
		
		if (object.type11("202401010") == 1) {
			System.out.println("1살 입니다.");
		}
		
		System.out.println();
		
		// System.out.println("megait".indexOf("g"));
		// System.out.println("megait".charAt(2));
		// System.out.println("megait".substring(2));
		// System.out.println("megait".substring(2,4));
	}

}


