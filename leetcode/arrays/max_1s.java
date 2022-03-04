package leetcode.arrays;

import java.util.*;
class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int n =nums.length;
        int sum=0;
        int max = 0;
        for(int i=n-1;i>=0;i--){
            if(nums[i]==1){
                sum+=nums[i];
                nums[i]=sum;
                if(max<sum){
                max=sum;
             }
            }
            else{
                sum=0;
            }
        }
        return max;
    }
}