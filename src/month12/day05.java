package month12;

import java.util.Stack;

/**
 * @Author 奥特曼
 * @Date 2020/12/22 0022 19:37
 * @Description 用两个栈来实现一个队列，完成队列的Push和Pop操作。 队列中的元素为int类型。
 **/
public class day05 {
    Stack<Integer> stack1 = new Stack<Integer>();
    Stack<Integer> stack2 = new Stack<Integer>();

    public void push(int node) {
        stack1.push(node);
    }

    public int pop() {
        if (stack2.size() <= 0) {
            while (stack1.size() != 0) {
                stack2.push(stack1.pop());
            }
        }
        return stack2.pop();
    }

    public static void main(String[] args) {
        day05 day05 = new day05();
        System. out.print("push:\t");
        for (int i = 0; i < 10; i++) {
            day05.stack1.push(i );
            System. out.print(i +"\t" );
        }
        System. out.print("\npop:\t" );
        int i=day05.stack1.size();
        while (i>0){
            System. out.print(day05.pop()+"\t");
            i--;
        }

    }

}
