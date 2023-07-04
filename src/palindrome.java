//check whether th given list is palindrome or not....

import java.util.Stack;

public class palindrome {
    static class Node{
        int data;
        Node next;

        Node(int d){
            data=d;
            next=null;
        }
    }
     boolean ispalindrome(Node head){
        boolean ispalin=false;
        Stack<Integer> st=new Stack<>();

        if (head==null){
            return ispalin;
        }

        while(head!=null){
            st.push(head.data);
            head=head.next;
        }


        while (head!=null){
            int i=st.pop();
            if (head.data==i){
                ispalin=true;
            }
            head=head.next;
        }
        return ispalin;
    }
    public static void main(String[] args) {
        palindrome ob=new palindrome();

        Node one=new Node(1);
        Node two=new Node(2);
        Node three=new Node(2);
        Node four=new Node(2);
        Node five=new Node(1);

        System.out.println(ob.ispalindrome(one));
    }
}