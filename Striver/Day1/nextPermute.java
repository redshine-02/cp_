package Striver.Day1;

public class nextPermute {
    public void reverse(int[] arr , int i , int j){
        while(i<=j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }
    public void nextPermutation(int[] nums) {
        int x = -1;
        int a = nums.length-2;
        while(a>=0){
            if(nums[a]<nums[a+1]){
                x=a;
                break;
            }
            a--;
        } 
        if(x!=-1){
            int y = -1;
            for(int i = nums.length-1 ; i>x ; i--){
                if(nums[i]>nums[x]){
                    y = i;
                    break;
                }
            }
            int temp = nums[x];
            nums[x] = nums[y];
            nums[y] = temp; 
        }
        reverse(nums,x+1,nums.length-1);
    }
}
