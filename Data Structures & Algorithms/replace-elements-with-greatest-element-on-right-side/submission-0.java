class Solution {
    public int[] replaceElements(int[] arr) {
        for (int k = 1; k < arr.length; k++) {
            arr[k - 1] = arr[k];
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] < arr[j]) {
                    arr[i] = arr[j];
                }
            }
        }
        arr[arr.length - 1] = -1;
        return arr;
    }
}