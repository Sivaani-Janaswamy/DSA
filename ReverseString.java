import java.util.*;
public class ReverseString{
    static final Scanner sc = new Scanner(System.in);  
    public static void main(String[]args){
        try (sc) {
            System.out.println("Enter String: ");
            String str = sc.nextLine();
            String rev = "";
            for(int i = str.length()-1;i>=0;i--){
                rev = rev+str.charAt(i);
            }
            System.out.println(rev);
        }
    }
}