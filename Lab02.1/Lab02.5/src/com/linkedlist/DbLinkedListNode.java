package com.linkedlist;

public class DbLinkedListNode<V> {
    private V value;
    private DbLinkedListNode<V> next;
    private DbLinkedListNode<V> previous;

    public DbLinkedListNode(V value,
                            DbLinkedListNode<V> next,
                            DbLinkedListNode<V> previous) {
        this.value = value;
        this.next = next;
        this.previous = previous;
    }

    public DbLinkedListNode<V> getNext() {
        return next;
    }

    public DbLinkedListNode<V> getPrevious() {
        return previous;
    }

    public V getValue() {
        return value;
    }

    public DbLinkedListNode setValue(V value) {
        this.value = value;
        return this;
    }

    public DbLinkedListNode setNext(DbLinkedListNode<V> next) {
        this.next = next;
        return this;
    }


    public DbLinkedListNode setPrevious(DbLinkedListNode<V> previous) {
        this.previous = previous;
        return this;
    }
}

