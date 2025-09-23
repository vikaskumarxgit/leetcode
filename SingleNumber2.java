// LeetCode Problem 137: Single Number II


class Solution {
    public int singleNumber(int[] nums) {
        int status = 0;
        for(int i=0; i<nums.length; i++) {
        int count = 0;
            for(int j=0; j<nums.length; j++) {
                if(nums[i] == nums[j]) {
                    count++;
                }
            }
            if(count == 1) {
                status = nums[i];
            }
        }
        return status;
    }
}
