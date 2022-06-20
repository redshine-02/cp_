package Striver.Day1;
import java.util.*;

public class pascal {
    // ********** METHOD 2 ***************************
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> al = new ArrayList<>();
        List<Integer> pre = new ArrayList<>();
        for(int i = 0 ; i <numRows ; i++){
            List<Integer> res = new ArrayList<>();
            for(int j = 0 ; j<=pre.size() ; j++){
                if(j==0 || j==pre.size()){
                    res.add(1);
                }
                else{
                    int v = pre.get(j)+pre.get(j-1);
                    res.add(v);
                }
            }
            pre = res;
            al.add(res);
        }
        return al;
    }
// ********** METHOD 1 ***************************   
//     public List<List<Integer>> generate(int numRows) {
//         List<List<Integer>> al = new ArrayList<>();
//         int[][] dp = new int[numRows][numRows];
//         int p=1;
//         for(int i = 0 ; i<numRows ; i++){
//             for(int j = 0 ; j<numRows ; j++){
//                 if(j==0){
//                     dp[i][j]=1;
//                 }
//                 else if(j==p-1 && i == numRows-1){
//                     dp[i][j]=1;
//                 }
//                 else if(i>0 && j>0){
//                     dp[i][j] = dp[i-1][j-1]+dp[i-1][j];
//                 }
//                 p++;
//             }
//         }
//         int s = 1;
//         for(int i = 0 ; i<numRows ; i++){
//             List<Integer> li = new ArrayList<>();
//             for(int j = 0 ; j<numRows ; j++){
//                 if(dp[i][j]==0){
//                     continue;
//                 }
//                 if(dp[i][j]!=0){
//                     li.add(dp[i][j]);
//                 }
//                 s++;
//             }
//             al.add(li);
//         }
        
//         return al;
//     }
}
