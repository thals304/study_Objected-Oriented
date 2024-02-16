package step7_01.objectArray;

import java.util.ArrayList;

/*
 * 
 *  # foreach문 (향상된 for문)
 *  
 *  [ 구조 ]
 *  
 *  for (element type 변수명 : 반복가능한 자료형) {
 *  	명령어;
 *  }
 * 
 *  - for문의 반복 횟수 제어가 없다.
 *  - 반복 자료형의 크기만큼 처음부터 끝까지 반복하면서 반복 자료형의 element가 직접 변수에 저장되고 
 *    for문의 몸체{}를 반복하여 실행한다.
 * 
 * */

public class ObjectArrayEx11 {

	public static void main(String[] args) {
		
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
		
	}

}
