package _01_list;
/*
 * 헷갈리는 부분
 * 1.
 * ListNode temp = head;      의 의미
 *                 head.link;
 * 2.
 * temp != null
 * temp == null
 * temp.link != null
 * temp.link == null
 * 
 * 3.
 * 역순 구조
 * 
 * 4. link의 데이터 타입이 ListNode인 이유
 * 
 * */
class LinkedList{
	
	private ListNode head; // data, link가 있는데 처음엔 기본으로 null
	
	public LinkedList() {	// 생성자
		head = null;		// 처음 head는 null(존재 X)
	}
	
	// 중간에 삽입 
	public void insertMiddleNode(ListNode pre, String data) {       
		ListNode newNode = new ListNode(data);
		// pre.link에는 이미 이전에 연결되어 있던 노드의 링크가 저장되어있으므로 
		// 삽입할 노드가 일단 그 링크를 받고 pre.link는 삽입할 노드의 링크를 대입
		newNode.link = pre.link; 
		pre.link = newNode;
	}
	
	// 맨 마지막에 삽입 
	public void insertLastNode(String data) {
		
		ListNode newNode = new ListNode(data); // newNode는 어차피 tail이 되므로 link는 null
		
		if (head == null) {
			this.head = newNode;
		}
		else {
			ListNode temp = head; // head 시작주소 백업
			// 리스트의 끝을 찾는 과정 
			while (temp.link != null) {	 // 연결된 다음 노드가 존재(head 노드에 연결된 주소가 null이 아닌 경우)
				temp = temp.link;	// head에 다음 노드 주소 연결 //연결된 다음 노드로 넘어가게 해주는 건가?
			}
			temp.link = newNode; // 추가한 노드를 맨 마지막에 연결 (추가한 노드가 tail이 됨)
			
		}
		
	}
	
	// 맨 마지막 노드 삭제
	public void deleteLastNode() {
		
		ListNode pre, temp;
		if (head == null)  return; // 노드가 0개 // 메서드 종료
		
		if (head.link == null) {	// 노드가 1개?
			head = null;
		}
		else {
			pre = head; // pre에 head 시작 주소 백업
			temp = head.link;	// head에 연결된 다음 노드의 주소?
			while (temp.link != null) { // tail 노드의 link가 아닌 경우
				pre = temp; // head에 temp 연결
				temp = temp.link;  // 다음 노드 주소 연결
			}
			pre.link = null; // 맨 마지막 tail 노드 연결 끊기
		}
		
	}
	
	// 존재 여부 확인
	public ListNode searchNode(String data) {
		
		ListNode temp = this.head;
		
		while (temp != null){ // ?
			if (data == temp.getData())  
				return temp;
			else temp = temp.link; // 연결된 다음 노드로 넘어가게 해주는 건가?
		}
		
		return  temp;
		
	}
	
	// 역순
	public void reverseList() {

		// 변수 틀 : pre current next(head)
		ListNode next = head;
		ListNode current = null;
		ListNode pre = null;
		
		while (next != null) { // head != null이 도대체 무슨 의미야? 
			pre = current; 
			current = next; 
			next = next.link; // ?
			current.link = pre;
		}
		
		head = current;
		
	}
	
	
	public void printList() {
		
		ListNode temp = this.head;
		System.out.printf("L = (");
		
		while (temp != null) {
			System.out.printf(temp.getData());
			temp = temp.link;
			if (temp != null) {
				System.out.printf(", ");
			}			
		}
		
		System.out.println(")");
	}
	
}


class ListNode {
	
	private String data;
	public ListNode link; // 클래스가 데이터 타입? 왜지? 주소(링크)이기 때문에?
	
	public ListNode() {	// 생성자1
		this.data = null;
		this.link = null;
	}
	public ListNode(String data) {	// 생성자2 오버로딩
		this.data = data;
		this.link = null;
	}
	public ListNode(String data, ListNode link) {	// 생성자3 오버로딩
		this.data = data;
		this.link = link;
	}
	public String getData() {	// data가 private하므로 getter로 반환
		return  this.data;
	}
	
}

public class List01{
	
	public static void main(String args[]) {
		
		LinkedList L = new LinkedList();
		
		System.out.println("(1) 공백 리스트에 노드 3개 삽입하기");
		L.insertLastNode("월");
		L.insertLastNode("수");
		L.insertLastNode("일");
		L.printList();

		System.out.println("(2) 수 노드 뒤에 금 노드 삽입하기");
		ListNode pre = L.searchNode("수");
		
		if (pre == null) {
			System.out.println("검색실패>> 찾는 데이터가 없습니다.");
		}
		else {
			L.insertMiddleNode(pre, "금");
			L.printList();
		}

		System.out.println("(3) 리스트의 노드를 역순으로 바꾸기");
		L.reverseList();
		L.printList();

		System.out.println("(4) 리스트의 마지막 노드 삭제하기");      
		L.deleteLastNode();
		L.printList();
		
	}
}
