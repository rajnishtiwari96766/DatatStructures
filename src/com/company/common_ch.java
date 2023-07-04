package com.company;
//
//import java.util.HashSet;
//import java.util.Set;
//
//public class common_ch {
//    static int ans(String str1,String str2){
//        Set<Character> s1=new HashSet<>();
////        int i=0;
//
//        char[] arr1=str1.toCharArray();
////        for(char i:str1.toCharArray()){
////            s1.add(i);
////        }
//
//        for (char i=0;i< arr1.length;i++){
//            s1.add(i);
//        }
//
//        Set<Character> s2=new HashSet<>();
////        int j=0;
////        for(char j:str2.toCharArray()){
////            s2.add(j);
////        }
//        char[] arr2=str2.toCharArray();
//
//        for (char i=0;i< arr2.length;i++){
//            s2.add(i);
//        }
//
//        int count=0;
//        for (char c:s1){
//            if (s2.contains(c)){
//                count++;
//            }
//        }
//        return count;
//    }
//    public static void main(String[] args) {
//        String str1="Rajnish";
//        String str2="Sharduli";
//
////        int res=ans(str1,str2);
////        System.out.println(res);
//
//        System.out.println(ans(str1,str2));
//    }
//}
//
import java.util.HashSet;
import java.util.Set;

public class common_ch {
    static int ans(String str1, String str2) {
        Set<Character> s1 = new HashSet<>();
        char[] arr1 = str1.toCharArray();

        for (char c : arr1) {
            s1.add(c);
        }

        Set<Character> s2 = new HashSet<>();
        char[] arr2 = str2.toCharArray();

        for (char c : arr2) {
            s2.add(c);
        }

        int count = 0;
        for (char c : s1) {
            if (s2.contains(c)) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        String str1 = "rajnish";
        String str2 = "anvi";

        System.out.println(ans(str1, str2));
    }
}

