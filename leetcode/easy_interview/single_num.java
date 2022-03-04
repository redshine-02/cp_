package leetcode.easy_interview;
import java.util.*;
class Solution {
    // 1st APPROACH ----------------->T.C = O(2N) S.C. = O(N)
    // public int singleNumber(int[] nums) {
    //     HashMap<Integer,Integer> hm =new HashMap<>();
    //     for(int ele: nums){
    //         hm.put(ele,hm.getOrDefault(ele,0)+1);
    //     }
    //     for(int ele : nums){
    //         if(hm.get(ele)==1){
    //             return ele;
    //         }
    //     }
    //     return -1;
    // }

    //2ND APPROACH ----------------->T.C = O(N) S.C. = O(1)
    public int singleNumber(int[] nums) {
        int n = nums.length;
        if(n==1){
            return nums[0];
        }
        if(n==2){
           return -1; 
        }
        Arrays.sort(nums);
        if(nums[0]!=nums[1]){
            return nums[0];
        }
        if(nums[n-1]!=nums[n-2]){
            return nums[n-1];
        }
        for(int i=1;i<nums.length-1;i++){
            if(nums[i]!=nums[i-1] && nums[i]!=nums[i+1]){
                return nums[i];
            }
        }
        
        
        return -1;
    }
}
