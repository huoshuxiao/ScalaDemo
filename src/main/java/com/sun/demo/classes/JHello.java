package com.sun.demo.classes;

import java.util.Arrays;

public class JHello {

    public static void main(String[] args) {

        String[] arrays = new String[3];

        Arrays.asList(args).forEach(i -> System.out.println(i));
    }
}
