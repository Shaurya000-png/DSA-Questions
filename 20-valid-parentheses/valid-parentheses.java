class Solution {
    public boolean isValid(String s) {
        Stack <Character> stack = new Stack<>();

        for (char ch : s.toCharArray()) {
            boolean isOpening = (ch == '(' || ch == '{' || ch == '[');
            boolean isClosing = (ch == ')' || ch == '}' || ch == ']');

            if (isOpening) {
                stack.push(ch);
            } else if (isClosing){
                if (stack.isEmpty()) return false;


                char top = stack.pop();

                boolean isMismatch = ( top == '(' && ch != ')' ) || ( top == '{' && ch != '}' ) || ( top == '[' && ch != ']' );

                if (isMismatch) return false;
            }
        }
        return stack.isEmpty();
    }
}