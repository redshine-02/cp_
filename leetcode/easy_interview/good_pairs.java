package leetcode.easy_interview;

import java.util.*;
public class good_pairs {
    public int binomialCoeff(int n, int k)
	{

		// Base Cases
		if (k > n)
			return 0;
		if (k == 0 || k == n)
			return 1;

		// Recur
		return binomialCoeff(n - 1, k - 1)
			+ binomialCoeff(n - 1, k);
	}
    public int numIdenticalPairs(int[] nums) {
        
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            hm.put(nums[i],hm.getOrDefault(nums[i],0)+1);
        }
        int sum =0;
        for(int i=0;i<nums.length;i++){
           int val = hm.get(nums[i]);
            if(val>=2){
                
                int p = binomialCoeff(val,2);
                sum+=p;
            }
            hm.put(nums[i],0);
        }
        return sum;
    }
}
