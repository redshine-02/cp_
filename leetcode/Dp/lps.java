package leetcode.Dp;

class Solution {
    public String longestPalindrome(String s) {
        int start = 0 ;
        int length = 1;
        for(int i = 0 ; i<s.length() ; i++){
           // if(i+1<s.length() && s.charAt(i)!=s.charAt(i+1)){
                int l = i-1;
                int r = i+1;
                while(l>=0 && r<s.length() && s.charAt(l)==s.charAt(r)){
                    l--;
                    r++;
                }
                int len = (r-1)-(l+1)+1;
                if(length<len){
                    length = len;
                    start = l+1;
                }
            //}
            if(i+1<s.length() && s.charAt(i)==s.charAt(i+1)){
                int l1 = i-1;
                int r1 = i+2;
                while(l1>=0 && r1<s.length() && s.charAt(l1)==s.charAt(r1)){
                    l1--;
                    r1++;
                }
                int len1 = (r1-1)-(l1+1)+1;
                if(length<len1){
                    length = len1;
                    start = l1+1;
                }
            }
        }
        String ans = s.substring(start,start+length);
        return ans;
    }
}
