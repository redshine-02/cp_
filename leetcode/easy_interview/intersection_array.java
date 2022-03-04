package leetcode.easy_interview;

import java.util.*;
class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        HashMap<Integer,Integer> hm = new HashMap<>();
        ArrayList<Integer> al = new ArrayList<>();
        for(int ele : nums1){
            hm.put(ele,hm.getOrDefault(ele,0)+1);
        }
        for(int ele : nums2){
            if(hm.containsKey(ele)==true && hm.get(ele)>0){
                int val = hm.get(ele);
                al.add(ele);
                val = val-1;
                hm.put(ele,val);
            }
        }
        int[] a = new int[al.size()];
        for(int i=0;i<al.size();i++){
            a[i]=al.get(i);
        }
        return a;
    }
}
