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
    }
}
