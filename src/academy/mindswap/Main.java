package academy.mindswap;

import java.util.Arrays;
import java.util.Locale;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
	// write your code here
        String prayer = "Oh Lord, won't you buy me a trash Mercedes Benz\n" +
                "My friends all drive trash Porsches, I must make trash amends\n" +
                "Worked hard all my trash lifetime, no help from my trash friends\n" +
                "So Lord, won't you buy me a trash Mercedes Benz";

        String result=removeWordAndUpperCaseIt(prayer,"trash");
        System.out.println(result);

    }
    public static String removeWordAndUpperCaseIt(String phrase,String wordToRemove){
        return Arrays.stream(phrase.split(" "))
                .filter(word -> !word.toLowerCase().contains(wordToRemove))
                .map(String::toUpperCase)
                .collect(Collectors.joining(" "));
    }
}
