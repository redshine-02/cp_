package leetcode.arrays;

import java.util.*;
public class n_double {
    public boolean checkIfExist(int[] arr) {
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int ele : arr){
            hm.put(ele,hm.getOrDefault(ele,0)+1);
            
        }
        for(int ele : arr){
            if(ele==0){
                if(hm.get(ele)%2==0){
                    return true;
                }
            }
            else if(hm.containsKey(ele*2)){
                //System.out.println(ele);
                return true;
            }
        }
        
        
        return false;
        
    }
}
