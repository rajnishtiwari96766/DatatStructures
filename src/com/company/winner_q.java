//find winner from the circular queue...
package com.company;

import java.util.LinkedList;

public class winner_q {
    private  LinkedList<Integer> q;
    public int winner(int n,int k){
        q=new LinkedList<>();

        if(q.isEmpty()){
            return 0;
        }

        int a=0;
        for(int i=0;i<k;i++){
            while(n>1) {
                if (i == k) {
                    q.remove();
                }
                n--;
            }
        }
        return q.poll();
    }
    public static void main(String[] args) {

    }
}
