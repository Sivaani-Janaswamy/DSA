import java.util.*;
// No duplicates allowed in Hashsets
public class HashSets {
    public static void main(String[]args)
    {
        HashSet<Integer> days = new HashSet<>();
        days.add(1);
        days.add(1);
        days.add(2);
        days.add(2);
        days.add(4);
        days.add(5);
        days.add(6);
        System.out.println(days);
        Iterator<Integer> it = days.iterator();
        while(it.hasNext()){
        System.out.printf("%d\t",it.next());
        TreeSet<String> cars = new TreeSet<>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("BMW");  
        cars.add("Mazda");
        System.out.println(cars);
       }
    }
}
