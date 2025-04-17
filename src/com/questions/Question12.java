package com.questions;

import java.util.Arrays;
// Remove duplicates from the string and return in the same order|
public class Question12 {
    public static void main(String[] args) {
         String name="ishikajaiswal";
         name.chars().distinct().mapToObj(x-> (char) x).forEach(System.out::print);
         System.out.println();
         Arrays.stream(name.split("")).distinct().forEach(System.out::print);

    }
}
