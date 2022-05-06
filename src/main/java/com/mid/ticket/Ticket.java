package com.mid.ticket;

public class Ticket {
//    public static final int TAIPEI = 100;
//    public static final int TAICHUNG = 200;
//    public static final int KAOHSIUNG = 300;

    Station start;
    Station end;
    int price;
    public Ticket(Station start,Station end){
        this.start = start;
        this.end = end;
        int diff = Math.abs(start.id - end.id);
        System.out.printf("diff : "+diff);
        switch (diff){
            case 100:
                price = 500;
                break;
            case 200:
                price = 600;
                break;
            case 300:
                price = 1100;
                break;
        }
//        if(start == Station.TAIPEI){
//            if(end == Station.TAICHUNG){
//                price = 600;
//            }else {
//                price = 1500;
//            }
//        }
//        if(start == Station.TAICHUNG){
//            if(end == Station.TAIPEI){
//                price = 600;
//            }else {
//                price = 900;
//            }
//        }
//        if(start == Station.KAOHSIUNG){
//            if(end == Station.TAICHUNG){
//                price = 900;
//            }else {
//                price = 1500;
//            }
//        }
    }
    public void print(){
        System.out.println(start.name+"\t"+end.name+"\t"+price);
    }
}
