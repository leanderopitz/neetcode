class Solution {
    public int trap(int[] height) {
        int result = 0;
        int h = 0;
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < height.length; i++) {
            if (height[i] > h) {
                h = height[i];
                list.clear();
                list.add(i);
            } else if (height[i] == h) {
                list.add(i);
            }
        }
        if (list.size() >= 2) {
            result += h * (list.get(list.size() - 1) - 1 - list.get(0));
            for (int i = list.get(0) + 1; i < list.get(list.size() - 1); i++) {
                result -= height[i];
            }
        }
        int left = 0;
        int heightLeft = 0;
        while (left < list.get(0)) {
            if (heightLeft < height[left]) {
                heightLeft = height[left];
            } else {
                result += heightLeft - height[left];
            }
            left++;
        }
        int right = height.length - 1;
        int heightRight = 0;
        while (right > list.get(list.size() - 1)) {
            if (heightRight < height[right]) {
                heightRight = height[right];
            } else {
                result += heightRight - height[right];
            }
            right--;
        }
        System.out.println(list);
        System.out.println(result);
        return result;
    }
}
