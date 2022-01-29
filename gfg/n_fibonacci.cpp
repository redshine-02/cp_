#include<bits/stdc++.h>
using namespace std;

vector<long long int > dp(10000,-1);

int main(){
    int t;
    cin>>t;
    while(t--){
        long long int n;
        cin>>n;
        cout<<nthFibonacci(n)<<endl;
    }
}
long long int nthFibonacci(long long int n){
        // code here
        if(n<=1){
            return n;
        }
        if(dp[n]!=-1){
            return dp[n];
        }
        return dp[n]=(nthFibonacci(n-1)+nthFibonacci(n-2))%1000000007;
}