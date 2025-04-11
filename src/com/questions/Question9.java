package com.questions;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

//Question 10: Partition a List into Even and Odd Numbers
public class Question9 {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(1,4,7,6,9,11,44,1,4,88,6,66,567);
        Map<Boolean, List<Integer>> collect = list.stream().collect(Collectors.partitioningBy(n -> n % 2 == 0));
        List<Integer> evenNumber = collect.get(true);
        List<Integer> oldNumber = collect.get(false);
        System.out.println("evenNumber "+ evenNumber);
        System.out.println("oldNumber "+oldNumber);

    }
}
