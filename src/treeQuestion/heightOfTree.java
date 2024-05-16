package treeQuestion;

import tree.TreeFromPreorderSequence.*;
import java.util.*;

public class heightOfTree {
    public int height(Node node) {
    	if(node==null)return 0;
    	return Math.max(height(node.left),height(node.right))+1;
    }
		
	
	

	public static void main(String[] args) {
		// Pre Order
		int nodesArray[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
		Node root = (new BinaryTree()).buildTree(nodesArray);
		int height = new heightOfTree().height(root);
		System.out.println(height);

	}

}
