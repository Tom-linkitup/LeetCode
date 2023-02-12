package arraysandhashing;

public class IsPalindrome {
    public boolean isPalindrome(String s) {
        if (s.isEmpty()) return true;
        String s1 = s.toLowerCase().replaceAll("[^a-zA-Z0-9]", "");
        String s2 = new StringBuffer(s1).reverse().toString();
        return s1.equals(s2);
    }
}
