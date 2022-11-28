import java.math.BigInteger;

public class Main {
    public static void main(String[] args) {
        System.out.println(getFactorial(5));
        System.out.println(getFactorialRecursive(10));
        System.out.println(getNod(100, 80));
        System.out.println(getNodRecursive(9, 28));
    }

    public static BigInteger getFactorial(int number) {
        BigInteger result = BigInteger.ONE;
        for (int i = 1; i <= number; i++) {
            result = result.multiply(BigInteger.valueOf(i));
        }
        return result;
    }

    public static BigInteger getFactorialRecursive(int number) {
        if (number < 0 ) {
            return BigInteger.ZERO;
        } else if (number  == 0 || number == 1) {
            return BigInteger.ONE;
        } else {
            return BigInteger.valueOf(number).multiply(getFactorialRecursive(number - 1));
        } // (5 * (getfa...(4 * getfa..(3 * getfa..(2 * getfa..(1)))))
    }

    private static int getNod(int number1, int number2) {
        int nod;
        if (number1 > number2) nod = number1 / 2;
        else nod = number2 / 2;
        for (int i = nod; i >= 2; i--) {
            if (number1 % i == 0 && number2 % i == 0) {
                return i;
            }
        }
        return 1;
    }
    public static int getNodRecursive(int number1, int number2) {
        if (number1 == 0)
            return number2;
        if (number2 == 0)
            return number1;
        if (number1 >= number2)
            return getNodRecursive(number1 % number2, number2);
        return getNodRecursive(number1, number2 % number1);
    }
}
