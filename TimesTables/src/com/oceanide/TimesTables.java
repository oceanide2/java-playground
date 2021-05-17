package com.oceanide;

import java.util.ArrayList;

public class TimesTables {
    private int times;
    private ArrayList<Integer> numbers = new ArrayList<>();

    private void initializeNumbers() {
        for (int i = 1; i < 10; i++) {
            numbers.add(i);
        }
    }

    public TimesTables(int times) {
        this.times = times;
        initializeNumbers();
    }

    public void calculate() {
        for (var number: numbers) {
            System.out.println(times * number);
        }
    }
}
