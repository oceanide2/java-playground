package com.oceanide;

import java.util.ArrayList;

public class Student {
    private int id;
    private String name;
    private ArrayList<Subject> subjectList;

    private void addSubjectList(Subject[] subjects) {
        for (var subject: subjects) {
            subjectList.add(subject);
        }
    }

    public Student(int id, String name, Subject[] subjects) {
        this.id = id;
        this.name = name;

        this.subjectList = new ArrayList<>();
        addSubjectList(subjects);
    }

    public int AddAllSubjectsScore() {
        int sum = 0;

        for (var subject: subjectList) {
            sum += subject.getScore();
        }
        return sum;
    }

    public void showInfo() {
        System.out.println("학번: " + id + ", 이름: " + name);

        for (var subject: subjectList) {
            System.out.println("과목명: " + subject.getTitle() +
                    ", 점수: " + subject.getScore());
        }

        System.out.println("총합: " + AddAllSubjectsScore());
    }
}
