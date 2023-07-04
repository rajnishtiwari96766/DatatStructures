package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class candies {
    public List<Boolean> kidsWithCandies(int []candies,int extraCandies){
        int greatest=candies[0];
        int n=candies.length;
        List<Boolean> result=new ArrayList<>();

        for (int i=1;i<candies.length;i++){
           if(candies[i]>greatest){
               greatest=candies[i];
           }
        }

        for(int i=0;i< candies.length;i++){
            candies[i]=candies[i]+extraCandies;

            if (candies[i]> greatest){
                result.add(true);
            }else {
                result.add(false);
            }
        }
        return result;
    }
    public static void main(String[] args) {

    }
}
