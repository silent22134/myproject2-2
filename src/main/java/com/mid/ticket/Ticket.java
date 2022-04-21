package com.mid.ticket;

public class Ticket {
    public static final int TAIPEI = 100;
    public static final int TAICHUNG = 200;
    public static final int KAOHSIUNG = 300;

    Station start;
    Station end;
    int price;
    public Ticket(Station start,Station end){
        this.start = start;
        this.end = end;
        if(start == Station.TAIPEI){
            if(end == Station.TAICHUNG){
                price = 600;
            }else {
                price = 1500;
            }
        }
        if(start == Station.TAICHUNG){
            if(end == Station.TAIPEI){
                price = 600;
            }else {
                price = 900;
            }
        }
        if(start == Station.KAOHSIUNG){
            if(end == Station.TAICHUNG){
                price = 900;
            }else {
                price = 1500;
            }
        }
    }
    public void print(){
        System.out.println(start.name+"\t"+end.name+"\t"+price);
    }
}
