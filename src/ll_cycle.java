//detect cycle in the linked-list...

import org.w3c.dom.Node;

public class ll_cycle {
    static Node head;

    static class Node{
        int data;
        Node next;

        Node(int d){
            data=d;
            next=null;
        }
    }

    static boolean hascycle(){
        Node fast=head;
        Node slow=head;
        int flag=0;

        if (head==null){
            return false;
        }

        while (head!=null && head.next!=null){
            slow=slow.next;
            fast=fast.next.next;

            if (slow==fast){
                flag=1;
                break;
            }
        }
        if (flag==1){
            return true;
        }else {
            return false;
        }
    }
    public static void main(String[] args) {
        ll_cycle ob=new ll_cycle();

        ob.head=new Node(1);
        ob.head.next=new Node(2);
        ob.head.next.next=new Node(3);
        ob.head.next.next.next=new Node(4);
        ob.head.next.next.next.next=ob.head;

        System.out.println(ob.hascycle());
    }
}