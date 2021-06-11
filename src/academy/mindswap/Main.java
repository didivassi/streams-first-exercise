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

        String result=Arrays.asList(prayer.split(" "))
                .stream()
                .filter(word -> !word.toLowerCase().contains("trash"))
                .map(word-> word.toUpperCase())
                .collect(Collectors.joining(" "));

        System.out.println(result);
        
    }
}
