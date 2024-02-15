package step7_01.objectArray;
// 24.02.14 time 22:00-22:05
/*
 * today 소감문
 * 이번 연습은 accountList[1]인 주소를 다른 변수 temp에 저장할 때 둘의 데이터 타입은
 * Account_연습문제2로 같아야 한다는 점과 
 * 주소가 같기 때문에 temp.id temp.money를 바꾸거나 accountList[1].id  -.money 중
 * 어느 것을 바꾸더라도 둘에게 영향을 미친다는 점을 알려주고 싶은 예제인 것 같다.
 * */
class Account_연습문제2 {
	 
	String id; 
	int money;
	
}

public class ObjectArrayEx03_연습2 {

	public static void main(String[] args) {
		
		Account_연습문제2[] accountList = new Account_연습문제2[2];
		
		for (int i = 0; i < accountList.length; i++) {
			accountList[i] = new Account_연습문제2(); // 각 요소에 Account_연습문제2 클래스의 새 인스턴스를 할당하는 코드	
		}
		
		accountList[0].id = "1111";
		accountList[0].money = 100000;
		
		accountList[1].id = "2222";
		accountList[1].money = 200000;
		
		for (int i = 0; i < accountList.length; i++) {
			System.out.println("id : " + accountList[i].id + " / " + "money : " + accountList[i].money);
		}
		
		Account_연습문제2 temp = accountList[1]; // 주소(링크)
		temp.id = "1234";
		System.out.println("=============================");
		
		for (int i = 0; i < accountList.length; i++) {
			System.out.println("id : " + accountList[i].id + " / " + "money : " + accountList[i].money);
		}
		
		
	
	}

}
