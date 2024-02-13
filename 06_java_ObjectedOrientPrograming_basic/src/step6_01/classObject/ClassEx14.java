package step6_01.classObject;
// this : 객체 (오브젝트, 인스턴스) 자신

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
