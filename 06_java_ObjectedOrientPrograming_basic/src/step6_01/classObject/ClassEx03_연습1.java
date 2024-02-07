package step6_01.classObject;
// 24.02.07 time 14:13-14:16
/*
 * today 소감문
 * 처음에는 class 만들고 객체 만드는것까지는 이해했는데
 * 클래스의 필드가 배열인데 이것의 합을 어떻게 구해야 하지라는 
 * 두려움이 있었다. 하지만 for문에서 length를 object.arr.length로 사용할 수 있다는
 * 점에서 바로 모든 문제를 자신있게 풀 수 있었던 것 같다. 
 * */
//# 학생성적관리 프로그램[1단계] : 클래스 + 변수

class Ex03_연습1{
	int[] arr = {87, 100, 11, 72, 92};
}



public class ClassEx03_연습1 {

	public static void main(String[] args) {
		
		Ex03_연습1 object= new Ex03_연습1();
		// 문제 1) 전체 합 출력
		// 정답 1) 362
		int sum = 0;
		for (int i = 0; i < object.arr.length; i++) {
			sum += object.arr[i];
		}
		System.out.println(sum);
		
		// 문제 2) 4의 배수의 합 출력
		// 정답 2) 264
		sum = 0;
		for (int i = 0; i < object.arr.length; i++) {
			if (object.arr[i] % 4 == 0) {
				sum += object.arr[i];
			}
		}
		System.out.println(sum);
		
		// 문제 3) 4의 배수의 개수 출력
		// 정답 3) 3
		int cnt = 0;
		for (int i = 0; i < object.arr.length; i++) {
			if (object.arr[i] % 4 == 0) {
				cnt ++;
			}
		}
		System.out.println(cnt);
		
		// 문제 4) 짝수의 개수 출력
		// 정답 4) 3
		cnt = 0;
		for (int i = 0; i < object.arr.length; i++) {
			if (object.arr[i] % 2 == 0) {
				cnt ++;
			}
		}
		System.out.println(cnt);
	}

}
