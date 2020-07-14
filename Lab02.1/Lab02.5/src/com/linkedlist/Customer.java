package com.linkedlist;

public class Customer {
    private int customerNo;
    private String name;
    private float balance;

    public Customer(int customerNo, String name, float balance){
        this.customerNo = customerNo;
        this.name = name;
        this.balance = balance;
    }

    public int getCustomerNo() {
        return customerNo;
    }

    public String getName() {
        return name;
    }

    public float getBalance() {
        return balance;
    }

    public void makePayment(float payment){
        if(payment > 0){
            balance -= payment;
        }
    }

    @Override
    public String toString() {
        return "Customer{" +
                "custNo=" + customerNo +
                ", name='" + name + '\'' +
                ", balance=" + balance +
                '}';
    }
}
