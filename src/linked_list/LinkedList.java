package linked_list;

public class LinkedList
{
	private Node head;
	private Node tail;
	private int length;
	
	class Node
	{
		int value;
		Node next;
		
		Node(int value)
		{
			this.value = value;
		}
	} // ==========end of inner class Node==========
	
	public LinkedList(int value)
	{
		Node newNode = new Node(value);
		head = newNode;
		tail = newNode;
		length = 1;
	} // ==========end of LinkedList constructor==========
	
	public Node getHead()
	{
		return head;
	}
	
	public Node getTail()
	{
		return tail;
	}
	
	public int getLength()
	{
		return length;
	}
	
	public void printList()
	{
		Node temp = head;
		while (temp != null)
		{
			System.out.print("{ " + temp.value + " }==>");
			temp = temp.next;
		}
		System.out.print("null");
		System.out.println();
	} // ==========end of printList==========
	
	public void printAll()
	{
		if (length == 0)
		{
			System.out.println("Head: null");
			System.out.println("Tail: null");
		}
		else
		{
			System.out.println("Head: " + head.value);
			System.out.println("Tail: " + tail.value);
		}
		System.out.println("Length: " + length);
		System.out.println("\nLinked List:");
		if (length == 0)
		{
			System.out.println("empty");
		}
		else
		{
			printList();
		}
	} // ==========end of printAll==========
	
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
		
		Node temp = head;
		Node pre = head;
		while (temp.next != null)
		{
			pre = temp;
			temp = temp.next;
		}
		tail = pre;
		tail.next = null;
		length--;
		if (length == 0)
		{
			head = null;
			tail = null;
		}
		return temp;
	} // ==========end of removeLast==========
	
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
			head = newNode;
		}
		length++;
	} // ==========end of prepend==========
	
	public Node removeFirst()
	{
		if (length == 0)
		{
			return null;
		}
		Node temp = head;
		head = head.next;
		temp.next = null;
		length--;
		if (length == 0)
		{
			tail = null;
		}
		return temp;
	} // ==========end of removeFirst==========
	
	public Node get(int index)
	{
		if (index < 0 || index >= length)
		{
			return null;
		}
		Node temp = head;
		for (int i = 0; i < index; i++)
		{
			temp = temp.next;
		}
		return temp;
	} // ==========end of get==========
	
	public boolean set(int index, int value)
	{
		Node temp = get(index);
		if (temp != null)
		{
			temp.value = value;
			return true;
		}
		return false;
	} // ==========end of set==========
	
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
		Node temp = get(index - 1);
		newNode.next = temp.next;
		temp.next = newNode;
		length++;
		return true;
	} // ==========end of insert==========
	
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
		
		Node prev = get(index - 1);
		Node temp = prev.next;
		
		prev.next = temp.next;
		temp.next = null;
		length--;
		return temp;
	} // ==========end of remove==========
	
	public void reverse()
	{
		Node temp = head;
		head = tail;
		tail = temp;
		Node after = temp.next;
		Node before = null;
		for (int i = 0; i < length; i++)
		{
			after = temp.next;
			temp.next = before;
			before = temp;
			temp = after;
		}
	} // ==========end of reverse method==========
	
} // ==========end of class LinkedList==========