package leetcode.easy_interview;

import java.util.*;
public class move_zero {
    public void swap(int[] arr,int i,int j){
        int temp = arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    public void moveZeroes(int[] nums) {
        int n = nums.length;
        int i=0;
        int j=0;
        while(j<n){
            if(nums[j]!=0){
                swap(nums,i,j);
                i++;
            }
            j++;
        }
        
    }
}
