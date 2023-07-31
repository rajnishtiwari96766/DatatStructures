////shifting all the zeroes to the end in the array
//package com.company;
//
//public class moving_zeros {
//    static void movezeroes(int [] nums){
//        int [] res=new int[nums.length];
//        for(int i=0;i< nums.length;i++){
//            if(nums[i]!=0){
//                res[i]=nums[i];
//            }
//        }
//        System.out.println(res);
//    }
//    public static void main(String[] args) {
//
//    }
//}


//package com.company;
//public class moving_zeros {
//    static void movezeroes(int []nums){
//        StringBuilder str=new StringBuilder();
//
//        for(int i=0;i< nums.length;i++){
//            if(nums[i]!=0){
//                str.append(nums[i]);
//            }
//        }
//        System.out.println(str.());
//    }
//    public static void main(String[] args) {
//
//    }
//}

package com.company;
public class moving_zeros {
    static void move_zero(int []nums){
        int temp=0;
        for(int i=0;i< nums.length;i++){
            for(int j=i+1;j< nums.length;j++){
                if(nums[j]!=0){
                    nums[j]=temp;
                    nums[i]=nums[j];
                    temp=nums[i];
                }
            }
        }

        for(int i=0;i< nums.length;i++){
            System.out.println(nums);
        }
    }
    public static void main(String[] args) {

    }
}