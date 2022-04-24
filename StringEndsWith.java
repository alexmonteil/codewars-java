public class StringEndsWith {

    public static void main(String[] args) {
        String test1 = "javascript";
        String ending = "script";
        String test2 = "java";

        System.out.println("Should print true");
        assert StringEndsWith(test1, ending);
        System.out.println("The result is: " + StringEndsWith(test1, ending));
        System.out.println("\n\n" + "Should print false");
        assert !StringEndsWith(test2, ending);
        System.out.println("The result is: " + StringEndsWith(test2, ending));

    }

    public static boolean StringEndsWith(String str, String ending) {
        return str.endsWith(ending);
    }
}
