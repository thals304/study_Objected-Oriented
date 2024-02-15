package step7_01.objectArray;
// 24.02.14 time 22:50-23:04
/*
 * today 소감문
 * 클래스 안에 객체 배열이 있으니 객체 생성에서부터 갑자기 머릿속이 복잡해졌고
 * 객체 배열에 객체를 대입하다보니 이중 연결이 된 느낌이라 수형도를 그리고 싶은 욕구가
 * 막 생긴 것 같다. 그 욕구를 참으며 중간중간 주석들로 설명을 해놓았지만 많은 복습이 필요한 건
 * 사실이다.
 * */
class Member_연습문제2{
	
	String name;
	int num;
	
}


class MemberManager_연습문제2{

	Member_연습문제2[] memberList = new Member_연습문제2[3];

}


public class ObjectArrayEx06_연습2 {

	public static void main(String[] args) {

		MemberManager_연습문제2 mg = new MemberManager_연습문제2(); // 객체 생성 - 그 안에 객체 배열 존재
		Member_연습문제2 m1 = new Member_연습문제2(); // 객체 생성 - 그 안에 name, num 객체 변수 존재
		
		// m1 = new Member_연습문제2();을 mg.memberList[0]에 대입해주므로
		// 각 요소에 Member_연습문제2 클래스의 새 인스턴스를 할당하는 코드
		mg.memberList[0] = m1; // m1에 있는 name, num 사용 가능
		m1.name = "1111";
		m1.num = 1;
		
		m1 = new Member_연습문제2();
		mg.memberList[1] = m1;
		m1.name = "2222";
		m1.num = 2;
		
		m1 = new Member_연습문제2();
		mg.memberList[2] = m1;
		m1.name = "3333";
		m1.num = 3;
		
		for (int i = 0; i < mg.memberList.length; i++) {
			System.out.println("name : " + mg.memberList[i].name);
			System.out.println("num : " + mg.memberList[i].num);
			System.out.println();
		}
		
		Member_연습문제2 temp = mg.memberList[1]; // 주소(링크)
		System.out.println("name : " + temp.name); // 2222
		System.out.println("num : " + temp.num);   // 2
		
	}

}
