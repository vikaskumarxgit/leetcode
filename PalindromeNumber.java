// leetcode 9: Palindrome Number


class Solution {
    public boolean isPalindrome(int x) {
        if(x < 0) {
            return false;
        } else {
            int revNum = 0;
            int original = x;
            while(x != 0) {
                int rem = x % 10;
                revNum = revNum * 10 + rem;
                x /= 10;
            }
            return (revNum == original) ? true: false;
        }
    }
}

