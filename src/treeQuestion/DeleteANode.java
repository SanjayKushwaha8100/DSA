package treeQuestion;

public class DeleteANode {
	static class Node{
		int data;
		Node left,right;
		Node(int data){
			this.data=data;
		}
	}
		 static Node insert(Node node,int key) {
			if(node==null)return new Node(key);
			if(key<node.data)node.left=insert(node.left,key);
			else node.right=insert(node.right,key);
			return node;
		}
		 
		static void inOrderTraversal(Node root) {
			if(root==null)return;
			inOrderTraversal(root.left);
			System.out.print(root.data+" ");
			inOrderTraversal(root.right);
		}
		
		static Node delete(Node root,int val) {
			// searching the node
			if(val<root.data) {
				root.left = delete(root.left,val);
			}
			else if(val>root.data) {
				root.right = delete(root.right,val);
			}
			else { // val == root.data
				// search done 
				
				// case 1 if node doesn't have child
				if(root.left==null && root.right==null) {
					return null;
				}
				// case 2 node have only one child 
				if(root.left==null) {	// if left is null return right child
					return root.right;
				}
				else if(root.right == null) {	// vice-versa
					return root.left;
				}
				// case 3 we will find the inoderSuccessor to replace the node
				Node IS=inOrderSuccessor(root);
				root.data=IS.data;
				root.right=delete(root.right,IS.data);// deleting the InorderSuccessor from right subtree and here it will utilize case 1 or 2
			}
			return root;
		}
		public static Node inOrderSuccessor(Node node) {
			while(node.left!=null) {
				node=node.left;
			}
			return node;
			
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {5,1,3,4,2,7,4};
		Node node=null;
		for(int i=0;i<arr.length;i++) {
			node=insert(node,arr[i]);
		}
		inOrderTraversal(node);	
		System.out.println("");
		delete(node,4);
		inOrderTraversal(node);
	}

}
