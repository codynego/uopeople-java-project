package linkedlist;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> list = new LinkedList<>();
		list.addNode("hello");
		list.addNode("there");
		list.popNode();
		list.printList();
		System.out.println(list.size());

	}

}

