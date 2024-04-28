package doubly_linked_list;

public class DoublyLinkedList
{
	private Node head;
	private Node tail;
	private int length;
	
	class Node
	{
		int value;
		Node next;
		Node prev;
		
		Node(int value)
		{
			this.value = value;
		} // ==========end of Node constructor==========
		
	} // ==========end of inner class Node==========
	
	public DoublyLinkedList(int value)
	{
		Node newNode = new Node(value);
		head = newNode;
		tail = newNode;
		length = 1;
	} // ==========end of DoublyLinkedList constructor==========
	
	public void printList()
	{
		Node temp = head;
		System.out.print("null<--");
		while (temp != null)
		{
			if (temp.next != null)
			{
				System.out.print("{ " + temp.value + " }<==>");
			}
			else
			{
				System.out.print("{ " + temp.value + " }-->");
			}
			
			temp = temp.next;
		}
		System.out.print("null");
		System.out.println();
	
	} // ==========end of printList==========
	
	public void append(int value)
	{
		Node newNode = new Node(value);
		if (length == 0)
		{
			head = newNode;
			tail = newNode;
		}
		else
		{
			tail.next = newNode;
			newNode.prev = tail;
			tail = newNode;
		}
		length++;
	} // ==========end of append==========
	
	public Node removeLast()
	{
		if (length == 0)
		{
			return null;
		}
		Node temp = tail;
		if (length == 1)
		{
			head = null;
			tail = null;
		}
		else
		{
			tail = tail.prev;
			tail.next = null;
			temp.prev = null;
		}
		length--;
		return temp;
		
	} // ==========end of removeLast method==========
	
	public void getHead()
	{
		System.out.println("Head: " + head.value);
	}
	
	public void getTail()
	{
		System.out.println("Tail: " + tail.value);
	}
	
	public void getLength()
	{
		System.out.println("Length: " + length);
	}
	
} // ==========end of class DoublyLinkedList==========
