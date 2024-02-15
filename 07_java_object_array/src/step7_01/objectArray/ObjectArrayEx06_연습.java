package step7_01.objectArray;

class Member{
	
	String name;
	int num;
	
}


class MemberManager{

	Member[] memberList = new Member[3];

}


public class ObjectArrayEx06_연습 {

	public static void main(String[] args) {

		// 해석해보기
		MemberManager mg = new MemberManager();	
		Member m1 = new Member();
		mg.memberList[0] = m1;
		m1.name = "김철수";
		m1.num = 1001;
		
		m1 = new Member();  // 앞에 연결을 끊고 m1을 다시 사용하려는 것
		mg.memberList[1] = m1;
		m1.name = "이만수";
		m1.num = 1002;
		
		m1 = new Member();
		mg.memberList[2] = m1;
		m1.name = "박영희";
		m1.num = 1003;
		
		for (int i = 0; i < mg.memberList.length; i++) {
			System.out.println("num : " + mg.memberList[i].num);
			System.out.println("name : " + mg.memberList[i].name);
			System.out.println();
		}
		// 주소(링크) 둘의 데이터 타입이 같은가? 
		// 클래스 MemberManger에서 memberList의 데이터 타입이 Member[]이므로 memberList[1]은 데이터 타입이 Member이므로 같다고 볼 수 있음
		Member temp = mg.memberList[1]; 
		System.out.println("num : " + temp.num); // 이만수
		System.out.println("name : " + temp.name); // 1002

	}

}
