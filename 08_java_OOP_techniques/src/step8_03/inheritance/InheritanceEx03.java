package step8_03.inheritance;

/*
 * 
 *  # this , super
 * 
 * 	- this : 자신의 객체
 *    super : 부모클래스의 객체
 *  
 *  - this() : 자신의 생성자
 *    super() : 부모클래스의 생성자
 *  
 *  - this.testMethod() : 자신의 메서드 호출
 *    testMethod()		: 자신의 메서드 호출
 *    super.testMethod() : 부모의 메서드 호출
 * 
 * */

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
	
	// 오버라이딩
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
		
		//(P-기본) 부모클래스 기본생성자 실행 이 따라옴
		new Child();
		System.out.println();
		
		new Child("자녀", 40);
		System.out.println();
		
		Child object = new Child("자녀", 20);
		object.callMethod();
	}

}
