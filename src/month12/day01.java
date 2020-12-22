package month12;

/**
 * @Author 奥特曼
 * @Date 2020/12/22 0022 17:33
 * @Description 在一个二维数组中（每个一维数组的长度相同），每一行都按照从左到右递增的顺序排序，
 * 每一列都按照从上到下递增的顺序排序。请完成一个函数，输入这样的一个二维数组和一个整数，判断数组中是否含有该整数。
 **/
public class day01 {

    public boolean Find(int target, int[][] array) {
        // 获取初始行数。初始列数
        int rows = array.length;
        int lines = array[0].length;
        boolean flag = false;// 设置标志位为false
        int row = 0;// 动态行数默认从0开始
        int col = lines - 1;// 动态列数默认从最后一列开始
        while (row <= rows - 1 && col >= 0) {// 当没有达到最后一行并且没有达到第一列的时候
            if (array[row][col] == target) {// 如果对象元素等于target，找到，break
                flag = true;
                break;
            }
            //如果最后一个数都小于目标的数值，应该在其行换为下一行
            else if (array[row][col] < target) {
                row++;
            }
            //如果最后一个数都大于目标的数值，应该在其列换为上一列
            else {
                col--;
            }
        }
        return flag;
    }


    public static void main(String[] args) {
        int[][] arr = new int[][]{
                {1, 2, 8, 9}, {2, 4, 9, 12}, {4, 7, 10, 13}, {6, 8, 11, 15}};
        boolean b = new day01().Find(1, arr);
        System.out.println(b);
    }
}
