package com.questions;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//Question 7: Remove duplicates from a list.
public class Question7 {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(1,4,7,6,9,11,44,1,4,88,6,66,567);
//        list.stream().distinct().forEach(System.out::println);
        List<Integer> list1 = list.stream().distinct().toList();
        System.out.println(list1);
    }
}
