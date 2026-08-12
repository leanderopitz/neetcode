class Solution {
    public int[] replaceElements(int[] arr) {
        int tmp = arr[arr.length - 1];
        for (int i = arr.length - 2; i > -1; i--) { 
            int tmp2 = arr[i];
            arr[i] = tmp;
            if (tmp2 > tmp) {
                tmp = tmp2;
            }
        }
        arr[arr.length - 1] = -1;
        return arr;
    }
}