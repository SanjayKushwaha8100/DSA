package treeQuestion;

import tree.TreeFromPreorderSequence.*;
import java.util.*;
import tree.TreeFromPreorderSequence.Node;
public class sumOfNodes {
    public int sum(Node root) {
        if(root==null){
            return 0;
        }
        return root.data + sum(root.left) + sum(root.right);
        
    }
		
	
	

	public static void main(String[] args) {
		// Pre Order
		int nodesArray[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
		Node root = (new BinaryTree()).buildTree(nodesArray);
		int totalSum = new sumOfNodes().sum(root);
		System.out.println(totalSum);

	}

}
