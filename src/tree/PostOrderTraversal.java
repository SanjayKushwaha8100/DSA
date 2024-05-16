package tree;

import tree.TreeFromPreorderSequence.*;
//import tree.TreeFromPreorderSequence.Node;

public class PostOrderTraversal {
	static void postOrder(Node node) {
		if(node==null) {
			System.out.print(-1+" ");
			return;
		}
		postOrder(node.left);
		postOrder(node.right);
		System.out.print(node.data+" ");
	}
	

	public static void main(String[] args) {
		// Pre Order
		int nodesArray[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
		Node root = (new BinaryTree()).buildTree(nodesArray);
		postOrder(root);

	}

}
