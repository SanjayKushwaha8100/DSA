package treeQuestion;

import tree.TreeFromPreorderSequence.*;
import java.util.*;

public class diameterOfTree {
	
	// approch 1 O(N^2)
	public int height(Node node) {
		if(node==null)return 0 ;
		return Math.max(height(node.left),height(node.right)) + 1;
	}
    
	public int diameterApproach1(Node node) {
    	if(node==null)return 0;
    	int diaLeft = diameterApproach1(node.left);
    	int diaRight = diameterApproach1(node.right);
    	int diaThrouRoot = height(node.left)+height(node.right)+1;
    	return Math.max(Math.max(diaLeft, diaRight),diaThrouRoot);
    	
	}
	
	// approch 2 O(N)
	// will calculator diameter and height together
	class Treeinfo{
		int height;
		int dia;

		Treeinfo(int height, int dia){
			this.dia=dia;
			this.height=height;
		}
	}
	
	public Treeinfo diameterApproach2(Node node) {
		if(node == null) {
			return new Treeinfo(0,0);
		}
		
		// storing the info of height and dia for each nodes
		// init left and right will be (h=0,dia=0)
		Treeinfo left = diameterApproach2(node.left);
		Treeinfo right = diameterApproach2(node.right);
		
		int myHeight = Math.max(left.height, right.height)+1;
		
		int dia1 = left.dia;
		int dia2 = right.dia;
		int dia3 = left.height+right.height+1;	//passing through the root node
		int myDiam = Math.max(dia3, Math.max(dia1,dia2));	// max of all 
		
		Treeinfo myInfo = new Treeinfo(myHeight,myDiam);	
		return myInfo;	// return both the info(height,dia)
		
		
	}
		
	
	

	public static void main(String[] args) {
		// Pre Order
		int nodesArray[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
		Node root = (new BinaryTree()).buildTree(nodesArray);
		
		System.out.println("Approach 1:"+new diameterOfTree().diameterApproach1(root));
		
		// approcah 2 
		
		System.out.println("Approach 2:"+new diameterOfTree().diameterApproach2(root).dia);

	}

}
