package leetcode;
import java.util.*;

class Solution {
    public int findKthLargest(int[] nums, int k) {
        //1st Approach
        Arrays.sort(nums);
        int n=nums.length;
        return nums[n-k];
        
        //2nd Approach===MIN HEAP
        // PriorityQueue<Integer> pq = new PriorityQueue<>();
        // int n=nums.length;
        // if(n>1){
        // for(int i=0;i<k;i++){
        //     pq.add(nums[i]);
        // }
        //     for(int i=k;i<n;i++){
        //         if(pq.peek()<nums[i]){
        //             pq.remove();
        //             pq.add(nums[i]);
        //         }
        //     }
        // }
        // else{
        //     pq.add(nums[0]);
        // }
        // return pq.peek();
        
        //3rd Approach==MAX HEAP
        // PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        // for(int ele: nums){
        //     pq.add(ele);
        // }
        // while(true){
        //     if(k==1){
        //         break;
        //     }
        //     pq.remove();
        //     k--;
        // }
        // return pq.peek();
        
        //4th approach is Quick Select
    }
}
