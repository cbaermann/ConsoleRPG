package com.linkedlist;

import org.junit.Before;
import org.junit.Test;

import javax.swing.plaf.IconUIResource;
import java.util.LinkedList;

import static org.junit.Assert.*;

public class SinglyLinkedListTest {
    SinglyLinkedList<Customer> custList = null;
    @Before
    public void setup(){
        custList = new SinglyLinkedList<>();
        custList.addFront(new Customer(12345, "Andrew Smith", 255));
        custList.addFront(new Customer(23456, "Betty Smith", 355));
        custList.addFront(new Customer(34567, "Charlie Smith", 455));
        custList.addFront(new Customer(45678, "Dora Smith", 555));
        custList.addFront(new Customer(56789, "Edward Smith", 655));
        custList.addFront(new Customer(67890, "Francie Smith", 755));
        custList.addFront(new Customer(78901, "Gregory Smith", 855));
    }
    @Test
    public void addFront() {
        int expected = custList.traverseList();
        custList.addFront(new Customer(173103, "Jonny B", 1000));
        int result = custList.traverseList();

        assertNotEquals(result, expected);
        assertEquals(8, result);

    }

    @Test
    public void deleteFront() {
        int expected = custList.traverseList();
        custList.deleteFront();
        int result = custList.traverseList();

    assertNotEquals(expected, result);
    assertEquals(6, result);
    }

    @Test
    public void getHead() {
        int expectedCustNo = 78901;
        LinkedListNode<Customer> head = custList.getHead();
        int actualCustNo = head.getValue().getCustomerNo();
        assertEquals(expectedCustNo, actualCustNo);
    }


    @Test
    public void traverseListPositive() {
        custList.traverseList();

        assertEquals(7, custList.traverseList());

    }
    @Test
    public void toStringPositive() {
        assertEquals(custList.toString(), custList.toString());
    }

    @Test
    public void reverse() {
//    int expected = custList.traverseList();
//    custList.rcursiveReverse();
//    int result = custList.traverseList();
//
//    assertEquals(result, expected);
        custList.recursiveReverse();
        custList.traverseList();


    }
}