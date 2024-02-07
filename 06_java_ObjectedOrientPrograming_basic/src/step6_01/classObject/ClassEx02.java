package step6_01.classObject;

/*
 * 
 * # 클래스의 범위
 * 
 * 		- 같은 패키지 안의 클래스는 다른 클래스에서 사용이 가능하다.
 *       ( 구체적인 접근제어자는 객체지향 기법에서 공부 )
 * 
 * */

class Product {
	
	// 클래스의 필드는 초깃값이 저장되어 있다.
	String code;	// null
	String name;
	String imgNm;
	int price;		// 0
	int deliveryPrice = 2500;	// 필드에 초깃값을 지정할 수 있다.
}

public class ClassEx02 {

	public static void main(String[] args) {
		
		// 같은 패키지 안의 클래스는 다른 클래스에서 사용이 가능하다.(접근제어자는 후에 자세히 공부)
		Member member = new Member();	// ClassEx01에서 만든 class Member를 ClassEx02에서도 사용 가능
		member.id = "aszx1234";
		member.password = "1234";
		
		System.out.println("id : "       + member.id);
		System.out.println("password : " + member.password);
		System.out.println();
		
		Product product = new Product();
		product.code = "0x001";
		product.name = "스마트TV";
		product.imgNm = "스마트TV.PNG";
		product.price = 1500000;
		// product.deliveryPrice = 0;
		
		System.out.println("code : " + product.code);
		System.out.println("name : " + product.name);
		System.out.println("imgNm : " + product.imgNm);
		System.out.println("price : " + product.price);
		System.out.println("deliveryPrice : " + product.deliveryPrice);
	}

}
