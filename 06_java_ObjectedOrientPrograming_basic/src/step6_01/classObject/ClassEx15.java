package step6_01.classObject;
/*
   
	# static
 	
 	- 정적 필드(static 변수)와 정적 메소드(static 메소드)는 객체(인스턴스)에 소속된 멤버가 아니라 클래스에 고정된 멤버이다.
 	  -> 클래스명.static변수명  , 클래스명.static메소드(); 형태로 사용 가능
 	- static 키워드를 통해 생성된 정적멤버들은 heap영역이 아닌 static영역에 할당한다.
 	- static 영역에 할당된 메모리는 모든 객체가 공유하여 하나의 멤버를 어디서든지 참조할 수 있다.
 	- Garbage Collector의 관리 영역 밖에 존재하기에 static영역에 있는 멤버들은 프로그램의 종료시까지 메모리가 할당된 채로 존재한다.
 
 */
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
