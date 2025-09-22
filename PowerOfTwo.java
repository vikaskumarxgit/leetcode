// Leetcode 231: Power of Two

class Solution {
    public boolean isPowerOfTwo(int n) {
        if(n<=0) return false;
        if(n==1) return true;
        while(n>1){
            if(n%2!=0) return false;
            n/=2;
        }
        return true;
    }
};