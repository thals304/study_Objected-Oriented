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
    
    **-  클래스에서 다양한 변수 (꼭 구분하기!)**
    
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

    - **foreach문 (향상된 for문)**
    
    `[ 구조 ]`
    
    `for (element type 변수명 : 반복가능한 자료형) {      명령어;       }`
    
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
