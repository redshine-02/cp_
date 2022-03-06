package leetcode.easy_interview;
import java.util.*;
public class power_3 {
    public boolean isPowerOfThree(int n) {
        int flag=1;
        if(n<=0){
            flag=0;
        }
        while(n>1){
            if(n%3!=0){
                flag=0;
                break;
            }
            else{
            n=n/3;}
        }
        if(flag==1){
            return true;
        }
        else{
            return false;
        }
    }
}
