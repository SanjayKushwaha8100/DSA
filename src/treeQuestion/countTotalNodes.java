package treeQuestion;

import tree.TreeFromPreorderSequence.*;
import tree.TreeFromPreorderSequence.Node;
import java.util.*;

public class countTotalNodes {
    public int countNodes(Node root) {
        if(root==null){
            return 0;
        }
        return countNodes(root.left)+countNodes(root.right)+1;
        
    }
		
	
	

	public static void main(String[] args) {
		// Pre Order
		int nodesArray[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
		Node root = (new BinaryTree()).buildTree(nodesArray);
		int total = new countTotalNodes().countNodes(root);
		System.out.println(total);

	}

}
