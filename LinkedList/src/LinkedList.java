public class LinkedList<T> {
	private Node<T> head = null;
	private int size;
	
	
	public boolean addNode(T data) {
		if (head == null) {
			head.data = data;
			head.next = null;
		} else {
			Node<T> temp;
			temp = head;
			while(temp.next != null) {
				temp = head.next;
			}
			Node<T> newNode;
			newNode.data = data;
			newNode.next = null;
			temp.next = newNode;
		}
		
		return true;
	}
	public void printList() {
		Node<T> temp;
		temp = head;
		while (temp != null) {
			System.out.println(temp.data);
			temp = temp.next;
		}
	}
}
