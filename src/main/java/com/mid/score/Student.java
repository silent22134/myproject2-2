package com.mid.score;

public class Student implements Printable{
    protected String name;
    protected int english;
    protected int math;
    public Student(String name){
        this.name = name;
    }
    public Student(String name,int english,int math){
        this(name);
        this.english = english;
        this.math = math;
    }
    public Student(){
        this("john",-1,-1);
    }
    @Override
    public void print(){
        System.out.println(name+"\t"+english+"\t"+math+"\t"+getAverage());
    }
    public int getAverage(){
        return (english+math)/2;
    }
}
