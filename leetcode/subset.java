package leetcode;
import java.util.*;
class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> al = new ArrayList<>();
        function(nums,0,al,ans);
        return ans;
    }
    public void function(int[] arr , int idx , List<Integer> al , List<List<Integer>> ans){
        if(idx==arr.length){
            ans.add(new ArrayList<>(al));
            return;
        }
        
        function(arr,idx+1,al,ans);
        al.add(arr[idx]);
        function(arr,idx+1,al,ans);
        al.remove(al.size()-1);
        
       // al.remove(idx);
    }
    
}