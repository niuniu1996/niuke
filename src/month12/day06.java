package month12;

import java.util.Vector;

/**
 * @Author 奥特曼
 * @Date 2020/12/23 0023 10:45
 * @Description 把一个数组最开始的若干个元素搬到数组的末尾，我们称之为数组的旋转。
 * 输入一个非递减排序的数组的一个旋转，输出旋转数组的最小元素。
 * NOTE：给出的所有元素都大于0，若数组大小为0，请返回0。
 **/
public class day06 {
    /**
     * 分析：非减排序的数组，就相当于是递增排序数组“”
     * <p>
     * 方法（1）：直接遍历，找到最小值。
     * <p>
     * 方法（2）：由于旋转后，前面是一个递增子序列，后面是一个递增子序列，找出不是递增的那个元素
     * <p>
     * 方法（3）：利用二分查找。如果中间元素值>最后一个元素值，说明最小值右半区间，如果中间元素<最后一个元素区间，说明最小值在左半区间，
     * 如果相等说明有相同元素，需要将判断区间往前缩一下，继续判断，不断循环，当二分查找的的左右区间相等了，就说明找到最小值了。
     */
    public int minNumberInRotateArray(int[] array) {
        int j = array.length;
        if (j == 0) return 0;
        int res = array[0];
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] > array[i + 1]) {
                res = array[i + 1];
                break;
            }
        }
        if (res > array[0]) {
            res = array[0];
        }
        return res;
    }

    /**
     * 二分法做
     *
     * @param args
     */
    public int minNumberInRotateArrayEr(int[] array) {
        int high = array.length;
        if (high == 0) return 0;
        int res = array[0];
        int low = 0;
        high = high - 1;
        int mid;
        while (low < high) {
            mid = (low + high) / 2;
            if (array[mid] <= array[high]) {
                high = high - 1;
            } else {
                low = mid + 1;
            }
        }
        if(array[low]<res){
            res=array[low];
        }
        return res;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{1, 5, 6, 2, 3};
        int i = new day06().minNumberInRotateArray(arr);
        System.out.println(i);
        int j = new day06().minNumberInRotateArrayEr(arr);
        System.out.println(j);
    }
}
