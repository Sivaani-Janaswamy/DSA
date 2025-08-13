import java.util.*;
public class Queues {
    public static void main(String[]args){
        Queue<Integer> q = new LinkedList<>();
        q.add(10);
        System.out.println("Queue elements: " + q);
        q.offer(20);
        q.add(30);
        q.add(40);
        q.add(50);
        System.out.println("Queue elements: " + q);
        System.out.println("Poll:" + q.poll());
        System.out.println("Element: " + q.element());
        System.out.println("Peek: " + q.peek());
        System.out.println("Queue elements: " + q);        

    }
}
