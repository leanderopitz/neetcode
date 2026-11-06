// Repetition 3
class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet <>();
        for (int i = 0; i < nums.length ; i++) {
            set.add(nums[i]);
        }
        int result = 0;
        for (int j = 0; j < nums.length; j++) {
            if (!set.contains(nums[j] - 1)) {
                int length = 0;
                while (set.contains(nums[j] + length)) {
                    length++;
                }
                result = Math.max(result, length);
            }
        }
        return result;
    }
}
