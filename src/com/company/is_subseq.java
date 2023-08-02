//check if the subseq is present or not...
//package com.company;
//public class is_subseq {
//    static boolean subseq(String s,String t){
//        boolean seq_present=false;
//        for(int i=0;i<t.length();i++){
//            if(!s.contains(t.charAt(i))){
//                t.remove();
//            }
//        }
//
//        if(s==t){
//            seq_present=true;
//        }
//        return seq_present;
//    }
//    public static void main(String[] args) {
//
//    }
//}


package com.company;
public class is_subseq {
    static boolean subseq(String s,String t){
        int i=0;
        boolean seq_present=false;
//        i=s.charAt(i);

        for(int j=0;j<t.length();j++){
                if(t.charAt(j)==s.charAt(i)){
                    i++;
                }
        }

        if(i==s.length()){
            seq_present=true;
        }
        return seq_present;
    }
    public static void main(String[] args) {

    }
}