package com.company;

public class fourth zavd {
    public static void main(String[] args) {
        int x=1, f=1;
        int numb=10;

        for (x=1; x<=numb; x=x+1){
            f=f*x;
        }
        System.out.println("Factorial number 10:"+f);

        while(x<=numb){
            f=f*x;
            x++;
        }
        System.out.println("Factorial number 10:"+f);
    }
}
