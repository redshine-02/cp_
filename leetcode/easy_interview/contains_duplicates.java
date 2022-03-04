package leetcode.easy_interview;
import java.util.*;
class Solution {
    public boolean containsDuplicate(int[] nums) {
        
        HashMap<Integer, Integer> hm = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            hm.put(nums[i],i);
        }
        if(hm.size()==nums.length){
            return false;
        }
        else{
            return true;
        }
        
    }
}
