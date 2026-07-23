class Solution {
    public int[] sortedSquares(int[] nums) {
        int n  = nums.length;
        int[] ans = new int[n];

        int left = 0;
        int right = nums.length - 1;
        int index = nums.length - 1;

        while ( left <= right ) {
            int leftSq = nums[left] * nums[left];
            int rightSq = nums[right] * nums[right];

            if ( leftSq > rightSq ) {
                ans[index] = leftSq;
                left++;
            } else {
                ans[index] = rightSq;
                right--;
            }
            index--;
        }

        return ans;
        
    }
}