import java.util.LinkedList;
import java.util.Queue;

//designing the front middle and back of the queue...
public class design_queue {

    private LinkedList<Integer> q;
    public void FrontMiddleBackQueue() {
        q=new LinkedList<>();
    }

    public void pushFront(int val) {

        q.add(0,val);
//        q.offerFirst()
    }

    public void pushMiddle(int val) {
        int n=q.size();
        int mid=n-1/2;
        q.add(mid,val);
    }

    public void pushBack(int val) {
        q.addLast(val);
    }

    public int popFront() {
        if (q.size()==0){
            return -1;
        }
        return q.remove(0);
    }

    public int popMiddle() {
        if (q.size()==0){
            return -1;
        }
        int n=q.size();
        int mid=n/2;
        return q.remove(mid);
    }

    public int popBack() {
        if (q.size()==0){
            return -1;
        }
        return q.removeLast();
    }
}
