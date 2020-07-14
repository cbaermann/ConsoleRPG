package com.linkedlist;

import java.util.Optional;

public class Stack<V> {
    private LinkedListNode<V> head;

    public void push(V item) {
//        pseudo-code
//        if (item != null)
//            node = new LinkedListNode(item, head)
//            head = node
        if(item != null){
            LinkedListNode<V> node = new LinkedListNode<>(item, head);
            head = node;
        }

    }

    public V pop() {
//      pseudo-code
//        if (head != null)

//             node = head
//             head = node.next
//             return node.value
//        return null
        if(head != null){
            LinkedListNode<V> node = head;
            head = node.getNext();
            return node.getValue();
        }
        return null;
    }

    public static void main(String[] args) {
        Stack<Integer> testingStack = new Stack<>();

        testingStack.push(0);
        testingStack.push(15);
        testingStack.push(11);
        testingStack.push(5500);
        testingStack.push(-15);

        System.out.println(testingStack);
        System.out.println("POP => " + testingStack.pop());
        System.out.println(testingStack);
        System.out.println("POP => " + testingStack.pop());
        System.out.println(testingStack);
        System.out.println("POP => " + testingStack.pop());
        System.out.println(testingStack);
        System.out.println("POP => " + testingStack.pop());
        System.out.println(testingStack);
    }
}