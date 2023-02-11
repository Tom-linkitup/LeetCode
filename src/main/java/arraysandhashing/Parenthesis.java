package arraysandhashing;

import java.util.Stack;

public class Parenthesis {

    public static void main(String[] args) {

        String test1 = "))((((())";
        int result1 = countValidParenthesis(test1);
        if (result1 == 0) System.out.println("NO!");
        else System.out.println("YES! Count: " + result1);

        String test2 = "()()()()(())(()())";
        int result2 = countValidParenthesis(test2);
        if (result2 == 0) System.out.println("NO!");
        else System.out.println("YES! Count: " + result2);
    }

    public static int countValidParenthesis(String str) {

        Stack<Character> st = new Stack<>();
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == '(') {
                st.push(ch);
            } else if (ch == ')') {
                if (st.isEmpty()) return 0;
                Character pop = st.pop();
                if (pop == null) {
                    return 0;
                } else {
                    count++;
                }
            }
        }

        return count;
    }
}
