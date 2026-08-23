class Solution {
    public int maxSubArray(int[] nums) {
        int currMax = 0;
        int maxTillNow = Integer.MIN_VALUE;

        for ( int num : nums ) {
            currMax = Math.max( num, currMax + num);
            maxTillNow = Math.max(currMax, maxTillNow);
        }
        return maxTillNow;
    }
}