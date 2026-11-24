class Solution {
    public int trap(int[] height) {
        int result = 0;
        int h = 0;
        int cmin = 0;
        int cmax = 0;
        for (int i = 0; i < height.length; i++) {
            if (height[i] > h) {
                h = height[i];
                cmin = i;
                cmax = i;
            } else if (height[i] == h) {
                cmax = i;
            }
        }
        if (cmin < cmax) {
            result += h * (cmax - 1 - cmin);
            for (int i = cmin + 1; i < cmax; i++) {
                result -= height[i];
            }
        }
        int left = 0;
        int heightLeft = 0;
        while (left < cmin) {
            if (heightLeft < height[left]) {
                heightLeft = height[left];
            } else {
                result += heightLeft - height[left];
            }
            left++;
        }
        int right = height.length - 1;
        int heightRight = 0;
        while (right > cmax) {
            if (heightRight < height[right]) {
                heightRight = height[right];
            } else {
                result += heightRight - height[right];
            }
            right--;
        }
        return result;
    }
}
