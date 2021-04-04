package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        long i,N,sum;
        N=13;
        sum=0;

        for(i=0;i<N;i++) {
            sum+= i*i;
        }
        System.out.println(sum);
    }
}
