package com.questions;

import java.util.Arrays;
import java.util.List;

//🔹 Question 3: Count the Number of Elements Greater Than 10
public class Question3 {
    public static void main(String[] args) {
        List<Integer> number= Arrays.asList(11,2,33,21,10,11,0,5,77,41);
        //distinct() used to remove duplicate element
        long count = number.stream().distinct().sorted().skip(2).peek(n->System.out.println("before  "+n)).filter(n -> n > 10).peek(System.out::println).count();
        System.out.println(count);
    }
}
