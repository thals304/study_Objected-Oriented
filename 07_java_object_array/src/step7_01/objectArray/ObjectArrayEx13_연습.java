package step7_01.objectArray;

import java.util.ArrayList;

class Tv {
	
	String name;
	String brand;
	int price;

	void setData(String name, String brand, int price) {
		this.name = name; 	// 여기에서만 this를 사용한 이유?
		this.brand = brand;
		this.price = price;
	}
	
}


public class ObjectArrayEx13_연습 {

	public static void main(String[] args) {
		
		// ArrayList 사용
		ArrayList<Tv> list = new ArrayList<Tv>();	// ArrayList 생성

		Tv temp = new Tv();	// 객체 생성
		temp.setData("TV", "삼성", 1000);
		list.add(temp);	
		// System.out.println(list);  값으로 안나오는 이유? list의 데이터 타입이 클래스 Tv(주소) 이므로
		
		temp = new Tv(); // temp를 다시 사용하려고 한 거 
		temp.setData("시그니처TV", "엘지", 2000);
		list.add(temp);

		temp = new Tv();
		temp.setData("스마트TV", "애플", 3000);
		list.add(temp);
	
		list.remove(1);	// 인덱스 1에 있는 "시그니처TV", "엘지", 2000가 삭제됨
		// list.size();는 3 -> 2가 됨
		
		// 출력 방법 1 : for문
		for (int i = 0 ; i < list.size(); i++) {
			System.out.println("name : " + list.get(i).name);
			System.out.println("brand : " + list.get(i).brand);
			System.out.println("price : " + list.get(i).price);
			System.out.println();
		}
		
		System.out.println("\n");
		
		// 출력 방법 2 : foreach문
		for (Tv tv : list) {	// list의 데이터 타입이 Tv이므로 
			System.out.println("name : " + tv.name);
			System.out.println("brand : " + tv.brand);
			System.out.println("price : " + tv.price);
			System.out.println();
		}


	}

}
