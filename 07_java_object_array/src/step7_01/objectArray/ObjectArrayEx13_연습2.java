package step7_01.objectArray;

import java.util.ArrayList;
// 24.02.19 14:10-14:19
/*
 * today 연습문제
 * 13번 문제 분석에서는 list에 temp를 계속 사용하기 위해 갱신해 총 3번을 대입하고
 * 인덱스 1을 삭제해서 출력했는데 이번에는 그냥 내 마음대로 하고 싶어서 set으로 인덱스 0을 수정하고
 * 출력한 다음 인덱스 1을 삭제하고 다시 출력하도록 만들었다.
 * */
class Tv_연습문제2 {
	
	String name;
	String brand;
	int price;

	void setData(String name, String brand, int price) {
		this.name = name;
		this.brand = brand;
		this.price = price;
	}
	
}


public class ObjectArrayEx13_연습2 {

	public static void main(String[] args) {
		
		// ArrayList 사용
		ArrayList<Tv_연습문제2> list = new ArrayList<Tv_연습문제2>();
		
		Tv_연습문제2 temp = new Tv_연습문제2();
		temp.setData("삼성 Tv", "삼성", 3000000);
		list.add(temp);
		
		temp = new Tv_연습문제2();
		temp.setData("애플 tv", "애플", 5000000);
		list.add(temp);
		
		temp = new Tv_연습문제2();
		temp.setData("LG Tv", "엘지", 2000000);
		list.set(0, temp);
		
		for (Tv_연습문제2 tv : list) {
			System.out.println("name : " + tv.name);
			System.out.println("brand : " + tv.brand);
			System.out.println("price : " + tv.price);
			System.out.println();
		}
		
		list.remove(1);
		
		for (int i = 0; i < list.size(); i++) {
			System.out.println( "name : "+ list.get(i).name + " / " + "brand : " + list.get(i).brand + " / " + "price : " + list.get(i).price);
		}
		


	}

}
