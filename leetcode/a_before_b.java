package leetcode;
import java.util.*;

public class a_before_b {
    public boolean checkString(String s) {
        int len = s.length();
        for(int i=0;i<len;i++){
            if(i+1<len){
                if(s.charAt(i)=='b' && s.charAt(i+1)=='a'){
                    return false;
                }
            }
        }
        return true;
        
    }
}
