import java.util.ArrayDeque;
import java.util.Deque;
public class Stack {
    public static void main(String[]args){
        Deque<Integer> s = new ArrayDeque<Integer>();
        s.push(15);
        s.push(16);
        s.push(20);
        System.out.println("Elements in Stack: "+s);
        s.pop();
        System.out.println("Stack after Deletion: "+s);
        s.pop();
        System.out.println("Stack after Deletion: "+s);
        s.pop();
        System.out.println("Stack after Deletion: "+s);
        
    }
}
