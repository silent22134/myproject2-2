package com.mid.sales;

public class Silver extends Member{
    public Silver(String level,int money){
        super(level, money);
    }
    @Override
    public void print(){
        System.out.println(level+"\t"+money+"\t"+(money-offmoney())+"("+offmoney()+")");
    }
}
