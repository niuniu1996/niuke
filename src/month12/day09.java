package month12;

/**
 * @Author 奥特曼
 * @Date 2020/12/27 0027 10:01
 * @Description 变态跳台阶：一只青蛙一次可以跳上1级台阶，也可以跳上2级……它也可以跳上n级。求该青蛙跳上一个n级的台阶总共有多少种跳法。
 **/
public class day09 {
    /**
     * 分析过程：
     *
     * 当台阶数 n = 0时、跳法f(n) = 0
     * n = 1 f(n) = 1 [1]
     * n = 2 f(n) = 2 [1 1]、[2]
     * n = 3 f(n) = 4 [1 1 1]、[2 1]、[1 2]、[3]
     * n = 4 f(n) = 8 [1 1 1 1]、[2 2]、[1 1 2]、[1 2 1]、[2 1 1]、[1 3]、[3 1]、[4]
     * n = 5 f(n) = 16 [1 1 1 1 1]、[1 2 2]、[2 1 2]、[2 2 1]、[1 1 1 2]…
     * F(n) = {0, 1, 2, 4, 8, 16, 32 ……} n = 0, 1, 2, 3, 4, 5……n
     * @param target
     * @return
     */
    public int JumpFloorII(int target) {
        int tmp = 1;
        if(target == 0){
            return 0;
        }else{
            for(int i=1; i<target; i++){
                tmp = tmp*2;
            }
            return tmp;
        }
    }
    public static void main(String[]args){
        int i = new day09().JumpFloorII(6);
        System.out.println(i);
    }
}
