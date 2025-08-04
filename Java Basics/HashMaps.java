import java.util.*;
//HashMap stores key-value pairs
public class HashMaps {
    public static void main(String[]args)
    {
     HashMap<Integer,String> StudentRollNumbers = new HashMap<>();
     StudentRollNumbers.put(120,"Priya K");
     StudentRollNumbers.put(121,"Jane Doe");
     Iterator<String> it = StudentRollNumbers.values().iterator();
      while(it.hasNext()){
        System.out.printf("%s\t",it.next());
      }
    }
}
