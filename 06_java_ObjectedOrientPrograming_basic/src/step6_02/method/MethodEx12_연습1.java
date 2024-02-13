package step6_02.method;

import java.util.Arrays;
// 24.02.13 time 19:38-20:43
/*
 * today 소감문
 * 일단 1시간 넘게 이 문제를 풀지 몰랐다는 점이 나에게 큰 충격을 준 것 같다.
 * 문제 수도 많고 쉽지 않은 메서드를 만드는거라 풀기 시작하기도 싫고 그냥 피해버릴까
 * 생각도 했지만 생각보다 내가 너무 잘 풀어서 놀랐던 것 같다.
 * 중간 중간 문자열 문법이 생각이 안나서 개념을 정리해둔 노트를 공부하면서 풀었는데 
 * 개념 복습을 꼭 돌려야 한다는 교훈을 준 것 같다.
 * 이 예제들 중 내가 애를 쓴 건  5,8번이다. 5번은 처음에는 문자열로 못풀것 같아서
 * 내가 자체 추가 문제 만들어서 char로 바꾸어 풀었다. 하지만 6번 문제를 보고 toCharArray()를
 * 통해 5번을 풀 수 있겠다 싶어 풀었는데 답은 제대로 나왔지만 꼼수로 맞춘 느낌이라 조금 아쉽다는 생각이 든다.
 * 그리고 8번은 쉽게 풀 수 있겎다 싶어 구현해봤는데 답이 아예 출력이 안되는 것이다. 심지어 오류도 안떠서
 * 어디를 고쳐야 되는지 내가 생각한 것 중 어느 부분이 틀렸는지 알 수가 없으니 답답했다.
 * 그래서 chat gpt를 통해 내가 틀린 부분을 체크하고 수정해준 방법을 참고해서 이해하려고 노력했다.
 * 물론 100% 습득은 안되어서 계속 봐야할 문제인 것 같다.
 * */
class Ex12_연습문제1 {
	
	// 1. 절대값을 리턴하는 myABS 메서드를 만드시오.
	int myABS(int param) {
		
		if (param < 0) return - param;
		else return param;
	}
	
	// 2. 이메일에 '@'가 있는지를 체크하는 checkEmailValidation 메서드를 만드시오.
	boolean checkEmailValidation(String email) {
		int check = -1;
		for (int i = 0; i < email.length(); i++) {
			if (email.charAt(i) == '@' ) {	// 문자 비교로 바뀌므로 equals 사용 X
				check = i;
			}
		}
		if (check == -1) return false;
		else return true;
	}
	
	// 3. 파일의 확장자를 리턴하는 getFileExtention 메서드를 만드시오.
	String getFileExtention(String fileName) {
		// .을 기준으로 뒤에 있는 문자열을 출력하도록 만들어야 될 거 같음
		int dotIdx = 0;
		for (int i = 0; i < fileName.length(); i++) {
			if (fileName.charAt(i) == '.') {
				dotIdx = i;
			}
		}
		String fileExtention = fileName.substring(dotIdx + 1, fileName.length());
		
		return fileExtention;
	}
	
	// 4. 숫자의 제곱을 계산하여 리턴하는 myPow 메서드를 만드시오.
	int myPow(int param1 , int param2) {
		int square = 1;
		for (int i = 1; i <= param2; i++) {
			square *= param1;
		}
		
		return square;
	}
	
	// 5. 문자열에 특정 문자의 위치를 리턴하는 myIndexOf 메서드를 만드시오.
	int myIndexOf_1(String data , String word) {	
		int idx = 0;
		char[] charWord = word.toCharArray();
		
		for (int i = 0; i < data.length(); i++) {
			if (data.charAt(i) == charWord[0]) {	// 이게 내 최선인데
				idx = i;
			}
		}
		
		return idx;
	}
	
	int myIndexOf_2(String data , char word) {	
		// word를 char로 해주면 편했을텐데,일단 String으로 푸는 방법을 모르니 char로 바꾸어 풀어보자
		int idx = 0;
		for (int i = 0; i < data.length(); i++) {
			if (data.charAt(i) == word) {
				idx = i;
			}
		}
		
		return idx;
	}
	
	// 6. 문자열에 특정 위치의 문자를 리턴하는 myCharAt 메서드를 만드시오.
	// 문자열을 문자 배열로 저장) > [안배운문법] 문자열.toCharArray()
	// 예시)                      > char[] 변수 = 문자열.toCharArray();
	char myCharAt(String data , int index) {
		char[] charData = data.toCharArray();
		char word = 0; // 문자 / 문자열은 어떻게 초기값 해줘야 되지?
		for (int i = 0; i < charData.length; i++) {
			if (charData[index] == charData[i]) {
				word = charData[i];
			}
		}
		
		return word;
	}
	
	// 7-1. 문자열의 특정위치부터 끝까지의 잘라진 문자열을 리턴하는 mySubString1 메서드를 만드시오.
	String mySubString1(String data , int startIndex) {
		// data는 배열이 아닌 문자열이라는 점!
		String mySubString = "";
		for (int i = startIndex; i < data.length(); i++) {
			mySubString += data.charAt(i); // 문자들을 연속적으로 문자열 변수에 저장해야함
		}
		
		return mySubString;
	}
	
	// 7-2. 문자열의 특정위치부터 특정위치까지의 잘라진 문자열을 리턴하는 mySubString2 메서드를 만드시오.
	String mySubString2(String data , int startIndex , int endIndex) {
		String mySubString = "";
		for (int i = startIndex; i < endIndex; i++) {
			mySubString += data.charAt(i);
		}
		
		return mySubString;
	}
	
	// 8. 문자열을 특정 키워드로 잘라내어 배열에 담아서 리턴하는 mySplit 메서드를 만드시오.
	String[] mySplit(String data , String sep) {
		char[] charSep = sep.toCharArray();
		int cnt = 0;
		for (int i = 0; i < data.length(); i++) {
			if (data.charAt(i) == charSep[0]) {
				cnt++;
				}
		}
		String[] mysplit = new String[cnt + 1];	// 배열 크기를 어떻게 하지? sep 개수 + 1로 넣기
		
		int startIdx = 0;
		int arrayIdx = 0;
		/*for (int i = 0; i < data.length(); i++) {
			if (data.charAt(i) == charSep[0]) {
				mysplit[arrayIdx] = data.substring(startIdx, i); // 현재까지의 문자열 추출해 배열에 저장
				startIdx = i + 1; // sep이 위치한 인덱스에서 + 1
				arrayIdx++;
			}
		}
		mysplit[arrayIdx] = data.substring(startIdx);	// 마지막으로 남은 문자열 추출해 배열에 저장	
		*/
		/* 이 방법으로 하면 출력이 안됨
		int i = 0;
		 while (i < data.length()) {
			int j = 0;
			if (data.charAt(i) != charSep[0]) {
				mysplit[j] = data.charAt(i); // 여기서부터 빨간 줄 생김
				j++;
			}
		} */
		
		// 배열 return을 어떻게 해야되지? return System.out.println(Arrays.toString(mysplit));이 안되는 이유?
		// 반환값의 타입이 String[]이라 return mysplit;이라고 하긴 했는데 mysplit이 반환되어 출력될 때 자꾸 주소를 반환한다고 생각하게 돼 
		return mysplit;
	}
	
}


public class MethodEx12_연습1 {

	public static void main(String[] args) {

		
		Ex12_연습문제1 e = new Ex12_연습문제1();
		
		// 1. 절대값을 리턴하는 myABS 메서드를 만드시오.
		System.out.println(e.myABS(3));   // 3
		System.out.println(e.myABS(-3));  // 3 
		System.out.println(e.myABS(12));  // 12 
		System.out.println(e.myABS(-12)); // 12
		System.out.println();
		
		// 2. 이메일에 '@'가 있는지를 체크하는 checkEmailValidation 메서드를 만드시오.
		System.out.println(e.checkEmailValidation("qwer1234@naver.com"));    // true
		System.out.println(e.checkEmailValidation("qwer1234"));    			 // false
		System.out.println(e.checkEmailValidation("abcde@gmail.com"));    	 // true
		System.out.println(e.checkEmailValidation("abcde"));    			 // false
		System.out.println();
		
		// 3. 파일의 확장자를 리턴하는 getFileExtention 메서드를 만드시오.
		System.out.println(e.getFileExtention("1.jpg"));  			// jpg   
		System.out.println(e.getFileExtention("캡처.png"));  		// png  
		System.out.println(e.getFileExtention("수업자료.txt"));  		// txt  
		System.out.println(e.getFileExtention("프로젝트 제안서.pdf"));  // pdf   
		System.out.println();
		
		// 4. 숫자의 제곱을 계산하여 리턴하는 myPow 메서드를 만드시오.
		System.out.println(e.myPow(3, 2));	// 9
		System.out.println(e.myPow(4, 2));	// 16
		System.out.println(e.myPow(5, 3));	// 125
		System.out.println(e.myPow(7, 3));	// 343
		System.out.println();
		
		// 5. 문자열에 특정 문자의 위치를 리턴하는 myIndexOf 메서드를 만드시오.
		System.out.println(e.myIndexOf_1("just do it!", "j"));  // 0
		System.out.println(e.myIndexOf_1("just do it!", "s"));  // 2
		System.out.println(e.myIndexOf_1("just do it!", "i"));  // 8
		System.out.println(e.myIndexOf_1("just do it!", "!"));  // 10
		System.out.println();
		
		System.out.println(e.myIndexOf_2("just do it!", 'j'));  // 0
		System.out.println(e.myIndexOf_2("just do it!", 's'));  // 2
		System.out.println(e.myIndexOf_2("just do it!", 'i'));  // 8
		System.out.println(e.myIndexOf_2("just do it!", '!'));  // 10
		System.out.println();
		
		// 6. 문자열에 특정 위치의 문자를 리턴하는 myCharAt 메서드를 만드시오.
		// 문자열을 문자 배열로 저장) > [안배운문법] 문자열.toCharArray()
		// 예시)                      > char[] 변수 = 문자열.toCharArray();
		System.out.println(e.myCharAt("just do it!", 0));    // j
		System.out.println(e.myCharAt("just do it!", 2));    // s
		System.out.println(e.myCharAt("just do it!", 8));    // i
		System.out.println(e.myCharAt("just do it!", 10));   // !
		System.out.println();
		
		// 7-1. 문자열의 특정위치부터 끝까지의 잘라진 문자열을 리턴하는 mySubString1 메서드를 만드시오.
		System.out.println(e.mySubString1("200107-1234567", 2));    // 0107-1234567
		System.out.println(e.mySubString1("200107-1234567", 4));	// 07-1234567
		System.out.println(e.mySubString1("200107-1234567", 7));	// 1234567
		System.out.println(e.mySubString1("200107-1234567", 10));	// 4567
		System.out.println();
		
		// 7-2. 문자열의 특정위치부터 특정위치까지의 잘라진 문자열을 리턴하는 mySubString2 메서드를 만드시오.
		System.out.println(e.mySubString2("200107-1234567", 0 , 2)); // 20
		System.out.println(e.mySubString2("200107-1234567", 2 , 4)); // 01
		System.out.println(e.mySubString2("200107-1234567", 4 , 6)); // 07
		System.out.println(e.mySubString2("200107-1234567", 0 , 6)); // 200107
		System.out.println();
		
		// 8. 문자열을 특정 키워드로 잘라내어 배열에 담아서 리턴하는 mySplit 메서드를 만드시오.
		System.out.println(Arrays.toString(e.mySplit("a,b,c", ",")));		  // [a, b, c]
		System.out.println(Arrays.toString(e.mySplit("a,b,c,e,f,g", ",")));   // [a, b, c, e, f, g]
		System.out.println(Arrays.toString(e.mySplit("a/b/c/e/f/g", "/")));   // [a, b, c, e, f, g]
		System.out.println(Arrays.toString(e.mySplit("goodsCd=1 & goodsNm=스마트 TV & goodsPrice=3000000 & orderQty=1 & ordererId=qwer1234", "&")));  // [goodsCd=1 ,  goodsNm=스마트 TV ,  goodsPrice=3000000 ,  orderQty=1 ,  ordererId=qwer1234]
		
		
	}

}
