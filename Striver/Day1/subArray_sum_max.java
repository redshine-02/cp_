package Striver.Day1;

public class subArray_sum_max {
    public int maxSubArray(int[] arr) {
        // METHOD 1
        // int max = arr[0];
        // for(int i = 0 ; i<arr.length ; i++){
        //     for(int j = 0 ; j<arr.length ; j++){
        //         int sum =0;
        //         for(int k = 0 ; k<=j ; k++){
        //             sum+=arr[k];
        //             max = Math.max(sum,max);
        //         }
        //     }
        // }
        // return max;
    
        //METHOD 2
        // int max = arr[0];
        // for(int i = 0 ; i<arr.length ; i++){
        //     int sum = 0;
        //     for(int j = i ; j<arr.length ; j++){
        //         sum+=arr[j];
        //         max = Math.max(sum,max);
        //     }
        // }
        // return max;
        
        //METHOD 3
        int max = arr[0],s=0;
        for(int i=0;i<arr.length;i++){
            s = s + arr[i];
            if(max<s){
                max=s;
            }
            if(s<0){
                s=0;
            }
            
        }
        return max;
    
        // METHOD 4
        // int max=arr[0],sum=0;
        // for(int i=0;i<arr.length;i++){
        //     sum+=arr[i];
        //     max = Math.max(sum,max);
        //     if(sum<arr[i]){
        //         sum=arr[i];
        //         max = Math.max(max,sum);
        //     }
        // } 
        // return max;
    }
}
