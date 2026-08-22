class Solution {
    public boolean isValid(String s) {
        Stack < Character > stack = new Stack<>();

        for ( char ch : s.toCharArray() ) {
            boolean isOpen = ( ch == '(' || ch == '{' || ch == '[' );
            boolean isClose = ( ch == ')' || ch == '}' || ch == ']');

            if ( isOpen ) {
                stack.push(ch);
            } else if ( isClose ) {
                if (stack.isEmpty()) return false;

                char top = stack.pop();

                boolean isMismatch = (( top == '(' && ch != ')') || ( top == '{' && ch != '}' ) || ( top == '[' && ch != ']'));

                if ( isMismatch ) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}