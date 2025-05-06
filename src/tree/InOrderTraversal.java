package tree;

import tree.TreeFromPreorderSequence.*;

public class InOrderTraversal {
	static void inOrder(Node node) {
		if(node==null) {
			System.out.print(-1+" ");
			return;
		}
		inOrder(node.left);
		System.out.print(node.data+" ");
		inOrder(node.right);
	}
	

	public static void main(String[] args) {
		// Pre Order
		int nodesArray[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
		Node root = (new BinaryTree()).buildTree(nodesArray);
		inOrder(root);

	}

}
