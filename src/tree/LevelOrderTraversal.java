package tree;

import tree.TreeFromPreorderSequence.*;
import java.util.*;

public class LevelOrderTraversal {
	static void lvlOrderTraversal(Node node) {
		Queue<Node> q=new LinkedList();
		if(node==null) {
			return;
		}
		q.add(node);
		q.add(null);
		while(!q.isEmpty()) {
			Node currentNode=q.remove();
			if(currentNode==null) {
				System.out.println();// print next line
				if(q.isEmpty()) {	// last null in the queue
					break;
				}
				else {	// if not again insert null
					q.add(null);
				}
			}
			else {// we have element
				System.out.print(currentNode.data+" ");
				// add the siblings
				if(currentNode.left!=null) {
					q.add(currentNode.left);
				}
				if(currentNode.right!=null) {
					q.add(currentNode.right);
				}
			}
		}

		
	}
	

	public static void main(String[] args) {
		// Pre Order
		int nodesArray[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
		Node root = (new BinaryTree()).buildTree(nodesArray);
		lvlOrderTraversal(root);

	}

}
