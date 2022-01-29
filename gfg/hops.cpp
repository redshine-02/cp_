#include<bits/stdc++.h>
using namespace std;

vector<long long int > dp(10000,-1);

int main(){
    int t;
    cin>>t;
    while(t--){
        int n;
        cin>>n;
        cout<<countWays(n)<<endl;
    }
}
long long countWays(int n)
//Staircase wala question where you have 3 ways to climb up the stair 1,2,3
// **************************************  MEMOIZATION  **************************************
    {
        if(n == 0){
            return dp[n] = 1;
        }
        
        if(dp[n] != -1)
            return dp[n];
        
        
        long long count = 0;
        
        if(n-1 >= 0){
            count += countWays(n-1);
        }
        if(n-2 >= 0){
            count += countWays(n-2);
        }
        if(n-3 >= 0){
            count += countWays(n-3);
        }
        return dp[n] = count%1000000007;
        
        // your code here
        
    }