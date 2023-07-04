package com.company;

public class fibonacci {
    static int fibo(int n){
        int a=0,b=1;
        int c=0;
        while(n-- >0){
            c=a+b;
            a=b;
            b=c;
            fibo(n);
        }
//        System.out.println(c);
        return c;
    }
    public static void main(String[] args) {
       int res= fibo(0);
        System.out.println(res);
    }
}
