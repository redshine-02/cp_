package leetcode.Dp;

class Solution {
    public int countVowelPermutation(int n) {
        long [][] dp = new long[n][5];
        for(int j = 0 ; j<5 ; j++){
            dp[0][j]=1;
        }
        int mod = (int)(1e9)+7;
        for(int i = 1 ; i < n ; i++){
            dp[i][0] = (dp[i-1][1])%mod;
            dp[i][1] = (dp[i-1][0]%mod + dp[i-1][2]%mod)%mod;
            dp[i][2] = (dp[i-1][0]%mod + dp[i-1][1]%mod + dp[i-1][3]%mod + dp[i-1][4]%mod)%mod;
            dp[i][3] = (dp[i-1][2]%mod + dp[i-1][4]%mod)%mod;
            dp[i][4] = (dp[i-1][0])%mod;
        }
        int sum = 0 ;
        
        for(int j = 0 ; j<5 ; j++){
            sum = (int)(sum%mod + dp[n-1][j]%mod)%mod;
        }
        return sum;
    }
    public int countVowelPermutation1(int n) {
        long [][] dp = new long[n][5];
        for(int j = 0 ; j<5 ; j++){
            dp[0][j]=1;
        }
        int mod = (int)(1e9)+7;
        for(int i = 1 ; i < n ; i++){
            dp[i][0] = (dp[i-1][1])%mod;
            dp[i][1] = (dp[i-1][0]%mod + dp[i-1][2]%mod)%mod;
            dp[i][2] = (dp[i-1][0]%mod + dp[i-1][1]%mod + dp[i-1][3]%mod + dp[i-1][4]%mod)%mod;
            dp[i][3] = (dp[i-1][2]%mod + dp[i-1][4]%mod)%mod;
            dp[i][4] = (dp[i-1][0])%mod;
        }
        int sum = 0 ;
        
        for(int j = 0 ; j<5 ; j++){
            sum = (int)(sum%mod + dp[n-1][j]%mod)%mod;
        }
        return sum;
    }
}