class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            set.add(nums[i]);
        }
        int result = 0;
        for (int j = 0; j < nums.length; j++) {
            if (!set.contains(nums[j])) {
                continue;
            } else {
                int current = nums[j];
                int length = 1;
                set.remove(current);
                int next = current;
                while (next != Integer.MAX_VALUE && set.contains(next + 1)) {
                    next++;
                    set.remove(next);
                    length++;
                }
                int previous = current; 
                while (next != Integer.MIN_VALUE && set.contains(previous - 1)) {
                    previous--;
                    set.remove(previous);
                    length++;
                }
                result = Math.max(result, length);
            }
            if (set.isEmpty()) {
                break;
            }
        }
        return result;
    }
}
