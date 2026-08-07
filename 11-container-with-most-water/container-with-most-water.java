class Solution {
    public int maxArea(int[] height) {
        
        int l = 0;
        int r = height.length - 1;
        int ans = 0;

        while ( l < r ){

                int area = (r - l) * Math.min(height[l], height[r]);
                

                if ( height[l] > height[r] ) {
                    r--;
                } else {
                    l++;
                }

                ans = Math.max(area, ans);

                
        }
        return ans;

    }
}