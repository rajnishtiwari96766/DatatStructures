//import java.util.Stack;
//
//public class stack_seq {
//   static boolean seq(int[]pushed,int []popped){
//        int j;
//       Stack<Integer> st=new Stack<>();
//        for (int i:pushed){
//            st.push(i);
//            while (!st.isEmpty() && st.peek()==popped[j]){
//                st.pop();
//                j++;//incrementing the popped pointer
//            }
//        }
//        return st.isEmpty();
//    }
//    public static void main(String[] args) {
//
//    }
//}