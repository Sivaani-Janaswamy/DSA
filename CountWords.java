package DSA;
import java.util.*;
public class CountWords {
    public static void main(String[]args){
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter Sentence:");
            String sentence = sc.nextLine();
            int noOfWords = sentence.split("\\s").length;
            System.out.printf("No of words: %d\n",noOfWords);
        }
    }
}
