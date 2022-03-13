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
        int[] a = new int[1];
        function(0,0,board,a);
        
        return a[0];
    }
    public void function(int sr , int sc , int[][] board, int[]  a){
        if(board[sr][sc]==1){
            return;
        }
        if(sr==board.length-1 && sc==board[0].length-1){
            a[0] = a[0]+1;
            return;
        }
        
        if(sr+1<board.length){
        board[sr][sc]=1;
        function(sr+1,sc,board,a);
        board[sr][sc]=0;
        }
        if(sc+1<board[0].length){
        board[sr][sc]=1;
        function(sr,sc+1,board,a);
        board[sr][sc]=0;
        }
        
    }
}
