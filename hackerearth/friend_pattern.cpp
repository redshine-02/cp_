//https://www.hackerearth.com/practice/basic-programming/input-output/basics-of-input-output/practice-problems/algorithm/friends-relationship-1/
#include<iostream>
using namespace std;
void pattern(int n){
        int nst=1;
        int nss=(n*2)-2;
        for(int i=1;i<=n;i++){
            for(int cst=1;cst<=nst;cst++){
                cout<<"*";
            }
			for(int css=1;css<=nss;css++){
				cout<<"#";
			}
			for(int cst=1;cst<=nst;cst++){
                cout<<"*";
            }
            nst++;
			nss=nss-2;
            cout<<endl;;
        }
}

int main(){
    int t;
    cin>>t;
    while(t--){
        int n;
        cin>>n;
        pattern(n);
    }

	return 0;
}
