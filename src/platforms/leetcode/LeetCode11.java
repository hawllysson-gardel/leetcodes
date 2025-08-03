package platforms.leetcode;

public class LeetCode11 {
    public static void main(String[] args) {
        System.out.println(maxArea(new int[]{1, 8, 6, 2, 5, 4, 8, 3, 7}));
        System.out.println(maxArea(new int[]{1, 1}));
    }

    // Runtime 6ms O(n) | Memory 57.67mb O(1)
    public static int maxArea(int[] height) {
        int left = 0;
        int right = height.length - 1;

        int maxArea = 0;
        while(left < right) {
            int distance = right - left;
            int minHeight = Math.min(height[left], height[right]);
            int currArea = distance * minHeight;

            maxArea = Math.max(maxArea, currArea);

            if(height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }

        return maxArea;
    }
}
