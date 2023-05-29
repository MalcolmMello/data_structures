package graph_matrix;

public class Main
{
	public static void main(String[] args) 
	{
		// Depth First Search = Pick a route, keep going
		//                      If you reach a dead end, or an already visited node,
		//                      backtrack to a previous node with unvisited adjacent neighbors
		
		Graph graph = new Graph(5);
		
		graph.addNode(new Node('A'));
		graph.addNode(new Node('B'));
		graph.addNode(new Node('C'));
		graph.addNode(new Node('D'));
		graph.addNode(new Node('E'));
		
		graph.addEgde(0, 1);
		graph.addEgde(1, 2);
		graph.addEgde(2, 3);
		graph.addEgde(2, 4);
		graph.addEgde(4, 0);
		graph.addEgde(4, 2);
		
		graph.print();
		
		graph.depthFirstSearch(3);
		
		System.out.println(graph.checkEdge(0,1));
		System.out.println(graph.checkEdge(3,2));
	}
}
