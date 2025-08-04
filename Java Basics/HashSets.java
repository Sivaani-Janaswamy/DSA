import java.util.*;
// No duplicates allowed in Hashsets
public class HashSets {
    public static void main(String[]args)
    {
        HashSet<Integer> days = new HashSet<>();
        days.addAll(Arrays.asList(1,2,3,4,5,6,7));
        Iterator<Integer> it = days.iterator();
        while(it.hasNext()){
        System.out.printf("%d\t",it.next());
       }
    }
}
