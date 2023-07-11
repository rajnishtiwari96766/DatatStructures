////find the product of the array except itself...
//package com.company;
//public class array_product {
//    static int[] productExceptSelf(int []nums){
//        int n=nums.length;
//        int [] ans=new int[n];
//        int product=1;
//        for (int i=0;i<n;i++){
//            for (int j=0;j<n;j++){
//                if(i==j){
//                    continue;
//                }
//                product*=ans[j];
//            }
//        }
//        return  ans;
//    }
//    public static void main(String[] args) {
//
//    }
//}

//-----------------------------------------------------------//
//class Solution {
//    public int[] productExceptSelf(int[] nums) {
//        int n=nums.length;
//        int ans[]=new int [n];
//        Arrays.fill(ans,1);
//        int curr=1;
//        for(int i=0;i<n;i++){
//            ans[i]*=curr;
//            curr*=nums[i];
//        }
//        curr=1;
//        for(int i=n-1;i>=0;i--){
//            ans[i]*=curr;
//            curr*=nums[i];
//        }
//        return ans;
//    }
//}