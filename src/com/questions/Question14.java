package com.questions;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
// Given a sentence, find the occurrence of each word
public class Question14 {
    public static void main(String[] args) {
        String sentences="Hello i am  ishika  everyone i hello i am am ishika";
        Map<String, Long> collect = Arrays.stream(sentences.split(" ")).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(collect);
        Map<String, Long> collect1 = Arrays.stream(sentences.split(" ")).collect(Collectors.groupingBy(x->x, Collectors.counting()));
        System.out.println(collect1);
    }
}
