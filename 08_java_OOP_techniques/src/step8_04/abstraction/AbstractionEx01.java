package step8_04.abstraction;

/*
 *  # 추상화 
 * 
 *  - 부모클래스를 상속받은 자식클래스에게 반드시 구현해야하는 메서드를 잊지않고 만들도록 '강제'하는 클래스
 *  - abstract 키워드를 클래스 앞에 붙여주어 추상클래스를 생성한다.
 *  - abstract 키워드를 메서드 앞에 붙여주어 추상메서드를 생성한다.
 *  - 추상메서드 뒤에 '{}' 아닌 ';'을 붙인다.  
 *  - 추상메서드는 추상클래스 안에서 선언만 하고 실질적인 메소드의 추상클래스를 상속받은 일반 자녀클래스에서 진행한다.
 *  - 다중 상속이 불가능하다.
 *  - 추상 클래스는 객체를 생성 할 수 없다.
 *    
 * */

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
class TestClass2 extends AbstractClass{

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
class TestClass3 extends AbstractClass{

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
