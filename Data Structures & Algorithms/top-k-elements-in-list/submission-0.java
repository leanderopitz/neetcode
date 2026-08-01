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
        int[] workArray = new int[map.size() * 2];
        int index = 0;
        for (Integer key : map.keySet()) {
            workArray[index] = key;
            workArray[index + 1] = map.get(key);
            index = index + 2;
        }
        selectionSort(workArray);
        int[] result = returnValue(workArray, k);
        return result;
    }
    static void selectionSort(int[] array) {
        int n = array.length;
        for (int i = 1; i < n - 1; i = i + 2) {
            int max = i;
            for (int j = i + 2; j < n; j = j + 2) {
                if (array[j] > array[max]) {
                    max = j;
                }
            }
        int tmp = array[i];
        int tmp2 = array[i - 1];
        array[i] = array[max];
        array[i - 1] = array[max - 1];
        array[max] = tmp;
        array[max - 1] = tmp2;
        }
    }
    static int[] returnValue(int[] array, int k) {
        int[] result = new int[k];
        int c = 0;
        for (int i = 0; i < k; i++) {
            result[i] = array[c];
            c = c + 2;
        }
        return result;
    }
}
