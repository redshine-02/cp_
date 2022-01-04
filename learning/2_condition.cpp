#include<bits/stdc++.h>

using namespace std;

int main(){
    // In a given statement if we need to check for two variables then generally >= , <= , > , < != is used
    // But if we want to check for more than two operators we use && || operator
    // In an if statement if you declare a variable within it then the variable can be used in the scope of that if condition only

    //  LOOPS

    //WHILE LOOPS
    // initialisation
    // while(conditions){
    //     body

    //     operation
    // }

    //FOR LOOPS
    // for(initialisation; conditions;operations){
    //     body
    // }

    //Break and continue are jump statements
    //Break  = ends the last loop after its executions
    //Continue = it skips just one iteration and skips it to the next one


    // Sum of digits
    int n;
    cin>>n;
    int sum=0;
    while(n>0){
        int ld=n%10;
        sum+=ld;
        n=n/10;
    }
    cout<<sum;

    return 0;
}