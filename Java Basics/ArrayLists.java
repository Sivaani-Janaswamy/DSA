import java.util.*;
//Array Lists are resizeable. Elements can be accessed by indexes
public class ArrayLists {
    public static void main(String[]args)
    {
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Mango");
        fruits.add("Apple");
        Iterator<String> it = fruits.iterator();
        while(it.hasNext()){
            System.out.printf("%s\t",it.next());
        }
        System.out.println();
        System.out.printf(fruits.get(1));
        fruits.set(1,"Banana");
        fruits.add("Strawberry");
        System.out.println();
        it = fruits.iterator();
        while(it.hasNext()){
            System.out.printf("%s\t",it.next());
        }
        System.out.printf("Size: %d",fruits.size());
        fruits.remove(1);
        System.out.println();
        it = fruits.iterator();
        while(it.hasNext()){
            System.out.printf("%s\t",it.next());
        }
        System.out.printf("Size: %d\n",fruits.size());
        fruits.add("Pineapple");
        fruits.add("Grapes");
        fruits.add("Apple");
        Collections.sort(fruits);
        for(String i:fruits){
            System.out.printf("%s  ",i);
        }
        System.out.println();
        Collections.sort(fruits,Collections.reverseOrder());
        for(String i:fruits){
            System.out.printf("%s  ",i);
        }
        System.out.println();
        ArrayList<String> fruits2 = (ArrayList<String>) fruits.clone();
        fruits2.forEach((n) -> System.out.println(n));
        System.out.println();
        System.out.printf("%b",fruits2.contains("Apple"));
        fruits.subList(2,5);
        fruits.forEach((n)->System.out.println(n));
        fruits2.toArray();
    }
}
