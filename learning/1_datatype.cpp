#include<bits/stdc++.h>//header file which include all the files required for competitve programming

using namespace std;

int main()//first function to get executed
{   
    //datatypes : char , int , float , double , bool
    
    char c= 'a';
    int a=3;
    double b=3.5;
    a=4.5; // 4 is stored in a
    bool d= true; // 1 is stored in d which is taken as true and 0 is taken as false
    
    //to store big integers we use long long int or long int

    //post-increment - use then increase/decrease
    //pre-increment - increment or decrement and then use

    char z='a'; //there are a total of 128 characters in total
    char y='ab'; //only the first character that is a is stored in y
    cout<<(int)z; //97 is printed


    char p='9';// 9 as a character is stored in p
    cout<<(int)p; //57

    // cin>> ignore all the white spaces
    
    //CACULATION IN DATATYPES
    cout<<7/2; //3    as 7 and 2 are integers 7/2 is 3.5 and the integer part is displayed

    //PRECEDENCE ORDER ::::: double > float > long long int > long int > int > characters

    cout<<'c'+1; //99+1=100
    double g=7/2; //claculation then storage
    cout<<g; //3.5

    //Precedence of operators are left to right

    /*
            RANGES OF DATATYPE 
            CONDITIONS FOR OVERFLOW
    */

   //-10^9 <int< 10^9
   //-10^12 <long int< 10^12
   //-10^18 <long long int< 10^18

//    int a=100000;
//    int b=100000;
//    long int c= a*b; ?? wrong answer because pehle calculate hone k baad woh int mai he aai n so overflow
//    cout<<c<<endl;

// SOLUTION 1

//    int a=100000;
//    int b=100000;
//    long int c= a*1LL*b; ?? it is similar to multiply a number with 1.0 to convert it to decimal value
//    cout<<c<<endl;

// SOLUTION 2

//    double a=100000;
//    double b=100000;
//    long int c= a*b; ?? it is similar to multiply a number with 1.0 to convert it to decimal value
//    cout<<fixed<<setprecision(0)<<c<<endl;
//            
//       ***fixed is used to avoid scientific notation ****1e10****
//              ***setprecision(0) is used to remove all the zeroes after .
// 
//     Although this method is giving the correct answer but we should avoid using this method because for a very large number it is able to store value nearly equal to it but not exactly equal to it
//      double number toh store kar leta hai but accuracy kho deta hai



    
    return 0;
}