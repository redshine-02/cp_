package leetcode.easy_interview;

import java.util.*;
public class count_prime {

    public int countPrimes(int n){
        boolean[] isPrime = new boolean[n+1];
        Arrays.fill(isPrime,true);
        isPrime[0]=false;
        if(n>0){
        isPrime[1]=false;}
        for(int i = 2;i*i<=n;i++){
            if(isPrime[i] && (long)i*i<=n){
                for(int j=i*i;j<=n;j=j+i){
                    isPrime[j]=false;
                }
            }
        }
        int count=0;
        for(int i=0;i<n;i++){
            if(isPrime[i]==true){
                count++;
            }
        }
        return count;
    }
}
