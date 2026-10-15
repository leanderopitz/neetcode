class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] result = new int[nums.length];
        int prefix = 1;
        result[0] = prefix;
        for (int i = 1; i < nums.length; i++) {
            result[i] = nums[i - 1] * prefix;
            prefix = result[i];
        }
        int suffix = 1;
        for (int j = nums.length - 1; j > -1; j--) {
            result[j] *= suffix;
            suffix *= nums[j];
        }
        return result;
    }
}  
