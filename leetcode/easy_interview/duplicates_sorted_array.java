package leetcode.easy_interview;

public class duplicates_sorted_array {
    public int removeDuplicates(int[] nums) {
        int n=nums.length;
        if(n<=1){
            return n;
        }
        int count =1;
        int i=1;
        int j=1;
        while(j<n){
            if(nums[j]!=nums[j-1]){
                nums[i]=nums[j];
                i++;
                count++;
            }
            j++;
        }
        
       return count; 
    }
}