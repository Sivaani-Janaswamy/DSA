import java.util.*;
public class PriortyQueues {
    public static void main(String[]arsgs){
        Queue<Integer> q = new PriorityQueue<>();
        q.add(10);
        q.add(20);
        q.add(15);
        System.out.println("Priority Queue Elements: "+q);
        System.out.println(q.peek());      
        System.out.println(q.poll());  
        System.out.println(q.peek());
        System.out.println("Priority Queue Elements: "+q);
    }
}
