package stack;

public class Stack
{
	private Node top;
	private int height;
	
	class Node
	{
		int value;
		Node next;
		
		Node(int value)
		{
			this.value = value;
		}
		
	} // ==========end of inner class Node==========
	
	public Stack (int value)
	{
		Node newNode = new Node(value);
		top = newNode;
		height = 1;
	} // ==========end of Stack constructor==========
	
	public void printStack()
	{
		Node temp = top;
		while (temp != null)
		{
			System.out.println(temp.value);
			temp = temp.next;
		}
	} // ==========end of printStack method==========
	
	public void getTop()
	{
		System.out.println("Top: " + top.value);
	} // ==========end of getTop method==========
	
	public void getHeight()
	{
		System.out.println("Height: " + height);
	} // ==========end of getHeight method==========
	
	public void push(int value)
	{
		Node newNode = new Node(value);
		if (height == 0)
		{
			top = newNode;
		}
		else
		{
			newNode.next = top;
			top = newNode;
		}
		height++;
	} // ==========end of push method==========
	
	public Node pop()
	{
		if (height == 0)
		{
			return null;
		}
		Node temp = top;
		top = top.next;
		temp.next = null;
		height--;
		return temp;
	}
	
} // ==========end of class Stack==========
