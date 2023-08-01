package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //let's code more and more...
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the first number:");
        int a= sc.nextInt();

        System.out.println("enter the second number:");
        int b= sc.nextInt();

        int sum=a+b;
        System.out.println("sum of the entered number's is:"+sum);
    }
}