package com.example.demo.JZOffer.one_ten;

import java.util.Stack;

public class 零七两个栈实现队列 {

    Stack<Integer> stack1 = new Stack<>();
    Stack<Integer> stack2 = new Stack<>();


    /**
     思路：一个栈压入元素，而另一个栈作为缓冲，将栈1的元素出栈后压入栈2中。
     也可以将栈1中的最后一个元素直接出栈，而不用压入栈2中再出栈。
     */
    public void push(int node) {
        stack1.push(node);
    }

    public int pop() throws Exception {
        if (stack1.isEmpty() && stack2.isEmpty()) {
            throw new Exception("栈为空！");
        }
        if (stack2.isEmpty()) {
            while(!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
        }
        return stack2.pop();
    }
}
