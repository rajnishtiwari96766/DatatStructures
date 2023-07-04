////removing the stars from the string...
//
//import java.util.Stack;
//
//public class rem_stars {
//    static void rem_str(String []str){
////        char res="";
//        Stack<String> st=new Stack<>();
//
//       for (int i=0;i< str.length;i++){
//           st.push(str[i]);
//
//           if (!st.isEmpty()) {
//               String res = st.peek();
//
//               if (res=="*"){
//                   st.pop();
//                   st.pop();
//               }
//           }
//       }
//        System.out.println(st);
//    }
//    public static void main(String[] args) {
//        rem_stars ob=new rem_stars();
//
//        String []str={"e","r","a","s","e","*","*","*","*","*"};
//
//        rem_str(str);
//    }
//}


//----------------------------------------------------------------//

import java.util.Stack;

public class rem_stars {
    static String rem_str(String str){
        Stack<Character> st=new Stack<>();

        for (int i=0;i<str.length();i++){
            st.push(str.charAt(i));

            if (st.peek()=='*'){
                st.pop();
                st.pop();
            }
        }
        StringBuilder string=new StringBuilder();
        while (!st.isEmpty()){
            string.append(st.pop());
        }

        return string.reverse().toString();
    }
    public static void main(String[] args) {
        rem_stars ob=new rem_stars();

        String str="leet**cod*e";

        System.out.println(rem_str(str));
    }
}