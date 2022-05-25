package com.company;

public class fifth zavd {
    public static void main(String[] args) {
        int a, b, c, d;
        int num = 0 ;

        for (int x = 0; x <= 24; x++){
            a = x/10;
            b = x%10;
            for (int z = 0; z <= 59; z++){
                c = z / 10;
                d = z % 10;
                if(a == d & c == b){
                    System.out.println(a + "" + b + ":"+ c + "" + d);
                    num++;
                }
            }
        }
        System.out.println("Number of matches: " + num);
    }
}