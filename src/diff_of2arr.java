import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

//find the difference between 2 arrays...
public class diff_of2arr {
    static List<List<Integer>> find_diff(int [] num1,int []num2){
        List<Integer> list1=new ArrayList<>();
        List<Integer> list2=new ArrayList<>();

        Set<Integer> s1=new HashSet<>();
        Set<Integer> s2=new HashSet<>();

        for (int i=0;i< num1.length;i++){
            s1.add(num1[i]);
        }
        for (int i=0;i< num2.length;i++){
            s2.add(num2[i]);
        }

        for (int num:s1){
            if (!s2.contains(num)){
                list1.add(num);
            }
        }
        for (int num:s2){
            if (!s1.contains(num)){
                list2.add(num);
            }
        }
        
        List<List<Integer>> res=new ArrayList<>();
        res.add(list1);
        res.add(list2);

        return res;
    }
    public static void main(String[] args) {

    }
}
