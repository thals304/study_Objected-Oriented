package step7_01.objectArray;
// 24.02.15 time 12:06-12:23
/*
 * today 소감문
 * 미리 이해하고 풀었는데도 아직은 어색한 부분이 있다.
 * 근데 객체 배열 안에 객체 배열이 있다고 해도 머리 속에 수형도를 그리면서
 * 관계성을 파악하니 간단한 구조였던 것 같다.
 * 근데 아직도 각 배열 요소에 어떤 클래스의 새 인스턴스를 할당하는 코드를 자연스럽게 쓰지 못하고 있고
 * 클래스 이름이 데이터 타입이 되는게 헷갈리고 실수하는 부분 같다.
 * */
//# 클래스 배열 응용

class Subject_연습문제2{
	
	String name;
	int score;
	
}


class Student_연습문제2{
	
	Subject_연습문제2[] subjects;	// Subject 객체를 담을 클래스 배열
	String name;
	
}


public class ObjectArrayEx07_연습2 {

	public static void main(String[] args) {

		Student_연습문제2[] studentList = new Student_연습문제2[3];
		
		studentList[0] = new Student_연습문제2(); // 각 요소에 Student_연습문제2 클래스의 새 인스턴스를 할당하는 코드
		studentList[0].name = "user1";
		studentList[0].subjects = new Subject_연습문제2[3]; // subjects의 데이터 타입은 Subject_연습문제2[]
		
	   for (int i = 0; i < studentList[0].subjects.length; i++) {
		   studentList[0].subjects[i] = new Subject_연습문제2();	// 각 요소에 Subject_연습문제2 클래스의 새 인스턴스를 할당하는 코드
		   studentList[0].subjects[i].name = "user1 과목 " + i;
		   studentList[0].subjects[i].score = 100;
	   }
	   
	   studentList[1] = new Student_연습문제2();	// 각 요소에 Student_연습문제2 클래스의 새 인스턴스를 할당하는 코드
	   studentList[1].name = "user2";
	   studentList[1].subjects = new Subject_연습문제2[2];
	   
	   for (int i = 0; i < studentList[1].subjects.length; i++) {
		   studentList[1].subjects[i] = new Subject_연습문제2();	// 각 요소에 Subject_연습문제2 클래스의 새 인스턴스를 할당하는 코드
		   studentList[1].subjects[i].name = "user2 과목 " + i;
		   studentList[1].subjects[i].score = 90;
	   }
	   
	   studentList[2] = new Student_연습문제2();	// 각 요소에 Student_연습문제2 클래스의 새 인스턴스를 할당하는 코드
	   studentList[2].name = "user3";
	   studentList[2].subjects = new Subject_연습문제2[1];
	   studentList[2].subjects[0] = new Subject_연습문제2();	// 각 요소에 Subject_연습문제2 클래스의 새 인스턴스를 할당하는 코드
	   studentList[2].subjects[0].name = "user3 과목 0";
	   studentList[2].subjects[0].score = 80;
	   
	   for (int i = 0; i < studentList.length; i++) {
		   System.out.println( "---"+ studentList[i].name + "---");
		   for (int j = 0; j < studentList[i].subjects.length; j++) {
			   System.out.println("name : " + studentList[i].subjects[j].name + " / " + "score : " + studentList[i].subjects[j].score );
			   System.out.println();
		   }
	   }
	   
	   
		
		
	}

}
