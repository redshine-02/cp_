package leetcode.Tree;
import java.util.*;
///**
// * Definition for a binary tree node.
class TreeNode {
     int val;
     TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
  }
public class inOrder {
    public void function(TreeNode root ,  List<Integer> al){
        if(root == null){
            return;
        }
        function(root.left , al);
        
        al.add(root.val);
        
        function(root.right , al);
    }
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> al = new ArrayList<>();
        function(root , al);
        return al;
        
    }
}