import java.util.*;
public class Conditions {
    public static void main(String[]args){
    @SuppressWarnings("deprecated")
    Scanner sc = new Scanner(System.in);
    int a,b;
    System.out.println("Enter 2 numbers: ");
    a = sc.nextInt();
    b = sc.nextInt();
    int maxValue = (a>b)?a:b;
    System.out.printf("Maximum Value: %d\n",maxValue);   
    int time = 20;
    if (time < 18) 
     {
      System.out.println("Good day.");
     } 
    else
      {
       System.out.println("Good evening.");
      }
    int day = 4;
    switch (day) {
      case 1 : System.out.println("Monday");
      case 2 : System.out.println("Tuesday");
      case 3 : System.out.println("Wednesday");
      case 4 : System.out.println("Thursday");
      case 5 : System.out.println("Friday");
      case 6 : System.out.println("Saturday");
      case 7 : System.out.println("Sunday");
      default : System.out.println("Invalid day");
    }
    sc.close();
  }
}
