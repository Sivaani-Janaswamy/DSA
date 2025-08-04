import java.util.*;
public class Variables {
    public static void main(String[]args){
        @SuppressWarnings("deprecated")
        Scanner sc = new Scanner(System.in);
        String name;
        int age;
        float cgpa;
        char grade;
        boolean result;
        System.out.println("Enter name:");
        name = sc.nextLine();
        System.out.println("Enter age:");
        age = sc.nextInt();
        System.out.println("Enter cgpa:");
        cgpa = sc.nextFloat();
        System.out.println("Enter grade:");
        grade = sc.next().charAt(0);
        System.out.println("Enter pass/fail (True/False):\n");
        result = sc.nextBoolean();
        int numberGrade = (int)cgpa;
        System.out.printf(" Name:%s \n Age:%d \n CGPA:%f \n Grade:%c \n Pass:%b \n Number Grade: %d",name,age,cgpa,grade,result,numberGrade);
        sc.close();
    }
}
