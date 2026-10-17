class Solution {
    public int searchInsert(int[] nums, int target) {
        int counter = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                return i;
            } else if (target < nums[i]) {
                return i;
            }
            counter++;
        }
        return counter;
    }
}