package step8_05.polymorphism;

import java.util.ArrayList;
import java.util.HashMap;

/*

	# 다형성 ( polymorphism )
	
	- 다형성은 같은 인터페이스나 부모 클래스를 상속받은 여러 객체가 그 인터페이스나 부모 클래스의 참조 타입으로 사용될 때 
	  각 객체의 실제 타입에 따라 서로 다른 방식으로 동작할 수 있게 하는 객체 지향의 핵심 원칙 중 하나이다.
	
	- 다형성을 구현하기 위해서는 다형성을 구현할 메소드가 포함된 모든 클래스가 같은 부모 클래스 혹은 인터페이스를 가져야 한다. 
	  (부모와 자식이 1:1 관계)
	- 부모 클래스 혹은 인터페이스와 자식 클래스에 같은 메소드가 있어야 하며 자식 클래스는 이 메소드를 반드시 override 하여 사용해야 한다.
	  (자식클래스는 부모 메서드 재정의)
	- 부모 클래스 혹은 인터페이스 타입에 자식 클래스 타입을 대입시켜 다형성이 구현된 메소드를 실행한다.

*/

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



