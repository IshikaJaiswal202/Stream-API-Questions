package com.questions;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
// Minimum and maximum number
public class Question4 {
    public static void main(String[] args) {
        List<Integer> number= Arrays.asList(11,2,33,21,10,11,1,5,77,41);
        Optional<Integer> max = number.stream().max(Comparator.naturalOrder());
        //System.out.println(number.stream().max(Integer::compareTo));
        System.out.println("max "+max);
        Optional<Integer> min = number.stream().min(Comparator.naturalOrder());
        System.out.println("min "+min );
    }
}
