package com.questions;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

//🔹 Question 9: Find the Frequency of Each Word in a List
public class Question8 {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("apple", "banana", "apple", "cherry", "banana", "apple");
        Map<String, Long> wordFeq = words.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(wordFeq);
    }
}
