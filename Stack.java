package exercise;

class Stack { 
    static final int MAX = 1000; 
    int top; 
    int a[] = new int[MAX]; // Maximum size of Stack 
    int size;
  
    boolean isEmpty() 
    { 
        //Write your code here 
    	return top == -1;
    } 

    Stack() 
    { 
        //Initialize your constructor 
        top = -1;
    } 
  
    boolean push(int s) 
    { 
        //Check for stack Overflow
        //Write your code here
    	if (top >= MAX - 1) {
    		System.out.println("Stack Overflow");
    		return false;
    	} else {
    		a[++top] = s;
    		System.out.println(s + " pushed into the stack");
    		return true;
    	}
    } 
  
    int pop() 
    { 
        //If empty return 0 and print " Stack Underflow"
        //Write your code here
    	if (isEmpty()) {
    	      System.out.println("STACK EMPTY");
    	      System.exit(1);
    	    }
    	    return a[top--];
    } 
  
    int peek() 
    { 
        //Write your code here
    	//return a[top];
    	if (top < 0) {
    		System.out.println("Stack Underflow!!!");
    		return 0;
    	} else {
    		int top_value = a[top];
    		return top_value;
    	}
    } 

} 
// Driver code 
class Main { 
    public static void main(String args[]) 
    { 
        Stack s = new Stack(); 
        s.push(10); 
        s.push(20); 
        s.push(30); 
        System.out.println(s.pop() + " Popped from stack"); 
    } 
}
