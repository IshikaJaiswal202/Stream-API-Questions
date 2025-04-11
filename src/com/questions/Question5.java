package com.questions;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

//🔹 Question 5: Find the Sum of All Numbers in a List
public class Question5 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(10, 20, 30, 40, 50);
        Optional<Integer> sumOf = numbers.stream().reduce((a, b) -> a + b);
        System.out.println("Sum "+sumOf);
        int sum = numbers.stream().mapToInt(Integer::intValue).sum();
        System.out.println(sum);
    }
}
