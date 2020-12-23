package month12;

/**
 * @Author 奥特曼
 * @Date 2020/12/23 0023 11:18
 * @Description 斐波那契数列（Fibonacci sequence），
 * 又称黄金分割数列、因数学家列昂纳多·斐波那契（Leonardoda Fibonacci）以兔子繁殖为例子而引入，
 * 故又称为“兔子数列”，指的是这样一个数列：1、1、2、3、5、8、13、21、34、……
 * 在数学上，斐波纳契数列以如下被以递推的方法定义：F(1)=1，F(2)=1, F(n)=F(n-1)+F(n-2)（n>=3，n∈N*），
 * 所以要得到第n个的斐波那契数列就要从前面去推出来，保留前面两个的值。
 **/
public class day07 {
    public int Fibonacci(int n) {
        if (n <= 1)//第0项是0，第一项是1
        {
            return n;
        } else {
            int res = 0;
            int n1 = 0;
            int n2 = 1;
            for (int i = 2; i <= n; i++) {
                //从第2开始2还是1，所以初始化的时候把n1=0，n2=1
                //第三项开始是前两项的和,然后保留最新的两项，更新数据相加
                res = (n1 + n2);
                n1 = n2;
                n2 = res;
            }
            return res;
        }
    }

    /**
     * 递归
     *
     * @param n
     * @return
     */
    public int Fibonaccidigui(int n) {
        if (n <= 1) {
            return n;
        } else {
            return Fibonaccidigui(n - 1) + Fibonacci(n - 2);
        }
    }

    public static void main(String[] args) {
        int n1 = new day07().Fibonacci(5);
        System.out.println(n1);
        int j = new day07().Fibonaccidigui(5);
        System.out.println(j);
    }
}
