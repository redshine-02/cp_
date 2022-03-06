package leetcode.easy_interview;

import java.util.*;
public class merge_2sorted {
    
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int j=0;
        for(int i=m;i<m+n;i++){
            nums1[i]=nums2[j];
            j++;
        }
        Arrays.sort(nums1);
    }
}