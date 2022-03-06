package leetcode;

public class sort012 {
    public void swap(int[] arr,int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    public void sortColors(int[] arr){
    int n = arr.length;    
    int i = 0;
    int j = 0;
    int k = n-1;
    while(j<=k){
        int val = arr[j];
        if(val==0){
            swap(arr,i,j);
            i++;
            j++;
        }
        else if(val==1){
            j++;
        }
        else{
            swap(arr,j,k);
            //j++;
            k--;
        }
    }
     
  }
}
