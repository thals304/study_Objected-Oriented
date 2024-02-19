package step7_01.objectArray;

import java.util.ArrayList;
import java.util.Arrays;
// 24.02.19 time 14:28-14:38
/*
 * today 소감문
 * 일단 이전 자료구조 연결리스트와 거의 유사해서 분석도 쉬웠고 정답을 보지 않고
 * 내가 이해한 대로 코드를 짜는 것도 쉽게 느껴졌다. 근데 자꾸만 add(index, value)를 수정이라고
 * 착각해서 삽입인 것이라고 개념을 다시 머리에 집어 넣어야할 것 같다.
 * 그리고 추가로 매소드가 아닌 main 부분 맨 마지막 출력부분에서 배열에 ,를 넣는 것의 조건과 넣는 방식이
 * 아직도 헷갈리고 어색하기만 한 것 같다.
 * */
// MyArrayList 만들기
class MyArrayList_연습문제2 {

	int[] arr;
	int elementCnt;

	void print() {
		System.out.println(Arrays.toString(arr));
	}

	
	void add(int value) {	// .add(value) // 추가
		
		if (elementCnt == 0) {
			arr = new int[elementCnt + 1];
		}
		else if (elementCnt > 0) {
			int[] temp = arr;
			arr = new int[elementCnt + 1];
			
			for(int i = 0; i < elementCnt; i++) {
				arr[i] = temp[i];
			}
			temp = null;
		}
		
		arr[elementCnt] = value;
		elementCnt++;
		
	}

	
	void add(int index, int value) {	// .add(index, value) // 삽입
		
		if(elementCnt == 0) {
			arr = new int[elementCnt + 1];
		}
		else if (elementCnt > 0){
			int[] temp = arr;
			arr = new int[elementCnt + 1];
			int j = 0;
			for (int i = 0; i < elementCnt + 1; i++) {
				if (i != index) {
					arr[i] = temp[j];
					j++;
				}
			}
			// 삽입도 for문 2개로 풀 수 있을까? 할수는 있는데 한 개로 짜는게 효율적
			temp = null;
		}
		
		arr[index] = value;
		elementCnt++;
	}

	
	void remove(int index) { // .remove(index) // 삭제
		
		if (elementCnt == 1) {
			arr = null;
		}
		else if (elementCnt > 1) {
			int[] temp = arr;
			arr = new int[elementCnt - 1];
			
			int j = 0;
			for (int i = 0; i < elementCnt; i++) {
				if (i != index) {
					arr[j] = temp[i];
					j++;
				}
			}
			/* 이렇게 표현해도 될 거 같음
			for (int i = 0; i < index; i++) {
				arr[i] = temp[i];
			}
			for (int i = index; i < elementCnt - 1; i++) {
				arr[i] = temp[i+1];
			}
			*/
			temp = null;
		}
		elementCnt--;
	}

	
	int size() { // .size(); // 크기
		return elementCnt;
	}

	
	int get(int index) { // .get(index);
		return arr[index];
	}

	
	void set(int index, int value) {	// .set(index) = value; // 수정
		arr[index] = value;
	}

	
	void clear() {	// .clear(); 
		arr = null;
		elementCnt = 0;
	}

}


public class ObjectArrayEx14_연습2 {

	public static void main(String[] args) {

		// [ ArrayList 사용 ] 
		ArrayList<Integer> list = new ArrayList<Integer>();

		// 추가하기
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		System.out.println(list);
		
		// 삽입하기
		list.add(0, 9);
		// 출력하기
		System.out.println(list);

		// (index로)삭제하기
		list.remove(3);
		System.out.println(list);

		// 길이 구하기
		int elementCnt = list.size();
		System.out.println("elementCnt = " + elementCnt);

		// (index로)값 꺼내오기
		System.out.print("[");
		for (int i = 0; i < elementCnt; i++) {
			System.out.print(list.get(i));
			if (i != elementCnt - 1) {
				System.out.print(", ");
			}
		}
		System.out.println("]");

		// 특정 위치의 값 수정하기
		list.set(3, 5);
		System.out.println(list);

		// 모든 데이터를 제거하기
		list.clear();
		System.out.println(list.size());

		
		
		
		System.out.println("\n========================================\n");
		
		
		
		
		// [ 직접 구현한 ArrayList ] 
		MyArrayList_연습문제2 myList = new MyArrayList_연습문제2();

		// 추가하기
		myList.add(10);
		myList.add(20);
		myList.add(30);
		myList.add(40);
		myList.add(50);
		myList.print();
		
		// 삽입하기
		myList.add(0, 9);
		// 출력하기
		myList.print();

		// (index로)삭제하기
		myList.remove(3);
		myList.print();

		// 길이 구하기
		int elementCount = myList.size();
		System.out.println("elementCnt = " + elementCount);

		// (index로)값 꺼내오기
		System.out.print("[");
		for (int i = 0; i < elementCount; i++) {
			System.out.print(myList.get(i));
			if (i != elementCount - 1) { // ,를 찍어서 출력해주기 위함
				System.out.print(", ");
			}
		}
		System.out.println("]");

		// 특정 위치의 값 수정하기
		myList.set(3, 5);
		myList.print();

		// 모든 데이터를 제거하기
		myList.clear();
		System.out.println(myList.size());

	}

}
