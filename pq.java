package _19_Heap;
import java.util.*;

public class Pq {
    public static void main(String[] args) {
        PriorityQueue<Integer>pq=new PriorityQueue<>();
        //        PriorityQueue<Integer>pq=new PriorityQueue<>(comparator.reverseorder());

        pq.add(3);
        pq.add(4);
        pq.add(1);
        pq.add(7);
        while(!pq.isEmpty()){
            System.out.println(pq.peek());
            pq.remove();
        }

    }
}
