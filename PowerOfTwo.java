// Leetcode 231: Power of Two


class Solution {
    public boolean isPowerOfTwo(int n) {
        if(n==1)return true;
        if(n > Integer.MAX_VALUE) return true;
        for(int i=1;i<n;i++){
            int a = ((int)Math.pow(2,i));
            if(a == n){
                return true;
            }
            if(a > n){
                return false;
            }
        }
        return false;
         }
};