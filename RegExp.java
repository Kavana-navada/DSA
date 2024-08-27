import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class RegExp{
    public static void main(String[] args)
    {
        // Pattern myPattern=Pattern.compile("placement12",Pattern.CASE_INSENSITIVE);
        // Matcher myMatcher=myPattern.matcher("Are you ready for Placement123 training");
        // boolean matchFound=myMatcher.find();
        // if(matchFound)
        // {
        //     System.out.println("Matched");
        // }
        // else
        // {
        //     System.out.println("No Match found");
        // }

        // Pattern newPattern=Pattern.compile("join us^");
        // Matcher newMatcher=newPattern.matcher("Are u ready to join us^");
        // System.out.println(newMatcher.find());

        // Pattern newPattern1=Pattern.compile("join us^",Pattern.LITERAL);
        // Matcher newMatcher1=newPattern1.matcher("Are u ready to join us^");
        // System.out.println(newMatcher1.find());

        // Pattern pattern = Pattern.compile("[^abc]");
        // Matcher matcher = pattern.matcher("abc");
        // System.out.println( matcher.find());

        Pattern pattern = Pattern.compile("cati|dogi|fishi");
        Matcher matcher = pattern.matcher("I have a cat, a dog, and a fish.");

        while (matcher.find()) {
            System.out.println("Found: " + matcher.group());  // Output: "Found: cat", "Found: dog", "Found: fish"
        }
        
    }
}