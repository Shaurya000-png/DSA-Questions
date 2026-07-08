class Solution {
    public String removeDuplicates(String s) {
        Scanner sc = new Scanner(System.in);
        
        Stack< Character > stk = new Stack<>();

        for ( char ch : s.toCharArray()) {
            if (!stk.isEmpty() && stk.peek() == ch ){
                stk.pop();
            } else {
                stk.push(ch);
            }
        }

        StringBuilder ans =  new StringBuilder();

        while (!stk.isEmpty() ) {
            ans.append(stk.pop());
        }

        return ans.reverse().toString();


    }
}