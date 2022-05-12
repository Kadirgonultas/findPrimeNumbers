package com.company;

public class Main {

    public static void main(String[] args) {

        int total;
        for (int i = 2; i < 100; i++) {
            total=0;
            for (int x = 2; x < i; x++) {
                if (i % x == 0) {
                   total++;
                }
            }
            if(total == 0)
                System.out.println( i + " ");
        }



    }
}
