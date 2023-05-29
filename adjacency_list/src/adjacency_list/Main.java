package adjacency_list;

public class Main
{
    // Adjacency List = An array/arraylist of linkedlists.
    //                  Each LinkedList has a unique node at the head.
    //                  All adjacent neighbors to that node are added to that node's LinkedList
    
    //                  runtime completity to check an Edge: O(n)
    //                  space completity: O(n + e)
    
	public static void main(String[] args) 
	{
		Graph graph = new Graph();
		
		graph.addNode(new Node('A'));
		graph.addNode(new Node('B'));
		graph.addNode(new Node('C'));
		graph.addNode(new Node('D'));
		graph.addNode(new Node('E'));
		
		graph.addEdge(0, 1);
		graph.addEdge(1, 2);
		graph.addEdge(1, 4);
		graph.addEdge(2, 3);
		graph.addEdge(2, 4);
		graph.addEdge(4, 0);
		graph.addEdge(4, 2);
		
		graph.print();
	}
}

