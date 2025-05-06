package tree;

public class TreeFromPreorderSequence {
	public static class Node{
		public int data;
		public Node left;
		public Node right;
		Node(int data){
			this.data=data;
			left=null;
			right=null;
		}
	}
	public static class BinaryTree{
		static int idx=-1;	 // Declared at class lvl for global access 
		public static Node buildTree(int nodesArray[]) {
			idx++;	// at start the idx will become 0 and keep on maintaining the indx for array & indx++ for recursive calls
			if(nodesArray[idx]==-1) {
				return null;// reached leaf node
			}
			Node newNode = new Node(nodesArray[idx]);
			newNode.left=buildTree(nodesArray);	// passing the array to build the left part of tree;
			newNode.right=buildTree(nodesArray); // passing the array to build the right part of tree;
			return newNode;
		}
	}

	public static void main(String[] args) {
		// Pre Order
		int nodesArray[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
//		BinaryTree tree= new BinaryTree();
		Node root = (new BinaryTree()).buildTree(nodesArray);
		System.out.println(root.data);

	}

}
