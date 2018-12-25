package Number50;
//用递归写，用常规思路会超时。
public class Solution {
    public double myPow(double x, int n) {
        double result = 0;
        if(n == 0)
            return 1;
        if (n < 0)
            result = 1/calculatePow(x , -n);
        else
            result = calculatePow(x , n);
        return result;
    }
    public double calculatePow(double x , int n) {
        if (n == 0)
            return 1;
        double sqrt = calculatePow(x , n/2);              //x的n/2
        if (n % 2 == 0) {
            return sqrt * sqrt;
        }
        else
            return x * sqrt * sqrt;
    }
}
