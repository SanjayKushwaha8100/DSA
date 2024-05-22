package treeQuestion;

import java.util.*;


class Node {
	int data;
	Node left;
	Node right;

	Node(int data) {
		this.data = data;
		this.left = null;
		this.right = null;
	}
}

class Tree {

	static int idx = -1;

	public static Node build(int nodesArray[]) {
		idx++;	// at start the idx will become 0 and keep on maintaining the indx for array & indx++ for recursive calls
		if(nodesArray[idx]==-1) {
			return null;// reached leaf node
		}
		Node newNode = new Node(nodesArray[idx]);
		newNode.left=build(nodesArray);	// passing the array to build the left part of tree;
		newNode.right=build(nodesArray); // passing the array to build the right part of tree;
		return newNode;
	}
}
class BuildTree{
	
	// this is not recursive it is iterative
	public void lvlOrderTraversal(Node root) {
		
		Queue<Node> temp= new LinkedList(); 
		if(root==null)return;
		temp.add(root);
		temp.add(null);
		while(!temp.isEmpty()) {
			Node currentNode = temp.remove();
			if(currentNode==null) {
				System.out.println();
				if(temp.isEmpty())break;
				else{
					temp.add(null);
				}
			}
			else {
				System.out.print(currentNode.data+" ");
				if(currentNode.left!=null)temp.add(currentNode.left);
				if(currentNode.right!=null)temp.add(currentNode.right);

			}
			
		}

	}
	int currLvl=1;
	int sum=0;
	public int sum(Node root,int k) {
		Queue<Node>q=new LinkedList();
		if(root==null)return 0;
		q.add(root);
		q.add(null);
		while(!q.isEmpty()) {
			Node currentNode = q.remove();
			if(currentNode==null) {
				if(q.isEmpty())return sum;
				else {
					currLvl++;
					if(currLvl>k)return sum;
					sum=0;
					q.add(null);
				}
			}
			else {
				sum+=currentNode.data;
				if(currentNode.left!=null)q.add(currentNode.left);
				if(currentNode.right!=null)q.add(currentNode.right);
			}
		}
		return sum;
		
	}
	


	

}

public class SumOfAllNodesAtKthLvl {




	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nodesArray[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
//		Node root = new Tree().buildTree(nodesArray);
//		System.out.println(root.data);
		// lvl order traversal
		
		Node root = (new Tree()).build(nodesArray);

		new BuildTree().lvlOrderTraversal(root);
		System.out.println(new BuildTree().sum(root,3));
		
		

	}
}
