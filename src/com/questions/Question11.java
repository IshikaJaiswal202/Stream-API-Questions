package com.questions;

import java.util.Arrays;
import java.util.Comparator;
// find the longest and smallest word in the given string
public class Question11 {
    public static void main(String[] args) {
            String sentences="Hello everyone i am ishika";
            String[] s = sentences.split(" ");
            Arrays.stream(s).max(Comparator.comparing(String::length)).ifPresent(System.out::println);
            Arrays.stream(s).min(Comparator.comparing(String::length)).ifPresent(System.out::println);
        }
    }

