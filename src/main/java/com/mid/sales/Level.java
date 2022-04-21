package com.mid.sales;

import java.util.ArrayList;
import java.util.List;

public class Level {
    public static void main(String[] args) {
        List<Member> members = new ArrayList<>();
        members.add(new Member("0001",1200));
        members.add(new Member("0002",800));
        members.add(new Silver("0003",2000));
        members.add(new Golden("0004",5000));
        members.add(new Platinum("0006",900));
        for (int i = 0; i < 5; i++) {
            members.get(i).print();
        }
        for (Member m : members) {
            m.print();
        }
    }

}
