package com.algorithms;


import java.util.ArrayList;


public class PracticeArrays {

    private int[] items;
    private int count;

    public PracticeArrays(int length){
        items = new int[length];
    }

    public void print(){
//        for(int i : items){
//            System.out.println(i);
//        }
        for(int i = 0; i < count; i++){
            System.out.println(items[i]);
        }
    }

    public void insert(int item){
        if(items.length == count){
            int[] newItems = new int[count * 2];
            for(int i = 0; i < count; i++){
                newItems[i] = items[i];
            }
            items = newItems;
        }
        items[count++] = item;
    }

    public void removeAt(int index){
        if(index < 0 || index >= count){
            throw new IllegalArgumentException();
        }
        for(int i = index; i < count; i++){
            items[i] = items[i + 1];
        }
        count--;
    }

    public int indexOf(int item){
        for(int i = 0; i < count; i++){
            if(items[i] == item){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        PracticeArrays numbers = new PracticeArrays(3);
        numbers.insert(10);
        numbers.insert(20);
        numbers.insert(30);
        numbers.insert(40);
//        numbers.removeAt(3);
//        System.out.println(numbers.indexOf(20));
//        numbers.print();

        ArrayList<Integer> arrayListofInts = new ArrayList<>();
        arrayListofInts.add(10);
        arrayListofInts.add(20);
        arrayListofInts.add(30);
        arrayListofInts.add(40);
        arrayListofInts.remove(0);
        System.out.println(arrayListofInts);


    }
}
