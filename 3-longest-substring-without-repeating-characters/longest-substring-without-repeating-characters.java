class Solution {
    public int lengthOfLongestSubstring(String s) {

        int[] lastSeen = new int[128];

        int l = 0;
        int length = 0;

        for (int r = 0; r < s.length(); r++) {

            char c = s.charAt(r);

            l = Math.max(l, lastSeen[c]);

            lastSeen[c] = r + 1;

            length = Math.max(length, r - l + 1);
        }

        return length;
    }
}