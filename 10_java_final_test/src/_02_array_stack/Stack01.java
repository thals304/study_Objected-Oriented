package _02_array_stack;

class ArrayStack {
	
	private int top;
	private int stackSize;
	private char[] itemArray;
	
	public ArrayStack(int stackSize) {
		top = -1;	
		this.stackSize = stackSize;
		itemArray = new char[this.stackSize];
	}
	
	
	public boolean isEmpty() {	// 처음 stack은 비어 있음
		return (top == -1);
	}
	
	
	public boolean isFull() {
		return (top == this.stackSize-1); // 배열이므로 -1 해주기
	}
	
	
	public void push(char item) {
		
		if (isFull()) {
			System.out.println("Inserting fail! Array Stack is full!!");
		}
		else { 			
			itemArray[++top] = item;
			System.out.println("Inserted Item : " + item);
		}
		
	}
	
	
	public char pop() {
		
		if (isEmpty()) {
			System.out.println("Deleting fail! Array Stack is empty!!");
			return 0;
		}
		else { 
			return itemArray[top--];	
		}	
		
	}
	// 현재 stack의 맨 위에 있는 값 return
	public char peek() {	
		if (isEmpty()) {
			System.out.println("Peeking fail! Array Stack is empty!!");
			return 0;
		}
		else {
			return itemArray[top];		
		}
	}
	
	public void printStack() {
		if (isEmpty()) {
			System.out.printf("Array Stack is empty!! %n %n");
		}
		else {
			System.out.printf("Array Stack>> ");
			for (int i = 0; i <= top; i++) {
				System.out.printf("%c ", itemArray[i]);
			}
			System.out.println("\n");	
		}
	}
}

public class Stack01 {
	
	public static void main(String args[]) {
		
		int stackSize = 5;
		char deletedItem;
		ArrayStack S = new ArrayStack(stackSize);
		
		S.push('A');
		S.printStack();
		
		S.push('B');
		System.out.println( "peek value : "+ S.peek());
		
		S.push('C');
		S.printStack();
		
		deletedItem = S.pop();
		if (deletedItem != 0) { // 0이면 stack이 empty한 상태
			System.out.println("deleted Item : " + deletedItem);
		}
		S.printStack();
		
	}
}