package com.questions;

import java.util.Arrays;
import java.util.List;

// Question 6: Count even numbers in a list.
public class Question6 {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(1,4,7,6,9,11,44,66,567);
        long count = list.stream().filter(n -> n % 2 == 0).count();
        System.out.println(count);
    }

}
