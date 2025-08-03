package platforms.leetcode;

public class LeetCode125 {
    public static void main(String[] args) {
        System.out.println(isPalindrome("A man, a plan, a canal: Panama"));
        System.out.println(isPalindrome("race a car"));
        System.out.println(isPalindrome(" "));
    }

    public static boolean isPalindrome(String s) {
        var sanitizedInput = s.toLowerCase().replaceAll("[^a-z0-9]", "");

        if(sanitizedInput.isEmpty()) return true;

        var reverseInput = new StringBuilder(sanitizedInput).reverse().toString();

        return reverseInput.equals(sanitizedInput);
    }
}
