package platforms.leetcode;

public class LeetCode392 {
    public static void main(String[] args) {
        System.out.println(isSubsequenceS2("abc", "ahbgdc"));
        System.out.println(isSubsequenceS2("axc", "ahbgdc"));
    }

    // Runtime 1ms O(n) | Memory 41.38mb O(1)
    public static boolean isSubsequenceS1(String s, String t) {
        if(s.isEmpty()) return true;
        if(t.isEmpty()) return false;
        if(s.length() > t.length()) return false;

        int sIndex = s.length() - 1;
        int tIndex = t.length() - 1;

        while(sIndex >= 0 && tIndex >= 0) {
            char sChar = s.charAt(sIndex);
            char tChar = t.charAt(tIndex);

            if(sChar == tChar) {
                sIndex--;
                tIndex--;
            }
            else if(tIndex == 0) return false;
            else tIndex--;
        }

        return true;
    }

    // Runtime 2ms O(n) | Memory 41.37mb O(1)
    public static boolean isSubsequenceS2(String s, String t) {
        if(s.isEmpty()) return true;
        if(t.isEmpty()) return false;
        if(s.length() > t.length()) return false;

        int sIndex = 0;
        int tIndex = 0;

        while(sIndex < s.length() && tIndex < t.length()) {
            if(s.charAt(sIndex) == t.charAt(tIndex)) {
                sIndex++;
            }

            if ((t.length() - tIndex) < (s.length() - sIndex)) return false;

            tIndex++;
        }

        return sIndex == s.length();
    }
}
