package com.mid.parking;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Runner {
    public static void main(String[] args) {
        String id = "ABC-1234";
        String entertime = "08:00";
        String exittime = "11:16";
        SimpleDateFormat sdf =new SimpleDateFormat("HH:mm");
        Date date =null;
        try{
            date =sdf.parse(entertime);
        }catch (Exception e){
            System.out.println("Wrong Format");
        }
        System.out.println(date);
        System.out.println(date.getTime());
        long ms = 8*60*60*1000;
        Date date2 = null;
        try{
            date2 = sdf.parse(exittime);
            System.out.println(date2);
            System.out.println(date2.getTime());
            int mins = (int)(date2.getTime()-date.getTime())/1000/60;
            System.out.println(mins);
            int fee = 30*(mins/60);
            System.out.println("Fee :"+fee);
//            3:14 => NT90 , 3:15 => NT120
//            3:15 ~ 3:30 => NT105
        }catch (Exception e){
            System.out.println("Wrong Format");
        }
    }
}
