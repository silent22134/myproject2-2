package com.mid;

import com.mid.score.Printable;
import com.mid.score.Student;

public class GraduateStudent extends Student implements Printable {
    int thesis;
    public GraduateStudent(String name,int english,int math,int thesis){
        super(name, english, math);
        this.thesis = thesis;
    }
    @Override
    public void print(){
        System.out.println(name+"\t"+english+"\t"+math+"\t"+getAverage()+"\t"+thesis);
    }
}
