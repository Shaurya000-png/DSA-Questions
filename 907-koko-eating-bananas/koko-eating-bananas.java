class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int left = 0;
        int right = piles[0];
        int res = right;

        for ( int pile : piles ) {
            right = Math.max(right, pile);
        }

        while ( left <= right ) {
            int mid = (left + right) / 2;

            int totalTime = 0;
            for (int pile : piles) {
                totalTime += Math.ceil((double)pile / mid);
            }

            if ( totalTime <= h ) {
                res = mid;
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return res;
    }
}