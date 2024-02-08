package step6_02.method;

import java.util.Scanner;
// 24.02.08 time 14:25-14:29
/*
 * today 소감문
 * 파라미터와 return 값이 없는 문제였다.
 * main에서 구현한 것을 메소드에서 그대로 코드 써주면 되서 
 * 간단하게 풀었다.
 * 
 * */
class Ex05_연습문제1{

	void test1() {
		int total = 0;
		for (int i = 1; i <= 5; i++) {
			total += i;
		}
		System.out.println(total);
	}
	
	void test2() {
		Scanner scan = new Scanner(System.in);
		int[] arr = new int[3];
		for (int i = 0; i < arr.length; i++) {
			System.out.print("정수 입력 : ");
			arr[i] = scan.nextInt();
		}
		int max = arr[0];
		
		for (int i = 0; i < arr.length; i++) {
			if (max < arr[i]) {
				max = arr[i];
			}
		}
		System.out.println("최댓값 : " + max);
		scan.close();
	}
	
}


public class MethodEx05_연습1 {

	public static void main(String[] args) {

		
			Ex05_연습문제1 e = new Ex05_연습문제1();
						
			// 문제 1) 1부터 5까지의 합을 출력하는 메서드
			e.test1();
			
			// 문제 2) 정수 3개를 배열에 입력받아 최대값을 출력하는 메서드
			e.test2();
		


	}

}
