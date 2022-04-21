package com.mid.ticket;

public class Student extends  Ticket{
    float off = 0.1f;
    public Student(Station start,Station end){
        super(start,end);
        price = price - (int)(price*off);
    }
}
