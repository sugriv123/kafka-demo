package com.kafka.kafka;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Supplier;

public class TestDemo {

    public static void main(String[] args) {

        String name="vikas";
        //Lambda Expression
        Supplier<List<String>> listSupplier=()->new ArrayList<>();
        //Constructor method reference
        Supplier listSupplier1=String::new;
        System.out.println(listSupplier +"*****"+listSupplier1);

        Function<Integer,Integer> st=x->x*x;


    }
}
