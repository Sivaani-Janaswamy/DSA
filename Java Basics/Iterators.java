import java.util.*;
//Iterators are used to access each element
public class Iterators {
    public static void main(String[]args)
    {
      ArrayList<String> cars = new ArrayList<>();
      cars.add("Volvo");
      cars.add("BMW");
      cars.add("Ford");
      cars.add("Mazda");
      Iterator<String> it = cars.iterator();
      while(it.hasNext()){
        System.out.printf("%s\t",it.next());
      }
    }
}
