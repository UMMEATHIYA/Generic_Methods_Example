package org.example;

import java.util.*;

public class WildcardExample {

    public static List<? extends Number> customList() {
        return List.of(1, 2.5, 3); // Mixed integers and doubles
    }

    public static void printList(List<?> list) {
        for (Object item : list) {
            System.out.println("Item: " + item);
        }
    }

    public static void main(String[] args) {
        List<? extends Number> numList = customList();
        printList(numList);
    }
}
