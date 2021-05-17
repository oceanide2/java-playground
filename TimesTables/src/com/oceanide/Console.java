package com.oceanide;

import java.util.Scanner;

public class Console {
    private String prompt;
    private int min;
    private int max;

    public Console(String prompt, int min, int max) {
        this.prompt = prompt;
        this.min = min;
        this.max = max;
    }

    public int readNumber() {
        int value;

        while (true) {
            System.out.print(prompt);
            Scanner input = new Scanner(System.in);
            int number = input.nextInt();

            if (number >= 2 && number <= 9) {
                value = number;
                break;
            }
            System.out.println(min + "부터 " + max + "까지의 수를 입력하세요!");
        }
        return value;
    }

}
