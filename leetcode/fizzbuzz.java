package leetcode;

import java.util.*;

class fizzbuzz{
    public ArrayList<String> fizzBuzz(int n) {
        
        ArrayList<String> al = new ArrayList<>();
        for(int i=1;i<=n;i++){
            if((i) % 3==0 && (i)%5==0){
                al.add("FizzBuzz");
            }
            else if((i) % 3==0){
                al.add("Fizz");
            }
            else if((i) % 5==0){
                al.add("Buzz");
            }
            else{
                //String s=""+i;
                al.add(""+i);
            }
        }
        return al;
    }
}