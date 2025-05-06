package tree;

import tree.TreeFromPreorderSequence.*;
//import tree.TreeFromPreorderSequence.Node;

public class PreOrderTraversal {
	static void preOrder(Node node) {
		if(node==null) {
			System.out.print(-1+" ");
			return;
		}
		System.out.print(node.data+" ");
		preOrder(node.left);
		preOrder(node.right);
	}
	

	public static void main(String[] args) {
		// Pre Order
		int nodesArray[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
		Node root = (new BinaryTree()).buildTree(nodesArray);
		preOrder(root);

	}

}
