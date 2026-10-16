class Solution {
    public int majorityElement(int[] nums) {
        int candidate = nums[0];
        int counter = 0;
        for (int i = 1; i < nums.length; i++) {
            if (candidate == nums[i]) {
                counter++;
            } else {
                counter--;
            }
            if (counter == -1) {
                candidate = nums[i];
                counter = 0;
            }
        }
        return candidate;
    }
}