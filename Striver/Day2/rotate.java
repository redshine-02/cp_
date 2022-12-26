package Striver.Day2;

public class rotate {
    // *********** METHOD **************************8
    public static void transpose(int[][] a){
        int n=a.length;
        for(int i=0;i<n;i++){
          for(int j=0;j<n;j++){
            if(i<j){
                int temp=a[i][j];
                a[i][j]=a[j][i];
                a[j][i]=temp;
            }
         }  
        }
    }
    
    public static void reverse(int[][] a){
        int n=a.length;
        for(int i=0;i<n;i++){
            int lo=0;
            int hi=n-1;
            while(lo<hi){
                int temp=a[i][lo];
                a[i][lo]=a[i][hi];
                a[i][hi]=temp;
                lo++;
                hi--;
            }
        }
    }
    
    
    public void rotate(int[][] matrix) {
        transpose(matrix);
        reverse(matrix);
    }
}
