package leetcode;
import java.util.*;

public class a_before_b {
    public boolean checkString(String s) {
         int len = s.length();
        // for(int i=0;i<len;i++){
        //     if(i+1<len){
        //         if(s.charAt(i)=='b' && s.charAt(i+1)=='a'){
        //             return false;
        //         }
        //     }
        // }
        // return true;
        int los=-1;
        for(int i=len-1;i>=0;i--){
            if(s.charAt(i)=='a'){
                los=i;
                break;
            }
        }
        int pos=-1;
        for(int i=0;i<len;i++){
            if(s.charAt(i)=='b'){
                pos=i;
                break;
            }
        }
        if(pos>los){
            return true;
        }
        else{
            if(pos==-1){
                return true;
            }
            else{
            return false;
            }        }
    }
}
