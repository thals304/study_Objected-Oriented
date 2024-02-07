package step6_01.classObject;
// 24.02.07 time 21:20-21:46
/*
 * today 소감문
 * 일단 이 문제는 내가 진짜 못하는 게임 문제 중 하나이다.
 * 그런데 어찌 저찌해서 일단 코드를 짜보긴 해봤는데
 * 생각보다 원하는대로 잘 돌려져서 기분이 좋았다.
 * 근데 이전에 이 문제에서는 좌우 끝에 도달하면 이동 불가능이라는 조건이 이번에는
 * 반대로 바뀌어서 그 부분에서 코드를 돌리면 index out of bound가 떠서 좀더 고민해 보고 
 * 코드를 수정해봐야겠다.
 * */
/*
 * # 숫자이동[3단계] : 클래스 + 변수
 * 1. 숫자2는 캐릭터이다.
 * 2. 숫자1을 입력하면, 캐릭터가 왼쪽으로
 * 	    숫자2를 입력하면, 캐릭터가 오른쪽으로 이동한다.
 * 3. 숫자 1은 벽이다. 벽을 만나면 이동할 수 없다.
 * 4. 단, 숫자3을 입력하면, 벽을 격파할 수 있다.
 * 5. 좌우 끝에 도달해도 계속 반대편으로 이동이 가능하다.
 * 예) 
 *  0 0 0 0 0 0 0 2 
 *  왼쪽(1) 오른쪽(2) : 2
 *  
 *  2 0 0 0 0 0 0 0 
 */

import java.util.Arrays;
import java.util.Scanner;

class Ex08_연습문제1{
	int[] game = {0, 0, 1, 0, 2, 0, 0, 1, 0};
}


public class ClassEx08_연습1 {

	public static void main(String[] args) {
	 Scanner scan = new Scanner(System.in);
	 
	 Ex08_연습문제1 object = new Ex08_연습문제1();
	 
	 // 2의 위치
	 int element = 5;
	 
	 while (true) {
		 System.out.println(Arrays.toString(object.game));
		 System.out.println("=====메뉴=====");
		 System.out.println("[1] 왼쪽으로 이동");
		 System.out.println("[2] 오른쪽으로 이동");
		 System.out.println("[3] 벽 격파 가능");
		 System.out.println("[0] 종료");
		 
		 System.out.print("메뉴 선택 :");
		 int menu = scan.nextInt();
		 
		 if (menu == 1) {
			 
				 if (object.game[element - 2] == 1) {	// 2가 인덱스 0 위치에 있고 왼쪽으로 한 칸 이동해야 할 때 index out of bound 로 
					 System.out.println("벽입니다. 이동이 불가합니다.");
				 }
				 else {
					 if (element == 1) {	// 배열 좌측 끝일 때 2의 위치는 인덱스 8으로 가야함
						 object.game[object.game.length - 1] = 2;
						 object.game[0] = 0;
						 element = 9;
					 }
					 else {
						 object.game[element - 2] = 2;
						 object.game[element - 1] = 0;
						 element --;
					 }
				 }
			 
			 
		 }
		 else if (menu == 2) {
			
				 if (object.game[element] == 1) {	// 2가 인덱스 9 위치에 있고 오른쪽으로 한 칸 해야 할 때 out of index로 
					 System.out.println("벽입니다. 이동이 불가합니다.");
				 }
				 else {
					 if (element == 1) {	// 배열 우측 끝일 때 2의 위치는 인덱스 0으로 가야함
						 object.game[object.game.length - 1] = 0;
						 object.game[0] = 2;
						 element = 1;
					 }
					 else {
						 object.game[element - 1] = 0;
						 object.game[element] = 2;
						 element ++;
					 }
				 }
			 
			 
		 }
		 else if (menu == 3) {
			 System.out.print("[1] 왼쪽 격파 [2] 오른쪽 격파 : ");
			 int choose = scan.nextInt();
			 if (choose == 1) {
				 object.game[element - 2] = 2;
				 object.game[element - 1] = 0;
				 element --;
			 }
			 else if (choose == 2) {
				 // 한 칸 우측이 1일 경우
				 object.game[element - 1] = 0;
				 object.game[element] = 2;
				 element ++;
			 }
			 
		 }
		 else if (menu == 0) {
			 break;
		 }
	 }
	 	scan.close();
	 	System.out.println("게임 종료");
	 	System.out.println(Arrays.toString(object.game));
	}

}
