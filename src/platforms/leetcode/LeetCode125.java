package platforms.leetcode;

public class LeetCode125 {
    public static void main(String[] args) {
        System.out.println(isPalindromeS3("A man, a plan, a canal: Panama"));
        System.out.println(isPalindromeS3("race a car"));
        System.out.println(isPalindromeS3(" "));
    }

    // Runtime 140ms O(n²) | Memory 46.48mb O(n²)
    public static boolean isPalindromeS1(String s) {
        String sanitizedS = s.toLowerCase().replaceAll("[^a-z0-9]", "");

        if (sanitizedS.isEmpty()) return true;

        StringBuilder reverseS = new StringBuilder();
        for (int i = sanitizedS.length() - 1; i >= 0; i--) {
            reverseS.append(sanitizedS.charAt(i));
        }

        return reverseS.toString().equals(sanitizedS);
    }

    // Runtime 14ms O(n) | Memory 45.33mb O(n)
    public static boolean isPalindromeS2(String s) {
        String sanitizedS = s.toLowerCase().replaceAll("[^a-z0-9]", "");

        if(sanitizedS.isEmpty()) return true;

        String reverseS = new StringBuilder(sanitizedS).reverse().toString();

        return reverseS.equals(sanitizedS);
    }

    // Runtime 2ms O(n) | Memory 42.79mb O(1)
    public static boolean isPalindromeS3(String s) {
        if (s == null || s.isEmpty()) return true;

        int left = 0;
        int right = s.length() - 1;

        while (left < right) {
            char cLeft = s.charAt(left);
            char cRight = s.charAt(right);

            if (!Character.isLetterOrDigit(cLeft)) left++;
            else if (!Character.isLetterOrDigit(cRight)) right--;
            else {
                if (Character.toLowerCase(cLeft) != Character.toLowerCase(cRight)) return false;

                left++;
                right--;
            }
        }

        return true;
    }
}
