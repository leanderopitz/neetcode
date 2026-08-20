// Repetition 1
class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                map.put(nums[i], map.get(nums[i]) + 1);
            } else {
                map.put(nums[i], 1);
            }
        }
        PriorityQueue<int[]> heap = new PriorityQueue<>((a,b) -> Integer.compare(b[1], a[1]));
        for (Integer key : map.keySet()) {
            int pair[] = {key, map.get(key)};
            heap.add(pair);
        }
        int[] result = new int[k];
        for (int j = 0; j < k; j++) {
            int[] pair = heap.poll();
            result[j] = pair[0];
        }
        return result;
    }
}
