class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int left = 1;
        int right = piles[0];
        int res = right;

        for (int pile : piles) {
            right = Math.max(right, pile);
        }

        while (left <= right) {
            int mid = left + (right - left) / 2;

            long totalTime = 0;

            for (int pile : piles) {
                totalTime += (pile + mid - 1) / mid;

                if (totalTime > h) {
                    break;
                }
            }

            if (totalTime <= h) {
                res = mid;
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        return res;
    }
}