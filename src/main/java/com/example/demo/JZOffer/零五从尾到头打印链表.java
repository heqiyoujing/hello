package com.example.demo.JZOffer;

public class 零五从尾到头打印链表 {
    public static void main(String[] args) {
       
    }
    /**
            输入一个链表，从尾到头打印链表每个节点的值。
	思路：借助栈实现，或使用递归的方法。
     */
    public static ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        ArrayList<Integer> list = new ArrayList<>();
        if (listNode == null)
            return list;
        Stack<ListNode> stack = new Stack<>();
        while (listNode != null) {
            stack.push(listNode);
            listNode = listNode.next;
        }

        while (!stack.isEmpty()) {
            list.add(stack.pop().val);
        }
        return list;
    }
}
