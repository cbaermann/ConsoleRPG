package com.quicksort;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class QuickSortTest {
    @Test
    public void testQuickSort(){
        QuickSort sortTest = new QuickSort();
        int[] sortInput = new int[]{9,8,7,6,5,4,3,2,1};
        int[] sortResult = new int[]{1,2,3,4,5,6,7,8,9};
        assertEquals(Arrays.toString(sortResult), Arrays.toString(sortTest.sort(sortInput)));
    }

}