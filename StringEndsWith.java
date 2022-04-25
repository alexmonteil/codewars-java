public class StringEndsWith {

    public static void main(String[] args) {
        String test1 = "javascript";
        String ending = "script";
        String test2 = "java";

        System.out.println("Should print true");
        boolean result = StringEndsWith(test1, ending);
        assert result;
        System.out.println("The result is: " + result);
        System.out.println("\n\n" + "Should print false");
        boolean result2 = StringEndsWith(test2, ending);
        assert !result2;
        System.out.println("The result is: " + result2);

    }

    public static boolean StringEndsWith(String str, String ending) {
        return str.endsWith(ending);
    }
}
