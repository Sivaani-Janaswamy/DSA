//Matcher and Pattern Classes
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpression {
    public static void main(String[]args)
    {
      Pattern pat = Pattern.compile("29D05M2005Y",Pattern.CASE_INSENSITIVE);
      Matcher match = pat.matcher("Enter password: 29D05M2005Y");
      boolean matchFound = match.find();
      if(matchFound){
        System.out.println("Match Found");
      }
      else{
        System.out.println("Match Not Found");
      }
//CASE_INSENSITIVE LITERAL UNICODE_CASE
//[abc] [^abc] [0-9]
// |	Find a match for any one of the patterns separated by | as in: cat|dog|fish
// .	Find just one instance of any character
// ^	Finds a match as the beginning of a string as in: ^Hello
// $	Finds a match at the end of the string as in: World$
// \d	Find a digit
// \s	Find a whitespace character
// \b	Find a match at the beginning of a word like this: \bWORD, or at the end of a word like this: WORD\b
// \\uxxxx	Find the Unicode character specified by the hexadecimal number xxxx
    }
}
// n+	Matches any string that contains at least one n
// n*	Matches any string that contains zero or more occurrences of n
// n?	Matches any string that contains zero or one occurrences of n
// n{x}	Matches any string that contains a sequence of X n's
// n{x,y}	Matches any string that contains a sequence of X to Y n's
// n{x,}	Matches any string that contains a sequence of at least X n's
