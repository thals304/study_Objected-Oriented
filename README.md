# web_backend
## **🔥 목표**

- 독립 (생각하는 것을 코드로 )
- 신입 개발자 이상 ( 실력, 가능성 )

## 📆 기간

24.01 ~ 24.06

## 🏃 과정

- 자바 + 프로그래밍 훈련, 디버깅, 소스 관리 ( 형성, 버전 관리 )
- **자바 ( 객체 지향 ) + 프로그래밍 훈련**
    
    cs ( 컴퓨터 사이언스: 네트워크, 리눅스, 자료구조 )
    
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
