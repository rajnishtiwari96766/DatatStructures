//import java.util.LinkedList;
//import java.util.Queue;
//
////implementing stacks using queues...
//public class st_queue {
//    static  class stack{
//        static Queue<Integer> q1=new LinkedList<>();
//        static Queue<Integer> q2=new LinkedList<>();
//
//        static int n;
//
//        static void push(int x){
//            q1.add(x);
//
//            while (q2.size()>0){
//                q1.add(q2.remove());
//                q2.remove();
//            }
//
//            Queue<Integer> q=q1;
//            q1=q2;
//            q2=q;
//        }
//
//        static void pop(){
//            if (q2.isEmpty())
//                return;
//
//            q2.remove();
//        }
//
//        static int top(){
//            if (q2.isEmpty())
//                return -1;
//
//            return q2.peek();
//        }
//
//        static int size(){
//            if (q2.isEmpty()){
//                return 0;
//            }
//            return q2.size();
//        }
//    }
//    public static void main(String[] args) {
//
//    }
//}
////------------------------------------------------------------------------//
//class MyStack {
//    Stack<Integer> stack=new Stack<>();
//    Queue<Integer> q1;
//    Queue<Integer> q2;
//
//    public MyStack() {
//        this.q1=new LinkedList<>();
//        this.q2=new LinkedList<>();
//    }
//
//    public void push(int x) {
//        q1.add(x);
//    }
//
//    public int pop() {
//        while(q1.size()>1){
//            q2.add(q1.remove());
//        }
//        int pop=q1.remove();
//        Queue<Integer> temp=q1;
//        q1=q2;
//        q2=temp;
//        return pop;
//    }
//
//    public int top() {
//        while(q1.size()>1){
//            q2.add(q1.remove());
//        }
//        int top=q1.peek();
//        q2.add(q1.remove());
//        Queue<Integer> temp=q1;
//        q1=q2;
//        q2=temp;
//        return top;
//
//    }
//
//    public boolean empty() {
//        if(q1.isEmpty()) return true;
//        return false;
//    }
//}
//
///**
// * Your MyStack object will be instantiated and called as such:
// * MyStack obj = new MyStack();
// * obj.push(x);
// * int param_2 = obj.pop();
// * int param_3 = obj.top();
// * boolean param_4 = obj.empty();
// */q