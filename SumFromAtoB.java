/*
    Given two integers a and b, which can be positive or negative, find the sum of all the integers between and including them and return it. If the two numbers are equal return a or b.

    Note: a and b are not ordered!
 */


public class SumFromAtoB {

    public static void main(String[] args) {
        int a = -5;
        int b = 10;
        int result = sum(a, b);
        System.out.println("Should print 40");
        assert result == 40;
        System.out.println("The result is : " + result);

    }

    public static int sum(int a, int b) {
        return (a + b) * (Math.abs(a - b) + 1) / 2;
    }
}
