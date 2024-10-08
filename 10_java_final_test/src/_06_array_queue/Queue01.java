package _06_array_queue;

class ArrayQueue {
	
	private int front;
	private int rear;
	private int queueSize;
	private char[] itemArray;
	
	public ArrayQueue(int queueSize) {	// 생성자
		front = -1;
		rear = -1;
		this.queueSize = queueSize;
		itemArray = new char[this.queueSize];
	}
	
	
	public boolean isEmpty() {	// 처음 큐는 비어있으므로 front와 rear가 같음
		return (front == rear);
	}
	
	
	public boolean isFull() {	
		return (rear == this.queueSize-1); // 배열이므로 인덱스는 - 1
	}
	
	// 큐에 값 넣기
	public void enQueue(char item) {
		
		if (isEmpty()) {	// 비어 있는 조건을 왜 쓰지? 원형 큐에서 사
			front = -1;
			rear = -1;
		}
		
		if (isFull()) {
			System.out.println("Inserting fail! Array Queue is full!!");
		}
		else { 			
			itemArray[++rear] = item;
			System.out.println("Inserted Item : " + item);
		}
	}
	
	
	public char deQueue(){
		
		if (isEmpty()) {
			System.out.println("Deleting fail! Array Queue is empty!!");
			return 0;
		}
		else { 
			return itemArray[++front];	
		}
				
	}
	
	
	public void printQueue() {
		
		if (isEmpty()) {
			System.out.printf("Array Queue is empty!! %n %n");
		}
		else {
			System.out.printf("Array Queue>> ");
			for (int i = front+1; i <= rear; i++) {
				System.out.printf("%c ", itemArray[i]);
			}
			System.out.println();System.out.println();
		}
		
	}

}

public class Queue01{
	public static void main(String args[]){
		int queueSize = 3;
		char deletedItem;
		ArrayQueue Q = new ArrayQueue(queueSize);
		
		Q.enQueue('A');
		Q.printQueue();
		
		Q.enQueue('B');
		Q.printQueue();
		
		deletedItem = Q.deQueue();
		if(deletedItem != 0)
			System.out.println("deleted Item : " + deletedItem);
		Q.printQueue();
		
		Q.enQueue('C');
		Q.printQueue();
		
		deletedItem = Q.deQueue();
		if(deletedItem != 0)
			System.out.println("deleted Item : " + deletedItem);
		Q.printQueue();

		deletedItem = Q.deQueue();
		if(deletedItem != 0)
			System.out.println("deleted Item : " + deletedItem);
		Q.printQueue();		
		
		deletedItem = Q.deQueue();
		if(deletedItem != 0)
			System.out.println("deleted Item : " + deletedItem);
		Q.printQueue();	
	}
}