class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                map.put(nums[i], map.get(nums[i]) + 1);
            } else {
                map.put(nums[i],1);
            }
        }
        // Comparator zum vergleichen 2er Elemente
        // Vergleiche die Häufigkeit des 1. Elementes mit der des 2. Elementes, um die Prioritätsreihenfolge der Priority Queue zu bilden 
        // Lambda Schreibweise 
        // PriorityQueue<int[]> heap = new PriorityQueue<>((a,b) -> Integer.compare(b[1], a[1]));
        PriorityQueue<int[]> heap = new PriorityQueue<>(new Comparator<int[]>() {
            @Override
            public int compare(int[] a, int[] b) {
                return Integer.compare(b[1], a[1]);
            }
        });
        for (Integer key : map.keySet()) {
            int[] pair = {key, map.get(key)};
            heap.add(pair);
        }
        int[] result = new int[k];
        for (int j = 0; j < k; j++) {
            // Holen uns oberstes Paar aus dem Heap
            int[] pair = heap.poll();
            // Nehmen 1. Element aus dem obersten Element des Heaps
            result[j] = pair[0];
        }
        return result;
    }
}
