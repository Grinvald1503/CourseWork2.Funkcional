import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        String incomingText = "yourapp the quick brown fox jumps over the lazy dog";
        Top10 countWords = new Top10(incomingText);
        countWords.printResult();
    }


}
