class Solution {
    public int maxArea(int[] heights) {
        int left = 0;
        int right = heights.length - 1;
        int result = 0;
        while (left < right) {
            int capacity = 0;
            int min = Math.min(heights[left], heights[right]);
            capacity = min * (right - left);
            result = Math.max(result, capacity);
            if (heights[left] < heights[right]) {
                left++;
            } else {
                right--;
            }

        }
        return result;
    }
}
