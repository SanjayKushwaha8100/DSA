package recursion;
import java.util.*;
public class ReverseAstack {
	public static void InsertAtBottom(Stack<String>a,String data) {	// simple using recursion
		if(a.isEmpty()) {
			a.push(data);
			return;
		}
		String temp=a.pop();
		InsertAtBottom(a,data);
		a.push(temp);
	}
	
	public static void reverseTheStack(Stack<String>a) {
		if(a.isEmpty()) {
			return;
		}
		String data=a.pop();
		reverseTheStack(a);
		InsertAtBottom(a,data);	// a method which will insert a ele at bottom
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<String>stack=new Stack<>();
		stack.push("this");
		stack.push("is");
		stack.push("a");
		stack.push("car");
		System.out.println(stack);
		reverseTheStack(stack);
		System.out.println(stack);

	}

}
