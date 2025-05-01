package com.interview.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class ToMap {
    public static void main(String[] args) {
        List<String> items = Arrays.asList("apple", "banana", "apple", "orange", "banana", "orange", "banana");
        Map<String, Integer> itemCount = items.stream()
                .collect(Collectors.toMap(
                        item -> item,
                        item -> 1,
                        Integer::sum // Merge function to sum duplicate values
                ));
        System.out.println("Using merge function : " + itemCount);

        Map<String, Integer> itemFrequency = items.stream()
                .collect(Collectors.groupingBy(item -> item, Collectors.summingInt(e -> 1)));
        System.out.println("Using groupingBy function : " + itemFrequency);
    }
}
