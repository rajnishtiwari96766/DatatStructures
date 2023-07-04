//////increment some element of the stack with some values...
////
////import java.util.Stack;
////
////public class stk_increment {
////    static Stack<Integer> stk_increment(int k, int val, int []arr){
////        Stack<Integer> st1=new Stack<>();
////        Stack<Integer> st2=new Stack<>();
////
////        for (int i=0;i< arr.length;i++){
////            st1.push(arr[i]);
////        }
////
////        while (!st1.isEmpty()){
//////            st1.pop();
////            st2.push(st1.pop());
////        }
////
////        while (!st2.isEmpty()){
////            while (k-- >0) {
////                int var = st2.pop();
////                var = val + var;
////                st1.push(val);
////            }
////        }
////        return st1;
////    }
////    public static void main(String[] args) {
////
////    }
////}
//
//
//import java.util.Stack;
//
////----------------------------------------------------------------------//
//class customStack{
//    int n=0;
//    Stack<Integer> st1=new Stack<>();
//    public customStack(int maxSize){
//        n=maxSize;
//    }
//
//    public void push(int x){
//        if (st1.size()<n){
//            st1.push(x);
//        }
//    }
//
//    public int pop(){
//        if (st1.size()>0){
//            return st1.pop();
//        }
//        else {
//            return -1;
//        }
//    }
//
//    public int increment(int k,int val){
//        Stack<Integer> st2=new Stack<>();
//
//        while (!st1.isEmpty()){
//            st2.push(st1.pop());
//        }
//
//        for (int i=0;i<k;i++){
//            if (st2.size()==0){
//                break;
//            }
//            st1.push(st2.pop()+val);
//        }
//        while (st2.size()!=0){
//            st1.push(st2.pop());
//        }
//    }
//}
