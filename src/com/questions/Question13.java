package com.questions;

import java.util.Arrays;
import java.util.Comparator;
//Find the word that has the second highest length
public class Question13 {
    public static void main(String[] args) {
        String sentences="Hello everyone i am ishika";
        String[] s = sentences.split(" ");
        Arrays.stream(s).sorted(Comparator.comparing(String::length).reversed()).skip(1).findFirst().ifPresent(System.out::println);
// Find the 2nd highest length word in the given sentence
        //length in int value
        Arrays.stream(s).map(c->c.length()).sorted(Comparator.reverseOrder()).skip(1).findFirst().ifPresent(System.out::println);
    }
}
