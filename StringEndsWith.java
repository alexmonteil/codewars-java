/*
    Complete the solution so that it returns true if the first argument(string) passed in ends with the 2nd argument (also a string).
 */

public class StringEndsWith {

    public static void main(String[] args) {
        String test1 = "javascript";
        String ending = "script";
        String test2 = "java";

        System.out.println("Should print true");
        boolean result = stringEndsWith(test1, ending);
        assert result;
        System.out.println("The result is: " + result);
        System.out.println("\n\n" + "Should print false");
        boolean result2 = stringEndsWith(test2, ending);
        assert !result2;
        System.out.println("The result is: " + result2);

    }

    public static boolean stringEndsWith(String str, String ending) {
        return str.endsWith(ending);
    }
}
