class Solution {
public:
    
    int trailingZeroes(int n) {
        int sum=0;
        int pow=5;
        while(true){
            if(n/pow==0){
                break;
            }
            sum+= n/pow;
            pow*=5;
        }
        return sum;
    }
};