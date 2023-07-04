import java.util.HashSet;

//Find the distance between 2 arrays...
public class dist_bet2arr {
    static int diff(int []arr1,int []arr2,int d){
        int count=0;
//        HashSet<Integer> s=new HashSet<>();

        for (int i=0;i< arr1.length;i++){
            boolean inlimit=false;
            for (int j=0;j< arr2.length;j++){
                int val=Math.abs(arr1[i]-arr2[j]);
               if (val<=d){
                   inlimit=true;
                   break;
               }
            }
            if (!inlimit){
                count++;
            }
        }

        return count;
    }
    public static void main(String[] args) {

    }
}
