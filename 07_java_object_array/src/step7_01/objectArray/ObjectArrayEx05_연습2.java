package step7_01.objectArray;
/*
 *  24.04.03 time 15:55-15:57
 *  today 소감문
 *  전에 안 풀었던 문제라서 분석을 먼저 하고 내 힘으로 풀어보자고 했는데
 *  분석도 그냥 클래스, 메서드, 객체 배열 생성 등이 전부라서 분석하는데도
 *  시간이 많이 걸리지 않았던 것 같다.
 * */
class Client {

	String id;
	String passwd;
	String name;
	String birth;
	int age;
	String contact;
	String address;
	
	void setData(String id, String passwd, String name, String birth, int age, String contact, String address) {
		
		// 파라메타로 전달된 데이터를 필드에 대입
		this.id = id;	
		this.passwd = passwd;
		this.name = name;
		this.birth = birth;
		this.age = age;
		this.contact = contact;
		this.address = address;
	}
	
	void printData() {
		System.out.println(this.id + " / " + this.passwd + " / " + this.name + " / " + this.birth + " / " + this.age + " / " + this.contact + " / " + this.address);
	}

}

public class ObjectArrayEx05_연습2 {

	public static void main(String[] args) {

		Client[] clientList = new Client[3];  // 객체 배열 생성
		
		for (int i = 0; i < clientList.length; i++) {
			clientList[i] = new Client(); // 각 배열 요소에 Client 클래스의 인스턴스들을 할당
		}
		// 각 클래스 변수에 직접 대입
		clientList[0].id      = "user1";
		clientList[0].passwd  = "1111";
		clientList[0].name    = "사용자1";
		clientList[0].birth   = "2000-01-01";
		clientList[0].age     = 25;
		clientList[0].contact = "010-1234-5678";
		clientList[0].address = "서울";
		// 클래스의 메서드를 통해 대입
		clientList[1].setData("user2","2222","사용자2","2010-01-01",15,"010-9876-5432", "경기");
		clientList[2].setData("user3","3333","사용자3","1990-01-01",35,"010-1111-2222", "인천");
		
		for (int i = 0; i < clientList.length; i++) {
			clientList[i].printData();
		}
	}

}
