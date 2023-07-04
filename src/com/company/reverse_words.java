package com.company;

import java.util.Stack;

public class reverse_words {
    static void rev_words(String str){
        Stack<String> s=new Stack<>();

        String[] s1=str.split(" ");

        for(String s2:s1){
            s.push(s2);
        }

        while(!s.isEmpty()){
            String res=s.pop();
            System.out.println(res);
        }
    }
    public static void main(String[] args) {

    }
}
