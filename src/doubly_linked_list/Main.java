package doubly_linked_list;

public class Main
{

	public static void main(String[] args)
	{
		DoublyLinkedList myDLL = new DoublyLinkedList(1);
		myDLL.printList();
		
		myDLL.append(2);
		myDLL.printList();
		
		// (2) Items - Returns 2 Node
		System.out.println(myDLL.removeLast().value);
		myDLL.printList();
		// (1) Items - Returns 1 Node
		System.out.println(myDLL.removeLast().value);
		myDLL.printList();
		// (0) Items - Returns null
		System.out.println(myDLL.removeLast());
		myDLL.printList();
	}

}
