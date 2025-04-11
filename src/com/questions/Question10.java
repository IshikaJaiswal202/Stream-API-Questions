package com.questions;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

// find the second highest number in a list using streams:
public class Question10 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(10, 20,85, 35, 50, 50, 75, 65);
        numbers.stream().distinct().sorted(Comparator.reverseOrder()).skip(1).findFirst().ifPresent(System.out::println);

    }
}
