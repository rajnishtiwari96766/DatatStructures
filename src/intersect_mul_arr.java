//find the common element in the sub-arrays in a 2-d array...

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class intersect_mul_arr {
    static List<Integer> intersection(int [][] nums){
        List<Integer> list=new ArrayList<>();

        if (nums==null || nums.length==0 || nums[0].length==0){
            return list;
        }
        HashSet<Integer> set=new HashSet<>();
        for(int i:nums[0]){
            set.add(i);
        }


        for (int i=1;i< nums.length;i++){
            HashSet<Integer> tempset=new HashSet<>();
            for (int j:nums[i]){
                if (set.contains(j)){
                   tempset.add(j);
                }
            }
            set=tempset;
        }

        list.addAll(set);
        return list;
    }
    public static void main(String[] args) {
        intersect_mul_arr ob=new intersect_mul_arr();

        int[][] nums={{3,1,2,4,5},{1,2,3,4},{3,4,5,6}};

        System.out.println(intersection(nums));
    }
}
