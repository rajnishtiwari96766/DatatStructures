import java.util.Stack;

public class min_stack extends Stack<Integer> {
    Stack<Integer> min_st=new Stack<>();

    void push(int x){
        if (min_st.isEmpty()){
            super.push(x);
            min_st.push(x);
        }else {
            super.push(x);
            int y=min_st.pop();
            min_st.push(y);

            if (x<y){
                min_st.push(x);
            }else {
                min_st.push(y);
            }
        }
    }

    int pop1(){
       int x=super.pop();
       min_st.pop();
       return x;
    }

    int getmin(){
        int x=min_st.pop();
        return x;
    }
    public static void main(String[] args) {
        min_stack ob=new min_stack();

        ob.push(10);
        ob.push(20);
        ob.push(30);

        System.out.println(ob.getmin());

        ob.push(5);

        System.out.println(ob.getmin());
    }
}