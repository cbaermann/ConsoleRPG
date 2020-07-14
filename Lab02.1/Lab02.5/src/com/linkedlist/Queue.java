package com.linkedlist;


public class Queue<V> {
    // DblLinkedListNode is provided
    // create a private Node for "head"
    // create a private Node for "tail"
    private DbLinkedListNode<V> head;
    private DbLinkedListNode<V> tail;

    public Queue() {
        head = null;
        tail = null;
    }

    public void enqueue(V item) {
        // add an item to the queue
        // pseudo code:
//        node = new Node(item)
//        node.previous = tail
//        if (head == null)  this means the queue is empty
//            head = node  so the node becomes the head
//            tail = node  and the tail
//        set tail previous to node
//        set node next to tail
//        set node previous to null
//        set tail to node
        DbLinkedListNode<V> node = new DbLinkedListNode<>(item, null, tail);
        if(head == null){
            head = node;
            tail = node;
        }
        tail.setPrevious(node);
        node.setNext(tail);
        node.setPrevious(null);
        tail = node;
    }

    public V dequeue() {
        // add an item to the queue
        // pseudo code:
//        if (head != null)
//            node = head's value
//        head = head.previous
//        return node
//       else return null
        if(head != null){
           V node = head.getValue();
           head = head.getPrevious();
           return node;
        }
        return null;

    }

    public static void main(String[] args) {
        Queue<String> q = new Queue<>();
        q.enqueue("one");
        q.enqueue("two");
        q.enqueue("three");
        System.out.println("3 Values added to queue");
        System.out.println("Now try to remove all 3 Values");
        System.out.println(q.dequeue());
        System.out.println(q.dequeue());
        System.out.println(q.dequeue());
        System.out.println("\nAll values removed, try to remove another");
        System.out.println(q.dequeue());
        System.out.println("\nQueue should be empty now, add a new item");
        q.enqueue("four");
        System.out.println("\nNow remove the one item");
        System.out.println(q.dequeue());
        System.out.println("\nAll items should be gone, try to remove one");
        System.out.println(q.dequeue());

    }
}

