package com.example.demo.util;

/**
 * @author: yiqq
 * @date: 2019/7/16
 * @description: java 单链表反转
 * https://www.cnblogs.com/zhou-test/p/10032063.html
 * https://www.cnblogs.com/zhengcj/p/7494089.html
 * https://www.cnblogs.com/xiongmozhou/p/10162711.html
 */
public class ListNode {

    public int data;
    public ListNode next;
    public ListNode(int data) {
        this.data = data;
    }
    public int getData() {
        return data;
    }
    public void setData(int data) {
        this.data = data;
    }
    public ListNode getNext() {
        return next;
    }
    public void setNext(ListNode next) {
        this.next = next;
    }

}
