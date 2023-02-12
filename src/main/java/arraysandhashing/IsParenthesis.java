package arraysandhashing;

import java.util.Stack;

public class IsParenthesis {

    public static void main(String[] args) {

    }

    public static boolean isValidParenthesis(String str) {

        Stack<Character> st = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == '(' || ch == '{' || ch == '[') {
                st.push(ch);
            } else if (ch == ')' || ch == '}' || ch == ']') {
                if (st.isEmpty()) return false;
                if (ch == ')') ch -= 1;
                else ch -= 2;
                Character pop = st.pop();
                if (ch != pop) {
                    return false;
                }
            }
        }
        return st.size() == 0;
    }
}
