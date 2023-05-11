package queues;
import java.util.LinkedList;
import java.util.Queue;

public class Main {

	public static void main(String[] args) {
		/*
			Queue = FIFO data structure. First-In First-Out
			A collection designed for holding elements prior to processing
			Linear data structure
	
			enqueue = offer()
			dequeue = poll()
		*/
	
		Queue<String> queue = new LinkedList<String>(); // Queues are only interfaces
	
		queue.offer("Karen");
		queue.offer("Chad");
		queue.offer("Steve");
		queue.offer("Harold");
	
		System.out.println(queue.isEmpty());
		System.out.println(queue.size());
		System.out.println(queue.contains("Harold"));
		System.out.println(queue.peek());
	
		queue.poll();
		queue.poll();
		queue.poll();
		queue.poll();
	
		/* Where are queues useful
			1. Keyboard buffer (letters should appear on the screen in the order they're pressed)
			2. Printer queue
			3. Used in LinkedLists, PriorityQueues, Breadth-First search
		*/
	}

}
