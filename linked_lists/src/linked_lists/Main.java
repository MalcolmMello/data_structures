package linked_lists;
import java.util.LinkedList;

public class Main {

	public static void main(String[] args) {
		// LinkedList = stores Nodes in 2 parts (data+address)
        // Nodes are in non-consecutive memory locations
        // Elements are linked using pointers
        //                  Single Linked List
        //        node               node                 node
        //   [data | address] -> [data | address] -> [data | address]
        //                  Double Linked List
        //        node                               node                         node
        //   [address | data | address] -> [address | data | address] -> [address |data | address]
  
        LinkedList<String> linkedList = new LinkedList<String>();

        /* LinkedList as a stack
        linkedList.push("A");
        linkedList.push("B");
        linkedList.push("C");
        linkedList.push("D");
        linkedList.push("F");
        linkedList.pop();
        
        */

        // LinkedList as a queue
        linkedList.offer("A");
        linkedList.offer("B");
        linkedList.offer("C");
        linkedList.offer("D");
        linkedList.offer("F");
//      linkedList.poll();

        // LinkedList as LinkedList
        linkedList.add(4, "E");
        linkedList.remove("E");
        

        System.out.println(linkedList.peekFirst());
        System.out.println(linkedList.peekLast());
        linkedList.addFirst("0");
        linkedList.addLast("G");
        
        String first = linkedList.removeFirst();
        String last = linkedList.removeLast();

	}

}
