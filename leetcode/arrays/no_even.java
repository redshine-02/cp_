package leetcode.arrays;

import java.util.*;
public class no_even {
    public int digit(int n){
        int count=0;
        while(n>0){
            n=n/10;
            count++;
        }
        return count;
    }
    public int findNumbers(int[] nums) {
        int ans=0;
        for(int i=0;i<nums.length;i++){
            int len = digit(nums[i]);
            if(len%2==0){
                ans++;
            }
        }
        return ans;
    }
}
