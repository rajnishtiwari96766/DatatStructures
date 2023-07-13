package com.company;

public class triplets_subseq {
    static boolean increasingtriplet(int []nums){
        int n= nums.length;

        if(n<3){
            return false;
        }

        int small=Integer.MAX_VALUE;
        int big=Integer.MAX_VALUE;

        for (int i=0;i<n;i++){
            int num=nums[i];

            if(num<=small){
                small=num;
            }else if(num<=big){
                big=num;
            }else {
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {

    }
}
