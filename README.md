# web_backend
## **🔥 목표**

- 독립 (생각하는 것을 코드로 )
- 신입 개발자 이상 ( 실력, 가능성 )

## 📆 기간

24.01 ~ 24.06

## 🏃 과정

- 자바 + 프로그래밍 훈련, 디버깅, 소스 관리 ( 형성, 버전 관리 )
- 자바 ( 객체 지향 ) + **프로그래밍 훈련**
    
    cs ( 컴퓨터 사이언스: 네트워크, 리눅스, 자료구조 )
    
- 웹 관련 언어 ( html, css, js + jquery)
    
    RDB ( 관계형 데이터베이스 > MySQL )
    
- 백엔드 관련 ( JSP 발전 과정 )
    
    → 추가 : 마이바티스, JPA, Model And View, rest api
    
- 클라우드, 문서화 > 포트폴리오
    
    Amazon > AWS

## 📖 Study - 객체지향

객체 지향 프로그래밍 ( Object Oriented Programming [ OOP ] )

    - **객체 지향**
    - 객체지향 프로그래밍(Object-Oriented Programming, OOP)은 프로그래밍의 한 패러다임(방법)으로 프로그램을 객체들의 집합으로 모델링하여 개발하는 방식
    - 코드의 재사용성이 높다.
    - 코드의 확장성이 높다.
    - 코드의 관리가 용이하다.
    - 개발자간에 프로그램 방법에 통일과 일치성을 준다.
    - 신뢰성이 높은 프로그래밍을 가능하게 한다.
    
- **클래스 ( class )**
    - 클래스(class)는 객체 지향 프로그래밍(OOP)에서 특정 객체를 생성하기 위해 변수와 메소드를 정의하는 일종의 템플릿 또는 설계도이다.
    - 객체의 속성과 행동을 정의한다.
    
     **`[ 형태 ]`**
    
     **`1) class : 키워드`**
    
     **`2) Product : 클래스명 ( 첫글자를 대문자로 작성한다. )`**
    
     **`3) {} : 클래스의 영역`**
    
    ```java
    // Ex01의 class
    class Member {	// 클래스의 이름은 대문자로 시작
    	// 설계 (디자인)
    	
    	// 필드 (field), 속성 (properties), 멤버(변수)
    	String id;	
    	String password;
    	String name;
    	String hp;
    	String email;
    	String address;
    	
    	// 메서드 (행동)
    }
    ```
    
    ```java
    // Ex02의 class
    class Product {
    	
    	// 클래스의 필드는 초깃값이 저장되어 있다.
    	String code;	// null
    	String name;
    	String imgNm;
    	int price;		// 0
    	int deliveryPrice = 2500;	// 필드에 초깃값을 지정할 수 있다.
    }
    ```
    
    **클래스의 범위**
    
    같은 패키지 안의 클래스는 다른 클래스에서 사용이 가능하다.
    
    ( 구체적인 접근제어자는 객체지향 기법에서 공부 )
    
- **객체 ( object )**
    - 컴퓨터 과학에서 객체 또는 오브젝트(object)는 클래스에서 정의한 것을 토대로 메모리(실제 저장공간)에 할당된 것으로
    프로그램에서 사용되는 데이터 또는 식별자에 의해 참조되는 공간을 의미하며, 변수, 자료 구조, 함수 또는 메소드가 될 수 있다. 프로그래밍 언어는 변수를 이용해 객체에 접근하므로 객체와 변수라는 용어는 종종 함께 사용된다. 그러나 메모리가 할당되기 전까지 객체는 존재하지 않는다.(위키백과 참조)
    - 객체는 속성(데이터)과 행동(메서드)을 가지는 프로그래밍의 기본 단위
    
     **`[형태]`**
    
     **`클래스명 변수명 = new 클래스명();`**
    
    ```java
         Member member1 = new Member();	// (객체 : object) : new 클래스명(); 형태로 객체를 생성함 // 이 문장 전체는 객체가 아님 객체를 변수에 담은 것
    		 
    		 member1.id = "qwer1234";
    		 member1.password = "1111";
    		 member1.name = "익명1";
    		 member1.hp = "010-1234-5678";
    		 member1.email = "qwer1234@naver.com";
    		 member1.address = "서울";
    		 
    		 Member member2 = new Member();
    		 
    		 member2.id = "abcd1234";
    		 member2.password = "2222";
    		 member2.name = "익명2";
    		 member2.hp = "010-5678-1234";
    		 member2.email = "abcd1234@naver.com";
    		 member2.address = "경기";
    		 
    		 System.out.println("member1 객체");
    		 System.out.println(member1);	// 주소(link) : step6_01.classObject.Member@626b2d4a
    		 System.out.println("id : "       + member1.id);
    		 System.out.println("password : " + member1.password);
    		 System.out.println("name : "     + member1.name);
    		 System.out.println("hp : "       + member1.hp);
    		 System.out.println("email : "    + member1.email);
    		 System.out.println("address : "  + member1.address);
    		 System.out.println();
    		 
    		 System.out.println("member2 객체");
    		 System.out.println(member2);	// 주소(link) : step6_01.classObject.Member@5e91993f
    		 System.out.println("id : "       + member2.id);
    		 System.out.println("password : " + member2.password);
    		 System.out.println("name : "     + member2.name);
    		 System.out.println("hp : "       + member2.hp);
    		 System.out.println("email : "    + member2.email);
    		 System.out.println("address : "  + member2.address);
    		 System.out.println();
    
         // 같은 패키지 안의 클래스는 다른 클래스에서 사용이 가능
    		 new Product();
    		 new Product();
    		 new Product();
    ```
    
- **메서드 (method)**
    - 클래스 기반 언어에서 클래스 내부에 정의되어 있다.
    - 메서드는 프로그램이 실행되고 있을 때 클래스에서 생성된 인스턴스와 관련된 동작을 정의한다.
    
    [ 형태 ]
    
    - void : return 타입 (int , double , char , String , int[] , Product , ....)
    - printMenu : 메서드명 ( 주로 소문자로 시작하고 동사형태로 작명한다. )
    - () : 입력인수 (파라메타 , 매개변수 , 아규먼트 , 인자)
    - {} : 메서드의 영역
    
    ```java
      class MethodEx {
    	
    	// 메서드 정의(define)
    	void printMenu() {
    		
    		System.out.println("================");
    		System.out.println("1. 로그인");
    		System.out.println("2. 로그아웃");
    		System.out.println("3. 개인정보조회");
    		System.out.println("4. 개인정보수정");
    		System.out.println("5. 회원탈퇴");
    		System.out.println("=================\n");
    		
    		return;
    	}
    }
    
    public class MethodEx01 {
    
    	public static void main(String[] args) {
    		
    		MethodEx object = new MethodEx();
    		
    		// 메서드 호출 (call) : 정의된 메서드가 동작함
    		// 객체.메서드명(); 형태로 호출하여 사용
    		object.printMenu();
    		
    	}
    
    }
    ```
    
- **메서드의 4가지 형태**
    - 입력값(파라메타 , 매개변수 , 인수 , 인자 , 아규먼트)과 결과값(return)의 유무에 따라 4가지 형태로 구분할 수 있다.
    
     `입력값이 있고 , 결과값이 있다. ( 11 )`
    
     `입력값이 있고 , 결과값이 없다. ( 10 )`
    
     `입력값이 없고 , 결과값이 있다. ( 01 )`
    
     `입력값이 없고 , 결과값이 없다. ( 00 )`
    
    ```java
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
    		// return ; 결과값이 없는 경우 return 키워드 생략 가능
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
    ```
    
- **return**
    - 데이터를 반환한다. return 데이터는 오직 1개이다.
    - 메서드를 종료한다.