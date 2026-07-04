class Solution {
    public int maxNumberOfBalloons(String text) {

        HashMap<Character, Integer> have = new HashMap<>();

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);

            have.put(ch, have.getOrDefault(ch, 0) + 1);
        }

        HashMap<Character, Integer> need = new HashMap<>();

        need.put('b', 1);
        need.put('a', 1);
        need.put('l', 2);
        need.put('o', 2);
        need.put('n', 1);

        int answer = Integer.MAX_VALUE;

        for ( char ch : need.keySet() ) {
            int haveCount = have.getOrDefault(ch, 0);
            int needCount = need.get(ch);

            int possibleBalloons = haveCount / needCount ;

            if (possibleBalloons < answer ) {
                answer = possibleBalloons;
            }           


        }

        return answer;




    }
}