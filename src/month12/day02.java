package month12;

/**
 * @Author 奥特曼
 * @Date 2020/12/22 0022 19:15
 * @Description 请实现一个函数，将一个字符串中的每个空格替换成“%20”。
 * 例如，当字符串为We Are Happy.则经过替换之后的字符串为We%20Are%20Happy。
 **/
public class day02 {
    public String replaceSpace(StringBuffer str) {
        if (str == null) {
            return null;
        }
        StringBuilder newstr = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ') {
                newstr.append('%');
                newstr.append('2');
                newstr.append('0');
            } else
                newstr.append(str.charAt(i));
        }
        return newstr.toString();
    }

    public static void main(String[] args) {
        StringBuffer str=new StringBuffer("aaa   bbb   ccc   ddd");
        String s = new day02().replaceSpace(str);
        System.out.println(s);
    }
}
