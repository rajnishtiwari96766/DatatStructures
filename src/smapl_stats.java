////generate a stastics from the given sample...
//
//import com.company.Main;
//
//import java.util.Arrays;
//import java.util.Stack;
//
//public class smapl_stats {
//    double []arr=new double[5];
//    static double[] stats(int [] count){
//        Stack<Integer> st=new Stack<>();
//
//        int size=0;
//        for (int i=0;i<count.length;i++){
//            while(count[i]-- >0){
//                st.push(i);
//                size++;
//            }
//        }
//        double[] arr=new double[size];
//        if (size>0) {
//            double max=0,min=0;
//            double mean=0,sum=0,median=0,mid1=0,mid2=0;
//            int[] sample = new int[size];
//            for (int i = 0; i < size; i++) {
//                sample[i] = st.pop();
//            }
//            Arrays.sort(sample);
//
//            for (int i=0;i<size-1;i++){
//                min=sample[0];
//
//                if (sample[i]<sample[i+1]){
//                    max=sample[i+1];
//                }
//
//                if (sample[i]>sample[i+1]){
//                    min=sample[i+1];
//                }
//            }
//
//            for (int i=0;i<sample.length;i++){
//                sum+=sample[i];
//                mean=sum/size;
//            }
//
//            for (int i=0;i<sample.length;i++){
//
//                if (size%2==0){
//                    median=(sample[size/2] + sample[(size/2)-1])/2.0;
//                }else if (size%2!=0){
//                    median=sample[size/2];
//                }
//            }
//
//            int max_rep=0;
//            int max_count=0;
//            for (int i=0;i<size;i++){
//                int rep=0;
//                for (int j=0;j<size;j++){
//                    if (sample[i]==sample[j]){
//                      rep++;
//                    }
//                }
//                if (rep>max_count){
//                    max_count=rep;
//                    max_rep=sample[i];
//                }
//            }
//        arr[0]=min;
//            arr[1]=max;
//            arr[2]=mean;
//            arr[3]=median;
//            arr[4]=max_rep;
//        }
//        return arr;
//    }
//
//    public static void main(String[] args) {
//        smapl_stats ob=new smapl_stats();
//
//        int []count={0,4,3,2,2,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
//        stats(count);
//    }
//}
