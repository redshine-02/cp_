package leetcode.Dp;

class Solution {
    public int mincostTickets(int[] days, int[] costs) {
        int n = days.length;
        int m = costs.length;
        int[][] dp = new int[m][n];
        dp[0][0]=costs[0];
        for(int i = 0 ; i<m ; i++){
            for(int j = 0 ; j<n ; j++){
                if(i == 0 && j>0){
                    dp[i][j] = dp[i][j-1] + costs[i];
                }
                else if(i>0 && j==0){
                    dp[i][j]=Math.min(dp[i-1][j],costs[i]);
                }
                else{
                    if(i==1 && days[j]>=7){
                        int d = days[j]/7;
                        int r = days[j]%7;
                        if(dp[i][j-1]>d*costs[i]){
                            dp[i][j] = d*costs[i] + r*Math.min(costs[1],costs[0]);
                        }
                        else{
                            dp[i][j] = dp[i][j-1] + Math.min(costs[1],costs[0]);
                        }
                        
                    }
                    else if(i==2 && days[j]>=30){
                        int d = days[j]/30;
                        int r = days[j]%30;
                        if(dp[i][j-1]>d*costs[i]){
                            dp[i][j] = d*costs[i] + r*Math.min(costs[1],Math.min(costs[0],costs[2]));
                        }
                        else{
                            dp[i][j] = dp[i][j-1] + Math.min(costs[1],Math.min(costs[0],costs[2]));
                        }
                    }
                    else{
                        if(i>0){
                        dp[i][j] = dp[i-1][j];}
                    }
                }
            }
        }
        for(int i = 0 ; i<dp.length ; i++){
            for(int j =0 ; j<dp[0].length ; j++){
                System.out.print(dp[i][j]+" ");
            }
            System.out.println();
        }
        return dp[m-1][n-1];
    }
}
