package priority_queues;
import java.util.*;

public class Main {

	public static void main(String[] args) {
		// no priority, random order

		/*
		Queue<Double> queue = new LinkedList<>();

		queue.offer(3.0);
		queue.offer(2.5);
		queue.offer(4.0);
		queue.offer(1.5);
		queue.offer(2.0);

		while(!queue.isEmpty()) {
			System.out.println(queue.poll());
		}
		*/

		// In this case, the values will be sorted from smaller to biggest as a priority

		
		Queue<Double> queue = new PriorityQueue<>();

		queue.offer(3.0);
		queue.offer(2.5);
		queue.offer(4.0);
		queue.offer(1.5);
		queue.offer(2.0);

		while(!queue.isEmpty()) {
			System.out.println(queue.poll());
		}
		
		System.out.println();
		// In this case, the values will be sorted from biggest to smaller as a priority

		
		Queue<Double> queueReverse = new PriorityQueue<>(Collections.reverseOrder());

		queueReverse.offer(3.0);
		queueReverse.offer(2.5);
		queueReverse.offer(4.0);
		queueReverse.offer(1.5);
		queueReverse.offer(2.0);

		while(!queueReverse.isEmpty()) {
			System.out.println(queueReverse.poll());
		}
		

		/*
		// In this case, the values will be sorted in alfabetical order

		/*
		Queue<String> queue = new PriorityQueue<>();

		queue.offer("B");
		queue.offer("C");
		queue.offer("A");
		queue.offer("F");
		queue.offer("D");

		while(!queue.isEmpty()) {
			System.out.println(queue.poll());
		}
		*/
	}

}
