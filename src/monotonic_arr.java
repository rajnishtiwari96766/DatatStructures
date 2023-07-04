//check whether the array is monotonic or not...
public class monotonic_arr {
    static boolean isMonotonic(int []nums){
        boolean ismonotonic=false;
        int i=0,j=0;
        for ( i=0;i<nums.length-1;i++){
            for ( j=i+1;j<nums.length-1;i++){
                if (nums[i]>=nums[j]){
                    ismonotonic= true;
                }else if (nums[i]<=nums[j]){
                    ismonotonic= true;
                }
            }
        }
        return ismonotonic;
    }
    public static void main(String[] args) {
        monotonic_arr ob=new monotonic_arr();

        int [] nums={1,2,2,3};

        System.out.println(isMonotonic(nums));
    }
}
