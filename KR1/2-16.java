package com.company;

public class Main {
    public static void main(String[] args) {
        int a = 2;
        int b = 3;
        System.out.println("a = " + a + " b = " + b);
        a += b;
        b = a - b;
        a -= b;
        System.out.println("a = " + a + " b = " + b);
    }
}
