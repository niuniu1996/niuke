package month12;

/**
 * @Author 奥特曼
 * @Date 2020/12/30 0030 16:50
 * @Description 求整数的次方。
 * 给定一个double类型的浮点数base和int类型的整数exponent。求base的exponent次方。
 **/
public class day12 {
    public double Power(double base, int exponent) {
        int n;
        //分母
        double denominator = 1;
        double currentDeno = base;
        //指数
        if (exponent > 0) {
            n = exponent;
        } else if (exponent < 0) {
            n = -exponent;
        } else {
            return 1;
        }
        while (n != 0) {
            if ((n & 1) == 1) {
                denominator *= currentDeno;
            }
            currentDeno *= currentDeno;
            n >>= 1;
        }
        return exponent > 0 ? denominator : (1 / denominator);
    }

    public static void main(String[] args) {
        double power = new day12().Power(2, 5);
        System.out.println(power);
    }
}
