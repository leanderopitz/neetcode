class Solution {
    public double myPow(double x, int n) {
        return recPow(x, n);
    }
    public double recPow(double x, long n) {
        if (n == 0) {
            return 1;
        } else if (n > 0) {
            if (n % 2 == 0) {
                double result = recPow(x, n / 2);
                return result * result;
            } else {
                double result = recPow(x, n / 2);
                return result * result * x;
            }
            
        } else {
            return 1 / recPow(x, n * -1);
        }
    }
}
