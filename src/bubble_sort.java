import java.lang.reflect.Array;
import java.util.Arrays;

//bubble sort algorithm...
public class bubble_sort {
    static int[] sort(int []arr){

        for (int i=0;i< arr.length;i++){
            for (int j=i+1;j< arr.length;j++){
                if (arr[i]>arr[j]){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        return arr;
    }
    public static void main(String[] args) {
        bubble_sort ob=new bubble_sort();
        int[] arr={3,2,4,12,2,1};
        System.out.println(Arrays.toString(sort(arr)));
//        sort(arr);
    }
}
