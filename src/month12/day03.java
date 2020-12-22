package month12;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @Author 奥特曼
 * @Date 2020/12/22 0022 19:23
 * @Description 输入一个链表，按链表从尾到头的顺序返回一个ArrayList。
 **/
public class day03 {
    public class ListNode {
        int val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }

        public ListNode() {

        }
    }

    /**
     * 思路：1，构造一个链表
     * <p>
     * 2，定义一个栈，将链表元素放入到栈中（利用栈的先进后出，实现从尾到头返回）
     * <p>
     * 3，取出栈的元素放入到ArrayList，然后遍历
     *
     * @return
     */
    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        ArrayList<Integer> resultList = new ArrayList<>();// 没有考虑空链表
        if (listNode == null) return resultList;
        while (listNode.next != null) {// 边界情况的考虑：最后一个的时候，无下一个节点
            resultList.add(0, listNode.val);
            listNode = listNode.next;
        }
        resultList.add(0, listNode.val);
        return resultList;
    }

    private ListNode inputLinkVal() {   //输入一个链表
        ListNode headNode = new ListNode();  //头节点
        ListNode tail;      //表尾节点
        tail = headNode;
        while (true) {
            Scanner sc = new Scanner(System.in);
            int val = sc.nextInt();
            if (0 == val) {     //输入0退出输入循环
                break;
            }
            ListNode listNode = new ListNode(val);      //新节点
            tail.next = listNode;       //尾插法添加节点
            tail = listNode;        //重置尾节点
            tail.next = null;       //尾节点的下一个置空

        }
        return headNode;        //返回头节点
    }


    public static void main(String[] args) {
        //输入链表值
        ListNode listNode = new day03().inputLinkVal();
        ArrayList<Integer> integers = new day03().printListFromTailToHead(listNode);
        System.out.println(integers);
    }
}
