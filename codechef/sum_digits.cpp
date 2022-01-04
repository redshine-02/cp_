//https://www.codechef.com/problems/FLOW006

#include <iostream>
using namespace std;

int sum(int n){
    int s=0;
    while(n>0){
        int ld=n%10;
        s=s+ld;
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
	    cout<<sum(n)<<endl;
	}
	return 0;
}