package platforms.leetcode;

public class LeetCode392 {
    public static void main(String[] args) {
        System.out.println(isSubsequence("abc", "ahbgdc"));
        System.out.println(isSubsequence("axc", "ahbgdc"));
    }

    // Runtime 1ms O(n) | Memory 41.72mb O(1)
    public static boolean isSubsequence(String s, String t) {
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
}
