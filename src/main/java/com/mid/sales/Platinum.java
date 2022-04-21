package com.mid.sales;

public class Platinum extends Member{
    public Platinum(String level,int money){
        super(level, money);
    }
    @Override
    public float offmoney(){
        return money*off;
    }
}
