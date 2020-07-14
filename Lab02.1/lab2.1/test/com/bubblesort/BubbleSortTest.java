package com.bubblesort;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;


public class BubbleSortTest {

    @Test
    public void bubbleSort(){
        BubbleSort testBubbleSort = new BubbleSort();
        int[] testSort = new int[]{5,4,3,2,1};
        int[] bubbleSortRestult = new int[]{1,2,3,4,5};
        assertEquals(Arrays.toString(bubbleSortRestult), Arrays.toString(testBubbleSort.bubbleSort(testSort)));

    }

}