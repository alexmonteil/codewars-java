import java.util.Arrays;
import java.util.List;

/*

Prompt :  Simple, given a string of words, return the length of the shortest word(s).
String will never be empty and you do not need to account for different data types.

*/

public class FindShortestWord {

    public static void main(String[] args) {
        String testStr = "What could the shortest word be ?";
        int shortest = findShortest(testStr);
        System.out.println("Should print ?");
        assert shortest == 1;
        System.out.println("The result is: " + shortest);
    }

    public static int findShortest(String str) {
        List<String> list = Arrays.asList(str.split("\\s"));
        String shortest = list.get(0);
        for (int i = 1; i < list.size(); i++) {
            if (shortest.length() > list.get(i).length()) {
                shortest = list.get(i);
            }
        }
        return shortest.length();
    }
}
