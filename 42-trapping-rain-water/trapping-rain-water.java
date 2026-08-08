class Solution {
    public int trap(int[] height) {
        if ( height == null || height.length == 0) {
            return 0;
        }

        int l = 0;
        int r = height.length - 1;

        int lmax = height[l];
        int rmax = height[r];

        int water = 0;

        while ( l < r ) {
            

            if ( lmax < rmax ) {
                l++;
                lmax = Math.max( lmax, height[l] );
                water += lmax - height[l];
            } else {
                r--;
                rmax = Math.max( rmax, height[r] );
                water += rmax - height[r];
            }
        }
        return water;
    }
}