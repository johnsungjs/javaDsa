package basic;

public class RecursionDemo {

    public static void main(String[] args) {

        // recursion(10);
        System.out.println(power(2, 8));

    }

    static int power(int value, int pow) {

        System.out.println("VALUE: " + value);

        if (pow < 1) {
            System.out.println("MASUK BASE CASE");
            return 1;
        }
        // return power(value + (pow * value), pow - 1);
        return value * power(value, pow - 1);
    }

    /**
     * - used on complex sorting algorithm - used on navigating tree - slower -
     * and takes more memory
     */
    static void recursion(int limit) {
        System.out.println("NUMS: " + limit);
        if (limit <= 0) {
            System.out.println("OUT AT limit: " + limit);
            return;
        }

        recursion(limit - 1);
    }

}
