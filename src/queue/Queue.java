package queue;

public class Queue
{
	private Node first;
	private Node last;
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
	
	public Queue(int value)
	{
		Node newNode = new Node(value);
		first = newNode;
		last = newNode;
		length = 1;
	} // ==========end of Queue constructor==========
	
	public void printQueue()
	{
		Node temp = first;
		System.out.print("[first]");
		while (temp != null)
		{
			System.out.print("{ " + temp.value + " }");
			if (temp.next == null)
			{
				System.out.print("[last]-->");
			}
			else
			{
				System.out.print("-->");
			}
			temp = temp.next;
		}
		System.out.print("null");
		System.out.println();
	} // ==========end of printQueue method==========
	
	public void getFirst()
	{
		System.out.println("First: " + first.value);
	}
	
	public void getLast()
	{
		System.out.println("Last: " + last.value);
	}
	
	public void getLength()
	{
		System.out.println("Length: " + length);
	}
	
	public void enqueue(int value)
	{
		Node newNode = new Node(value);
		if (length == 0)
		{
			first = newNode;
			last = newNode;
		}
		else
		{
			last.next = newNode;
			last = newNode;
		}
		length++;
	}
	
	public Node dequeue()
	{
		if (length == 0)
		{
			return null;
		}
		Node temp = first;
		if ( length == 1)
		{
			first = null;
			last = null;
		}
		else
		{
			first = first.next;
			temp.next = null;
		}
		length--;
		return temp;
	}
	
} // ==========end of class Queue==========
