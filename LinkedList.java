package exercise;

//import java.io.*; 

//Java program to implement 
//a Singly Linked List 
public class LinkedList { 

	Node head; // head of list 

	// Linked list Node. 
	// This inner class is made static 
	// so that main() can access it 
	static class Node { 

		int data; 
		Node next; 

		// Constructor 
		Node(int d) 
		{ 
			data = d; 
			next = null; 
		} 
	} 

	// Method to insert a new node 
	public static LinkedList insert(LinkedList list, int data) 
	{ 
		// Create a new node with given data 
		Node tmp = new Node(data); 
		tmp.next = null; 

		// If the Linked List is empty, 
		// then make the new node as head 
		if (list.head == null) { 
			list.head = tmp; 
		} 
		else { 
			// Else traverse till the last node 
			// and insert the new_node there 
			Node fin = list.head; 
			while (fin.next != null) { 
				fin = fin.next; 
			} 

			// Insert the new_node at last node 
			fin.next = tmp; 
		} 

		// Return the list by head 
		return list; 
	} 

	// Method to print the LinkedList. 
	public static void printList(LinkedList list) 
	{ 
		Node tmp2 = list.head; 

		System.out.print("LinkedList: "); 

		// Traverse through the LinkedList 
		while (tmp2 != null) { 
			// Print the data at current node 
			System.out.print(tmp2.data + " "); 

			// Go to next node 
			tmp2 = tmp2.next; 
		} 
	} 

	// Driver code 
	public static void main(String[] args) 
	{ 
		/* Start with the empty list. */
		LinkedList list = new LinkedList(); 

		// 
		// ******INSERTION****** 
		// 

		// Insert the values 
		list = insert(list, 1); 
		list = insert(list, 2); 
		list = insert(list, 3); 
		list = insert(list, 4); 
		list = insert(list, 5); 
	
		// Print the LinkedList 
		printList(list); 
	} 
} 
