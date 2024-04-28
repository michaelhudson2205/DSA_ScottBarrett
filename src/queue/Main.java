package queue;

public class Main
{

	public static void main(String[] args)
	{
		Queue myQueue = new Queue(2);
		myQueue.printQueue();
		myQueue.enqueue(1);
		myQueue.printQueue();
		
		// (2) Items - Returns 2 Node
		System.out.println(myQueue.dequeue().value);
		// (1) Items - Returns 1 Node
		System.out.println(myQueue.dequeue().value);
		// (0) Items - Returns null
		System.out.println(myQueue.dequeue());
		
	} // ==========end of psvm==========

} // ==========end of class Main==========
