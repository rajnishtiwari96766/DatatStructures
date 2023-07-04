////import java.util.Stack;
////
//////implementing queue using stack...
////public class queue_stack {
////    static void q_stack(int []arr){
////        Stack<Integer> st1=new Stack<>();
////        Stack<Integer> st2=new Stack<>();
////
////        int res=0;
////        for (int i=0;i< arr.length;i++){
////            st1.push(arr[i]);
////        }
////        while(!st1.isEmpty()){
////            st2.push(st1.pop());
////        }
////
////        while(!st2.isEmpty()){
//////            res= st2.pop();
////            st1.push(st2.pop());
////        }
////        System.out.println(st1);
//////        return res;
////    }
////    public static void main(String[] args) {
////        queue_stack ob=new queue_stack();
////
////        int []arr={1,2,3,4,5};
////
////        q_stack(arr);
////    }
////}
//
////---------------------------------------------------------------//
//class MyQueue {
//    // creat argument / veriables
//    private Stack<Integer> stack1 = new Stack<>();
//    private Stack<Integer> stack2 = new Stack<>();
//
//    public MyQueue() {
//
//    }
//
//    public void push(int x) {
//        if(stack1.isEmpty()){
//            stack1.push(x);  // pushing in stack1
//            return;
//        }
//        while(!stack1.isEmpty()){
//            stack2.push(stack1.pop()); // first Popping in stack1 then pushing stack1's pop value in stack2
//            // stack1.pop();
//        }
//        stack1.push(x);
//        while(!stack2.empty()){
//            stack1.push(stack2.pop()); // first Popping in stack2 then pusing stack2's pop value in stack1
//            // stack2.pop();
//        }
//    }
//
//    public int pop() {
//        return stack1.pop(); // Popping in stack1
//    }
//
//    public int peek() {
//        return stack1.peek();
//    }
//
//    public boolean empty() {
//        return stack1.isEmpty() && stack2.isEmpty();
//    }
//}
//
///**
// * Your MyQueue object will be instantiated and called as such:
// * MyQueue obj = new MyQueue();
// * obj.push(x);
// * int param_2 = obj.pop();
// * int param_3 = obj.peek();
// * boolean param_4 = obj.empty();
// */