package com.example.demo.JZOffer.one_ten;

import com.example.demo.util.CreateNode;
import com.example.demo.util.ListNode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class 零五从尾到头打印链表 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(23, 34, 55, 6, 5, 35, 677, 2);
        CreateNode createNode = new CreateNode(list);
        ListNode listNode = createNode.getHead();
        List<Integer> returnList = printListFromTailToHead(listNode);
        returnList.forEach(System.out::println);
    }
    /**
            输入一个链表，从尾到头打印链表每个节点的值。
	思路：借助栈实现，或使用递归的方法。
     */
    public static ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        ArrayList<Integer> list = new ArrayList<>();
        if (listNode == null)
            return list;
        Stack<ListNode> stack = new Stack<ListNode>();
        while (listNode != null) {
            stack.push(listNode);
            listNode = listNode.next;
        }

        while (!stack.isEmpty()) {
            list.add(stack.pop().data);
        }
        return list;
    }
}
