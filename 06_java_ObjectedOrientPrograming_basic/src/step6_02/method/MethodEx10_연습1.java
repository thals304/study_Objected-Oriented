package step6_02.method;

import java.util.Arrays;
// 24.02.13 time 12:17-12:26
/*
 * today 소감문
 * 문제 1은 간단하게 잘 풀었지만 2번에서 저장할 임의의 배열의 크기를 어떻게 설정해야 되는지
 * 너무 헷갈리고 쉽지 않았다. 그래서 정답예시를 참고했더니 메소드 test1에 arr을 넣어 
 * 나오는 값인 4의 배수의 개수를 가져와서 임의의 배열의 크기로 넣어주었다.
 * 어떻게 보면 되게 쉬운 내용인데 내 머리로는 잘 떠오르지 않아 계속 연습해야겠다.
 * 근데 j를 활용해서 배열에 차근차근 넣을 생각을 떠올린 것은 아주 잘했다고 생각했다.
 * */
class Ex10_연습문제1 {
	
	int test1(int[] arr) { 
		int cnt = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 4 == 0) {
				cnt ++;
			}
		}
		return cnt; 
	}
	
	int[] test2(int[] arr) { 
		int cnt = test1(arr);	// 값이 넘어온 것이므로 이렇게 가져와야함
		int[] temp = new int[cnt];	// 저장할 배열 크기를 어떻게 하지? tes1 메소드 활용!
		int j = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 4 == 0) {
				temp[j] = arr[i];
				j++;
			}
		}
		return temp; 
		}
	
}



public class MethodEx10_연습1 {

	public static void main(String[] args) {
		
	
			Ex10_연습문제1 e = new Ex10_연습문제1();
			
			int[] arr = {87, 12, 21, 56, 100};
			
			// 문제 1) 4의 배수의 개수를 리턴해주는 메서드
			int cnt = e.test1(arr);
			System.out.println("cnt = " + cnt);
			
			// 문제 2) 4의 배수의 개수만큼의 새로운 배열을 만들고, 4의 배수를 저장후 배열을 리턴해주는 메서드
			int[] temp = e.test2(arr);
			System.out.println(Arrays.toString(temp));
		


	}

}
