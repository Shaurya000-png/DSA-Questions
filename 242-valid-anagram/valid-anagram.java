class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap < Character, Integer > sh = new HashMap<>();

        for ( int i = 0; i < s.length() ; i++ ) {
            char ch = s.charAt(i);

            sh.put(ch, sh.getOrDefault(ch, 0 ) + 1);

        }

        HashMap < Character, Integer > th = new HashMap<>();

        for ( int i = 0; i < t.length() ; i++ ) {
            char ch = t.charAt(i);

            th.put(ch, th.getOrDefault(ch, 0 ) + 1);
            
        }
        
        if ( sh.equals(th)) {
            return true;
        }

        return false;
    }
}