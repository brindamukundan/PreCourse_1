package exercise;

class StackAsLinkedList {

	StackNode root;
	StackNode tmp;
	int value = Integer.MIN_VALUE;

	static class StackNode {
		int data;
		StackNode next;

		StackNode(int data) {
			// Constructor here
			this.data = data;
		}
	}

	public boolean isEmpty() {
		// Write your code here for the condition if stack is empty.
		if (root == null) {
			return true;
		} else {
			return false;
		}
	}

	public void push(int data) {
		// Write code to push data to the stack.
		StackNode Node = new StackNode(data);
		if (root == null) {
			root = Node;
		} else {
			tmp = root;
			root = Node;
			Node.next = tmp;
		}
	}

	public int pop() {
		// If Stack Empty Return 0 and print "Stack Underflow"
		// Write code to pop the topmost element of stack.
		// Also return the popped element
		if (root == null) {
			System.out.println("STACK EMPTY");
		} else {
			value = root.data;
			root = root.next;
		}
		return value;
	}

	public int peek() {
		// Write code to just return the topmost element without removing it.
		if (root == null) {
			System.out.println("STACK EMPTY");
			return value;
		} else {
			return root.data;
		}
	}
}

// Driver code
class Main_2 {
	public static void main(String[] args) {

		StackAsLinkedList sll = new StackAsLinkedList();

		sll.push(10);
		sll.push(20);
		sll.push(30);

		System.out.println(sll.pop() + " popped from stack");

		System.out.println("Top element is " + sll.peek());
	}
}