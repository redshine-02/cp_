//https://www.codechef.com/LRNDSA01/problems/FLOW007

#include <iostream>
using namespace std;

int reverse(int n){
    int s=0;
    while(n>0){
        int ld=n%10;
        s=s*10+ld;
        n=n/10;
    }
    return s;
}

int main() {
	// your code goes here
	int t;
	cin>>t;
	while(t--){
	    int n;
	    cin>>n;
	    cout<<reverse(n)<<endl;
	}
	return 0;
}
