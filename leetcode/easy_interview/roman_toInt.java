package leetcode.easy_interview;

import java.util.*;

class Solution {
    public int romanToInt(String s) {
        HashMap<Character,Integer> hm = new HashMap<>();
        hm.put('I',1);
        hm.put('V',5);
        hm.put('X',10);
        hm.put('L',50);
        hm.put('C',100);
        hm.put('D',500);
        hm.put('M',1000);
        int sum=hm.get(s.charAt(0));
        int n=s.length();
        for(int i=1;i<n;i++){
            char ch1 = s.charAt(i);
            char ch2 = s.charAt(i-1);
            sum+=hm.get(ch1);
            if((ch1=='V' && ch2=='I') || (ch1=='X' && ch2=='I') ){
            sum-=2;
            }
            else if((ch1=='L' && ch2=='X') || (ch1=='C' && ch2=='X') ){
            sum-=20;
            }
            else if((ch1=='D' && ch2=='C') || (ch1=='M' && ch2=='C') ){
            sum-=200;
            }
            
        }
        return sum;        
//         int t=0;
//         int i=s.length()-1;
//         while(i>=0){
//             if(s.charAt(i)=='I'){
//                 t+=1;
//             }
//             if(s.charAt(i)=='V'){
//                 if(i>0 && s.charAt(i-1)=='I'){
//                    t+=3; 
//                 }
//                 else{
//                 t+=5;
//                 }
//             }
//             if(s.charAt(i)=='X'){
//                 if(i>0 && s.charAt(i-1)=='I'){
//                    t+=8; 
//                 }
//                 else{
//                 t+=10;
//                 }
                
//             }
//             if(s.charAt(i)=='L'){
//                 if(i>0 && s.charAt(i-1)=='X'){
//                    t+=30; 
//                 }
//                 else{
//                 t+=50;
//                 }
                
//             }
//             if(s.charAt(i)=='C'){
//                 if(i>0 && s.charAt(i-1)=='X' ){
//                    t+=80; 
//                 }
//                 else{
//                 t+=100;
//                 }
              
//             }
//             if(s.charAt(i)=='D'){
//                 if(i>0 && s.charAt(i-1)=='C'){
//                    t+=300; 
//                 }
//                 else{
//                 t+=500;
//                 }
               
//             }
//             if(s.charAt(i)=='M'){
//                 if(i>0 && s.charAt(i-1)=='C' ){
//                    t+=800; 
//                 }
//                 else{
//                 t+=1000;
//                 }
               
//             }
//             i--;
            
//         }
            
//         return t;
        
    }
}
