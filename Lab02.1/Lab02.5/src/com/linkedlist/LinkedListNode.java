package com.linkedlist;


public class LinkedListNode<V>{
    private V value;
    public LinkedListNode<V> next;

    public LinkedListNode(V value, LinkedListNode<V> next){
        this.value = value;
        this.next = next;
    }

    public LinkedListNode<V> getNext() {
        return next;
    }

    public V getValue() {
        return value;
    }

    public LinkedListNode setValue(V value){
        this.value = value;
        return this;
    }

    public LinkedListNode setNext(LinkedListNode<V> next){
        this.next = next;
        return this;
    }


    @Override
    public String toString() {
        return "LinkedListNode{" +
                "value=" + value +
                "}";
    }
}
