// New approach
class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for (int i : nums) {
            set.add(i);
        }
        int result = 0;
        for (int i : nums) {
            if (!set.contains(i - 1)) {
                int length = 0;
                while (set.contains(i + length)) {
                    length++;
                }
                result = Math.max(result, length);
            }
        }
        return result;
    }
}
