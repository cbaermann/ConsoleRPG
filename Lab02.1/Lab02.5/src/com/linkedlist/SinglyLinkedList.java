package com.linkedlist;

import javax.naming.LinkLoopException;

public class SinglyLinkedList<V> {
    private LinkedListNode<V> head;
    public SinglyLinkedList(){
        head = null;
    }

    public void addFront(V item) {
        this.head = new LinkedListNode<V>(item, head);
    }

    public void deleteFront(){
        LinkedListNode<V> firstNode = this.head;

        if(firstNode != null){
            LinkedListNode<V> node = head.getNext();
            if(node!=null){
                LinkedListNode<V> tempNode = node;
                this.head.setNext(null);
                this.head=node;
            }
            else{
                this.head = null;
            }
        }
    }

    public LinkedListNode<V> getHead(){
        return head;
    }

    public int traverseList(){
        int size = 0;
        LinkedListNode<V> currentNode = getHead();
        while(currentNode!=null){
            System.out.println(currentNode.toString());
            currentNode = currentNode.getNext();
            size++;
        }
        System.out.println("Size of list is " + size);
        return size;
    }

//    public void reverse(){
//        LinkedListNode<V> pointer = head;
//        LinkedListNode<V> previous = null;
//        LinkedListNode<V> current = null;
//
//        while(pointer != null){
//            current = pointer;
//            pointer = pointer.next;
//
//            current.next = previous;
//            previous = current;
//            head = current;
//        }
//    }
    public void recursiveReverse(){
        reverse(head);
    }
    private void reverse(LinkedListNode<V> node){
        if(node != null) {
            System.out.println(node);
        }
        LinkedListNode<V> currentNode = node.getNext();
        if (currentNode != null) {
            LinkedListNode<V> next = currentNode;
            reverse(next);
        }
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        LinkedListNode<V> current = head;
        while(current != null){
            builder.append(current);
            builder.append("\n");
            LinkedListNode<V> next = current.getNext();
            if(next!=null){
                current = next;
            }
            else{
                current = null;
            }
        }
        return builder.toString();
    }
}
