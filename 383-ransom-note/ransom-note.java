class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {

        HashMap<Character, Integer> need = new HashMap<>();
        HashMap<Character, Integer> have = new HashMap<>();

        for (int i = 0; i < ransomNote.length(); i++) {
            char chNeed = ransomNote.charAt(i);

            if (need.containsKey(chNeed)) {
                need.put(chNeed, need.get(chNeed) + 1);
            } else {
                need.put(chNeed, 1);
            }
        }

        for (int i = 0; i < magazine.length(); i++) {
            char chHave = magazine.charAt(i);

            if (have.containsKey(chHave)) {
                have.put(chHave, have.get(chHave) + 1);
            } else {
                have.put(chHave, 1);
            }
        }

        for (char ch : need.keySet()) {

            if (!have.containsKey(ch)) {
                return false;
            }

            if (have.get(ch) < need.get(ch)) {
                return false;
            }
        }

        return true;

    }
}