package com.mergesort;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class MergeSortTest {

    @Test
    public void testMergeSort(){
        MergeSort sort = new MergeSort();
        int[] testArray = {87, 2, 17, 31, 51, 41, 11, 99, 100, 3};
        int[] expectedResult = {2, 3, 11, 17,31, 41, 51, 87, 99, 100};
        sort.mergeSort(testArray);
        assertEquals(Arrays.toString(expectedResult), Arrays.toString(testArray));
    }

    @Test
    public void testMergeSortNotEquals(){
        MergeSort sort = new MergeSort();
        int[] testArray = {87, 2, 17, 31, 51, 41, 11, 99, 100, 3};
        int[] expectedResult = {2, 3, 11, 17,31, 41, 51, 87, 99, -100};
        sort.mergeSort(testArray);
        assertNotEquals(Arrays.toString(expectedResult), Arrays.toString(testArray));
    }


}