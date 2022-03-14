package gfg;

// { Driver Code Starts
//Initial Template for Java

//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        
        while(t-- > 0)
        {
            String str[] = read.readLine().trim().split("\\s+");
            int r = Integer.parseInt(str[0]);
            int c = Integer.parseInt(str[1]);
            int matrix[][] = new int[r][c];
            
            for(int i = 0; i < r; i++)
            {
                int k = 0;
                str = read.readLine().trim().split("\\s+");
                for(int j = 0; j < c; j++){
                  matrix[i][j] = Integer.parseInt(str[k]);
                  k++;
                }
            }
            Solution obj = new Solution();
            int[] p = obj.endPoints(matrix,r,c);
            System.out.print("(" +  p[0]+ ", " +  p[1]+ ")" +"\n");
        }
    }
}

// } Driver Code Ends


//User function Template for Java

class Solution{
    static int[][] dir = {{0,1},{1,0},{0,-1},{-1,0}};
    static int [] endPoints(int [][]arr, int m, int n){
        //code here
        int i = 0;
        int j = 0;
        int k = 0;
        while(i<m && j<n && i>=0 && j>=0){
            if(arr[i][j]==0){
                k = k%4;
            }
            else if(arr[i][j]==1){
                k++;
                arr[i][j]=0;
            }
            k=k%4;
            i += dir[k][0];
            j += dir[k][1];
        }
        if(i==m){
            i=i-1;
        }
        if(j==n){
            j=j-1;
        }
        if(i==-1){
            i=i+1;
        }
        if(j==-1){
            j=j+1;
        }
        int[] a = new int[2];
        a[0] = i;
        a[1] = j;
        return a;
    }
}