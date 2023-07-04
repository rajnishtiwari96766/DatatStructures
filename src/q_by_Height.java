//reconstruction of th queue using height...

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class q_by_Height {
    public int [][] queue(int [][]people){
        Arrays.sort(people,(x,y)->x[0]==y[0]?x[1]-y[1] :y[0]-x[0]);

        List<int[]> l=new ArrayList<>();
        for (int i=0;i<people.length;i++){
            l.add(people[i][1],people[i]);
        }

        return l.toArray(new int[people.length][2]);
    }
    public static void main(String[] args) {

    }
}