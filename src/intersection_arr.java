//print the common elements in the two arrays...

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class intersection_arr {
    static int [] common(int []nums1,int []nums2){
        Set<Integer> s1=new HashSet<>();
        for(int i:nums1){
            s1.add(i);
        }

        Set<Integer> s2=new HashSet<>();
        for(int i:nums2){
            s2.add(i);
        }

        Set<Integer> s=new HashSet<>();
        for(int var:s1){
            if(s2.contains(var)){
                s.add(var);
            }
        }

        int [] arr=new int [s.size()];
        int i=0;
        for(int val:s){
            arr[i]=val;
            i++;
        }
        return arr;
    }
    public static void main(String[] args) {
        intersection_arr ob=new intersection_arr();

        int []num1={1,2,2,1};
        int []num2={2,2};

        System.out.println(Arrays.toString(common(num1, num2)));
    }
}