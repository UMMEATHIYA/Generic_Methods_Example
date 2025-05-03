package org.example;

import java.util.List;

public class NumberStats<T extends Number> {
    public double sum(List<T> numbers) {
        double total = 0.0;
        for (T num : numbers) {
            total += num.doubleValue();
        }
        return total;
    }

    public static void main(String[] args) {
        NumberStats<Integer> intStats = new NumberStats<>();
        System.out.println("Sum = " + intStats.sum(List.of(1, 2, 3)));

        NumberStats<Double> doubleStats = new NumberStats<>();
        System.out.println("Sum = " + doubleStats.sum(List.of(1.5, 2.5)));

        // NumberStats<String> invalidStats = new NumberStats<>(); // Compile error
    }
}
