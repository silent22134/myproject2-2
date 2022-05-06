package com.mid.score;

import com.mid.GraduateStudent;

import java.util.ArrayList;
import java.util.List;

public class Scoring {
    public static void main(String[] args) {
        Student jack = new Student("jack",88,54);

        Student lisa = new Student("lisa",61,76);
        GraduateStudent june = new GraduateStudent("june",77,75,71);
        List<Student>students = new ArrayList<>();
        students.add(jack);
        students.add(lisa);
        students.add(june);
        jack.print();
        lisa.print();
        june.print();
        for (int i = 0; i < students.size(); i++) {
            System.out.println(students.get(i));
        }
    }
}
