package com.company;

public class Main {

    public static void main(String[] args) {

        double sum = 1000;
        double proc = 17.0;
        int years = 2;

        for (int i = 0; i<years; i++){

            sum += (sum*(proc/100));}

        System.out.println(sum);

    }
}
