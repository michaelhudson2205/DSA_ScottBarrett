package stack;

public class Main
{

	public static void main(String[] args)
	{
		Stack myStack = new Stack(7);
		myStack.push(23);
		myStack.push(3);
		myStack.push(11);
		myStack.printStack();
		myStack.pop();
		myStack.printStack();
	}

}
