package gfg;

// { Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

public class pos_set_bit {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            int N = Integer.parseInt(read.readLine());

            Solution ob = new Solution();
            System.out.println(ob.findPosition(N));
        }
    }
}// } Driver Code Ends


//User function Template for Java

class Solution {
    static String binary(int n){
        int sum=0;
        StringBuilder s =new StringBuilder();
        while(n>0){
            int ld=n%2;
            s.insert(0,ld);
            n=n/2;
        }
        return s.toString();
    } 
    static int findPosition(int N) {
        // code here
        String s= binary(N);
        //System.out.println(s);
        int flag=0;
        int t=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='1'){
                flag++;
                t=s.length()-i;
                if(flag==2){
                    break;
                }
            }
        }
        if(flag==1){
            return t;
        }
        else{
        return -1;
        }
        
    }
};
