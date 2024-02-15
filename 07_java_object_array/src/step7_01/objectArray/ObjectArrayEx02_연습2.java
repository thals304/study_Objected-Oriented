package step7_01.objectArray;
// 24.02.14 time 21:49-21:52
/*
 * today 소감문
 * 객체 배열을 생성하고 for문을 사용해 배역 각 요소에 new Card_연습문제2(); 클래스의 
 * 새 인스턴스를 할당하는 코드를 만들었다. 이를 통해 객체 배열을 초기화하고, 
 * 각 요소를 새로운 객체로 설정하는 역할을 한다는 점을 알 수가 있었다.
 * 
 * */
class Card_연습문제2 {
	
	int num;
	String shape;
	
}

public class ObjectArrayEx02_연습2 {

	public static void main(String[] args) {
		
		 Card_연습문제2[] cardList = new Card_연습문제2[10];
		 
		 // for문 활용
		 for (int i = 0; i < cardList.length; i++) {
			 cardList[i] = new Card_연습문제2();
			 cardList[i].num = (i+1);
			 cardList[i].shape = "클로버";
		 }
		 
		 for (int i = 0; i < cardList.length; i++) {
			 System.out.println("num : "+ cardList[i].num);
			 System.out.println("shape : "+ cardList[i].shape);
			 System.out.println();
		 }
		 
		 
	}

}
