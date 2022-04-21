package com.mid.score;

public class Scoring {
    public static void main(String[] args) {
        Student jack = new Student("jack",88,54);
        Student lisa = new Student("lisa",61,76);
        GraduateStudent june = new GraduateStudent("june",77,75,71);
        jack.print();
        lisa.print();
        june.print();
    }
}
