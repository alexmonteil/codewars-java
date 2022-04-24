public class SumFromAtoB {

    public static void main(String[] args) {
        int a = -5;
        int b = 10;
        System.out.println("Should print 40");
        assert Sum(a, b) == 40;
        System.out.println("The result is : " + Sum(a, b));

    }

    public static int Sum(int a, int b) {
        return (a + b) * (Math.abs(a - b) + 1) / 2;
    }
}
