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
	
	public void prepend(int value)
	{
		Node newNode = new Node(value);
		if (length == 0)
		{
			head = newNode;
			tail = newNode;
		}
		else
		{
			newNode.next = head;
			head.prev = newNode;
			head = newNode;
		}
		length++;
	} // ==========end of prepend method==========
	
	public Node removeFirst()
	{
		if (length == 0)
		{
			return null;
		}
		Node temp = head;
		if (length == 1)
		{
			head = null;
			tail = null;
		}
		else
		{
			head = head.next;
			head.prev = null;
			temp.next = null;
		}
		length--;
		return temp;
		
	} // ==========end of removeFirst method==========
	
	public Node get(int index)
	{
		if (index < 0 || index >= length)
		{
			return null;
		}
		Node temp = head;
		if (index < length / 2) 
		{
			for (int i = 0; i < index; i++)
			{
				temp = temp.next;
			}
		}
		else
		{
			temp = tail;
			for (int i = length - 1; i > index; i--)
			{
				temp = temp.prev;
			}
		}
		return temp;
		
	} // ==========end of get method==========
	
	public boolean set(int index, int value)
	{
		Node temp = get(index);
		if (temp != null)
		{
			temp.value = value;
			return true;
		}
		return false;
		
	} // ==========end of set method==========
	
	public boolean insert(int index, int value)
	{
		if (index < 0 || index > length)
		{
			return false;
		}
		if (index == 0)
		{
			prepend(value);
			return true;
		}
		if (index == length)
		{
			append(value);
			return true;
		}
		Node newNode = new Node(value);
		Node before = get(index - 1);
		Node after = before.next;
		newNode.prev = before;
		newNode.next = after;
		before.next = newNode;
		after.prev = newNode;
		length++;
		return true;
		
	} // ==========end of insert method==========
	
	public Node remove(int index)
	{
		if (index < 0 || index >= length)
		{
			return null;
		}
		if (index == 0)
		{
			return removeFirst();
		}
		if (index == length - 1)
		{
			return removeLast();
		}
		Node temp = get(index);
		temp.next.prev = temp.prev;
		temp.prev.next = temp.next;
		temp.next = null;
		temp.prev = null;
		length--;
		return temp;
		
	} // ==========end of remove method==========
	
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
