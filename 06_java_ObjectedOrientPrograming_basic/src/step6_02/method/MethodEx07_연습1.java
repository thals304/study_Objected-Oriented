package step6_02.method;

// 24.02.36 time  14:36-14:44
/* 
 * today 소감문
 * 문제 3에서 소수를 모두 출력하는 곳에서 cnt == 2일 때 출력하는
 * 조건문을 어디 위치에 써야될지 수정 또 수정 또 수정을 한 끝에 
 * 완성했다. 이미 전에서 예제인데도 불구하고 벌써 까먹은 나로서 
 * 이번년도 동안 계속 연습이 필요하다고 생각한다.
 * 
 * */
class Ex07_연습문제1 {
	
	void printEvenOrOdd(int x) {
		if (x % 2 == 0) {
			System.out.println( x +"는 짝수입니다.");
		}
		else System.out.println(x +"는 홀수입니다.");
	}
	void getAvgBetweenValues(int x, int y) {
		int total = 0;
		for (int i = x; i <= y; i++) {
			total += i;
		}
		double avg = total / (double) (y - x + 1);
		System.out.println(x +"부터 " + y +"까지의 합의 평균 : " + avg);
	}

	void printPrimeNums(int primeNumber) {
		// 수정하기!
		System.out.print("소수 : ");
		for (int i = 2; i <= primeNumber; i++) {
			int cnt = 0;
			for (int j = 1; j <= i; j++) {
				if (i % j == 0) {
					cnt ++;
				}
			}
			if (cnt == 2) {
				System.out.print(i + " ");
			}
		}
		
	}
}


public class MethodEx07_연습1 {

	public static void main(String[] args) {
		
		
			Ex07_연습문제1 e = new Ex07_연습문제1();
			
			// 문제 1) num이 홀수인지 짝수인지 출력하는 메서드
			int num = 19;
			e.printEvenOrOdd(num);
	
			// 문제 2) x부터 y까지 합의 평균을 출력하는 메서드
			int x = 1;
			int y = 10;
			e.getAvgBetweenValues(x, y);
	
			// 문제3) 2부터 primeNumber까지의 소수를 전부 출력하는 메서드 
			int primeNumber = 20;
			e.printPrimeNums(primeNumber);
		



	}

}
