package hackerrank;

public class RecursiveDigitSum {

    // this solution works, but this coding pattern is uncommon for recursive method
    // public static int sumSuperDigit(String superDigit) {
    //     String[] arraySuperDigit = superDigit.split("");
    //     int sum = 0;
    //     for (String arr : arraySuperDigit) {
    //         System.out.println("arr: " + arr);
    //         sum += Integer.parseInt(arr);
    //         System.out.println("sum: " + sum);
    //     }
    //     if (Integer.toString(sum).length() < 2) {
    //         System.out.println("RETURN SUM: " + sum);
    //         return sum;
    //     } else {
    //         System.out.println("MASUK ELSE, KONDISI SUM: " + sum);
    //         String stringSum = Integer.toString(sum);
    //         return sumSuperDigit(stringSum);
    //     }
    // }
    

    //SOLUTION FROM medium: https://cbesangeeth.medium.com/recursive-digit-sum-hackerrank-java-aed5c908b4c4
    // static int findSum(String num) {
    //     if (num.length() < 2) {
    //         return Integer.parseInt(num);
    //     }
    //     int sum = 0;
    //     for (int i = 0; i < num.length(); i++) {
    //         sum += Integer.parseInt(String.valueOf(num.charAt(i)));
    //     }
    //     return findSum(String.valueOf(sum));
    // }
    // public static int superDigitMedium(String n, int k) {
    //     int temp = findSum(n) * k;
    //     if (temp > 9) {
    //         temp = findSum(String.valueOf(temp));
    //     }
    //     return temp;
    // }

    static int sumSuperDigit(String superDigit) {

        if (superDigit.length() < 2) {
            System.out.println("RETURN SUM: " + superDigit);
            return Integer.parseInt(superDigit);
        }

        int sum = 0;

        for (int i = 0; i < superDigit.length(); i++) {
            sum += Integer.parseInt(String.valueOf(superDigit.charAt(i)));
        }

        String stringSum = Integer.toString(sum);
        return sumSuperDigit(stringSum);
    }

    public static int superDigit(String n, int k) {

        /**
            ternyata kuncinya disini, harus dibuat variable temp terlebih dahulu

            jadi sumSuperDigit harus dijalankan dulu biar codenya kenceng
            RUMUS perhitungan = sumN * k
            jadi gak harus manual tambahin 5+4+3+2+1+5+4+3+2+1

            cara yg proper adalah dengan (5+4+3+2+1) * 2

            ini math basic yg terlupakan
         */

        int temp = sumSuperDigit(n) * k;

        System.out.println("TEMP BEFORE: "+ temp);

        if (temp > 9) {
            temp = sumSuperDigit(String.valueOf(temp));
        }

        return temp;
    }
    public static void main(String[] args) {

        System.out.println(superDigit("100", 20));
    }
}
