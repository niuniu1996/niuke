package month12;

/**
 * @Author 奥特曼
 * @Date 2020/12/30 0030 16:50
 * @Description TODO
 *
 *
 *
 * 过程
 * Java自带转化方法嘻嘻嘻嘻
 * 1、先将数字转换成二进制字符串
 * 2、用String.split()函数存入一个数组中
 * 3、遍历数组跟1比较，同时计数
 * 4、输出计数值
 *
 * public class Solution {
 *     public int NumberOf1(int n) {
 *         String bi = Integer.toBinaryString(n);
 *         String[] b = bi.split("");
 *         int num1 = 0;
 *         for(int i = 0; i<b.length;i++){
 *             if(b[i].equals("1")){
 *                 num1++;
 *             }
 *         }
 *         return num1;
 *     }
 * }
 * 看看题解：
 *
 * 直接根据题目的描述来提出方法一。有2个问题：
 * 问题1: 如何从十进制数转化到二进制数？
 * 问题2:转化为二进制数后，如果判断有1的个数？
 *
 * 方法1:除2取模法。
 * 当然这种方法，对于大部分数据是对的，但是对于-2147483648,二进制为1000...000，一共有31个0.因为计算机使用补码存储二进制数据的。对于这个数据，我们的方***输出0，实际上为1.所以这种方法不对。
 *
 * 方法2:二进制移位法
 * 直接将整数看成二进制，然后采用移位的方法。
 *
 * 如果val的二进制是110，则操作之后会变成011,也就是舍去最低位，然后最高位补0.
 * 但是如果val为负数，最高位会补1，所以对于负数还是有点问题。
 *
 * 我们可以转换一下思路，让一个数0x01从右向左与val的每一位进行&操作来判断
 *
 * 方法3:减 再与 去除一个1 (超级厉害)
 * 对于上一种解法中，无用操作是，如果当前位是0， 还是会做判断，然后一位一位的移动。
 * 如果，给你一种超能力，你一下可以对从右向左的第一位1直接判断，遇到0直接略过，那效率是不是很快。
 *
 * 如果一个整数不为0，那么这个整数至少有一位是1。如果我们把这个整数减1，那么原来处在整数最右边的1就会变为0，原来在1后面的所有的0都会变成1(如果最右边的1后面还有0的话)。其余所有位将不会受到影响。
 * 举个例子：一个二进制数1100，从右边数起第三位是处于最右边的一个1。减去1后，第三位变成0，它后面的两位0变成了1，而前面的1保持不变，因此得到的结果是1011.我们发现减1的结果是把最右边的一个1开始的所有位都取反了。这个时候如果我们再把原来的整数和减去1之后的结果做与运算，从原来整数最右边一个1那一位开始所有位都会变成0。如1100&1011=1000.也就是说，把一个整数减去1，再和原整数做与运算，会把该整数最右边一个1变成0.那么一个整数的二进制有多少个1，就可以进行多少次这样的操作。
 *
 * 时间复杂度：O(n) n为val中1的个数
 * 空间复杂度：O(1)
 *
 * public class Solution {
 *     public int NumberOf1(int n) {
 *         int count = 0;
 *         while(n!=0){
 *             n = n&(n-1);
 *             count++;
 *         }
 *         return count;
 *     }
 * }
 **/
public class day11 {
    public int NumberOf1(int n) {
        int count = 0;
        while(n!= 0){
            count++;
            n = n & (n - 1);
        }
        return count;
    }

    public static void main(String[] args) {
        int i = new day11().NumberOf1(3);
        System.out.println(i);
    }
}
