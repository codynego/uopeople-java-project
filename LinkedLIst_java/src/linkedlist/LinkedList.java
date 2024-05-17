package linkedlist;

public class LinkedList<T> {
	private Node<T> head;
	private int size;
	
	
	public boolean addNode(T data) {
		Node<T> newNode = new Node<>(data);
		if (head == null) {
			head = newNode;
		} else {
			Node<T> temp;
			temp = head;
			while(temp.next != null) {
				temp = head.next;
			}
			
			newNode.next = null;
			temp.next = newNode;
		}
		size++;
		
		return true;
	}
	
	public int size() {
		return size;
	}
	public void popNode() {
		Node<T> temp = head;
		if (temp.next == null) {
			head = null;
			return;
		}
		while (temp.next.next != null) {
			temp = temp.next;
		}
		temp.next = null;
		size--;
	}
	public void printList() {
		Node<T> temp;
		temp = head;
		while (temp != null) {
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
	}
}
