package step6_02.method;


// 24.02.13 time 12:50-12:54
/*
 * today 소감문
 * 이 문제를 Ex10 다음에 낸 이유를 잘 모르겠다.
 * 왜냐하면 그 이전의 예시들과 같은 문제들도 출제가 되었고
 * 심지어 10번에서 메소드 안에서 다른 메소드를 값을 가져오는 조금 레벨 업인 
 * 문제라고 생각해 11번은 더 어렵고 쉽지 않겠다는 기대를 꺾은 문제였던 것 같다.
 * 아무래도 12번이 어려우니 11번을 간단한 문제로 준거 같은데
 * 차라리 main에서 객체 생성과 메소드 사용까지 내가 직접 쓰게했다면 그나마
 * 괜찮았을 것 같다. 다음 이 문제를 풀게 되면 main 부분까지 직접 써봐야겠다.
 * */
class Ex11_연습문제1{
	
	int test1(int[] arr) { 
		int total = 0;
		for (int i = 0; i < arr.length; i++) {
			total += arr[i];
		}
		return total; 
	}
	
	int test2(int[] arr) {
		int total4 = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 4 == 0) {
				total4 += arr[i];
			}
		}
		return total4; 
	}
	
	int test3(int[] arr) { 
		int cnt = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 4 == 0) {
				cnt ++;
			}
		}
		return cnt; 
	}
	
	int test4(int[] arr) { 
		int cnt = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 0) {
				cnt ++;
			}
		}
		return cnt; 
	}
	

}




public class MethodEx11_연습1 {

	public static void main(String[] args) {

		
			Ex11_연습문제1 e = new Ex11_연습문제1();
			
			int[] arr = {87, 100, 11, 72, 92};
	
			// 문제 1) arr의 요소들의 전체 합 리턴
			// 정답 1) 362
			int tot = e.test1(arr);
			System.out.println("tot = " + tot);
			
			
			
			// 문제 2) arr의 요소들의 4의 배수의 합 리턴
			// 정답 2) 264
			tot = e.test2(arr);
			System.out.println("tot = " + tot);
			
			
			
			// 문제 3) arr의 요소들의 4의 배수의 개수 리턴
			// 정답 3) 3
			int cnt = e.test3(arr);
			System.out.println("cnt = " + cnt);
			
			
			
			// 문제 4) arr의 요소들의 짝수의 개수 리턴
			// 정답 4) 3
			cnt = e.test4(arr);
			System.out.println("cnt = " + cnt);
		

	}

}
