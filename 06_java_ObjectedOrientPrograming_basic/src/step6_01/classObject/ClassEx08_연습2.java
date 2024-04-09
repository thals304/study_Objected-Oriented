package step6_01.classObject;
/*
 * 24.04.08 time 18:28-18:46
 * today 소감문
 * 미뤄두고 미뤄두던 문제였던 것 같다. 앞에 제어문에서도 이 문제를 풀어보라고 했는데 아마 내 방식대로 풀다가 답이 안나와서
 * 다음에 정답예시를 먼저 분석해봐야지 했는데 그게 벌써 4월이 되서야 하게 되었던 것 같다.
 * 클래스와 객체를 이용해 풀어봤는데 물론 내가 바로 풀지는 못했고 이해하면서 따라해본 것 같다.
 * 조금만 나에게 어려운 내용이 나오면 받아들이는게 두려워서 미뤄뒀던 것 같던데 확실히 하니까 개운하고 그렇게까지 어렵지는
 * 않았어서 다음에 풀때는 이 풀이가 내 머리에서 바로바로 나오면 좋겠다.
 * */
/**/
/*
 * # 숫자이동[3단계] : 클래스 + 변수
 * 1. 숫자2는 캐릭터이다.
 * 2. 숫자1을 입력하면, 캐릭터가 왼쪽으로
 * 	  숫자2를 입력하면, 캐릭터가 오른쪽으로 이동한다.
 * 3. 숫자 1은 벽이다. 벽을 만나면 이동할 수 없다.
 * 4. 단, 숫자3을 입력하면, 벽을 격파할 수 있다.
 * 5. 좌우 끝에 도달해도 계속 반대편으로 이동이 가능하다.
 * 예) 
 *  0 0 0 0 0 0 0 2 
 *  왼쪽(1) 오른쪽(2) : 2
 *  
 *  2 0 0 0 0 0 0 0 
 */

import java.util.Scanner;

class Ex08_연습2{
	int[] game = {0, 0, 1, 0, 2, 0, 0, 1, 0};
}



public class ClassEx08_연습2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		Ex08_연습2 obj = new Ex08_연습2(); // 객체 생성
	
		int player = 0;
		// player 위치 : 인덱스 번호
		for (int i = 0; i < obj.game.length; i++) {
			if (obj.game[i] == 2) {
				player = i;
			}
		}
		
		while(true) {
			// 배열 모습 보여줌
			for(int i = 0; i < obj.game.length; i++) {
				System.out.print(obj.game[i] + " ");
			}
			System.out.println();
			
			System.out.print("1.left 2.right : ");
			int move = scan.nextInt();
			// 왼쪽으로 이동
			if (move == 1) {
				// player 위치가 왼쪽 맨끝에 위치하지 않고 현재 player 왼쪽에 벽이 있는 경우
				if (player != 0 && obj.game[player - 1] == 1) {
					System.out.print("3.punch : ");
					int punch = scan.nextInt();
					if (punch != 3) {
						continue;
				}
			}
				obj.game[player] = 0;
				player --;
				// 맨 왼쪽에서 왼쪽으로 한 칸 가야하는 경우 맨 오른쪽으로 인덱스 바꿔주기
				if (player == -1) {
					player = obj.game.length - 1;
				}
				
				obj.game[player] = 2;
			}
			else if (move == 2) {
				if (player != obj.game.length - 1 && obj.game[player + 1] == 1) {
					System.out.print("3.punch : ");
					int punch = scan.nextInt();
					if (punch != 3) {
						continue;
					}
					
					obj.game[player] = 0;
					player++;
					
					if (player == obj.game.length) {
						player = 0;
					}
					
					obj.game[player] = 2;
				}
			}
		}
	}
}
