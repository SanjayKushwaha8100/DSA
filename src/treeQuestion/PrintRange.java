package treeQuestion;
import java.util.*;
class Solution
{   
    //Function to return a list of BST elements in a given range.
    
    public static void range(Node node , int low , int high , ArrayList<Integer>ans){
        if(node==null)return;
        if(node.data>=low && node.data<=high){
            range(node.left,low,high,ans);
            // System.out.println(node.data);
            ans.add(node.data);
            range(node.right,low,high,ans);
        }
        else if(node.data>=high){
            range(node.left,low,high,ans);
        }
        else{
            range(node.right,low,high,ans);
        }
    }
	public static ArrayList<Integer> printNearNodes(Node root,int low,int high) {
        // code here.
        ArrayList<Integer>ans=new ArrayList<>();
        range(root,low,high,ans);
        return ans;
        
    }
    
}
