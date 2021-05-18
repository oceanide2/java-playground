package com.oceanide;

public class Main {

    public static void main(String[] args) {
        var kim = new Student(100,"Kim", new Subject[] {
                new Subject("국어", 100),
                new Subject("수학", 50)
        });

        kim.showInfo();

        var lee = new Student(101, "lee", new Subject[] {
                new Subject("국어", 70),
                new Subject("수학", 80),
                new Subject("영어", 100),
        });

        lee.showInfo();
    }
}
