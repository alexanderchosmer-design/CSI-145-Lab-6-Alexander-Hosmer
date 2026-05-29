
import java.util.Queue;
import java.util.LinkedList;

public class QStack {
    Queue<Integer> q = new LinkedList<Integer>();
    Queue<Integer> mirror = new LinkedList<Integer>();
    //elements must be queued backwards to act like a stack.
    //unfortunately, this is O(n). Dunno how I would make it O(1) without violating the rules.
    public void push(int x){
        //move all elements into mirror in order
        for(int i = 0; i < q.size(); i++){
            mirror.add(q.poll());
        }
        //add x into q
        q.add(x);
        //move all elements from mirror to q behind x
        for(int i = 0; i < mirror.size(); i++){
            q.add(mirror.poll());
        }
    }
    public int pop(){

        return q.poll();
    }
    public int top(){
        return q.peek();
    }
    //redundant, q inherits size from Collections
    public int size(){
        return q.size();
    }
    //redundant, q inherits isEmpty from Collections
    public boolean isEmpty(){
        return q.isEmpty();
    }
}
