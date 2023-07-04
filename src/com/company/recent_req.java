//find the number of requests in the given time period...
package com.company;

import java.util.LinkedList;

public class recent_req {

    private int[] arr;
//    int n= arr.length;

//    private LinkedList<Integer> q;

    public recent_req(){
        arr=new int[0];
//        q=new LinkedList<>();
    }

    public int ping(int t){
        int count=0;


        for (int i=0;i< arr.length;i++){
            int index=0;

                int a = t - 3000;

                if (arr[i] >= a && arr[i] <= t) {
                    count++;
                }
//                q.add(count);
            }
        
       return count;
    }
    public static void main(String[] args) {

    }
}
