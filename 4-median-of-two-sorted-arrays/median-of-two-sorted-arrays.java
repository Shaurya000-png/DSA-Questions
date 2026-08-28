class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;

        ArrayList<Integer> nums = new ArrayList<>();

        for (int num : nums1) {
            nums.add(num);
        }

        for (int num : nums2) {
            nums.add(num);
        }

        Collections.sort(nums);

        int l = 0;
        int r = nums.size() - 1;
        double ans = 0;

        while (l <= r) {
            int mid = (l + r) / 2;

            if (nums.size() % 2 != 0) {
                ans = nums.get(mid);
                break;
            } else {
                ans = (nums.get(mid) + nums.get(mid + 1)) / 2.0;
                break;
            }
        }

        return ans;
    }
}