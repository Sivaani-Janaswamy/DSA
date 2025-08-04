public class Loops {
    public static void main(String[]args){
        int i = 0;
        while (i < 5) {
         System.out.println(i);
         i++;
        }
       int j = 0;
       do {
        System.out.println(j);
        j++;
       }
      while (j < 5);
    for (int a = 0; a < 5; a++) {
        System.out.println(a);
    }
    String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
    for (String c : cars) {
    System.out.println(c);
    }
  }
}
