// Repetition 1
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();
        int con = 0;
        while (con < nums.length - 2) {
            int left = con + 1;
            int right = nums.length - 1;
            if (con > 0 && nums[con] == nums[con - 1]) {
                con++;
                continue;
            } else {
                while (left < right) {
                    if (nums[con] + nums[left] + nums[right] == 0) {
                        List<Integer> r = new ArrayList<>();
                        r.add(nums[con]);
                        r.add(nums[left]);
                        r.add(nums[right]);
                        result.add(r);
                        left++;
                        while (left < right && nums[left] == nums[left - 1]) {
                            left++;
                        }
                    } else if (nums[con] + nums[left] + nums[right] < 0) {
                        left++;
                    } else {
                        right--;
                    }
                }
            }
            con++;
        }
        return result;
    }
}
