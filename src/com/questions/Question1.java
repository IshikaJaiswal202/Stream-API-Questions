package com.questions;


import java.util.Arrays;
import java.util.List;

//🔹 Question 1: Convert a list of strings to uppercase
public class Question1 {

    public  static  void  main(String args[])
    {
        List<String> names= Arrays.asList("ishika","sarita","rishika","mishika","kishika");
        names.stream().map(String::toUpperCase)
                .forEach(System.out::println);

        for(String name:names)
        {
            System.out.println(name);
        }
    }
}
