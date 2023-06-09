package stacks;
import java.util.Stack;

public class Main {

	public static void main(String[] args) {
	/*
		stack = LIFO data structure. Last-IN First-Out
		stores objects into a sort of "vertical tower"
		push() to add to the top
		pop() to remove from the top
	*/

	Stack<String> stack = new Stack<String>();

	System.out.println(stack.empty());

	stack.push("Minecraft");
	stack.push("FIFA 18");
	stack.push("FIFA 19");
	stack.push("FIFA 20");
	stack.push("FIFA 21");

	String myFaveGame = stack.pop(); // return the value and remove
	
	System.out.println(myFaveGame);

	String MyFaveGame = stack.peek(); // only return
	
	System.out.println(MyFaveGame);

	int indexOfMinecraft = stack.search("Minecraft");
	
	System.out.println(indexOfMinecraft);

	// heap overflow
	/* 
		for (int i = 0; i < 100000000000000000000000000000; i++)
		{
			stack.push("Overwatch");
		} 
	*/

	/*
		
	*/

	System.out.println(stack);

	}

}
