package com.example.demo.util;

import java.util.List;

/**
 * @author: yiqq
 * @date: 2019/8/12
 * @description: 创建链表
 */
public class CreateNode {
    private ListNode head;
    public CreateNode(List<Integer> list){
        ListNode head = new ListNode(list.get(0));
        ListNode cur = head;
        for(int i=1;i<list.size();i++) {
            ListNode temp = new ListNode(list.get(i));
            cur.setNext(temp);
            cur = temp;
        }
        this.head = head;
    }

    public ListNode getHead() {
        return head;
    }

    public void setHead(ListNode head) {
        this.head = head;
    }
}
