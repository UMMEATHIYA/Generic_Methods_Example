package org.example;

public class GenericSwap {
    public static <T> void swapElements(T[] array, int i, int j) {
        if (i >= array.length || j >= array.length || i < 0 || j < 0) {
            throw new IndexOutOfBoundsException("Invalid indices.");
        }
        T temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    public static void main(String[] args) {
        Integer[] nums = {1, 2, 3};
        swapElements(nums, 0, 2);
        System.out.println("Swapped nums: " + java.util.Arrays.toString(nums));

        String[] words = {"A", "B", "C"};
        swapElements(words, 1, 2);
        System.out.println("Swapped words: " + java.util.Arrays.toString(words));
    }
}
