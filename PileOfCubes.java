/*
    Your task is to construct a building which will be a pile of n cubes. The cube at the bottom will have a volume of n^3, the cube above will have volume of (n-1)^3 and so on until the top which will have a volume of 1^3.

    You are given the total volume m of the building. Being given m can you find the number n of cubes you will have to build?

    The parameter of the function findNb (find_nb, find-nb, findNb, ...) will be an integer m and you have to return the integer n such as n^3 + (n-1)^3 + ... + 1^3 = m if such a n exists or -1 if there is no such n.
 */

public class PileOfCubes {

    public static void main(String[] args) {
        long result = findNb(2086437610951791877);
        System.out.println("n = " + result);
    }

    public static long findNb(long m) {

        double mToDouble = (double) m;
        long n = 1;
        double totalVolume = Math.pow(n, 2) * Math.pow((n + 1), 2) / 4;

        while (totalVolume < m) {
            n++;
            totalVolume = Math.pow(n, 2) * Math.pow((n + 1), 2) / 4;
        }

        if (totalVolume == mToDouble) {
            return n;
        }

        System.out.println("totalVolume = " + totalVolume);
        System.out.println("mToDouble = " + mToDouble);

        return -1;
    }

    public static long findNb2(long m) {

        long squareRootTest = (long) Math.sqrt(m);
        if (!(squareRootTest % 2 == 0)) {
            return -1;
        }

        long n = 1;
        long sum = 1;

        while (sum < squareRootTest) {
            n++;
            sum = n * (n + 1) / 2;
        }

        if (sum == squareRootTest) {
            return n;
        }

        return -1;
    }
}
