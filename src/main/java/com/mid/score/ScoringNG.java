package com.mid.score;

public class ScoringNG {
    public static void main(String[] args) {
        String[] name = {"one","two","three","four","five"};
        int[] english = {10,20,30,40,50};
        int[] math = {50,40,30,20,10};
        for (int i = 0; i < 5; i++) {
            if(i!=3){
                System.out.println(name[i]+"\t"+english[i]+"\t"+math[i]);
            }
        }
    }
}
