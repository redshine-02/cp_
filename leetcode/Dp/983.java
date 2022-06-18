package leetcode.Dp;
import java.util.*;

// class Solution {
class Solution {
        public int[] dp = new int[366];
        
        public int mincostTickets(int[] days, int[] costs) {
            HashSet<Integer> hs = new HashSet<>();
            for(int day : days){hs.add(day);}
            for(int i = 1 ; i<366 ; i++){
                if(hs.contains(i)){
                    int one = costs[0];
                    int seven = costs[1];
                    int thirty = costs[2];
                    if(i-1>=0){
                        one+=dp[i-1];
                    }
                    if(i-7>=0){
                        seven+=dp[i-7];
                    }
                    if(i-30>=0){
                        thirty+=dp[i-30];
                    }
                    dp[i] = Math.min(one , Math.min(seven,thirty));
                }
                else{
                    dp[i] = dp[i-1];
                }
            }
            return dp[365];
        }
    }