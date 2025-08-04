import java.util.*;
//HashMap stores key-value pairs
public class HashMaps {
    public static void main(String[]args)
    {
     HashMap<Integer,String> StudentRollNumbers = new HashMap<>();
     StudentRollNumbers.put(120,"Priya K");
     StudentRollNumbers.put(121,"Jane Doe");
     StudentRollNumbers.put(122,"Jessica Lawerence");
     StudentRollNumbers.put(123,"Anand Rao");
     System.out.println(StudentRollNumbers);
     Iterator<String> it = StudentRollNumbers.values().iterator();
      while(it.hasNext()){
        System.out.printf("%s  ",it.next());
      }
      System.out.println(StudentRollNumbers.get(121));
      for(int i: StudentRollNumbers.keySet()){
        System.out.printf("%d - %s\n",i,StudentRollNumbers.get(i));
      }
      System.out.println(StudentRollNumbers.values());
      TreeMap<String, String> capitalCities = new TreeMap<>();
      capitalCities.put("England", "London");
      capitalCities.put("India", "New Dehli");
      capitalCities.put("Austria", "Wien");
      capitalCities.put("Norway", "Oslo");
      capitalCities.put("Norway", "Oslo"); // Duplicate
      capitalCities.put("USA", "Washington DC");
      System.out.println(capitalCities);
    }
}
