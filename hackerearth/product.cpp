//https://www.hackerearth.com/practice/basic-programming/input-output/basics-of-input-output/practice-problems/algorithm/find-product/
#include<bits/stdc++.h>
using namespace std;

int main(){
    int t;
    cin>>t;
    int arr[t];
    long long int pro=1;
    int mod=1000000007;
    for(int i=0;i<t;i++){
        cin>>arr[i];
        pro=pro*1LL*arr[i];
        pro=pro%mod;

    }
    cout<<pro<<endl;
    return 0;

}