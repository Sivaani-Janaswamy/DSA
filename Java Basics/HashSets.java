import java.util.*;
// No duplicates allowed in Hashsets
public class HashSets {
    public static void main(String[]args)
    {
        HashSet<Integer> days = new HashSet<>();
        days.add(1);
        days.add(12);
        Iterator<Integer> it = days.iterator();
        while(it.hasNext()){
        System.out.printf("%d\t",it.next());
       }
    }
}
