package Striver.Day1;

public class setZero {

    public void help(int[][] arr , int a , int b){
        int n = arr.length;
        int m = arr[0].length;
        for(int i = 0 ; i<n ; i++){
            arr[i][b]=0;
        }
        for(int i = 0 ; i<m ; i++){
            arr[a][i]=0;
        }
    }

    
// ************************** METHOD 1 **********************************
//     public void setZeroes(int[][] matrix) {
//         int m = matrix.length;
//         int n = matrix[0].length;
//         int[][] dp = new int[m][n];
//         for(int i = 0 ; i<m ; i++){
//             for(int j = 0 ; j<n ; j++){
//                 if(matrix[i][j]==0){
                   
//                 }
//                 else{
//                     dp[i][j]=matrix[i][j];
//                 }
//             }
//         }
//         for(int i = 0 ; i<m ; i++){
//             for(int j = 0 ; j<n ; j++){
//                 if(matrix[i][j]==0){
//                    help(dp,i,j);
//                 }
//             }
//         }
//         for(int i = 0 ; i<m ; i++){
//             for(int j = 0 ; j<n ; j++){
//                 matrix[i][j]=dp[i][j];
//             }
//         }
        
//     }

// ************************** METHOD 2 **********************************
    
//     public class pair{
//         int l;
//         int b;
//         pair(){
            
//         }
//         pair(int l , int b){
//             this.l = l;
//             this.b = b;
//         }
//     }
    
    // public void setZeroes(int[][] matrix) {
    //     int m = matrix.length;
    //     int n = matrix[0].length;
    //     ArrayList<pair> al = new ArrayList<>();
    //     for(int i = 0 ; i<m ; i++){
    //         for(int j = 0 ; j<n ; j++){
    //             if(matrix[i][j]==0){
    //               pair p = new pair(i,j);
    //               al.add(p);
    //             }
    //         }
    //     }
    //     for(int i = 0 ; i<al.size() ; i++){
    //         pair pp = al.get(i);
    //         int a = pp.l;
    //         int c = pp.b;
    //         help(matrix,a,c);
    //     }
    // }

    // ************************** METHOD 3 **********************************
    public void setZeroes(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        boolean r = false;
        boolean c = false;
           for(int i = 0 ; i <m ; i++){
               for(int j = 0 ; j<n ; j++ ){
                   if(matrix[i][j]==0){
                       if(i>0){
                           matrix[i][0]=0;
                       }
                       if(j>0){
                           matrix[0][j]=0;
                       }
                       if(i==0){
                           r=true;
                       }
                       if(j==0){
                           c=true;
                       }
                   }
               }
           }
           for(int i=1 ; i<m ; i++){
               if(matrix[i][0]==0){
                   for(int j = 0 ; j<n ; j++){
                       matrix[i][j]=0;
                   }
               }
           }
           for(int i=1 ; i<n ; i++){
               if(matrix[0][i]==0){
                   for(int j = 0 ; j<m ; j++){
                       matrix[j][i]=0;
                   }
               }
           }
           if(r){
               for(int j=0 ; j<n ; j++){
                   matrix[0][j]=0;
               }
           }
           
           
           if(c){
               for(int j=0 ; j<m ; j++){
                   matrix[j][0]=0;
               }
           }
   }
}
