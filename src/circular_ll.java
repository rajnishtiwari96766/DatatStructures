//designing a circular linked list...
class MyCircularQueue {
    private int [] q;
    private int size,count,headIndex;
    public MyCircularQueue(int k) {
        q=new int[k];
        size=k;
        count=0;
        headIndex=0;
    }

    public boolean enQueue(int value) {
        if(isFull()){
            return false;
        }

        q[(headIndex+count)%size]=value;
        count+=1;
        return true;
    }

    public boolean deQueue() {
        if(isEmpty()){
            return false;
        }

        headIndex=(headIndex+1)%size;
        count-=1;
        return true;
    }

    public int Front() {
        if(isEmpty()){
            return -1;
        }

        return q[(headIndex)];
    }

    public int Rear() {
        if(isEmpty()){
            return -1;
        }
        return q[(headIndex+count-1)%size];
    }

    public boolean isEmpty() {
        return count==0;
    }

    public boolean isFull() {
        return count==size;
    }
}

/**
 * Your MyCircularQueue object will be instantiated and called as such:
 * MyCircularQueue obj = new MyCircularQueue(k);
 * boolean param_1 = obj.enQueue(value);
 * boolean param_2 = obj.deQueue();
 * int param_3 = obj.Front();
 * int param_4 = obj.Rear();
 * boolean param_5 = obj.isEmpty();
 * boolean param_6 = obj.isFull();
 */
