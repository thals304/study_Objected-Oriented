package step6_02.method;
// 24.02.13 time 12:29-12:34
/*
 * today 소감문
 * Ex9를 먼저 풀고 와서 그런가 Ex8은 굉장히 쉽게 풀고 
 * 이해도 잘 된 것 같다. 
 * Ex7과 다른점은 밑에서 객체를 만들고 메소드를 이용하는 것까지
 * 내가 직접 써야한다는 점이었던 것 같다.
 * */

class Ex08_연습문제1 {
	
	void printSum(int[] arr) {
		int total = 0;
		for (int i = 0; i < arr.length; i++) {
			total += arr[i];
		}
		System.out.println(total);
	}
	void printSumMultiple4(int[] arr) {
		int total4 = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 4 == 0) {
				total4 += arr[i];
			}
		}
		System.out.println(total4);
	}
	
	void printCountMultiple4(int[] arr) {
		int cnt = 0;
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] % 4 == 0) {
				cnt ++;
			}
		}
		System.out.println(cnt);
	}
}


public class MethodEx08_연습1 {

	public static void main(String[] args) {
		
		int[] arr = { 87, 100, 11, 72, 92 };

		Ex08_연습문제1 object = new Ex08_연습문제1();
		// 문제 1) arr요소의 전체 합을 출력하는 메서드
		// 정답 1) 362
		object.printSum(arr);
		
		// 문제 2) 4의 배수의 합을 출력하는 메서드
		// 정답 2) 264
		object.printSumMultiple4(arr);
		
		// 문제 3) 4의 배수의 개수를 출력하는 메서드
		// 정답 3) 3
		object.printCountMultiple4(arr);
		
		

	}

}
