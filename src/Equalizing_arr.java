//equalizing the array by reversing the sub arrays...

import java.util.HashSet;
import java.util.Set;

public class Equalizing_arr {
    static boolean canBeEqual(int []target,int []arr){
        boolean isEqual=true;
        int n2= arr.length;
        int n1=target.length;

        if (n1!=n2){
            isEqual=false;
        }

        Set<Integer> s1=new HashSet<>();
        for (int i:target){
            s1.add(i);
        }
        Set<Integer> s2=new HashSet<>();
        for (int j:arr){
            s2.add(j);
        }

        if(!s1.contains(s2)){
            isEqual=false;
        }

        for (int i=0;i<arr.length;i++){
            for (int j=i+1;j< target.length;j++){
                if (j<i){
                    int temp=i;
                    i=j;
                    j=temp;
                }
            }
        }
        return isEqual;
    }
    public static void main(String[] args) {

    }
}