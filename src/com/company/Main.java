package com.company;

import java.util.ArrayList;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        // write your code here
        ArrayList<Integer> numbers = new ArrayList<>();
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            numbers.add(i + 1);
            sum = sum+(i+1);
        }
	// Added comment
        System.out.println(numbers);
        System.out.println("suma initiala:" + sum);

        int rando = (int) ((Math.random() * numbers.size()));
        numbers.remove(rando);

        int sum2 = 0;
        for (int i = 0; i < numbers.size(); i++) {
            sum2 = sum2+ numbers.get(i);
        }

        System.out.println(numbers);
        System.out.println("suma cu un numar lipsa:" + sum2);

        System.out.println("valoarea lipsa este:" + (sum - sum2));
    }
}