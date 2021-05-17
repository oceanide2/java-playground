package com.oceanide;

public class Main {
    public static void main(String[] args) {
        var console = new Console("구구단에서 출력할 단은? ", 2, 9);
        int times = console.readNumber();

        var timesTable = new TimesTables(times);
        timesTable.calculate();
    }
}
