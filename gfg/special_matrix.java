package gfg;

// { Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while(T-->0)
        {
            String[] s = br.readLine().trim().split(" ");
            int n = Integer.parseInt(s[0]);
            int m = Integer.parseInt(s[1]);
            int k = Integer.parseInt(s[2]);
            int[][] blocked_cells = new int[k][2];
            for(int i = 0; i < k; i++){
                String[] s1 = br.readLine().trim().split(" ");
                for(int j = 0; j < 2; j++){
                    blocked_cells[i][j] = Integer.parseInt(s1[j]);
                }
            }
            Solution obj = new Solution();
            int ans = obj.FindWays(n, m, blocked_cells);
            System.out.println(ans);

        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution
{
    public int FindWays(int n, int m, int[][] blocked_cells)
    {
        // Code here
        int[][] board = new int[n][m];
        for(int i = 0 ; i<blocked_cells.length ; i++){
            int a = blocked_cells[i][0];
            int b = blocked_cells[i][1];
            board[a-1][b-1] = 1;
        }
        int[][] a = new int[n][m];
        // for(int[] row : a){
        //     Arrays.fill(row,-1);
        // }
        //Arrays.fill(a,-1);
        int ways = function(0,0,board,a);
        return ways;
    }
    public int function(int sr , int sc , int[][] board, int[][]  dp){
        // if(sr>=board.length || sc>=board[0].length ||board[sr][sc]==1){
        //     return 0;
        // }
        if(sr>=board.length || sc>=board[0].length ||board[sr][sc]==1){
            return 0;
        }
        if(sr==board.length-1 && sc==board[0].length-1){
            return dp[sr][sc] = 1;
        }
        
        if(dp[sr][sc]!=0){
            return dp[sr][sc];
        }
        //dp[sr][sc]+=(function(sr+1,sc,board,dp)+function(sr,sc+1,board,dp))%1000000007;
        int count = 0 ;
        count+=(function(sr+1,sc,board,dp))%1000000007;
        count+=(function(sr,sc+1,board,dp))%1000000007;
        
        return dp[sr][sc]+=count%1000000007;
    }
}