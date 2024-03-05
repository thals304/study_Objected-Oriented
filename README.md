# web_backend
## **🔥 목표**

- 독립 (생각하는 것을 코드로 )
- 신입 개발자 이상 ( 실력, 가능성 )

## 📆 기간

24.01 ~ 24.06

## 🏃 과정

- 자바 + 프로그래밍 훈련, 디버깅, 소스 관리 ( 형성, 버전 관리 )
- **자바 ( 객체 지향 ) + 프로그래밍 훈련**
    
    **cs ( 컴퓨터 사이언스: 네트워크, 리눅스, 자료구조 )**
    
- 웹 관련 언어 ( html, css, js + jquery)
    
    RDB ( 관계형 데이터베이스 > MySQL )
    
- 백엔드 관련 ( JSP 발전 과정 )
    
    → 추가 : 마이바티스, JPA, Model And View, rest api
    
- 클라우드, 문서화 > 포트폴리오
    
    Amazon > AWS

## 📖 Study - 객체지향

### 객체 지향 프로그래밍 ( Object Oriented Programming [ OOP ] )

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
    
    **`[형태]`**

	**`void : return 타입 (int , double , char , String , int[] , Product , ....)`**

	**`printMenu : 메서드명 ( 주로 소문자로 시작하고 동사형태로 작명한다. )`**

	**`() : 입력인수 (파라메타 , 매개변수 , 아규먼트 , 인자)`**

	**`{} : 메서드의 영역`**
    
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

- **this**
    - **객체 (오브젝트, 인스턴스) 자신**
    
    ```java
    class Unit {
    	
    	int shield = 60;
    	int hp = 100;
    	
    	void printData() {
    		System.out.println("this : " + this);
    		// this는 생략이 가능하고 기본적으로 생략되어 있다.
    		System.out.println("hp: " + this.hp);
    		System.out.println("sheild: " + this.shield);
    		System.out.println();
    	}
    }
    
    public class ClassEx14 {
    
    	public static void main(String[] args) {
    		
    		Unit unit1 = new Unit(); // unit1은 주소(링크)
    		unit1.shield = 0;
    		unit1.hp = 0;
    		System.out.println("unit1 : " + unit1);	// unit1일 때는 this는 unit1의 주소와 같음
    		unit1.printData();
    		
    		Unit unit2 = new Unit(); // unit2은 주소(링크)
    		unit2.shield = 1;
    		System.out.println("unit2 : " + unit2); // unit1일 때는 this는 unit1의 주소와 같음
    		unit2.printData();
    		
    		Unit unit3 = new Unit();
    		System.out.println("unit3 : " + unit3);
    		unit3.printData();
    		
    
    	}
    
    }
    ```
    

- **static**
    - **정적 필드(static 변수)와 정적 메소드(static 메소드)는 객체(인스턴스)에 소속된 멤버가 아니라 클래스에 고정된 멤버이다.
    → 클래스명.static변수명 , 클래스명.static메소드(); 형태로 사용 가능**
    - static 키워드를 통해 생성된 정적멤버들은 heap영역이 아닌 static영역에 할당한다.
    - static 영역에 할당된 메모리는 모든 객체가 공유하여 하나의 멤버를 어디서든지 참조할 수 있다.
    - Garbage Collector의 관리 영역 밖에 존재하기에 static영역에 있는 멤버들은 프로그램의 종료시까지 메모리가 할당된 채로 존재한다.
    
    ```java
    class Character {
    	
    	int hp = 100;  // this.hp 
        static int moveSpeed = 10;
    	
    	void printData() {
    		System.out.println("hp : " + hp);
    		System.out.println("moveSpeed : " + moveSpeed);
    		System.out.println();
    	}
    	
    	static void speedUp() {	// 메소드도 static 사용 가능
    		moveSpeed += 10000;
    	}
    }
    
    public class ClassEx15 {
    
    	public static void main(String[] args) {
    
    		Character c1 = new Character();
    		c1.hp = 0;	
    		// 클래스명.static변수명으로 사용
    		Character.moveSpeed = 100; // c1.moveSpeed = 100 ;
    		
    		Character c2 = new Character();
    		c2.hp = 50;
    		Character.moveSpeed += 9999; // c2.moveSpeed += 9999;	// c1에 의해 c1 ~ c3의 moveSpeed가 100 이었다가 c2에 의해 9999가 더해짐 
    		
    		Character c3 = new Character();
    		// 클래스명.static메서드(); 형태로 사용
    		Character.speedUp(); // c3.speedUp();
    		
    		c1.printData();
    		c2.printData();
    		c3.printData();
    		
    		// static 사용 예시
    		System.out.println(Math.PI);
    		System.out.println(Math.abs(-12));
    		
    		try {
    			Thread.sleep(3000);
    			System.out.println("끝");
    		} catch (InterruptedException e) {
    			e.printStackTrace();
    		}
    	}
    
    }
    ```
  - **싱글턴 디자인 패턴**
      - 객체를 1번만 생성하고 싶을 때 사용하는 기법
      - 싱글턴 디자인 패턴을 만드는 방법
        
          1. private 기본 생성자를 만든다.
        
          2. 내부에서 static으로 자기자신의 인스턴스를 생성한다. **(핵심)**
        
          3. instance를 반환할 getter를 만들어준다.
        
    
    ```java
    class SingleTonTest {
    	
    	// 1) private 기본 생성자를 만든다.
    	private SingleTonTest() {}	// main에서 new SingleTonTest();를 못하게 막음
    	
    	// 2) 내부에서 static으로 자기자신의 인스턴스를 생성한다. (핵심)
    	private static SingleTonTest instance = new SingleTonTest();	// 밑에 변수와 메서드도 static으로 만들어줌
    	
    	// 3) instance를 반환할 getter를 만들어준다.
    	public static SingleTonTest getInstance() {
    		return instance;
    	}
    	// 테스트 변수
    	String testVar = "테스트 변수";
    	
    	// 테스트 메서드
    	void testMethod() {
    		System.out.println("테스트 메서드");
    	}
    }
    
    class ClassTest {}
    
    public class ClassEx17 {
    
    	public static void main(String[] args) {
    
    		// error : 싱글턴 사용방식은 일반 클래스 사용방식과 다름
    		// new SingleTonTest();
    		
    		System.out.println(SingleTonTest.getInstance());  // 주소로 나옴
    		System.out.println(SingleTonTest.getInstance());  // 같은 객체
    		System.out.println(SingleTonTest.getInstance());  // 같은 객체
    		System.out.println();
    		
    		// 싱글턴클래스명.instance.변수명
    		System.out.println(SingleTonTest.getInstance().testVar);
    		
    		// 싱글턴클래스명.instance.메서드명()
    		SingleTonTest.getInstance().testMethod();
    		
    		System.out.println(new ClassTest());  // 다른 객체 
    		System.out.println(new ClassTest());  // 다른 객체 
    		System.out.println(new ClassTest());  // 다른 객체 
    	}
    
    }
    
    ```

  - **Thread (쓰레드)**
    - 운영체제에 의해서 관리되는 하나의 '작업' 혹은 '태스크'를 의미한다.
        
        Ex) 음성인식 작업 , 모션인식 작업 , 웹브라우저 , main()함수
        
    - main() 의외의 다른 쓰레드를 만들려면 **Thread클래스를 상속**받거나 **Runnable 인터페이스를 구현**한다.
    - 자바에서는 다중 상속을 허용하지 않기 때문에 **Thread 클래스를 확장하는 클래스는 다른 클래스를 상속받을 수 없다.**
    - **Runnable 인터페이스를 구현했을 경우에는 다른 인터페이스를 구현할 수 있으며 다른 클래스도 상속받을 수 있다. (주로 Runnable 인터페이스 구현을 많이 사용)** 
    
    ```java
    // 쓰레드 구현방법 1) Thread 클래스를 상속받아서 구현한다.
    class Music extends Thread {
    	// Thread 클래스로부터 제공되는 run() 메서드이며 동시적으로 수행할 명령어를 작성한다.
    	@Override
    	public void run() {	       // run 메서드 오버라이딩
    		// super.run();
    		for (int i = 0; i < 10; i++) {
    			System.out.println("배경음악이 연주되는 중");
    			try {
    				Thread.sleep(500);
    			} catch (InterruptedException e) {
    				e.printStackTrace();
    			}
    		}
    		
    	}
    }
    // 쓰레드 구현방법 2) Runnable 인터페이스를 구현하여 사용한다.
    class Game implements Runnable{
    
    	@Override
    	public void run() {	        // run 메서드 구현
    		for (int i = 0; i < 10; i++) {
    			System.out.println("게임 하는 중");
    			try {
    				Thread.sleep(500);
    			} catch (InterruptedException e) {
    				e.printStackTrace();
    			}
    		}
    	}
    	
    }
    
    public class ClassEx18 {
    
    	public static void main(String[] args) {
    
    		// Thread클래스를 상속받을 경우 객체에서 start()메서드를 이용하여 쓰레드를 시작한다. 
    		// 클래스안에 오버라이딩된 run()메서드를 호출한다.
    		Music music = new Music(); 
    		music.start();	// 상속 받았기 때문에 .start()로 바로 사용 가능
    		
    		// Runnable Interface를 구현할 경우 Thread객체에서 생성자의 인수로
    		// Runnable Interface를 구현한 객체를 주입하여 새로운 객체를 만들고
    		// 새로운 객체를 통해 .start()메서드를 이용하여 쓰레드를 시작한다. > run()메서드 호출
    		Game temp = new Game(); // 구현했기 때문에 틀만 가지고 있는 것
    		
    		Thread game = new Thread(temp);	// 추가로 쓰레드 객체 만들어줘야함
    		game.start();
    		
    		for (int i = 0; i < 10; i++){
    			System.out.println("PC 카톡을 하는 중");
    			try {
    				Thread.sleep(500);	// Thread.으로 호출하니 static! // 500 > 0.5초
    			} catch (InterruptedException e) {
    				e.printStackTrace();
    			}      
    		}
    		
    	}
    
    }
    ```
    
  **+)  클래스에서 다양한 변수 (꼭 구분하기!)**
    
    ```java
    // 다양한 변수의 종류
    class VariableEx{
    	
    	int a; 			// 객체, 인스턴스 변수 (객체에서 사용하는 변수)
    	static int b;   // 정적, 클래스 변수 (클래스 이름으로 사용하는 변수)
    	
    	void test(int c) {	// 매개변수, 파라메타, 아규먼트 (메서드로 전달되는 데이터를 받을 때 사용하는 변수)
    		int d;  	    // 지역변수 (메서드 내부에서만 사용하는 변수)
    	}
    	
    }
    ```

  **+) 메서드 오버로딩(overloading) , 메서드 중복정의**

    1 ) 매개변수의 개수

    2 ) 매개변수의 데이터 타입이 달라도 같은 이름으로 만들어진 여러 개의 메서드를 사용할 수 있는 기법 

  
    >**Tech Q&A    메서드 오버로딩 vs 메서드 오버라이딩**
    >
    > Overloading : 메서드 이름이 같고, 매개변수의 개수, 데이터 타입은 달라야 함
                  (단, 리턴 값만 다른 것은 오버로딩 할 수 없음)
    >
    > Overriding : 부모 클래스로부터 상속 받은 메서드를 자식 클래스에서 재정의 하는 것 
                  자식 클래스에서는 **오버라이딩하고자 하는 메소드의 이름, 매개변수, 리턴 값이 모두 같아야 함**

    </aside>

  ```java
    class MethodOverloadingEx {
	
	int add(int x, int y) {
		return x + y;
	}
	
	int add(int x, int y, int z) {
		return x + y + z;
	}
	
	double add(double x, double y) {
		return x + y;
	}
	
	int add(int[] arr) {
		int total = 0;
		for (int i = 0; i < arr.length; i++) {
			total += arr[i];
		}
		return total;
	}
}

- **생성자 (Constructor)**
    - 생성자는 반드시 클래스의 이름과 같아야 한다.
    - 생성자는 리턴타입을 가지지 않고 return도 사용하지 않는다.
        
        ( 생성자도 하나의 메서드이지만 기존 메서드와의 차이점이 있다. )
        
    - 생성자는 인스턴스를 생성할때 ( new 클래스명(); ) 호출된다.
        
        3-1) 반드시 실행된다.
        
        3-2) 가장 먼저 실행된다.
        
    - 생성자를 정의하지 않으면 컴파일러가 자동으로 기본 생성자를 만든다.
    - 기본 생성자란 클래스이름과 같으며 매개변수에 아무것도 없는 생성자를 의미한다.
    - 생성자를 새로 정의하면 기본 생성자는 자동으로 만들어지지 않는다.
    
    ```java
    class ConstructorTest {
    	
    	// 생성자
    	ConstructorTest(){ // 메서드랑 다른 점 : return 없음
    		
    		System.out.println("생성자 호출");
    		
    	}
    	// 메서드
    	void method1() {
    		System.out.println("메서드1 호출");
    	}
    	void method2() {
    		System.out.println("메서드2 호출");
    	}
    	void method3() {
    		System.out.println("메서드3 호출");
    	}
    	
    }
    
    public class MethodEx19_01 {
    
    	public static void main(String[] args) {
    		
    		// 객체를 생성할 때 기본 생성자가 실행된다.
    		ConstructorTest object = new ConstructorTest();
    		
    		// 메서드를 호출할 때 메서드가 실행된다.
    		object.method3();
    		object.method1();
    		
    		new ConstructorTest();
    		new ConstructorTest();
    		
    	}
    
    }
    ```
    
    ```java
    // 생성자를 이용한 필드 초기화(init)
    
    class GoodsDTO {
    	
    	String goodsCd;
    	String goodsNm;
    	int goodsPrice;
    	
    	void setData(String goodsCd, String goodsNm, int goodsPrice) {
    		this.goodsCd = goodsCd;
    		this.goodsNm = goodsNm;
    		this.goodsPrice = goodsPrice;
    	}
    	// 생성자 자동완성키 Source > Generate Constructor Using Fields 
    	public GoodsDTO(String goodsCd, String goodsNm, int goodsPrice) {
    
    		this.goodsCd = goodsCd;
    		this.goodsNm = goodsNm;
    		this.goodsPrice = goodsPrice;
    	}
    	
    	void printData() {
    		System.out.println("goodsCd : " + this.goodsCd);
    		System.out.println("goodsNm : " + this.goodsNm);
    		System.out.println("goodsPrice : " + this.goodsPrice);
    		System.out.println();
    	}
    }
    public class MethodEx19_02 {
    
    	public static void main(String[] args) {
    		
    		// (before)
    		// GoodsDTO goodsDTO = new GoodsDTO();
    		// goodsDTO.setData("0x001", "셔츠", 30000);
    		// goodsDTO.printData();
    		
    		// (after)
    		GoodsDTO goods1 = new GoodsDTO("0x001", "셔츠", 30000);
    		goods1.printData();
    		
    		GoodsDTO goods2 = new GoodsDTO("0x002", "데님바지", 50000);
    		goods2.printData();
    		
    		GoodsDTO goods3 = new GoodsDTO("0x003", "양말", 2000);
    		goods3.printData();
    		
    		// 생성자 사용 예시
    		Scanner scan = new Scanner(System.in);
    		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
    		DecimalFormat df = new DecimalFormat("#,##0");
    	}
    
    }
    ```
    
    - **생성자 오버로딩**
        - 생성자도 메서드이기 때문에 메서드 오버로딩 기법이 적용 가능하다.
        - 생성자 오버로딩을 구현하기 위해서는 메서드와 마찬가지로
        - 파라메타의 개수나 타입을 다르게 정의 하면 된다.
    
    ```java
    class GoodsVO {
    
    	String goodsCd;
    	String goodsNm;
    	int goodsPrice;
    
    	// 기본 생성자
    	GoodsVO() {
    		this.goodsCd = "없음";
    		this.goodsNm = "없음";
    		this.goodsPrice = -1;
    	}
    
    	// 생성자 오버로딩
    	GoodsVO(String goodsCd) {
    		this.goodsCd = goodsCd;
    		this.goodsNm = "없음";
    		this.goodsPrice = -1;
    	}
    
    	// 생성자 오버로딩
    	GoodsVO(String goodsCd, String goodsNm) {
    		this.goodsCd = goodsCd;
    		this.goodsNm = goodsNm;
    		this.goodsPrice = -1;
    	}
    
    	// 생성자 오버로딩
    	GoodsVO(String goodsCd, String goodsNm, int goodsPrice) {
    		this.goodsCd = goodsCd;
    		this.goodsNm = goodsNm;
    		this.goodsPrice = goodsPrice;
    	}
    
    	void printData() {
    		System.out.println("goodsCd : " + this.goodsCd);
    		System.out.println("goodsNm : " + this.goodsNm);
    		System.out.println("goodsPrice : " + this.goodsPrice);
    		System.out.println();
    	}
    }
    public class MethodEx19_03 {
    
    	public static void main(String[] args) {
    
    		GoodsVO goods1 = new GoodsVO();
    		goods1.printData();
    		
    		GoodsVO goods2 = new GoodsVO("0x001");
    		goods2.printData();
    		
    		GoodsVO goods3 = new GoodsVO("0x002", "청바지");
    		goods3.printData();
    		
    		GoodsVO goods4 = new GoodsVO("0x003", "셔츠", 50000);
    		goods4.printData();
    		
    	}
    }
    ```
    
    - **toString**
        - 주소를 받아 객체에 관한 정보를 문자열로 반환한다.
    
    ```java
    class OrderDTO {
    	
    	private String orderId;
    	private String goodsId;
    	private String memberId;
    	
    	public String getOrderId() {
    		return orderId;
    	}
    	public void setOrderId(String orderId) {
    		this.orderId = orderId;
    	}
    	public String getGoodsId() {
    		return goodsId;
    	}
    	public void setGoodsId(String goodsId) {
    		this.goodsId = goodsId;
    	}
    	public String getMemberId() {
    		return memberId;
    	}
    	public void setMemberId(String memberId) {
    		this.memberId = memberId;
    	}
      // toString 생성 자동완성
    	// 좌측 상단 Source > Generate toString > Generate
    	@Override
    	public String toString() {
    		return "OrderDTO [orderId=" + orderId + ", goodsId=" + goodsId + ", memberId=" + memberId + ", goodsTitle="
    				+ goodsTitle + "]";
    	}
    	}
    public class MethodEx20 {
    
    	public static void main(String[] args) {
    		
    		OrderDTO order1 = new OrderDTO();
    		order1.setOrderId("order1");
    		order1.setGoodsId("goods1");
    		order1.setMemberId("member1");
    		System.out.println(order1); // 주소를 찍으면 toString이 저장된 값들 출력됨 // getter로 하나씩 출력할 필요 없음
      }
    }
    ```

### 객체 배열

- **객체 배열 생성**
    
    **`형태`**
    
    **`클래스명[] 배열명 = new 클래스명[크기];`**
    
    ```java
    class Product {
    	String name = "아이패드";
    	int price = 1000;
    }
    
    public class ObjectArrayEx01 {
    
    	public static void main(String[] args) {
    
      Product[] productList = new Product[3];
    
      Product product = new Product();
      // 1) Product  2) product 3) new Product(); 
    	// 3번은 객체이고 2번은 객체(3번)를 넣은 변수이므로 객체 배열에 대입(저장) 가능 
    	// but, 1번은 데이터 타입이므로 객체 배열에 대입(저장) 불가능
      product.name = "기계식 키보드";
    	product.price = 35000;
    	productList[0] = product;
    
      productList[1] = new Product(); // 배열 인덱스 1에 객체를 생성해 주는 행위
    	productList[2] = new Product(); // 배열 인덱스 2에 객체를 생성해 주는 행위
      
      productList[1].name = "무소음마우스";
    	productList[1].price = 27000;
    		
    	productList[2].name = "장패드";
    	productList[2].price = 10000;
    
      // [응용] 생각해보기
    		Product[] temp1 = productList;	        // 주소 (링크)
    		Product temp2 = productList[0]; 		    // 주소 (링크) 
    		String temp3 = productList[1].name; 	  // 데이터
    		int temp4 = productList[1].price; 	    // 데이터
    		
    		Product temp = productList[2];
    		System.out.println("temp : " + temp);   // 주소
    		System.out.println("productList[2] : " + productList[2]);  // 주소
    		
    		System.out.println("temp.name : " + temp.name);  // 장패드
    		System.out.println("productList[2].name : " + productList[2].name);  // 장패드
    		
    		temp.name = "장패드1";
    		System.out.println("temp.name : " + temp.name);  // 장패드1
    		System.out.println("productList[2].name : " + productList[2].name); // 장패드1 -> 주소이므로 같은 결과값이 나옴
    		
    		productList[2].name = "장패드2"; 
    		System.out.println("temp.name : " + temp.name); // 장패드2
    		System.out.println("productList[2].name : " + productList[2].name); // 장패드2
    
    }
    ```

- **컬렉션 프레임워크 (collection framework) ArrayList**
    - 배열은 한번 선언하면 프로그램에서 배열의 크기를 바꿀 수 없다.
    - ArrayList 클래스는 데이터가 입력되면 자동으로 크기가 커지고 데이터가 삭제되면 자동으로 크기가 작아진다.
    - 중간에 데이터가 삽입되면 데이터가 삽입될 위치부터 모든 데이터가 뒤로 이동 되고 중간의 데이터가 제거된 다음 위치부터 모든 데이터가 앞으로 이동한다.
    
    **`[ ArrayList 생성 방법 ]`**
    
    `ArrayList<Integer> list = new ArrayList<Integer>();`
    
    `ArrayList<Integer> list = new ArrayList<>(); // 우변의 제네릭의 데이터형은 생략 가능`
    
    `ArrayList<String> list = new ArrayList<String>();`
    
    `ArrayList<Product> list = new ArrayList<Product>();`
    
    `ArrayList<Member> list = new ArrayList<Member>();`
    
    **[ 래퍼 클래스(wrapper class) ]**
    
    - 래퍼 클래스란 기본 자료형을 클래스로 만들어 놓은 것을 의미한다.
    
        **[기본형]          [래퍼 클래스]**
      
         **byte                Byte**
      
         **short               Short**
      
         **int                Integer**
      
        **long                 Long**
      
        **float               Float**
      
        **double              Double**
      
         **char               Character**
      
        **boolean             Boolean**
    
    **[ 제네릭 ]**
    
    - 제네릭(generic)이라 부르며 ArrayList에 저장될 데이터 타입을 반드시 클래스로 작성한다.
    - 기본 자료형 데이터를 저장하는 ArrayList를 만들어야 하는 경우에는 래퍼 클래스를 사용한다.
    
    ```java
      // 기존 배열의 연결리스트와 비교하기
      int arr[] = new int[10];
      ArrayList<Integer> list = new ArrayList<Integer>();
    
      System.out.println(Arrays.toString(arr));
      System.out.println(list); // toString이 내장되어 있어서 그냥 써도 됨
    
       // Insert & Append
       // add(value) : arrayList의 맨뒤에 value를 추가한다.
       // add(index,value) : arrayList의 index번째에 value를 추가한다.
        arr[0] = 10;
    		arr[1] = 10;
    		arr[2] = 10;
    		arr[3] = 10;
    		arr[4] = 10;
    		
    		list.add(10);
    		list.add(20);
    		list.add(40);
    		list.add(50);
    		list.add(2, 30);
     
       // size() : arrayList의 데이터의 개수를 반환한다.
        System.out.println("크기 : " + arr.length);
    		System.out.println("크기 : " + list.size());
      
       // set(index,value) : ArrayList의 index번째의 값을 value값으로 수정한다.
        arr[0] = 1000;
    		arr[1] = 2000;
    		arr[2] = 3000;
    		
    		list.set(0, 1000);
    		list.set(1, 2000);
    		list.set(2, 3000);
    
       // remove(index) : ArrayList의 index번째 위치의 값을 삭제한다.
        arr[0] = 0;
    		arr[1] = 0;
    		arr[2] = 0;
    		
    		list.remove(2);
    		list.remove(1);
    		list.remove(0);
    
       // get(index) : ArrayList의 index번째의 value를 얻어온다.
        System.out.println(arr[0]);
    		System.out.println(arr[1]);
    		System.out.println(arr[2]);
    		System.out.println();
    		
    		System.out.println(list.get(0));
    		System.out.println(list.get(1));
    
        for(int i = 0; i < arr.length; i++) {
    			System.out.println(arr[i] + " ");
    		}
    		System.out.println();
    		
    		for(int i = 0; i < list.size(); i++) {
    			System.out.println(list.get(i) + " ");
    		}
        
        arr = null;
    		
    		list.clear();   // ArrayList의 모든 데이터만 삭제
    		list.add(10); 	// 내용만 비운 것이니 또 추가, 삭제, 삽입 가능 
    		
    		list = null;    // ArrayList 자체를 삭제
    		// list.add(10);  // null pointerException error!
    		list = new ArrayList<Integer>();	// 다시 만들어야 함
    		list.add(10);
    
    ```
- **컬렉션 프레임워크 (collection framework) HashMap**

  - HashMap은 K(Key)에 V(Value)를 할당 방식으로 데이터가 저장하는 데이터 형식이다.
  - HashMap은 순서와 상관없이 key로 데이터를 저장 및 관리한다.
    
    **`HashMap 생성방법`**
    
    `HashMap<키, 값> 변수명 = new HashMap<키, 값>();
     HashMap<키, 값> 변수명 = new HashMap<>();`						
    
    // new 뒤쪽의 generic은 생략 가능하다.
    
    Ex)
    HashMap<String, Integer> hmap = new HashMap<String, Integer>();
    HashMap<String, Integer> hmap = new HashMap<>();
    
     설명)
    HashMap<String,Integer>   : key의 타입은 String이고 저장될 데이터의 타입은 Integer이다.
    HashMap<String,String>     : key의 타입은 String이고 저장될 데이터의 타입은 String이다.
    HashMap<String,Object>    : key의 타입은 String이고 저장될 데이터의 타입은 Object이다.
    HashMap<String,Product>  : key의 타입은 String이고 저장될 데이터의 타입은 Product이다.
    HashMap<String,Member> : key의 타입은 String이고 저장될 데이터의 타입은 Member이다.
    
    ```java
        HashMap<String, Integer> hMap = new HashMap<String, Integer>();
    		
    		// put(key, value) : HashMap의 key에 value를 할당한다. 
    		// put()메서드는 존재하지 않는 key에 넣어주면 데이터가 입력되고 존재하는 key에 넣어주면 수정된다. 
    		hMap.put("data1", 1000);
    		hMap.put("data2", 2000);
    		hMap.put("data3", 3000);
    		System.out.println(hMap);  // hashmap은 순서와는 전혀 관계 없음
    		System.out.println("\n===============================\n");
    		
    		hMap.put("data1", 10000); 	// 키가 같으면 수정
    		hMap.put("data2", 20000); 	// 키가 같으면 수정
    		hMap.put("data3", 30000); 	// 키가 같으면 수정
    		hMap.put("data4", 4000);	// hashmap에 없는 키가 추가되면 데이터 추가 
    		hMap.put("data5", 5000);	// hashmap에 없는 키가 추가되면 데이터 추가 
    		
    		System.out.println(hMap); 
    		System.out.println("\n===============================\n");
    		
    		// size() : HashMap의 데이터개수를 반환한다.
    		System.out.println( "개수 : "+ hMap.size());
    		System.out.println("\n===============================\n");
    		
    		// get(key) : HashMap의 key에 할당된 value를 얻어온다.
    		System.out.println(hMap.get("data1"));
    		System.out.println(hMap.get("data2"));
    		System.out.println(hMap.get("data3"));
    		System.out.println(hMap.get("data4"));
    		System.out.println(hMap.get("data5"));
    		System.out.println("\n===============================\n");
    		
    		// keySet() : HashMap의 key만 얻어온다.
    		System.out.println(hMap.keySet());
    		
    		for ( String key : hMap.keySet()) {
    			System.out.println(key + " : " + hMap.get(key));
    		}
    		System.out.println("\n===============================\n");
    		
    		// remove(key) : HashMap의 key에 해당하는 값을 제거한다.
    		hMap.remove("data1");
    		hMap.remove("data2");
    		hMap.remove("data3");
    		System.out.println(hMap);
    		System.out.println("\n===============================\n");
    		
    		hMap.clear(); // HashMap의 모든 데이터만 삭제
    		// hMap.put("data1", 1000); 바로 put, remove, get 등등 가능
    		
    		hMap = null;  // HashMap 자체를 삭제 
    		// hMap.put("data1",1000); 바로 put 불가능 -> 다시 만들어야 함
    		hMap = new HashMap<String, Integer>();
    ```
    

    +) 웹에서 자주 사용하는 예시

  ```java
  class TempMember {
  	
  	String id;
	String passwd;
	String name;
	String email;
	String address;

  }

  public class ObjectArrayEx12 {
  
     	public static void main(String[] args) {

		// 웹에서 자주 사용하는 예시 1
		TempMember temp1 = new TempMember();	// temp1은 주소(링크)
		temp1.id      = "user1";	// key
		temp1.name    = "유저1";
		temp1.passwd  = "1";
		temp1.email   = "1@gamil.com";
		temp1.address = "서울";
		
		TempMember temp2 = new TempMember();
		temp2.id      = "user2";
		temp2.name    = "유저2";
		temp2.passwd  = "2";
		temp2.email   = "2@gamil.com";
		temp2.address = "경기";
		
		TempMember temp3 = new TempMember();
		temp3.id      = "user3";
		temp3.name    = "유저3";
		temp3.passwd  = "3";
		temp3.email   = "3@gamil.com";
		temp3.address = "인천";
		
		HashMap<String, TempMember> mapEx01 = new HashMap<String, TempMember>();
		// arryaList는 순서가 있기 때문에 name을 알고 싶다고 했을 때
		// 인덱스 번호를 알아야한다는 번거로움이 있음
		// 근데 HashMapd은 대장 역할(key)을 id라고 정해두고 주소를 value로 하면 
		// 얼마든지 name, email, address 등을 뽑아낼 수 있음
		mapEx01.put(temp1.id, temp1); 	
		mapEx01.put(temp2.id, temp2);
		mapEx01.put(temp3.id, temp3);
		
		System.out.println(mapEx01);
		System.out.println(mapEx01.get(temp1.id).name);

		// 웹에서 자주 사용하는 예시 2 (예시 1보다 2가 실제로 사용하는 경우가 더 많음)
		HashMap<String,Object> mapEx02 = new HashMap<String, Object>();
		mapEx02.put("id", "user4");
		mapEx02.put("name", "유저4");
		mapEx02.put("passwd", "4");
		mapEx02.put("email", "4@gmail.com");
		mapEx02.put("address", "부산");
		// 클래스 외에 추가적으로 데이터 저장이 가능
		mapEx02.put("isPcLogin", true);
		mapEx02.put("role", "VIP"); 
		mapEx02.put("browser", "chrome"); 
		
		System.out.println(mapEx02);

		// 참고) Object 타입을 명시할경우 서로 다른데이터를 저장할 수 있다.
		HashMap<String, Object> testMap = new HashMap<String, Object>();
		testMap.put("key1", "문자열");
		testMap.put("key2", 100);
		testMap.put("key3", true);
		testMap.put("key4", 3.14);
		testMap.put("key5", 'p');
		testMap.put("key6", new TempMember());
		testMap.put("key7", new Product());

	}
	```

  **+) 제네릭 (generic) 집중 설명**
    - 클래스 내부에서 사용하는 데이터의 타입(Type)을 클래스의 인스턴스를 생성할 때 결정하는 것을 의미한다.
    - 객체의 타입을 컴파일 시점에 체크하기 때문에 타입 안정성을 높이고 형 변환의 번거로움을 줄일 수 있다.
    
    ```java
    class Employee {}
    class Manager {}
    class Supervisor {}
    
    class GenericEx<T> { // T : type
    	// before
    	// Employee[] employees = new Employee[3];
    	// Manager[] managers = new Manager[3];
    	// Supervisor[] supervisors = new Supervisor[3];
    	
    	// after
    	Object[] arr = new Object[3];
    	
    	int idx = 0;
    	void add(T data) {
    		arr[idx++] = data;
    	}
    	
    	T get(int index) {
    		return (T)arr[index];	// return을 할 때는 T 타입으로 형변환 해줘야 함 
    		                        // why? 제네릭 타입 T의 실제 유형을 알지 못하므로
    	}
    	
     }
    public class ObjectArrayEx16 {
    
    	public static void main(String[] args) {
    
    		GenericEx<Employee> employees = new GenericEx<Employee>(); // ArrayList 생성과 유사
    		GenericEx<Manager> managers = new GenericEx<Manager>(); 
    		GenericEx<Supervisor> supervisors = new GenericEx<Supervisor>(); 
    	
    		employees.add(new Employee());		// 주소(링크)를 data로 넣어줌
    		// employees.add(new Manager());
    		// employess.add(new Supervisor());
    		
    		// managers.add(new Employee());
    		managers.add(new Manager());
    		// managers.add(new Supervisor());
    		
    		// supervisors.add(new Employee());
    		// supervisors.add(new Manager());
    		supervisors.add(new Supervisor());
    		
    		System.out.println(employees.get(0));
    		System.out.println(managers.get(0));
    		System.out.println(supervisors.get(0));
    	}
    
    }
    
    ```
  
- **foreach문 (향상된 for문)**
    
    **`[ 구조 ]`**
    
    `for (element type 변수명 : 반복가능한 자료형) {   명령어;  }`
    
    - for문의 반복 횟수 제어가 없다.
    - 반복 자료형의 크기만큼 처음부터 끝까지 반복하면서 반복 자료형의 element가 직접 변수에 저장되고
    - for문의 몸체{}를 반복하여 실행한다.
    
    ```java
        // 기존 for문과 비교
    
        // 사용 예시 1)
    		int[] arr1 = {10 , 20 , 30 , 40 , 50 , 60 , 70 , 80 , 90 , 100};
    		for (int i  = 0; i < arr1.length; i++) {
    			System.out.print(arr1[i] + " ");
    		}
    		System.out.println();
    		
    		for (int element : arr1) {	// 1개 임시저장 : 뭉탱이류(array, arraylist)
    			System.out.print(element + " ");
    		}
    		System.out.println();
    		
    		System.out.println("\n==============================\n");
    		
    		// 사용 예시 2)
    		String[] arr2 = {"한놈" , "두시기" , "석삼" , "너구리" , "오징어"};
    		for (int i  = 0; i < arr2.length; i++) {
    			System.out.print(arr2[i] + " ");
    		}
    		System.out.println();
    		
    		for (String idx: arr2) {
    			System.out.print(idx + " ");
    		}
    		System.out.println();
    		
    		System.out.println("\n==============================\n");
    		
    		// 사용 예시 3) 어레이리스트 & foreach문
    		ArrayList<Product> list = new ArrayList<Product>();
    		
    		for (int i = 1; i < 11; i++) {
    			Product temp = new Product(); // 주소(링크)
    			temp.name = "상품" + i;
    			temp.price = 10000 * i;
    			list.add(temp);
    		}
    		
    		for (int i = 1; i < list.size(); i++) {
    			// list.get(i) 까지만 출력하면 주소가 나옴
    			//            .name  .price를 해줘야 내가 원하는 값을 눈으로 볼 수 있음
    			System.out.println(list.get(i).name + " / " + list.get(i).price);
    			System.out.println();
    		}
    		// 데이터 자체가 오기 때문에 temp.name / temp.price 형태로 간단하게 사용 가능
    		for (Product temp : list) {
    			System.out.println(temp.name + " / " + temp.price);
    		}
    ```

### 객체 지향 기법

- **개요**

    > src/step9_01.overview/@)객체지향 프로그래밍 개요.pdf 참고

- **캡슐화 (Encapsulation)**
    - 객체지향 프로그래밍에서 캡슐화는 클래스의 내부 구현을 숨기고
    외부에서는 오직 정의된 인터페이스를 통해서만 객체와 상호작용할 수 있도록 하는 문법이다.
    - 이를 통해 객체의 상세 구현을 변경해도 다른 코드에 영향을 주지 않게 하여 코드의 유지보수성과 확장성을 높인다.
    - **캡슐화를 구현하는 문법 접근제어자(Access Modifier)의 종류**
        - **public  		     : 프로젝트 전체에서 접근 가능**
        - **protected             : 상속 관계에서 접근 가능**
        - **default(package) : 패키지 내에서만 접근 가능**
        - **private 		     : 같은 클래스 내부에서만 접근 가능**
    
    ```java
    class BankAccount1 {
    	int balance = 100000; // 캡슐화 적용 x
    }
    
    class BankAccount2 {
    	private int balance = 100000; // 캡슐화 적용 o
    	
    	/*
    	 
    	캡슐화를 적용한 경우 balance 필드는 private으로 선언되어 클래스 외부에서 직접 접근할 수 없게 된다. 
    	대신 deposit와 withdraw 같은 공개 메서드를 통해 잔액을 변경할 수 있으며
    	이 메서드들은 잘못된 금액이 계좌에 설정되지 않도록 검증 로직을 포함할 수 있다.
    	
    	 */
    	void deposite(int amount) { // 입금
    		if (amount > 0) { 
    			balance += amount;
    		}
    	}
    
    	void withdraw(int amount) { // 출금
    		if (amount > 0 && balance >= amount) {
    			balance -= amount;
    		}
    	}
    	int getBalance() { // private로 캡슐화 적용한 변수를 getter로 visible 가능하게 함
    		return balance;
    	}
    }
    
    public class EncapsulationEx01 {
    
    	public static void main(String[] args) {
    
    		/*
    		 * 
    		 * - 캡슐화를 적용하지 않음
    		 * 
    		 * 잔액은 공개적으로 접근 가능하며 외부 코드에서 임의로 잔액을 변경할 수 있다. 실수 혹은 악의적인 의도로 잘못된 금액을 설정할 위험을
    		 * 내포한다.
    		 * 
    		 */
    		BankAccount1 bankAccount1 = new BankAccount1();
    		bankAccount1.balance = -200000;
    		System.out.println(bankAccount1.balance);
    		System.out.println();
    		/*
    		 * 
    		 * - 캡슐화 적용
    		 * 
    		 * 캡슐화는 계좌의 잔액을 보호하고 유효하지 않은 금액이 계좌에 추가되거나 제거되는 것을 방지한다. BankAccount 클래스의 내부 구현을
    		 * 나중에 변경하더라도 이 클래스를 사용하는 코드에는 영향을 주지 않는다. 예를 들어 잔액 로깅 메커니즘을 추가하거나 특정 조건에서만 금액을
    		 * 추가/제거할 수 있도록 변경할 수 있다. 이는 유지보수성과 확장성을 크게 향상시킨다.
    		 * 
    		 */
    		BankAccount2 bankAccount2 = new BankAccount2();
    		// bankAccount2.balance = - 300000; // is not visible
    		// System.out.println(bankAccount2.balance);
    		bankAccount2.deposite(-1);
    		System.out.println(bankAccount2.getBalance());
    		bankAccount2.withdraw(300000);
    		System.out.println(bankAccount2.getBalance());
    	}
    
    }
    ```
    
    ```java
    // 클래스에서 접근제어자
    // public class PublicC{}       // (가능) 단, 하나의 클래스 파일에는 하나의 public 클래스만 존재 가능 (이미 밑에서 사용하고 있어서 오류뜸)
    class DefaultC{}                // (가능)
    // protected class ProtectedC{} // (불가능) class는 public, default 접근제어자만 사용 가능
    // private class privateC{}     // (불가능) class는 public, default 접근제어자만 사용 가능 
    
    public class EncapsulationEx03 {
    	// 필드에서 접근제어자
    	public int publicV;        // 프로젝트 전체에서 접근 가능
    	int defaultV;   		       // 같은 패키지에서 접근가능
    	protected int protectedV;  // 상속관계에서 접근 가능
    	private int privateV;      // 같은 클래스 내부에서만 접근 가능
    
    	// 메서드에서 접근제어자
    	public void publicM(){	}	   	// 프로젝트 전체에서 접근 가능
    	void defaultM(){}				      // 같은 패키지에서 접근가능
    	protected void protectedM(){}	// 상속관계에서 접근 가능
    	private void privateM(){}		  // 같은 클래스 내부에서만 접근 가능
    }
    ```
    
    - **Getter & Setter**
        - 캡슐화는 객체의 데이터를 외부에서 직접 접근하는 것을 제한하여 객체의 상태를 보호하고
        객체와 상호작용하는 방식을 제어하는 객체 지향 프로그래밍의 핵심 원칙 중 하나이다.
        Getter와 Setter 메서드를 통해 이를 구현할 수 있다.
        - getter : 접근 , setter : 수정
        
        ```java
        class Unit {
        	
        	private String name;
        	private int hp;
        	
        	// getter : private 변수를 외부로 반환하는 메서드
        	String getName() { // 변수명 앞에 get을 추가하여 메서드 이름을 작성함
        		return name;
        	}
        	// setter : private 변수를 외부로 수정하는 메서드
        	void setName(String name) { // 변수명 앞에 set을 추가하여 메서드 이름을 작성함
        		// this를 생략할 수 없음 
        		// java에서는 this를 현재 객체를 가리키는 참조로서 멤버 변수인 name과 파라미터 name을 구분하기 위해 써야함
        		this.name = name; 
        	}
        	
        	int getHp() {
        		return hp;
        	}
        	void setHp (int hp) {
        		this.hp = hp;
        	}
        }
        
        public class EncapsulationEx02 {
        
        	public static void main(String[] args) {
        		
        		Unit unit = new Unit();
        		
        		// unit.name = "tank";
        		// unit.hp = 100;
        		
        		// setter를 사용해 private 필드를 수정
        		unit.setName("tank");
        		unit.setHp(100);
        		
        		// System.out.println(unit.name);
        		// System.out.println(unit.hp);
        		
        		// getter를 사용해 private 필드를 반환
        		System.out.println(unit.getName());
        		System.out.println(unit.getHp());
        		System.out.println();
        ```

- **상속 (Inheritance)**
    - 클래스 사이 부모 자식 관계를 설정해서 프로퍼티(필드, 변수) 및 메서드를 상속 및 확장하여 사용할 수 있다.
    
      **[ 호칭 ]**
    
      **`부모 클래스, 상위 클래스, 슈퍼 클래스, 기반 클래스`**
    
      **`----------------------------------------------------`**
    
      **`자녀 클래스, 하위 클래스, 서브 클래스, 파생 클래스`**
    
      **[ 형식 ]**
    
      **`class 자녀클래스 extends 부모클래스 {}`**
    
    - 모든 클래스는 Object클래스를 상속받는다.
    - 단일 상속만 가능하다. ( 다중상속 불가 )
    - Ex) Class A extends B,C,D,E (불가능)
    
    ```java
    class Beginner {
    	
    	int level = 1;
    	int power = 10;
    	int dex   = 10;
    	int life  = 10;
    	int mana  = 10;
    	
    	void levelUp() {
    		this.level++;
    		this.power += 10;
    		this.dex   += 10;
    		this.life  += 10;
    		this.mana  += 10;
    	}
    	
    	void printStatus() {
    		System.out.println("level : " + this.level);
    		System.out.println("power : " + this.power);
    		System.out.println("dex : " + this.dex);
    		System.out.println("life : " + this.life);
    		System.out.println("mana : " + this.mana);
    		System.out.println();
    	}
    }
    
    class Warrior1 extends Beginner {
    	
    }
    class Wizard1 extends Beginner {
    	
    }
    public class InheritanceEx01 {
    
    	public static void main(String[] args) {
    
    		Warrior1 warrior1 = new Warrior1();
    		warrior1.printStatus();
    		warrior1.levelUp();
    		warrior1.levelUp();
    		warrior1.levelUp();
    		warrior1.printStatus();
    		
    		System.out.println("\n=================\n");
    		
    		Wizard1 wizard1 = new Wizard1();
    		wizard1.printStatus();
    		wizard1.levelUp();
    		wizard1.printStatus();
    	}
    
    }
    ```
    
    - **메서드 오버라이딩 (Method Overriding)**
        - 부모클래스로부터 상속 받은 메서드를 재정의(overriding)하여 사용한다.
            - 부모클래스의 메서드와 이름이 같고 구현되는 기능이 다르다.
            - 객체지향 기법의 다형성(polymorphism)을 구현하는 핵심기능이다.
            - 메서드 오버로딩과 혼용되기 쉽다.
              
            **메서드 오버라이딩** : 부모클래스와 자녀클래스 사이의 메서드이름이 같음(재정의)
          
            **메서드 오버로딩** : 같은 클래스 안에서 메서드이름이 같음(중복 정의)
        
        ```java
        class Warrior2 extends Beginner{
        	
        	// 메서드 오버라이딩 (메서드 재정의)
        	void levelUp() {
        		this.level++;
        		this.power += 1000;
        		this.dex   += 100;
        		this.life  += 1000;
        		this.mana  += 5;
        	}
        	// Warrior2 클래스만의 메서드 추가
        	void dash() {
        		System.out.println("\n warrior2 dash! \n");
        	}
        
        }
        class Wizard2 extends Beginner{
        	
        	// 메서드 오버라이딩 (메서드 재정의)
        		void levelUp() {
        			this.level++;
        			this.power += 20;
        			this.dex   += 100;
        			this.life  += 100;
        			this.mana  += 3000;
        		}
        	// Wizard2 클래스만의 메서드 추가
        		void fireball() {
        			System.out.println("\n wizard2 fireball! \n");
        		}
        }
        
        public class InheritanceEx02 {
        
        	public static void main(String[] args) {
        
        		Warrior2 warrior2 = new Warrior2();
        		warrior2.printStatus();
        		warrior2.levelUp();
        		warrior2.levelUp();
        		warrior2.levelUp();
        		warrior2.printStatus();
        		
        		warrior2.dash();
        		
        		System.out.println("\n=================\n");
        		
        		Wizard2 wizard2 = new Wizard2();
        		wizard2.printStatus();
        		wizard2.levelUp();
        		wizard2.printStatus();
        		wizard2.fireball();
        	}
        
        }
        ```
        
	   > **다형성 vs 메서드 오버라이딩**
    > 
	   >  다형성 : 하나의 객체가 여러가지 타입을 가질 수 있는 것
	   >  다형성은 오버라이딩보다 큰 개념
	   >  오버라이딩은 다형성의 한 형태로 상속 관계에서 발생하는 매커니즘
	    

     - **this, super**
    - this : **자신**의 객체
        
        super : **부모클래스**의 객체
        
    - this() : **자신**의 생성자
        
        super() : **부모클래스**의 생성자
        
    - ex)
        
        this.testMethod() : 자신의 메서드 호출
        
        testMethod()	: 자신의 메서드 호출
        
        super.testMethod() : 부모의 메서드 호출
        
    
    ```java
    class Parent{
    	
    	String name = "p";
    	int age = 70;
    	
    	Parent(){
    		this("무명",-1); // Parent(String name, int age) 추가 생성자가 먼저 출력됨
    		System.out.println("(P-기본) 부모클래스 기본생성자 실행");
    	}
    	Parent(String name, int age){
    		System.out.println("(P-기본) 부모클래스 생성자 오버로딩 실행");
    	}
    	
    	void testMethod() {
    		System.out.println("(P) 부모클래스이 테스트 메서드");
    	}
    	
    }
    
    class Child extends Parent{
    	
    	String name = "c";
    	int age = 40;
    	
    	Child(){
    		// super(); // 부모 클래스의 기본생성자를 실행 (기본적으로 생략되어 있음)
    		super("부모2", 80);
    		System.out.println("(C-기본) 자녀클래스 기본생성자 실행");
    	}
    	Child (String name, int age){
    		// this();         // 부모 오버로딩, 자녀 기본, 자녀 오버로딩 출력
    		// super();        // 부모 오버로딩, 부모 기본, 자녀 오버로딩 출력
    		super("앨런튜링",70); // 부모 오버로딩, 자녀 오버로딩 출력
    		System.out.println("(C-기본) 자녀클래스 생성자 오버로딩 실행");
    	}
    	
    	// 오버라이딩 (상속 관계)
    	void testMethod() {
    		System.out.println("(C) 자녀클래스이 테스트 메서드");
    	}
    	void callMethod() {
    		
    		System.out.println(this.name);	// 자신의 변수
    		System.out.println(this.age);
    		
    		System.out.println(super.name);	// 부모의 변수
    		System.out.println(super.age);
    		
    		System.out.println();
    		testMethod();       // 자신의 testMethod(); 호출
    		this.testMethod();  // 자신의 testMethod(); 호출
    		super.testMethod(); // 부모의 testMethod(); 호출
    		
    	}
    	
    }
    
    public class InheritanceEx03 {
    
    	public static void main(String[] args) {
    
    		new Parent();
    		System.out.println();
    		
    		new Parent("부모",70);
    		System.out.println();
    		
    		//(P-기본) 부모클래스 생성자 실행 이 따라옴
    		new Child();
    		System.out.println();
    		
    		new Child("자녀", 40);
    		System.out.println();
    		
    		Child object = new Child("자녀", 20);
    		object.callMethod();
    	}
    
    }
    ```

 - **추상화  (Abstraction)**
    - 부모클래스를 상속받은 자식클래스에게 반드시 구현해야하는 메서드를 잊지않고 만들도록 '강제'하는 클래스
    - abstract 키워드를 클래스 앞에 붙여주어 추상클래스를 생성한다.
    - abstract 키워드를 메서드 앞에 붙여주어 추상메서드를 생성한다.
    - 추상메서드 뒤에 '{}' 아닌 ';'을 붙인다.
    - 추상메서드는 추상클래스 안에서 선언만 하고 실질적인 메소드의 추상클래스를 상속받은 일반 자녀클래스에서 진행한다.
    - 다중 상속이 불가능하다.
    - 추상 클래스는 객체를 생성 할 수 없다.
    
    ```java
    // 일반 클래스
    class NormalClass {
    	
    	int var; // 필드
    	
    	NormalClass (){} // 생성자
    	
    	void method() {} // 메서드
    	
    }
    
    // 추상 클래스
    abstract class AbstractClass {
    	
    	// 필드
    	int var1;
    	String var2;
    	double var3;
    	
    	// 추상메서드 (핵심!)
    	abstract void abstractMethod1(); // 추상화는 책의 목차라고 생각하기 > 목차는 내용이 있으면 안됨
    	abstract void abstractMethod2();
    	abstract void abstractMethod3();
    	abstract void abstractMethod4();
    	abstract void abstractMethod5();
    	
    	// 일반 메서드
    	void method1() {
    		System.out.println("일반 메서드1");
    	}
    	void method2() {
    		System.out.println("일반 메서드12");
    	}
    	void method3() {
    		System.out.println("일반 메서드3");
    	}
    	
    }
    // 추상클래스를 상속받은 클래스
    class TestClass1 extends AbstractClass{
    
    	// 추상 메서드는 반드시 구현해야 한다.
    	@Override
    	void abstractMethod1() {
    		
    	}
    
    	@Override
    	void abstractMethod2() {
    		
    	}
    
    	@Override
    	void abstractMethod3() {
    		
    	}
    
    	@Override
    	void abstractMethod4() {
    		
    	}
    
    	@Override
    	void abstractMethod5() {
    	
    	}
    	
    }
    public class AbstractionEx01 {
    
    	public static void main(String[] args) {
    		
    		// 추상클래스는 객체를 생성할 수 없다.
    		// new AbstractClass();
    		
        // 상속받은 추상 클래스의 필드, 일반 메서드, 구현한 추상 메서드 사용 가능
    		TestClass1 testclass1 = new TestClass1();
    		
    	}
    	
    }
    ```
    
    - **인터페이스** **(매우 중요)**
        - 인터페이스는 추상클래스보다 더 추상화된 구문
        - 실제 구현된 것이 전혀 없는 기본 설계도 (자바 8이후 부터 default 메서드 static 메서드추가)
        - 미리 정해진 규칙에 맞게 구현하도록 '표준'을 제시하는데 사용한다.
        - 클래스는 인터페이스를 상속(extends)받을 수 없고 인터페이스는 클래스를 상속(extends)받을 수 없다.
        - 클래스는 클래스끼리 인터페이스는 인터페이스끼리 상속(extends)시킬 수 있다.
        - 클래스는 다중 상속(extends)을 허용하지않지만 인터페이스는 다중구현(implements)을 허용한다.
        
        **[ 인터페이스의 요소 ]**
        
        - **상수** : 인터페이스에서 제공하는 지정된 데이터
        - **추상메소드** : 추상메서드는 추상클래스 안에서 선언만 하고 실질적인 메소드의 추상클래스를 상속받은 일반 자녀클래스에서 진행한다.
        - **디폴트(일반)메소드** : 인터페이스에서도 메서드 구현이 가능하지만 구현한 클래스에서는 강제성이 없다.
        - **정적(static)메소드** : 객체가 없어도 인터페이스 만으로도 사용이 가능한 메서드
        
        ```java
        // 인터페이스
        interface BBB {
        	
        	// 정적 상수
        	static final int A = 100;
        	static final int B = 100;
        	static final int C = 100;
        	
        	// 추상메서드
        	abstract void test3();
        	abstract void test4();
        	
        	// void test5() {} 사용 X > 개정
        	// 일반 메서드 (메서드 앞에 default 키워드를 작성한다)
        	default void test5() {
        		System.out.println("default 메서드");
        	}
        	
        	// 정적 메서드 (메서드 앞에 static 키워드를 작성한다.)
        	static void test6() {
        		System.out.println("static 메서드");
        	}
        	
        }
        // 인터페이스에서는 abstract키워드를 생략할 수 있다.
        interface CCC {
        	void test7();	
        	void test8();
        	void test9();
        }
        // implements 키워드를 사용하여 인터페이스를 '구현'한다. (상속x)
        class DDD implements BBB, CCC{	// 인터페이스는 다중구현이 가능하다
        
        	@Override
        	public void test3() {}
        	@Override
        	public void test4() {}
        	@Override
        	public void test7() {}
        	@Override
        	public void test8() {}
        	@Override
        	public void test9() {}
        	
        }
        // 상속과 동시에 인터페이스 구현이 가능하다. (단, extends 인터페이스는 안됨)
        class EEE extends NormalClass implements BBB,CCC{
        // NormalClass는 클래스 BBB, CCC는 인터페이스 
        	@Override
        	public void test7() {}
        	@Override
        	public void test8() {}
        	@Override
        	public void test9() {}
        	@Override
        	public void test3() {}
        	@Override
        	public void test4() {}
        	
        }
        ```
        
        **+) 인터페이스 타입 객체 생성**
        
        ```java
        // 인터페이스
        public interface CreditCard { // 어떤 메서드(행동)를 사용할 건지에 대한 목차 
        
        	void purchasing();          // 구매결제
        	void onlinePayments();      // 온라인 결제
        	void cashAdvance();         // 현금인출
        	void automaticPayments();   // 자동결제 설정
        	void rewardPoints();        // 적립 포인트
        	void milesAccumulation();   // 마일리지 적립
        	void insuranceBenefits();   // 보험 혜택
        	void emergencyServices();   // 긴급 서비스
        	void installmentPatments(); // 할부 결제
        }
        ```
        
        - 클래스가 구현한 인터페이스의 타입의 참조형으로 이를 구현한 클래스의 객체를 생성할 수 있다.
        - 인터페이스를 자료형으로 구현할 경우 프로그램은 더욱 유연해진다.
        
          **`[ 방법 ]`**
        
          **`인터페이스 변수명 = new 클래스명();`**
        
        ```java
        // 인터페이스를 구현하는 클래스
        class HyundaiCard implements CreditCard{
        
        	@Override
        	public void purchasing() {}
        	@Override
        	public void onlinePayments() {}
        	@Override
        	public void cashAdvance() {}
        	@Override
        	public void automaticPayments() {}
        	@Override
        	public void rewardPoints() {}
        	@Override
        	public void milesAccumulation() {}
        	@Override
        	public void insuranceBenefits() {}
        	@Override
        	public void emergencyServices() {}
        	@Override
        	public void installmentPatments() {}
        	}
        
        public class AbstractionEx03 {
        
        	public static void main(String[] args) {
        		
        		HyundaiCard hyundaiCard1 = new HyundaiCard(); 
        		
        		// 인터페이스 타입으로 객체를 생성 (좀 더 유연한 구조)
        		CreditCard creditCard1 = new HyundaiCard(); 
        		
        		// 예시 1
        		ArrayList<Integer> list1 = new ArrayList<Integer>();
        		List<Integer> list2 = new ArrayList<Integer>();
        		
        		// 예시 2
        		HashMap<String, String> map1 = new HashMap<String,String>();
        		Map<String, String> map2 = new HashMap<String,String>();
        				
        	}
        	
        }
        ```
        
        **+) 인터페이스를 구현하는 클래스**
        
        - 인터페이스와 인터페이스를 구현하는 클래스를 한 곳에 쓰는 것보다 분리해서 쓰기
        - 인터페이스를 구현하는 클래스는 인터페이스 이름 + Impl(implements)를 추가하여 클래스명을 작성
            
            ex) AdminOrderDAO     > AdminOrderDAOImpl
            
            AdminGoodsService > AdminGoodsServiceImpl
            
        - 클래스 생성시 [interface]에서 Add클릭 > 구현할 인터페이스를 검색하여 선택 후 클래스 생성

 - **다형성 (polymorphism)**
    - 다형성은 같은 인터페이스나 부모 클래스를 상속받은 여러 객체가 그 인터페이스나 부모 클래스의 참조 타입으로 사용될 때
    각 객체의 실제 타입에 따라 서로 다른 방식으로 동작할 수 있게 하는 객체 지향의 핵심 원칙 중 하나이다.
    - 다형성을 구현하기 위해서는 다형성을 구현할 메소드가 포함된 모든 클래스가 같은 부모 클래스 혹은 인터페이스를 가져야 한다.
    **(부모와 자식이 1:1 관계)**
    - 부모 클래스 혹은 인터페이스와 자식 클래스에 같은 메소드가 있어야 하며 자식 클래스는 이 메소드를 **반드시 override 하여 사용**해야 한다.
    (자식클래스는 부모 메서드 재정의)
    - 부모 클래스 혹은 인터페이스 타입에 자식 클래스 타입을 대입시켜 다형성이 구현된 메소드를 실행한다.
    
    ```java
    // 부모클래스 
    class Shape {
    	// 자녀클래스가 상속받아서 사용할 메서드 정의
    	void draw() {}
    	
    }
    
    class Line extends Shape {
    	
    	// 부모의 메서드를 재정의
    	void draw() {
    		System.out.println("선을 그린다.");
    	}
    
    }
    
    class Circle extends Shape{
    	// 부모의 메서드를 재정의
    	void draw() {
    		System.out.println("원을 그린다.");
    	}
    }
    class Rect extends Shape{
    	// 부모의 메서드를 재정의
    	void draw() {
    		System.out.println("사각형을 그린다.");
    	}
    }
    
    public class PolymorphismEx02 {
    
    	public static void main(String[] args) {
    
    		// 부모클래스의 타입으로 배열을 생성하고 자식클래스로 배열의 요소를 추가
    		
    		Shape[] shape = new Shape[3];
    		shape[0] = new Line();		// 업캐스팅 (upcasting)
    		shape[1] = new Circle();
    		shape[2] = new Rect();
    		
    		// draw(); 메서드의 이름은 한 개이지만 구현되는 기능은 다양함 // 메서드 재정의를 통해 1:1 관계를 만듬
    		shape[0].draw();			// 다형성 : 모양이 많음
    		shape[1].draw();
    		shape[2].draw();
    		
    		// 참고자료 1)
    		ArrayList<Object> test1 = new ArrayList<Object>();
    		test1.add(100);				// 정수 데이터
    		test1.add("문자열데이터");		// 문자열 데이터
    		test1.add(true);	 		// boolean 데이터
    		test1.add(new Circle()); 	// Circle 데이터 // 모든 클래스는 object를 상속받음 
    		test1.add(new Line());		// Line 데이터
    		
    		// 참고자료 2)
    		HashMap<String, Object> test2 = new HashMap<String, Object>();
    		test2.put("data1", 100);
    		test2.put("data2", "문자열데이터");
    		test2.put("data3", true);
    		test2.put("data4", new Circle());
    		test2.put("data5", new Line());
    		
    	}
    
    }
    ```
    
    - **클래스의 형변환 (업다운 캐스팅)**
        - 자바에서 업캐스팅(Upcasting)과 다운캐스팅(Downcasting)은 객체의 형변환을 다룬다.
        - 이러한 형변환은 상속 관계에 있는 클래스 사이에서 발생하며
        업캐스팅과 다운캐스팅을 이해하기 위해서는 먼저 상속 관계에 있는 클래스가 있다고 전제해야 한다.
        - 부모클래스는 객체를 생성 할때 부모클래스에 있는 자원만 생성된다.
        - 자녀클래스는 객체를 생성 할때 부모클래스와 자녀클래스의 자원이 모두 생성된다. (1+1)
        - 그러므로 자녀클래스는 부모클래스의 타입으로 객체를 생성 할 수 있고 부모클래스는 자녀클래스의 타입으로 객체를 생성 할 수 없다.
        
        ```java
        class Base {
        	
        	void baseMethod() {
        		
        	}
        }
        
        class Sub extends Base{
        	
        	void subMethod() {
        		
        	}
        }
        
        public class PolymorphismEx01 {
        
        	public static void main(String[] args) {
        
        		Base base1 = new Base();	// 부모클래스 객체 생성
        		base1.baseMethod();			// 자신의 메서드 사용
        		
        		Sub sub1 = new Sub();		// 자녀클래스 객체 생성
        		sub1.baseMethod();			// 상속받은 메서드 사용
        		sub1.subMethod(); 			// 자신의 메서드 사용
        		
        		System.out.println("\n================\n");
        		
        		// Sub base2 = new Base();	// 자녀타입으로 부모 객체 생성 불가능
        		                            
        		/*
        		  
        			# 업캐스팅 (Upcasting)
        			
        			- 자녀 클래스의 객체를 부모 클래스 타입으로 형변환하는 것을 의미한다. 
        			- 명시적으로 형변환 타입을 적지 않아도 된다.
        			- 객체의 타입이 부모형태이기 때문에 부모 클래스가 가지고 있는 메서드만 사용가능하다.
        		 
        		 */
        		Base sub2 = new Sub();
        		sub2.baseMethod(); 			// 부모타입이기 때문에 부모의 메서드만 사용가능
        		
        		/*
        		  
        			# 다운캐스팅 (Downcasting)
        			
        			- 업캐스팅된 객체를 다시 원래의 자녀 클래스 타입으로 형변환하는 것을 의미한다.
        			
        			- 명시적으로 형변환을 타입을 적어야 한다.
        			
        			- 부모타입으로 만들어진 자녀클래스의 타입을 다시 자녀클래스로 형변환 할 경우 다시 자녀클래스로 사용 가능하므로 
        			  업캐스팅을 통해 숨겨진 서브 클래스의 속성이나 메소드에 다시 접근할 수 있다.
        	 		   
        	 		- 다운캐스팅은 타입 체크를 통해 안전하게 수행되어야 하며 잘못된 다운캐스팅은 ClassCastException을 발생시킬 수 있다.
        		
        		 */
        		Sub sub3 = (Sub) sub2;
        		sub3.baseMethod();	// 부모의 메서드 사용
        		sub3.subMethod();	  // 자신의 메서드도 사용가능
        		
        		// [참고] 객체 변수 + instanceof + 타입 : 형변환이 가능한지 확인하는 메서드
        		if(sub1 instanceof Base) {
        			System.out.println("형변환 가능 1");
        		}
        		else {
        			System.out.println("형변환 불가능1");
        		}
        		
        		if(base1 instanceof Sub) {
        			System.out.println("형변환 가능 1");
        		}
        		else {
        			System.out.println("형변환 불가능1");
        		}
        	}
        
        }
        
        ```

- **솔리드 (객체 지향 설계) > SRP, OCP, LSP, ISP, DIP**
    - **SRP (Single Responsibility Principle, 단일 책임 원칙)**
        - 클래스는 하나의 기능만을 가지고 그 기능을 완전히 캡슐화 해야 한다는 것을 의미한다.
        - 만약 클래스가 여러가지 작업을 책임져야 한다면 이는 버그 발생 가능성을 높인다.
        많은 기능 중 한 가지를 변경할 때 개발자가 모르는 사이에 다른 기능에 영향을 줄 수 있기 때문이다.
        - SRP의 목적은 **기능들을 분리**하는 것이고 이로 인해 개발자가 어떤 기능을 수정하더라도 연관 없는 기능에는 영향이 가지 않게 되는 기대 효과가 있다.
        - 이 원칙을 따르면 코드의 재사용성과 유지보수성이 향상된다.
        
        ```java
        
        /*
        
        	# AsIs Model
        
        	해당 클래스는 사용자의 요청정보를 받아들여 페이지를 이동시키며 
        	암호화 , 인증 , 메일전송등 인증 서비스업무 등의 두 가지 책임을 가지고 있다.
        
        */
        class SRP_BadCase{
        	
        	void forwardMain() {
        		System.out.println("메인화면으로 이동");
        	}
        	void forwardAuthentication() {
        		System.out.println("인증화면으로 이동");
        	}
        	void forwardPayment() {
        		System.out.println("결제화면으로 이동");
        	}
        	
        	void cryptPassword() {
        		System.out.println("비밀번호 암호화 로직");
        	}
        	void findUserPasswordUnchanged() {
        		System.out.println("비밀번호를 변경하지 않은지 90일이 경과한 회원을 검색하는 로직");
        	}
        	void sendMailForAuthentication() {
        		System.out.println("인증을 위한 이메일 전송 로직");
        	}
        }
        /*
        	# ToBe Model
        
        	SRP_Controller 클래스는 사용자의 요청정보를 받아들여 페이지를 이동시키는 단일 책임을 가지고
        	SRP_Service 클래스는 암호화 , 인증 , 메일전송등 인증 서비스업무 등의 단일 책임을 가집니다. 
        	이렇게 각 클래스가 하나의 책임만을 가지므로 SRP를 준수하게 된다. 
        	코드의 재사용성과 유지보수성이 향상되며 미래의 변경 사항이 한 클래스에 국한되어 다른 클래스에 영향을 미치지 않게 된다.
        
         */
        
        class SRP_Controller {
        	
        	void forwardMain() {
        		System.out.println("메인화면으로 이동");
        	}
        	void forwardAuthentication() {
        		System.out.println("인증화면으로 이동");
        	}
        	void forwardPayment() {
        		System.out.println("결제화면으로 이동");
        	}
        }
        class SRP_Service {
        	
        	void cryptPassword() {
        		System.out.println("비밀번호 암호화 로직");
        	}
        	void findUserPasswordUnchanged() {
        		System.out.println("비밀번호를 변경하지 않은지 90일이 경과한 회원을 검색하는 로직");
        	}
        	void sendMailForAuthentication() {
        		System.out.println("인증을 위한 이메일 전송 로직");
        	}
        }
        ```
        
    
    - **OCP (Open/Closed Principle, 개방-폐쇄 원칙)**
        - 소프트웨어 엔티티(클래스, 모듈, 함수 등)는 확장에는 열려 있어야 하고, 수정에는 닫혀 있어야 한다는 원칙이다.
        - 이 원칙을 따르면 **기존의 코드를 변경하지 않고도 시스템의 기능을 확장**할 수 있다.
        - 즉 새로운 기능을 추가하고 싶을 때 기존 코드를 수정하는 대신 기존 코드를 확장 만으로 원하는 기능을 추가할 수 있어야 한다.
        
        ```java
        /*
        
        	# AsIs Model
        
        	OCP_BadCase 클래스는 powerpoint와 pdf 보고서를 생성할 수 있다. 
        	하지만 새로운 보고서 형식(예: powerpoint , pdf)을 추가하려면 makingReport 메소드를 수정해야 한다.
        	이는 OCP를 위반한다.
        
        */
        class OCP_BadCase{
        	
        	void makingReport(String reportType) {
        		
        		if (reportType.equals("excel")){
        			System.out.println("엑셀문서 리포트 가능");
        		}
        //		else if (reportType.equals("powerpoint")) {
        //		System.out.println("한글문서 리포트 가능");
        //		}
        		else if  (reportType.equals("hwp")) {
        			System.out.println("한글문서 리포트 가능");
        		}
        //		else if  (reportType.equals("pdf")) {
        //		System.out.println("PDF 리포트 가능");
        //		}
        		else if  (reportType.equals("docx")) {
        			System.out.println("워드문서 리포트 가능");
        		}
        	}
        }
        
        /*
           
           # ToBe Model
          
        	새로운 보고서 형식을 추가하고 싶을 때 MakeReport 인터페이스를 구현하는 새 클래스를 만들기만 하면 된다. 
        	기존 코드(MakeReport 인터페이스와 기존의 구현 클래스)를 수정할 필요가 없으므로 OCP 원칙을 준수하게 된다.
        
        */
        interface MakeReport{
        	void makingReport();
        }
        class ExcelMakeReport implements MakeReport{
        
        	@Override
        	public void makingReport() {
        		System.out.println("엑셀문서 리포트 기능 ");
        	}
        	
        }
        class HwpMakeReport implements MakeReport{
        
        	@Override
        	public void makingReport() {
        		System.out.println("한글문서 리포트 기능 ");
        	}
        	
        }
        class DocxMakeReport implements MakeReport{
        
        	@Override
        	public void makingReport() {
        		System.out.println("워드문서 리포트 기능 ");
        	}
        	
        }
        class PowerpointMakeReport implements MakeReport{
        
        	@Override
        	public void makingReport() {
        		System.out.println("파워포인트문서 리포트 기능 ");
        		
        	}
        	
        }
        class PdfMakeReport implements MakeReport{
        
        	@Override
        	public void makingReport() {
        		System.out.println("PDF문서 리포트 기능 ");
        		
        	}
        	
        }
        ```
        
    - **LSP (Liskov Substitution Principle, 리스코프 치환 원칙)**
        - **하위 타입은 언제나 상위 타입으로 대체**될 수 있어야 한다는 원칙이다.
        - 즉 프로그램에서 부모 클래스의 인스턴스 대신에 자식 클래스의 인스턴스를 사용해도 프로그램의 정확성이 변하지 않아야 합니다.
        
        ```java
        /*
        
        	# AsIs Model
        	
        	LSP_BadCase 클래스에서 eat()메서드와 , sleep() 메서드는 모든 사람에게 적용 될 수 있지만 
        	excercise() 메서드는 모든 사람에게 적용이 될 수 없을 수도 있음에도 불구하고 항상 운동을 하도록 설정되어있다.
        	해당 클래스를 상속받는 자식클래스에서는 예상치 못한 결과가 발생할 수 있으며 이는 LSP 원칙을 위반한다. 
        	
        
        */
        class LSP_BadCase{
        	
        	void eat() {
        		System.out.println("먹는다");
        	}
        	void sleep() {
        		System.out.println("잠을 잔다.");
        	}
        	void exercise() { // 모든 사람이 운동을 하지는 않는다.
        		System.out.println("운동을 한다.");
        	}
        }
        
        class Lee extends LSP_BadCase {}// 운동을 하는 사람
        class Kim extends LSP_BadCase {}// 운동을 하지 않는 사람	
        /*
        
        # ToBe Model
        
        	Person 클래스에서는eat()메서드와 , sleep() 메서드만 구현을 하고 있고
        	ExercisePerson 클래스에는 excercise() 운동을 하는 고유한 방법을 가지고 있다. 
        	이로써 LSP를 준수할수 있게 되어 운동을 하지 않는 자녀클래스도 부모클래스로 대체할수 있게 만든다.
        	
        
        */
        class Person {
        	
        	void eat() {
        		System.out.println("먹는다");
        	}
        	void sleep() {
        		System.out.println("잠을 잔다.");
        	}
        }
        class ExcercisePerson extends Person {
        	void exercise() { 
        		System.out.println("운동을 한다.");
        	}
        }
        
        class Choi extends ExcercisePerson{}	// 운동을 하는 사람
        class Park extends Person {}		     	// 운동을 안하는 사람
        
        public class LSP {
        
        	public static void main(String[] args) {
        		
        		LSP_BadCase lee = new Lee();
        		lee.exercise();    // 운동을 한다
        		
        		LSP_BadCase kim = new Kim();
        		kim.exercise();    // 운동을 하지 않음에도 운동을 하는 메서드가 적용 (LSP 위반)
        		
        		System.out.println("\n================\n");
        
        		ExcercisePerson choi = new Choi();
        		choi.exercise();	// 운동을 하는 메서드가 존재하고 객체의 타입이 부모, 자녀가 동일하게 수행됨
        		
        		Person park = new Park();
        		// park.exercise(); 존재 X // 운동을 하는 메서드가 없음
        		
        	}
        
        }
        ```
        
    - **ISP (Interface Segregation Principle, 인터페이스 분리 원칙)**
        - 클라이언트가 자신이 사용하지 않는 메서드에 의존하지 않아야 한다는 원칙이다.
        즉 한 개의 일반적인 인터페이스보다는 **여러 개의 구체적인 인터페이스**가 낫다는 것을 의미한다.
        - 클래스가 서로 관계없는 기능들을 가지고 있다면 낭비가 되고 예상치 못한 버그를 발생 시킬 수 있다.
        - 클래스는 해당 역할에 대한 액션만 수행해야 하고 이를 제외한 다른 액션은 완전히 삭제하거나 다른 곳(다른 클래스 등)으로 이동 시켜야 한다.
        - 이 원칙은 인터페이스를 작고 잘 정의된 단위로 분리하여 클라이언트가 필요로 하는 메서드만을 구현하도록 강제한다.
        
        ```java
        /*
        	    # AsIs Model
        	    
        		ISP_BadCase 인터페이스는 accelerate , deAccelerate , openSunroof ,  remoteStartUp 메서드를 정의한다. 
        		특정 클래스는 위 4가지 메서드를 모두 구현할 수 있지만 
        		특정 클래스는 openSunroof ,  remoteStartUp 메서드를 구현을 하지 않을 수도 있다.
        		따라서 특정 클래스는 자신이 사용하지 않는 openSunroof ,  remoteStartUp 메서드에 의존하게 되며 이는 ISP를 위반한다.
        		
         */
        interface ISP_BadCase{
        	
        	void accelerate();
        	void deaccelerate();
        	void openSunroof();
        	void remoteSrartUp();
        }
        // sunRoof가 없는 경우에도 sunRoof를 구현해야 함
        class Car1 implements ISP_BadCase {
        
        	@Override
        	public void accelerate() {}
        
        	@Override
        	public void deaccelerate() {}
        
        	@Override
        	public void openSunroof() {}
        
        	@Override
        	public void remoteSrartUp() {}
        	
        }
        // remoteStartUp이 없는 경우에도 remoteStartUp을 구현해야함
        class Car2 implements ISP_BadCase{
        
        	@Override
        	public void accelerate() {}
        
        	@Override
        	public void deaccelerate() {}
        
        	@Override
        	public void openSunroof() {}
        
        	@Override
        	public void remoteSrartUp() {}
        	
        }
        
        /*
          
           # ToBe Model
           
        	Car 인터페이스는 accelerate , deAccelerate 메서드를 각각 정의한다.
        	OpenRoofAble 인터페이스는 Car 인터페이스를 모두 구현하고 openSunroof 메서드를 정의한다. 
        	RemoteStartUpAble 인터페이스는 Car 인터페이스를 모두 구현하고 remoteStartUp 메서드를 정의한다. 
        	
        	이렇게 하면 각 클라이언트는 자신이 필요로 하는 메서드에만 의존하게 되므로 ISP 원칙을 준수하게 된다.
        
        	ISP를 준수함으로써 시스템의 유연성과 재사용성이 향상되며 변경에 대한 영향을 최소화할 수 있다.
        	
         */
        
        interface Car{
        	void accelerate();
        	void deAccelerate();
        }
        interface OpenRoofAble extends Car {
        	void openSunroof();
        }
        interface RemoteStartUPAble extends Car{
        	void remoteSrartUp();
        }
        // 옵션이 필요없는 경우
        class Car3 implements Car {
        
        	@Override
        	public void accelerate() {}
        
        	@Override
        	public void deAccelerate() {}
        	
        }
        // Sunroof 옵션만 필요한 경우
        class Car4 implements OpenRoofAble{
        
        	@Override
        	public void accelerate() {}
        
        	@Override
        	public void deAccelerate() {}
        
        	@Override
        	public void openSunroof() {}
        	
        }
        // RemoteStartUP 옵션만 필요한 경우
        class Car5 implements RemoteStartUPAble{
        
        	@Override
        	public void accelerate() {}
        
        	@Override
        	public void deAccelerate() {}
        
        	@Override
        	public void remoteSrartUp() {}
        	
        }
        ```
        
    
    - **DIP (Dependency Inversion Principle, 의존성 역전 원칙)**
        - 객체지향 설계 원칙 중 하나로 고수준 모듈이 저수준 모듈에 의존해서는 안 되며 둘 다 추상화에 의존해야 한다는 원칙이다.
        - 즉 , **세부 사항이 추상화에 의존**해야 하며 추상화는 세부 사항에 의존해서는 안 된다.
        - 이 원칙은 시스템의 결합도를 낮추고 유연성과 확장성을 높이기 위해 사용된다.
        
        ```java
        interface CreditCard {
        	void purchasing(); 	     	 // 구매결제
        	void automaticPayments();    // 자동결제설정
        }
        
        class HyundaiCard implements CreditCard{
        
        	@Override
        	public void purchasing() {}
        
        	@Override
        	public void automaticPayments() {}
        }
        
        class ShinhanCard implements CreditCard{
        
        	@Override
        	public void purchasing() {}
        
        	@Override
        	public void automaticPayments() {}
        
        }
        
        /*	
        	  
        	  # AsIs Model
        	  
        	   아래 예시에서는 HyundaiCard , ShinhanCard 클래스(저수준 모듈)와 DIP_BadCase 클래스(고수준 모듈)가 있다.
        	   DIP_BadCase는 HyundaiCard에 직접 의존하고 있어 DIP를 위반한다. 
        	   이 경우, 전원 스위치는 오직 HyundaiCard만 제어할 수 있으며 다른 장치(예: ShinhanCard, WooriCard)를 제어하려면 추가적인 변경이 필요하다.
        	   
         */
        
        class DIP_BadCase{
        	
        	HyundaiCard hyundaiCard = new HyundaiCard();
        	// ShinhanCard shinhanCard = new ShinhanCard();
        	
        	void payment() {
        		hyundaiCard.purchasing();
        		// shinhanCard.purchasing();
        	}
        }
        /*
         
         	 # ToBe Model
         
        	DIP_ToBe 클래스는 HyundaiCard, ShinhanCard 또는 어떤 CreditCard 구현체와도 동작할 수 있으며 
        	새로운 장치를 추가하더라도 DIP_ToBe 클래스를 변경할 필요가 없다. 
        	이렇게 DIP를 적용하면 시스템의 결합도가 낮아지고 유연성 및 확장성이 향상된다.
        	
        	
         */
        
        class DIP_GoodsCase{
        	
        	CreditCard creditCard = new HyundaiCard();
        	//                    = new ShinhanCard(); 로 바꿔주면 유연성 있게 밑에 메서드 사용 가능 // CreditCard 인터페이스가 소켓이라고 생각
        	void payment() {
        		creditCard.purchasing();
        	}
        }
        ```

## 📖 Study - Computer Science (자료구조, 네트워크, 리눅스)

### 자료구조 (Data Structure)

### 네트워크 (NetWork)

- **네트워크**
    
    Network = Net(그물) + work(작업하다)
    
    - 무언가가 무언가(종단, 단말장치)와 무언가에 의해(유선,무선) 무언가(정보,데이터)를 주고받는 것
    - 네트워크의 규모가 확장되거나 , 효율적인 정보 공유를 위해 규약( Protocol )이 필요
    
- **데이터 전송 관계**
    - 요청(request)에 의한 응답(response) 관계
    
      요청자 : 클라이언트 ( Client )
      
      응답자 : 서버	  ( Server )
    
- **네트워크의 유형**
    
    **1) LAN  (Local Area Network):** 로컬 에어리어 네트워크는 비교적 작은 지리적 범위 내에서 컴퓨터 및 기타 종단장치를 연결하는 네트워크입니다. 주로 집, 사무실, 학교 등 내부 네트워크에서 사용됩니다.
    
    **2) WAN (Wide Area Network):** 원거리 에어리어 네트워크는 지리적으로 넓은 범위에 걸쳐 있는 네트워크를 의미합니다. 여러 LAN을 연결하거나 인터넷과 같은 글로벌 네트워크를 포함합니다.  
    
    `LAN vs WAN : LAN - 집 안 / WAN - 집 밖 
    (사이에 문 역할 : router , gateway, 공유기 )`
    
    **3) Internet:** 인터넷은 전 세계적으로 연결된 글로벌 네트워크로, 다양한 유형의 네트워크가 연결되어 정보 및 데이터를 공유하는 데 사용됩니다.
    
    **4)  VPN (Virtual Private Network):** 가상 사설 네트워크는 공중 네트워크(인터넷)를 통해 안전하게 연결된 사설 네트워크처럼 사용하는 기술입니다. 원격 위치 또는 사용자가 안전하게 기업 네트워크에 접속할 수 있도록 합니다.
    
    **5) VLAN (Virtual LAN):** 가상 LAN은 물리적으로 분리된 네트워크를 논리적으로 그룹화하여 관리하고 효율적으로 운영하기 위한 기술입니다.
    
    **6) WLAN (Wireless LAN):** 무선 로컬 에어리어 네트워크는 무선 통신 기술을 사용하여 컴퓨터 및 장치를 연결하는 네트워크를 의미합니다. 주로 Wi-Fi를 통해 사용됩니다.

    
- **OSI 7 Layer**
    
    **1) 물리 계층 (Physical Layer): 진짜 전송**
    
    OSI 모델의 가장 하위 계층으로, 물리적 매체를 통해 데이터를 전송하는 역할을 합니다.
    데이터 비트를 전기 신호, 광 신호 또는 무선 신호로 변환합니다.
    예시 장비 및 기술: 케이블, 허브, 리피터
    
    **2) 데이터 링크 계층 (Data Link Layer): 데이터프레임, 랜, MAC주소**
    
    데이터 링크 계층은 물리 계층에서 송수신되는 데이터 프레임을 관리하고, 오류 검출 및 수정을 수행합니다.
    이 계층은 주소 지정 및 프레임의 흐름 제어를 관리하며, 네트워크 환경에서 데이터 프레임이 정확하게 전달되도록 합니다.
    예시 장비 및 프로토콜: 스위치, 브리지, 이더넷, MAC 주소
    
    **3) 네트워크 계층 (Network Layer): IP주소, 데이터 전달**
    
    네트워크 계층은 패킷 라우팅과 경로 선택을 담당합니다. 이 계층은 송신자에서 수신자까지 데이터 패킷을 안정적으로 전달합니다.
    라우터를 통해 패킷이 다른 네트워크로 라우팅되며, IP 주소를 사용하여 목적지를 식별합니다.
    예시 프로토콜: IP, ICMP
    
    **4) 전송 계층 (Transport Layer): 데이터 전송, 추적, 복구, 관리, 포트 번호**
    
    전송 계층은 데이터의 전송을 관리하며, 에러 검출 및 복구, 데이터의 순서화, 포트 번호를 통한 프로세스 식별을 수행합니다.
    TCP (Transmission Control Protocol)와 UDP (User Datagram Protocol)는 이 계층에서 사용되며, 데이터 신뢰성 및 흐름 제어를 담당합니다.
    
    **5) 세션 계층 (Session Layer): 연결 설정, 유지**
    
    세션 계층은 통신 세션을 설정, 관리하고 종료합니다. 이 계층은 데이터의 동기화와 다중 통신 관리를 수행합니다.
    예시 기술: API (Application Programming Interface), RPC (Remote Procedure Call)
    
    **6) 표현 계층 (Presentation Layer): 인코딩, 암호화, 보안**
    
    표현 계층은 데이터의 형식 변환, 데이터 압축, 데이터 암호화와 같은 데이터 표현과 관련된 작업을 담당합니다.
    데이터를 응용 프로그램에서 이해할 수 있는 형식으로 변환하고, 데이터 보안을 유지합니다.
    예시 기술: JPEG (이미지 압축), SSL/TLS (보안 프로토콜)
    
    **7) 응용 계층 (Application Layer): 프로그램**
    
    OSI 모델의 최상위 계층으로, 사용자 및 응용 프로그램과 직접 상호 작용하는 계층입니다.
    응용 프로그램은 이 계층을 통해 네트워크 서비스 및 기능을 사용할 수 있습니다.
    예시 프로토콜: HTTP (웹 통신), FTP (파일 전송), SMTP (이메일)
    
    `+) OSI 7 의 2, 3, 4는 데이터 전송 주소에서 사용`
    
- **TCP/IP**
    - 모델은 OSI 모델과 비슷한 네트워크 프로토콜 스택입니다.
    - 이 모델은 4 ~ 5개의 계층으로 구성되어 있습니다
    - TCP/IP 모델은 실제 인터넷 통신에서 널리 사용되며, OSI 모델보다 더 단순하고 실제 네트워크에서의 구현에 더 가깝습니다.
    
    **1) 네트워크 접속 계층 (Network Access Layer):** OSI의 물리 계층과 데이터 링크 계층에 대응합니다. 이 계층은 하드웨어 인터페이스와 관련된 기능을 수행합니다.
    
    **2) 인터넷 계층 (Internet Layer):** OSI의 네트워크 계층과 부분적으로 일치합니다. 이 계층은 IP 프로토콜을 사용하여 데이터 패킷의 라우팅과 전달을 담당합니다.
    
    **3) 전송 계층 (Transport Layer):** OSI의 전송 계층과 동일한 역할을 수행하며, TCP와 UDP 프로토콜을 사용하여 데이터 전송을 관리합니다.
    
    **4) 응용 계층 (Application Layer):** OSI의 응용 계층과 같은 역할을 합니다. 응용 프로그램과 네트워크 서비스 간의 상호 작용을 지원하며, HTTP, FTP, SMTP 등의 프로토콜을 사용합니다.

   ![osi_tcp](https://github.com/thals304/study_Objected-Oriented/assets/126967336/af74ab3b-50ee-492d-9f62-aacc5696080b)
    
- **데이터 전송 주소 체계**
    
    `4 Port ↔ 3 IP ↔ 2 MAC 필요`
    
    **1) MAC 주소**
    
    → window command : ‘ipconfig /all’로 확인 > 이더넷 물리적 주소에 해당
    
    - 로컬환경 내에서 데이터 전송 담당
    - 변경이 불가능한 물리적인 주소
    
    **2) IP 주소**
    
    - 로컬(local)에서 리모트(remote)환경으로 데이터 전송 담당
    - 변경이 가능한 논리적인 주소
    - IPv4 > IP 주소 모자름 →  IPv6와 병행해서 사용 or 공유기(사설IP) 도입
        
        
    - **공인 IP 주소 (Public IP)**
        
         → 웹 브라우저에서 '내 아이피 주소 검색'으로 확인
        
        ISP업체에서 할당한 인터넷이 가능한 주소 , 공인 IP 네트워크 정보는 ISP업체 라우터 (gateway, 공유기)장비에 등록
        
        @ISP (Internet Service Provider) : 인터넷 서비스 제공자  Ex) kt,lg,sk,등
        
    - **사설 IP 주소	(Private IP)**
        
        → Window command : 'ipconfig'로 확인
        
         ISP업체 임대와 상관없이 내부 용으로 사용하는 주소 , 사설 IP 네트워크 정보는 ISP업체 라우터(gateway, 공유기) 장비에 등록 x
        
        ```
        [ 사설 IP 주소 대역 ]
        A Class 10.0.0.0 ~ 10.255.255.255
        B Class 172.16.0.0 ~ 172.31.255.255
        C Class 192.168.0.0 ~ 192.168.255.255
        ```
        
    - **서브넷 마스크 (Subnet Mask)**
        
         - 공통비트 '1'표기 -> 네트워크 아이디 ( 네트워크 식별자 )
         - 공통비트 '0'표기 -> 호스트 아이디 ( 호스트 식별자 )
        
        ```
          		IP	   Subnet Mask     Network ID    Host ID
          	---------------------------------------------------------
          	192.168.6.254      255.255.255.0   192.168.6          .254
          	192.168.6.254      255.255.0.0     192.168          .6.254
          	192.168.6.254      255.0.0.0	   192.         .168.6.254
        
        ```
        
        255 = 11111111 / 1이 있는 곳 까지 NID, 나머지는 HID
      
        NID가 같은 애들끼리 ping 가능!

  - **IP 주소 클래스 ( 0.0.0.0 ~ 255.255.255.255 )**
    - **유니케스트 주소**
        - 장치에 설정하는 주소
        
        ```
             A Class ( 0 ~ 127 )
        
          		- 기본 서브넷마스크 : 255.0.0.0
          		- 네트워크당 IP주소 개수 : 2^24개
        
          		B Class ( 128 ~ 191 )
        
          		- 기본 서브넷마스크 : 255.255.0.0
          		- 네트워크당 IP주소 개수 : 2^16개
        
          		C Class ( 192 ~ 223 )
        
          		- 기본 서브넷마스크 : 255.255.255.0
          		- 네트워크당 IP주소 개수 : 2^8개
        ```
        
        //   A 클래스 : 00000000 ~ 01111111
        
        B 클래스 : 10000000 ~ 10111111
        
        C 클래스 : 11000000 ~ 11011111
        
        D 클래스 : 11100000 ~ 11101111
        
        E  클래스 : 11110000 ~ 11110111
        
    - **멀티케스트 주소**
        - 장치에 사용할 수 없음
        - 멀티케스트 트래픽을 위한 목적으로 사용됩니다.
        
        ```
                    D Class ( 224 ~ 239 )
        ```
        
    - **실험 및 예비 목적으로 예약**
        - 장치에 사용할 수 없음
        - 일반적인 네트워크 운영에는 사용되지 않음
        
        ```
                     E Class ( 240 ~ 255 )
        ```
        
    
    +)
    
    @유니케스트     ->  1 : 1 통신
    @멀티케스트     ->  1 : 특정 그룹 통신(N)
    @브로드케스트  ->  1 : 전체 통신 (ALL)
    

- 현재는 CIDR (Classless Inter-Domain Routing)와 함께 더 유연한 주소 할당 방식을 사용 

**3) Port 번호**

- 네트워크 통신에서 프로세스나 서비스를 식별하기 위한 번호
- TCP/IP 네트워크에서는 Port 번호를 사용하여 데이터가 어떤 프로그램으로 전송되어야 하는지 결정
- **TCP (Transmission Control Protocol) : 안정성**
    - **연결 지향 프로토콜** : TCP는 연결을 설정하고 유지한 후 데이터를 안정적으로 전송하기 위한 연결 지향 프로토콜
    데이터 전송 전에 **3-way 핸드셰이크**를 통해 연결을 설정
        
        
       ![Tcp-handshake](https://github.com/thals304/study_Objected-Oriented/assets/126967336/c446083a-0250-429e-9e46-96dc12ce2020)
        
    
    +) **더 알아보기**  SYN Flooding(Layer 4 공격)이 있을 때 , 네트워크 중간에 proxy  형태로 위치한 방화벽이 핸드셰이크를 서버 대신 처리하고, TCP 핸드 셰이크의 정상적인 완료가 이루어질 때까지 원본 서버와의 연결을 보류
    
    - **신뢰성**: TCP는 데이터의 신뢰성을 보장하기 위해 재전송 및 에러 검출 및 복구 메커니즘을 제공
    데이터가 손실되거나 손상되었을 때 다시 전송하고, 데이터가 순서대로 도착하도록 보장
    - **흐름 제어와 혼잡 제어**: TCP는 네트워크의 트래픽 흐름을 관리하고 혼잡 상태를 감지하며 조절하는 기능을 한다.
    네트워크에서의 과도한 혼잡을 방지하고 안정적인 데이터 전송을 가능하게 한다.

- **UDP (User Datagram Protocol) : 속도**
    - **비연결성 프로토콜**: UDP는 연결을 설정하지 않고 데이터를 전송하는 비연결성 프로토콜 연결 설정과 관리에 드는 오버헤드가 없어 TCP보다 빠른 데이터 전송이 가능
    - **신뢰성 부족**: UDP는 데이터의 전달 신뢰성을 보장하지 않으며, 데이터가 손실 될 수 있고 데이터가 순서대로 도착하지 않을 수 있습니다.
    - **흐름 제어와 혼잡 제어 부재**: UDP는 흐름 제어와 혼잡 제어를 제공하지 않으므로 데이터가 네트워크 혼잡에 의해 손실 될 수 있음

- 포트 범위는 0에서 65535까지 65536(255 * 255)개 사용한다.
    
    → Window command > ‘netstat -ant’  
    
    System Port ( Well Known Port )   > (0 - 1023)   - 컴퓨터 포트
    User Port   ( Registered Port )       > (1024 - 49151)  - 기업 포트 
    Dynamic/Private Port                    > (49152 - 65535) - 우리가 사용하는 포트
    
    ```
    
    [System Port 예시]
    
    [ web ]
    HTTP(TCP 80)    : www에서 hypertext 정보를 주고받을 수 있는 프로토콜
    HTTPS(TCP 443)  : http(hypertext transfer protocol)에서 보안(security)이 강화된 프로토콜
    ---------------------------------------------------------------------------------------
    [ 개발용 컴퓨터 -> 서버용 컴퓨터 (원격 제어) ]
    telnet(TCP 23)  :	원격터미널 제어를 하기 위한 프로토콜 (old - version)
    SSH(TCP 22)     : telnet에서 암호화된 보안(security)이 강화된 프로토콜 (modern - version)
    ---------------------------------------------------------------------------------------
    [ File Tranfer Protocol ]
    FTP(TCP 21)     : 파일전송을 위한 프로토콜 (인증 및 로그인)
    FTP-data(TCP 20): 파일전송을 위한 프로토콜 (데이터 전송)
    ---------------------------------------------------------------------------------------
    [ email ]
    SMTP(TCP 25)    : 이메일을 송신(보내기)하기 위한 프로토콜 (Simple Mail Transfer Protocol)
    POP3(TCP 110)   : 이메일을 수신(받기)하기 위한 프로토콜
    ---------------------------------------------------------------------------------------
    [ IP ]
    DNS(UDP 53)     : IP주소를 도메인이름으로 변환하는 프로토콜 (Domain Name Service) 
    ex) 원래는 0.0.0.0 형태로 써야 하는데 google.com, www.naver.com
    DHCP(UDP 67)    :	IP주소를 중앙에서 관리 및 할당하는 프로토콜 (서버) 
    (Dynamic Host(IP, subnetmask,gateway) Configure Protocol)
    DHCP(UDP 68)    :	IP주소를 중앙에서 할당받는 프로토콜 (클라이언트)
    ex) 인터넷이 안되서 공유기를 껐다가 키는 것 - IP 사용 시간이 주어져서 일정 시간이 지나면 다시 할당 받아야함
    ----------------------------------------------------------------------------------------
    
    NTP(UDP 123)    :	시간동기화를 위한 프로토콜
    syslog(UDP 514) : 컴퓨팅에서 syslog는 메시지 로깅의 표준 (음성 녹음)
    ex) 윈도우 vs 리눅스
        로그저장  로그저장
         통합      분산
    ```
    
- **네트워크 주소 변환(Network Address Translation, NAT)**
    - NAT는 IPv4의 주소 부족 문제를 해결하기 위한 방법으로서 고려되었으며,
    주로 비공인(사설, local) 네트워크 주소를 사용하는 망에서 외부의 공인망
    (public, 예를 들면 인터넷)과의 통신을 위해서 네트워크 주소를 변환하는 것이다.
    즉 **내부 망에서는 사설 IP 주소를 사용하여 통신을 하고, 외부망과의 통신시에는
    NAT를 거쳐 공인 IP 주소로 자동 변환**한다.
    - **장점:**
    1. 공인 IP 주소 1개에, 여러 개의 비공인 주소를 매핑할 수 있어 비용 절감 효과가 있다.
    2. 사설 IP 주소를 사용함으로써 외부에서 볼 때 내부의 망 구조를 알 수 없어 보안 효과가 있다.
    - **단점:**
    외부망과의 통신시 주소 변환을 거쳐야 하므로 느려지며, 사용자가 많을수록 속도 저하가 커진다.
    이러한 NAT 기능은 보통 라우터나 방화벽 등에 설치하며, 라우팅 정책에 따라 사설 IP 주소와 변환될
    IP 주소를 static하게 혹은 dynamic하게 매핑할 수 있으며 테이블로 관리된다.
    
    1. 사설 IP 주소를 정적인 하나의 공인 IP 주소로 매핑
    2. 사설 IP 주소를 임의의 공인 IP 주소들 중에서 어떤 하나와 매핑
    3. 사설 IP 주소에 특정 TCP 포트를 더한 것을 하나의 공인 IP 주소로 매핑
    4.  공인 IP 주소를 사설 IP 주소 중의 하나로 (순서는 라운드 로빈 방식을 사용) 매핑 할 수 있다.
    
    ![IMG_0127](https://github.com/thals304/study_Objected-Oriented/assets/126967336/b7b80706-0a33-46a7-addf-4d416ba2807a)
    
    LAN 밖으로 나가면  private > public 주소 변환(NAT)
    
    LAN 안으로 들어가면 public > private 주소 변환(NAT) 
    **(단, 먼저 private > public  NAT을 한번 뚫어줘야 public > private 주소 변환 가능)**

### 리눅스 (Linux)
