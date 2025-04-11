package com.questions;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

//🔹 Question 2: Filter All Even Numbers from a List
public class Question2 {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(1,8,3,5,6,7,4,9,0,1,3);
        List<Integer> number = list.stream().filter(n -> n % 2 == 0)
                .toList();
        System.out.println(number);
        //because collection all classes override the toString()
        System.out.println(list);
    }
}
