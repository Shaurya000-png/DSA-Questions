class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {

        HashMap<Character, Integer> have = new HashMap<>();


        for (int i = 0; i < magazine.length(); i++) {
            char ch = magazine.charAt(i);

            if (have.containsKey(ch)) {
                have.put(ch, have.get(ch) + 1);
            } else {
                have.put(ch, 1);
            }
        }

        for (int i = 0; i < ransomNote.length(); i++) {
            char ch = ransomNote.charAt(i);

            if ( !have.containsKey(ch) || have.get(ch) == 0 ) {
                return false;
            }
            have.put(ch, have.get(ch) - 1);
        }

        return true;

    }
}