package gfg;

import java.util.*;
public class reverse_words {
    
    public static Scanner sc=new Scanner(System.in);

    public static String reverseWords(String S)
    {
        // code here 
        String s="";
        String f="";
        for(int i=0;i<S.length();i++){
            if(S.charAt(i)=='.'){
                f=s+"."+f;
                s="";
            }
            else{
            s+=S.charAt(i);}
            }
            f=s+"."+f;
            
        return f.substring(0,f.length()-1);
    }
    public static void main(String[] args)throws Exception{
        String n=sc.next();
        System.out.println(reverseWords(n));
    }
}


