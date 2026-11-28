class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        int result = 1;
        int[][] pair = new int[position.length][2];
        double[] times = new double[position.length];
        for (int i = 0; i < position.length; i++) {
            pair[i][0] = position[i];
            pair[i][1] = speed[i];
        }
        Arrays.sort(pair, (a, b) -> Integer.compare(a[0], b[0]));
        for (int i = 0; i < position.length; i++) {
            double arrivalTime = (double) (target - pair[i][0]) / (double) pair[i][1];
            times[i] = arrivalTime;
        }
        double max = times[position.length - 1];
        for (int i = times.length - 1; i >= 0; i--) {
            if (max < times[i]) {
                max = times[i];
                result++;
            }
        }
        return result;
    }
}
