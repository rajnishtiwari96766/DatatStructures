//import org.w3c.dom.Node;
//
////Gas station problem...
//public class gas_station {
//    Node head;
//
//    class Node{
//        int data;
//        Node next;
//
//        Node(int d){
//            data=d;
//            next=null;
//        }
//    }
//
//    static int station(int []gas,int []cost){
//        Node head=last.next;
//
////        int const1=0;
//        int i=0;
//        for ( i=0;i< gas.length;i++){
//            for (int j=0;j< cost.length;j++){
//
//                if (gas[i]>cost[j]){
////                const1=gas[i];
//                    int var=gas[i]-cost[j];
//
//                    if (var>=0){
//                        var+=gas[i+1];
//                    }
//                }
//            }
//        }
//        return gas[i];
//    }
//    public static void main(String[] args) {
//
//    }
//}

//-----------------------------------------------------------------//
class Solution1 {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int total=0,avail=0,index=0;
        for(int i=0;i<gas.length;i++){
            total+=gas[i]-cost[i];
            avail+=gas[i]-cost[i];
            if(avail<0){
                avail=0;
                index=i+1;
            }
        }
        if(total<0){
            return -1;
        }
        return index;
    }
}

//-------------------------------------------------------------------//
class Solution {
public int canCompleteCircuit(int[] gas, int[] cost) {
        int totalgas=0,totalcost=0;

        for(int i=0;i<gas.length;i++){
        totalgas+=gas[i];
        totalcost+=cost[i];
        }

        if(totalgas < totalcost){
        return -1;
        }

        int tankingas=0,start=0;

        for(int i=0;i<gas.length;i++){
        tankingas+=gas[i];
        tankingas-=cost[i];

        if(tankingas<0){
            tankingas=0;
        start=i+1;
        }
        }
        return start;
        }
        }