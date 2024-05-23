package treeQuestion;

public class BuildBST {
	static class Node{
		int data;
		Node left,right;
		Node(int data){
			this.data=data;
		}
	}
	static class Tree{
		// inserting duplicate in the right side
		 Node insert(Node node,int key) {
			if(node==null)return new Node(key);
			if(key<node.data)node.left=insert(node.left,key);
			else node.right=insert(node.right,key);
			return node;
		}
		 
		 // don't want to insert dupli
//		    Node insert(Node root, int Key) {
//		        if(root==null)return new Node(Key);
//		        if(Key<root.data)root.left=insert(root.left,Key);
//		        else if(Key>root.data)root.right=insert(root.right,Key);    // for duplicate 
//		        return root;
//		        
//		    }
		void inOrderTraversal(Node root) {
			if(root==null)return;
			inOrderTraversal(root.left);
			System.out.print(root.data+" ");
			inOrderTraversal(root.right);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {5,1,3,4,2,7,4};
		Node node=null;
		for(int i=0;i<arr.length;i++) {
			node=new Tree().insert(node,arr[i]);
		}
		new Tree().inOrderTraversal(node);
		
				
	}

}
