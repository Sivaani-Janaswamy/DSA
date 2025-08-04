public class Generics extends Box<Object>{
    public static void main(String[]args){
        Box<String> strBox = new Box<>();
        strBox.set("Hello");
        System.out.println(strBox.get());

        Box<Integer> intBox = new Box<>();
        intBox.set(19);
        System.out.println(intBox.get());
        
        String[] names = {"Jenny", "Liam"};
        Integer[] numbers = {1, 2, 3};
        printArray(names);
        printArray(numbers);
    }
    public static <T> void printArray(T[] array) {
    for (T item : array) {
      System.out.print(item+" ");
    }
  }
}
