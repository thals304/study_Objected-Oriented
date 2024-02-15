package step7_01.objectArray;

class Product {
	String name = "아이패드";
	int price = 1000;
}

public class ObjectArrayEx01 {

	public static void main(String[] args) {
		
		
		/*
		   - 객체배열 생성
		   클래스명[] 배열명 = new 클래스명[크기];
		   
		 * */
		Product[] productList = new Product[3];
		
		Product product = new Product(); 
		// 1) Product  2) product 3) new Product(); 
		// 3번은 객체이고 2번은 객체(3번)를 넣은 변수이므로 객체 배열에 대입(저장) 가능 
		// but, 1번은 데이터 타입이므로 객체 배열에 대입(저장) 불가능
		product.name = "기계식 키보드";
		product.price = 35000;
		productList[0] = product;  
		
		productList[1] = new Product(); // 배열 인덱스 1에 객체를 생성해 주는 행위
		productList[2] = new Product();
		
		productList[1].name = "무소음마우스";
		productList[1].price = 27000;
		
		productList[2].name = "장패드";
		productList[2].price = 10000;
		
		for(int i = 0; i < productList.length; i++) {
			System.out.println(productList[i].name);
			System.out.println(productList[i].price);
			System.out.println();
		}
		
		// [응용] 생각해보기
		Product[] temp1 = productList;	        // 주소 (링크)
		Product temp2 = productList[0]; 		// 주소 (링크) 
		String temp3 = productList[1].name; 	// 데이터
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

}
